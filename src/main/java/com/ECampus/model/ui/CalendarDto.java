package com.ECampus.model.ui;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@Builder
public record CalendarDto(Long id, LocalDateTime timeslot) {
}
