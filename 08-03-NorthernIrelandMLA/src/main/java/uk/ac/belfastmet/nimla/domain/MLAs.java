package uk.ac.belfastmet.nimla.domain;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class MLAs {
	
	@JsonProperty("PersonId")
	private String personId;
	@JsonProperty("AffiliationId")
	private String affiliationId;
	@JsonProperty("MemberName")
	private String memberName;
	@JsonProperty("MemberFirstName")
	private String memberFirstName;
	@JsonProperty("MemberFullDisplayName")
	private String memberDisplayName;
	@JsonProperty("MemberSortName")
	private String memberSortName;
	@JsonProperty("MemberTitle")
	private String memberTitle;
	@JsonProperty("PartyName")
	private String partyName;
	@JsonProperty("PartyOrganisationId")
	private String partyOrganisationId;
	@JsonProperty("ConstituencyName")
	private String constituencyName;
	@JsonProperty("ConstituencyId")
	private String constituencyId;
	
	
	
	
}
