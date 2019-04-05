package com.devglan.assignment;

import java.util.List;

import org.springframework.data.repository.Repository;


public interface QuestionRepository extends Repository<Question, Integer> {
	
	void delete(Question question);

    List<Question> findAll();

    Question findOne(int id);

    Question save(Question question);
}
