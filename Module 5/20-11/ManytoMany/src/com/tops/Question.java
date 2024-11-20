package com.tops;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="questions")
public class Question 
{
	
	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment",strategy="increment")
	@Column(name="qid")
	int id;
	
	@Column(name="qname")
	String qname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	@ManyToMany(targetEntity = Answer.class, cascade = { CascadeType.ALL })
	
	@JoinTable(name = "questin_answer", joinColumns = { @JoinColumn(name = "q_id") }, inverseJoinColumns = { @JoinColumn(name = "ans_id") })
	
	List<Answer>answers;

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	
	
	
	
	
	
}
