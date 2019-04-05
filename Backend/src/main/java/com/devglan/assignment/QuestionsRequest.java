package com.devglan.assignment;

import java.util.List;

public class QuestionsRequest {
private List<Question> questions;

/**
 * @return the questions
 */
public List<Question> getQuestions() {
	return questions;
}

/**
 * @param questions the questions to set
 */
public void setQuestions(List<Question> questions) {
	this.questions = questions;
}

}
