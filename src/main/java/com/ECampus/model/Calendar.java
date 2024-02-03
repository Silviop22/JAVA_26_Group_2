package com.ECampus.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.boot.autoconfigure.web.format.DateTimeFormatters;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "calendars")
@Entity
public class Calendar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long calendarId;
    private DateTimeFormatters timeslot;


}
