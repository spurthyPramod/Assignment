package com.devglan.assignment;

import java.util.List;

public interface SubQuestionService {
	SubQuestion create(SubQuestion subquestion);

	SubQuestion delete(int id);

	    List<SubQuestion> findAll();

	    SubQuestion findById(int id);

	    SubQuestion update(SubQuestion subquestion);
}
