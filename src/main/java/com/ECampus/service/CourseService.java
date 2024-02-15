package com.ECampus.service;

import com.ECampus.model.*;
import com.ECampus.model.ui.CalendarDto;
import com.ECampus.model.ui.CourseDto;
import com.ECampus.repository.CalendarRepository;
import com.ECampus.repository.CourseRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Getter
@Setter
@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;
    private final CalendarRepository calendarRepository;

    public CourseDto getById(Long id){
        Course course = findById(id);
        return new CourseDto(course.getCourseId(), course.getCourseName(), course.getCourseECTS(), course.getCalendar().getCalendarId());
    }

    public Course findById(Long id) {
        return courseRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Course not found"));
    }

    public String addCalendar(Long id, CalendarDto calendarDto) {
        Course course = findById(id);
        Calendar calendar = Calendar.builder()
                .timeSlot(calendarDto.timeslot())
                .course(course)
                .build();
        course.getCalendars().add(calendar);
        courseRepository.save(course);
        return "Calendar added successfully";
    }
   // public Course createCourse(CourseDto courseDto) {
       // Optional<Course> existingCourse = courseRepository.existingCourse
               // (courseDto.getCourseName(), courseDto.getCourseECTS());
       // if (existingCourse.isPresent()) {
          //  throw new EntityExistsException("Course name " + courseDto.getCourseName() + "Course ECTS "
                //    + courseDto.getCourseECTS() +" already exists.");
      //  }
      //  return courseRepository.save(courseMapper.toEntity(courseDto));
    //}
   public ResponseEntity<String> updateStudentInformation(Long courseId, CourseDto courseExtendedDto) {
       Optional<Course> courseOptional = courseRepository.findById(courseId);

       if (courseOptional.isPresent()) {
           Course course = courseOptional.get();

           course.setCourseName(courseExtendedDto.getCourseName());
           course.setCourseECTS(courseExtendedDto.getCourseECTS());


           if (courseExtendedDto.getCalendarId() != null) {

               Optional<Calendar> calendarOptional = calendarRepository.findById(courseExtendedDto.getCalendarId());
               calendarOptional.ifPresent(course::setCalendar);
           }



           courseRepository.save(course);

           return ResponseEntity.ok("Course information updated successfully.");
       }
       return null;
//        return ResponseEntity.ok("Course information updated successfully.");
//    } else {
//        throw new CourseNotFoundException("Course with id " + courseId + " not found");
//    }

       //public ResponseEntity<CourseDto> viewCourseDetails(Long courseId) {
          // Optional<Course>course1Optional = courseRepository.findById(courseId);

          // if (courseOptional.isPresent()) {
             //  Course course = courseOptional.get();
              // CourseDto courseDto = new CourseDto(
                      // course.getCourseId(),
                      // course.getCourseName(),
                       //course.getCourseECTS(),

                      // course.getCalendar() != null ? course.getCalendar().getCalendarId() : null
             //  );
             //  return ResponseEntity.ok(courseDto);
         //  } else {
               //return ResponseEntity.notFound().build();

          // }
     //  }
}
    public List<Student> findEnrolledStudentsByCourseId(Long courseId) {
        return courseRepository.findEnrolledStudentsByCourseId(courseId);
//    }
//    public String programLessonsForCourse(Long courseId, List<LessonDto> lessonDtoList) {
//        Course course = courseRepository.findById(courseId)
//                .orElseThrow(() -> new EntityNotFoundException("Course not found with id: " + courseId));
//        for (LessonDto lessonDto : lessonDtoList) {
//            Lesson lesson = new Lesson();
//            lesson.setTitle(lessonDto.getTitle());
//            lesson.setDescription(lessonDto.getDescription());
//            // Set other properties as needed
//            lesson.setCourse(course);
//            lessonRepository.save(lesson);
//        }
//
//        return "Lessons programmed successfully for course with ID: " + courseId;
//    }
}


}

