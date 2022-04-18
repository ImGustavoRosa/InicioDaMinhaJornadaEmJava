package com.gustavorosa.escola.repository;

import com.gustavorosa.escola.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository <Professor, Integer> {

}
