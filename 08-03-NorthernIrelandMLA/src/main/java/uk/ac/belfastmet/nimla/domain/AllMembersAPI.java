package uk.ac.belfastmet.nimla.domain;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class AllMembersAPI {
	@JsonProperty("AllMembersList")
	AllMembersList allMembersList;
	//Map<String,Object> allMembersList;
	
	public String toString() {
		String allMembersList = this.allMembersList.toString();
		
		return allMembersList;
	}
}
