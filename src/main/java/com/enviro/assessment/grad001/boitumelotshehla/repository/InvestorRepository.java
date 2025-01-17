package com.enviro.assessment.grad001.boitumelotshehla.repository;

import com.enviro.assessment.grad001.boitumelotshehla.model.Investor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvestorRepository extends JpaRepository<Investor, Long> {
}
