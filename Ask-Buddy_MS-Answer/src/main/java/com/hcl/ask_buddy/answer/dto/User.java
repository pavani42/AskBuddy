package com.hcl.ask_buddy.answer.dto;

import java.util.List;



import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hcl.ask_buddy.answer.entity.Answers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

	//  User Entity Attributes
	private long sap_Id;
	private String mail;
	private String username;
	private String password;
	@JsonIgnore
	private List<Question> questionList;
	@JsonIgnore
	private List<Answers> answerList;

}
