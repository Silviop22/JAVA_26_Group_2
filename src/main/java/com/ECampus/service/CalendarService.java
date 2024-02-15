package com.ECampus.service;

import com.ECampus.model.Calendar;
import com.ECampus.model.ui.CalendarDto;
import com.ECampus.repository.CalendarRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CalendarService {

    private final CalendarRepository calendarRepository;
    private final CourseService courseService;

    public CalendarDto getById(Long id) {
        Calendar calendar = calendarRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Calendar not found"));
        return new CalendarDto(calendar.getCalendarId(), calendar.getTimeSlot());
    }

    public List<CalendarDto> getByCourseId(Long courseId) {
        return calendarRepository.findCalendarsByCourse(courseId).stream()
                .map(c -> new CalendarDto(c.getCalendarId(), c.getTimeSlot()))
                .toList();
    }

}
