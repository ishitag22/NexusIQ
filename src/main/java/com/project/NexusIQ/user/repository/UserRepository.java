package com.project.NexusIQ.user.repository;

import com.project.NexusIQ.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Repository
public interface UserRepository
        extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);
}