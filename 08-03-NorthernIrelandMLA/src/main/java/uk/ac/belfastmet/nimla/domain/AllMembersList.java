package uk.ac.belfastmet.nimla.domain;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class AllMembersList {
	
	@JsonProperty("Member")
	ArrayList<MLAs> members;

	@Override
	public String toString() {
		return "AllMembersList [members=" + this.members.toString() + "]";
	}
	
	

}
