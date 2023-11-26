package com.bmicalculator.bmi.repository;

import com.bmicalculator.bmi.BmiBean;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BmiRepository extends JpaRepository<BmiBean, Long> {
}
