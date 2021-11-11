package com.pts.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "teamGroup")
public class TeamGroup {

	@Id
	@GeneratedValue(generator = "sequence_mat_id_generator")
	@SequenceGenerator(name="sequence_mat_id_generator", initialValue= 5, allocationSize=10000)
	@Column(name = "idTeamGroup", updatable = true, nullable = false, length = 25)
	private Long idTeamGroup;

	@Column(name = "Team", updatable = true, nullable = true, length = 200)
	private String Team;
	
	@Column(name = "description", updatable = true, nullable = true, length = 200)
	private String description;


	public  TeamGroup() { }
	
	
	public Long getIdTeamGroup() {
		return idTeamGroup;
	}

	
	public void setIdTeamGroup(Long idTeamGroup) {
		this.idTeamGroup = idTeamGroup;
	}

	
	public String getTeam() {
		return Team;
	}

	
	public void setTeam(String team) {
		Team = team;
	}

	
	public String getDescription() {
		return description;
	}

	
	public void setDescription(String description) {
		this.description = description;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Team == null) ? 0 : Team.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((idTeamGroup == null) ? 0 : idTeamGroup.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TeamGroup other = (TeamGroup) obj;
		if (Team == null) {
			if (other.Team != null)
				return false;
		} else if (!Team.equals(other.Team))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (idTeamGroup == null) {
			if (other.idTeamGroup != null)
				return false;
		} else if (!idTeamGroup.equals(other.idTeamGroup))
			return false;
		return true;
	}
	
	
	
}
