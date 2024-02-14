package com.ECampus.service.shared.ClassMappers;

import com.ECampus.model.Calendar;
import com.ECampus.model.ui.CalendarDto;
import com.ECampus.service.shared.Mapper;

public class CalendarMapper implements Mapper<CalendarDto, Calendar> {

    @Override
    public CalendarDto toDto(Calendar entity) {
        return CalendarDto.builder()
                .id(entity.getCalendarId())
                .timeslot(entity.getTimeSlot())
                .build();
    }
}
