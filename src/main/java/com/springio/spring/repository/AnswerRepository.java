package com.springio.spring.repository;

import com.springio.spring.models.Answer;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Long>{
    List<Answer> findByQuestionId(Long questionId);
}