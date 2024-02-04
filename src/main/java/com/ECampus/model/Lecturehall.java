package com.ECampus.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="lecturehalls")
@Builder
@Entity
public class Lecturehall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hallId;
    private  boolean status;
    private int capacity;
}
