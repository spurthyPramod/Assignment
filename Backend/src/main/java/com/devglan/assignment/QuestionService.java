package com.devglan.assignment;

import java.util.List;


public interface QuestionService {
	
	Question create(Question question);

	Question delete(int id);

	    List<Question> findAll();

	    Question findById(int id);

	    Question update(Question question);
}
