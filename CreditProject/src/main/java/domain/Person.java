package domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Person {
	@Id
	@GeneratedValue
	private int personId;
	private String name;
	@OneToMany(mappedBy = "createdBy")
	private List<Project> createdProjects = new ArrayList<Project>();

	@Enumerated(EnumType.STRING)
	private PersonRole personRole;

	public PersonRole getPersonRole() {
		return personRole;
	}

	public void setPersonRole(PersonRole personRole) {
		this.personRole = personRole;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Project> getCreatedProjects() {
		return createdProjects;
	}

	public void setCreatedProjects(List<Project> createdProjects) {
		this.createdProjects = createdProjects;
	}

	private Person() {
	}

}
