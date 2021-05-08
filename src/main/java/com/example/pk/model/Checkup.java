package com.example.pk.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Data
@NoArgsConstructor

public class Checkup {

    private String id;
    private String name;
    private Patient patient;
    private Doctor doctor;
    private LocalDate date;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Checkup checkup = (Checkup) o;
        return id.equals(checkup.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
