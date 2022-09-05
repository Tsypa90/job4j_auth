package ru.job4j.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.time.LocalDateTime;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder(builderMethodName = "of")
@Data
public class Employee {
    @EqualsAndHashCode.Include
    private int id;
    private String name;
    private String surname;
    private int taxIdentifier;
    private LocalDateTime hireDate;
    private Person person;
}
