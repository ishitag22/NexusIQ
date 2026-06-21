package com.project.NexusIQ.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class departmentResponse {

    private Long id;
    private String name;
}