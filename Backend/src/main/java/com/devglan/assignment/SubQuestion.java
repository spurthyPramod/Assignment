package com.devglan.assignment;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
/***
 * @author spoorthy
 */
@Entity
@Table(name = "subquestion")
public class SubQuestion {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="questiontype")
	private String subchoice;
	@Column(name="subquestion_name")
	private String subquestion_name;
	@Column(name="multi_line")
	private String childTextArea;
	@Column(name="single_choice")
	private String childSingleChoice;
	@Column(name="multi_text1")
	private String childmultitext1;
	@Column(name="multi_text2")
	private String childmultitext2;
	@Column(name="multi_text3")
	private String childmultitext3;
	@Column(name="multi_text4")
	private String childmultitext4;
	@Column(name="multi_text5")
	private String childmultitext5;
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "quesiton_id", nullable = false)
    private Question question;
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
	 * @return the subchoice
	 */
	public String getSubchoice() {
		return subchoice;
	}
	/**
	 * @param subchoice the subchoice to set
	 */
	public void setSubchoice(String subchoice) {
		this.subchoice = subchoice;
	}
	/**
	 * @return the subquestion_name
	 */
	public String getSubquestion_name() {
		return subquestion_name;
	}
	/**
	 * @param subquestion_name the subquestion_name to set
	 */
	public void setSubquestion_name(String subquestion_name) {
		this.subquestion_name = subquestion_name;
	}
	/**
	 * @return the childTextArea
	 */
	public String getChildTextArea() {
		return childTextArea;
	}
	/**
	 * @param childTextArea the childTextArea to set
	 */
	public void setChildTextArea(String childTextArea) {
		this.childTextArea = childTextArea;
	}
	/**
	 * @return the childSingleChoice
	 */
	public String getChildSingleChoice() {
		return childSingleChoice;
	}
	/**
	 * @param childSingleChoice the childSingleChoice to set
	 */
	public void setChildSingleChoice(String childSingleChoice) {
		this.childSingleChoice = childSingleChoice;
	}
	/**
	 * @return the childmultitext1
	 */
	public String getChildmultitext1() {
		return childmultitext1;
	}
	/**
	 * @param childmultitext1 the childmultitext1 to set
	 */
	public void setChildmultitext1(String childmultitext1) {
		this.childmultitext1 = childmultitext1;
	}
	/**
	 * @return the childmultitext2
	 */
	public String getChildmultitext2() {
		return childmultitext2;
	}
	/**
	 * @param childmultitext2 the childmultitext2 to set
	 */
	public void setChildmultitext2(String childmultitext2) {
		this.childmultitext2 = childmultitext2;
	}
	/**
	 * @return the childmultitext3
	 */
	public String getChildmultitext3() {
		return childmultitext3;
	}
	/**
	 * @param childmultitext3 the childmultitext3 to set
	 */
	public void setChildmultitext3(String childmultitext3) {
		this.childmultitext3 = childmultitext3;
	}
	/**
	 * @return the childmultitext4
	 */
	public String getChildmultitext4() {
		return childmultitext4;
	}
	/**
	 * @param childmultitext4 the childmultitext4 to set
	 */
	public void setChildmultitext4(String childmultitext4) {
		this.childmultitext4 = childmultitext4;
	}
	/**
	 * @return the childmultitext5
	 */
	public String getChildmultitext5() {
		return childmultitext5;
	}
	/**
	 * @param childmultitext5 the childmultitext5 to set
	 */
	public void setChildmultitext5(String childmultitext5) {
		this.childmultitext5 = childmultitext5;
	}
	/**
	 * @return the question
	 */
	public Question getQuestion() {
		return question;
	}
	/**
	 * @param question the question to set
	 */
	public void setQuestion(Question question) {
		this.question = question;
	}
	
}
