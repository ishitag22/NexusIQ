package com.project.NexusIQ.department.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "departments")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Department
{
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY )
    private long id;
    @Column(nullable = false , unique = true)
    private String name;
}