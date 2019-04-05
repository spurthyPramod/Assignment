package com.devglan.assignment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class SubQuestionServiceImpl implements SubQuestionService {

	@Autowired
    private SubQuestionRepository subquestionrepository;

    @Override
    public SubQuestion create(SubQuestion subquestioon) {
        return subquestionrepository.save(subquestioon);
    }

    @Override
    public SubQuestion delete(int id) {
    	SubQuestion subquestion = findById(id);
        if(subquestion != null){
        	subquestionrepository.delete(subquestion);
        }
        return subquestion;
    }

    @Override
    public List<SubQuestion> findAll() {
        return subquestionrepository.findAll();
    }

    @Override
    public SubQuestion findById(int id) {
        return subquestionrepository.findOne(id);
    }

    @Override
    public SubQuestion update(SubQuestion subquestion) {
        return subquestionrepository.save(subquestion);
    }
}
