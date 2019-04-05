package com.devglan.assignment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping({"/questions"})
public class QuestionController {
	
	@Autowired
    private QuestionService questionService;
	@Autowired
    private SubQuestionService subquestionService;

	@PostMapping
    public void create(@RequestBody QuestionsRequest req){
       System.out.println(req.getQuestions());
      for(int i=0;i<req.getQuestions().size();i++) {
    	  
    	 Question q= questionService.create(req.getQuestions().get(i));
    	 for(int j=0;j<req.getQuestions().get(i).getSubquestion().size();j++) {
    		 SubQuestion sb=req.getQuestions().get(i).getSubquestion().get(j);
    		 sb.setQuestion(q);
    		 subquestionService.create(sb);
    	 }
    	 
      }
    }
	@GetMapping
    public List<Question> findAll(){
		return questionService.findAll();
    }
	@GetMapping(path = {"/{id}"})
    public Question findOne(@PathVariable("id") int id){
        return questionService.findById(id);
    }
	
}

