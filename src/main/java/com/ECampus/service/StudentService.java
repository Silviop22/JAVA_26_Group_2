package com.ECampus.service;


import com.ECampus.model.Course;
import com.ECampus.model.Group;
import com.ECampus.model.Major;
import com.ECampus.model.Student;
import com.ECampus.model.ui.Enrollment;
import com.ECampus.model.ui.StudentDto;
import com.ECampus.model.ui.StudentExtendedDto;
import com.ECampus.repository.*;
import com.ECampus.service.shared.ClassMappers.StudentMapper;
import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;
    @Autowired
    private MajorRepository majorRepository;
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private GroupRepository groupRepository;
    @Autowired
    private EnrollmentRepository enrollmentRepository;


    private Student findExistingStudent(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Student with id " + id + " not found"));
    }
    public StudentDto getById(Long id) {
       Student student = studentRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Student not found."));
        return new StudentDto(student.getId(),
                student.getFirstName(),
                student.getLastName());
    }

    public StudentExtendedDto getStudentById(Long id) {
        Student student = findExistingStudent(id);
        return studentMapper.toExtendedDto(student);
    }

    public Set<StudentDto> getList() {
        return studentRepository.findAll()
                .stream()
                .map(studentMapper::toDto)
                .collect(Collectors.toSet());
    }

    public Student createStudent(StudentExtendedDto student) {
        Optional<Student> existingStudent = studentRepository.findByStudentFirstNameAndStudentLastNameAndEmail
                (student.getFirstName(), student.getLastName(), student.getEmail());
        if (existingStudent.isPresent()) {
            throw new EntityExistsException("Student with name " + student.getFirstName() + " "
                    + student.getLastName()+", with email "
                    + student.getEmail() +" already exists.");
        }
        return studentRepository.save(studentMapper.toEntity(student));
    }

    public ResponseEntity<String> updateStudentInformation(Long studentId, StudentExtendedDto studentExtendedDto) {
        Optional<Student> studentOptional = studentRepository.findById(studentId);

        if (studentOptional.isPresent()) {
            Student student = studentOptional.get();

            student.setFirstName(studentExtendedDto.getFirstName());
            student.setLastName(studentExtendedDto.getLastName());
            student.setBirthDate(studentExtendedDto.getBirthDate());
            student.setEmail(studentExtendedDto.getEmail());
            student.setAddress(studentExtendedDto.getAddress());

            if (studentExtendedDto.getMajorId() != null) {
                Optional<Major> majorOptional = majorRepository.findById(studentExtendedDto.getMajorId());
                majorOptional.ifPresent(student::setMajor);
            }

            if (studentExtendedDto.getGroupId() != null) {
                Optional<Group> groupOptional = groupRepository.findById(studentExtendedDto.getGroupId());
                groupOptional.ifPresent(student::setGroup);
            }

        return ResponseEntity.ok("Student information updated successfully.");
    } else {
            throw new EntityNotFoundException("Student with given id not found");
        }
    }
    public ResponseEntity<String> enrollStudentInCourse(Long studentId, Long courseId, Long majorId) {
       Student student= findExistingStudent(studentId);
        Optional<Course> courseOptional = courseRepository.findById(courseId);
        Optional<Major> majorOptional = majorRepository.findById(majorId);

        if (student.equals(true) && courseOptional.isPresent() && majorOptional.isPresent()) {
            student.getId();
            Course course = courseOptional.get();
            Major major = majorOptional.get();

            // Check if student belongs to the specified major
            if (!student.getMajor().equals(major)) {
                return ResponseEntity.badRequest().body("Student does not belong to the specified major.");
            }

            // Create a new enrollment
            Enrollment enrollment = new Enrollment();
            enrollment.setStudent(student);
            enrollment.setCourse(course);

            // Save the enrollment
            enrollmentRepository.save(enrollment);

            return ResponseEntity.ok("Student enrolled in course successfully.");
        } else {
            return ResponseEntity.notFound().build();
        }
    }



    public void deleteStudent(Long id) {
        Student student = findExistingStudent(id);
        studentRepository.delete(student);
    }


}
