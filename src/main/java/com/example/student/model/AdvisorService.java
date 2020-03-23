package com.example.student.model;

import com.example.student.model.domain.Advisor;

import java.util.List;

public interface AdvisorService {

    List<Advisor> findAllAdvisor();
    Advisor findAllAdvisorById(int id);
    Advisor save(Advisor newAdvisor);
    Advisor updateAdvisor(Advisor updateAdvisor);
    void deleteAdvisorById(Integer id);

}
