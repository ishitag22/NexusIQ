package com.project.NexusIQ.department.controller;

import com.project.NexusIQ.department.service.departmentService;
import com.project.NexusIQ.dto.departmentResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
@RequiredArgsConstructor
public class departmentController {
    private final departmentService departmentService;

    @GetMapping
    public ResponseEntity<List<departmentResponse>> getAllDepartments() {
        return ResponseEntity.ok(
                departmentService.getAllDepartments()
        );

}

}
