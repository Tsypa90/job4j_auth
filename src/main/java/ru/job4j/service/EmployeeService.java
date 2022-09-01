package ru.job4j.service;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.stereotype.Service;
import ru.job4j.model.Employee;
import ru.job4j.repository.EmployeeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    @NonNull
    private EmployeeRepository store;

    public List<Employee> findAll() {
        return store.findAll();
    }

    public Employee save(Employee employee) {
        return store.save(employee);
    }
}
