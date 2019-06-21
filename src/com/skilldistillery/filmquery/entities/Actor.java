package com.skilldistillery.filmquery.entities;

import java.util.List;

public class Actor {
//	 variables
	private int Id;
	private String firstName;
	private String lastName;
	private List<Film> films;

//	constructors
	public Actor() {

	}

	public Actor(int id, String firstName, String lastName) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

//getters and setters
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

//	toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Actor [Id=");
		builder.append(Id);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", getId()=");
		builder.append(getId());
		builder.append(", getFirstName()=");
		builder.append(getFirstName());
		builder.append(", getLastName()=");
		builder.append(getLastName());
		builder.append("]");
		return builder.toString();
	}

//	hash and equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Id;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Actor other = (Actor) obj;
		if (Id != other.Id) {
			return false;
		}
		if (firstName == null) {
			if (other.firstName != null) {
				return false;
			}
		} else if (!firstName.equals(other.firstName)) {
			return false;
		}
		if (lastName == null) {
			if (other.lastName != null) {
				return false;
			}
		} else if (!lastName.equals(other.lastName)) {
			return false;
		}
		return true;
	}

	public void setFilms(List<Film> findFilmsByActorId) {
		// TODO Auto-generated method stub
		
	}

}
