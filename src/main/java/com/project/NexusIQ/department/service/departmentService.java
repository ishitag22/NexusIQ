package com.project.NexusIQ.department.service;


import com.project.NexusIQ.department.repository.DepartmentRepository;
import com.project.NexusIQ.dto.departmentResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class departmentService {

    private final DepartmentRepository departmentRepository;

    public List<departmentResponse> getAllDepartments() {

        return departmentRepository.findAll()
                .stream()
                .map(department -> departmentResponse.builder()
                        .id(department.getId())
                        .name(department.getName())
                        .build())
                .toList();
    }
}