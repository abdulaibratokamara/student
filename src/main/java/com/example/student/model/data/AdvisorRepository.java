package com.example.student.model.data;

import com.example.student.model.domain.Advisor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdvisorRepository extends JpaRepository<Advisor, Integer> {
}
