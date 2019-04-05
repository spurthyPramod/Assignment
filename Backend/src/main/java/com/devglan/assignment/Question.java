package com.devglan.assignment;
/***
 * @author spoorthy
 */
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
@Table(name = "question")
public class Question {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="questiontype")
	private String choice;
	@Column(name="question")
	private String question;
	@Column(name="multi_line")
	private String parentTextArea;
	@Column(name="single_choice")
	private String parentSingleChoice;
	@Column(name="multi_text1")
	private String multitext1;
	@Column(name="multi_text2")
	private String multitext2;
	@Column(name="multi_text3")
	private String multitext3;
	@Column(name="multi_text4")
	private String multitext4;
	@Column(name="multi_text5")
	private String multitext5;
	@JsonManagedReference
	@OneToMany(cascade=CascadeType.ALL,mappedBy="question",fetch=FetchType.LAZY)
    private List<SubQuestion> subquestion;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the choice
	 */
	public String getChoice() {
		return choice;
	}
	/**
	 * @param choice the choice to set
	 */
	public void setChoice(String choice) {
		this.choice = choice;
	}
	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}
	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}
	/**
	 * @return the parentTextArea
	 */
	public String getParentTextArea() {
		return parentTextArea;
	}
	/**
	 * @param parentTextArea the parentTextArea to set
	 */
	public void setParentTextArea(String parentTextArea) {
		this.parentTextArea = parentTextArea;
	}
	/**
	 * @return the parentSingleChoice
	 */
	public String getParentSingleChoice() {
		return parentSingleChoice;
	}
	/**
	 * @param parentSingleChoice the parentSingleChoice to set
	 */
	public void setParentSingleChoice(String parentSingleChoice) {
		this.parentSingleChoice = parentSingleChoice;
	}
	/**
	 * @return the multitext1
	 */
	public String getMultitext1() {
		return multitext1;
	}
	/**
	 * @param multitext1 the multitext1 to set
	 */
	public void setMultitext1(String multitext1) {
		this.multitext1 = multitext1;
	}
	/**
	 * @return the multitext2
	 */
	public String getMultitext2() {
		return multitext2;
	}
	/**
	 * @param multitext2 the multitext2 to set
	 */
	public void setMultitext2(String multitext2) {
		this.multitext2 = multitext2;
	}
	/**
	 * @return the multitext3
	 */
	public String getMultitext3() {
		return multitext3;
	}
	/**
	 * @param multitext3 the multitext3 to set
	 */
	public void setMultitext3(String multitext3) {
		this.multitext3 = multitext3;
	}
	/**
	 * @return the multitext4
	 */
	public String getMultitext4() {
		return multitext4;
	}
	/**
	 * @param multitext4 the multitext4 to set
	 */
	public void setMultitext4(String multitext4) {
		this.multitext4 = multitext4;
	}
	/**
	 * @return the multitext5
	 */
	public String getMultitext5() {
		return multitext5;
	}
	/**
	 * @param multitext5 the multitext5 to set
	 */
	public void setMultitext5(String multitext5) {
		this.multitext5 = multitext5;
	}
	/**
	 * @return the subquestion
	 */
	public List<SubQuestion> getSubquestion() {
		return subquestion;
	}
	/**
	 * @param subquestion the subquestion to set
	 */
	public void setSubquestion(List<SubQuestion> subquestion) {
		this.subquestion = subquestion;
	}
	
	

}
