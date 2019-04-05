package com.devglan.assignment;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service
public class QuestionServiceImpl implements QuestionService {
	 @Autowired
	    private QuestionRepository questionrepository;

	    @Override
	    public Question create(Question questioon) {
	        return questionrepository.save(questioon);
	    }

	    @Override
	    public Question delete(int id) {
	    	Question question = findById(id);
	        if(question != null){
	        	questionrepository.delete(question);
	        }
	        return question;
	    }

	    @Override
	    public List<Question> findAll() {
	        return questionrepository.findAll();
	    }

	    @Override
	    public Question findById(int id) {
	        return questionrepository.findOne(id);
	    }

	    @Override
	    public Question update(Question question) {
	        return questionrepository.save(question);
	    }
}
