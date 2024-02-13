package com.ECampus.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="lecturehalls")
@Builder
@Entity
public class LectureHall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hallId;
    private  boolean status;
    private int capacity;
    @ManyToOne
    @JoinColumn(name = "calendar_id")
    @OnDelete(action = OnDeleteAction.CASCADE)  //nuk supozohet qe te fshihen halls nqs anullohet nje orar
    private Calendar calendarId;
}
