package com.skilldistillery.filmquery.entities;

public class Film {

//	variables
	private int id;
	private String title;
	private String description;
	private int releaseYear;
	private int languageId;
	private int rentalDuration;
	private double rentalRate;
	private double length;
	private double replacementCost;
	private String rating;
	private String specialFeatures;

//	constructors
	public Film() {

	}

	public Film(int id, String title, String description, int releaseYear, int languageId, int rentalDuration,
			double rentalRate, double length, double replacementCost, String rating, String specialFeatures) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.releaseYear = releaseYear;
		this.languageId = languageId;
		this.rentalDuration = rentalDuration;
		this.rentalRate = rentalRate;
		this.length = length;
		this.replacementCost = replacementCost;
		this.rating = rating;
		this.specialFeatures = specialFeatures;
	}

//	getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public int getLanguageId() {
		return languageId;
	}

	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}

	public int getRentalDuration() {
		return rentalDuration;
	}

	public void setRentalDuration(int rentalDuration) {
		this.rentalDuration = rentalDuration;
	}

	public double getRentalRate() {
		return rentalRate;
	}

	public void setRentalRate(double rentalRate) {
		this.rentalRate = rentalRate;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getReplacementCost() {
		return replacementCost;
	}

	public void setReplacementCost(double replacementCost) {
		this.replacementCost = replacementCost;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getSpecialFeatures() {
		return specialFeatures;
	}

	public void setSpecialFeatures(String specialFeatures) {
		this.specialFeatures = specialFeatures;
	}

//	Stringbuilder
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Film [id=");
		builder.append(id);
		builder.append(", title=");
		builder.append(title);
		builder.append(", description=");
		builder.append(description);
		builder.append(", releaseYear=");
		builder.append(releaseYear);
		builder.append(", languageId=");
		builder.append(languageId);
		builder.append(", rentalDuration=");
		builder.append(rentalDuration);
		builder.append(", rentalRate=");
		builder.append(rentalRate);
		builder.append(", length=");
		builder.append(length);
		builder.append(", replacementCost=");
		builder.append(replacementCost);
		builder.append(", rating=");
		builder.append(rating);
		builder.append(", specialFeatures=");
		builder.append(specialFeatures);
		builder.append(", getId()=");
		builder.append(getId());
		builder.append(", getTitle()=");
		builder.append(getTitle());
		builder.append(", getDescription()=");
		builder.append(getDescription());
		builder.append(", getReleaseYear()=");
		builder.append(getReleaseYear());
		builder.append(", getLanguageId()=");
		builder.append(getLanguageId());
		builder.append(", getRentalDuration()=");
		builder.append(getRentalDuration());
		builder.append(", getRentalRate()=");
		builder.append(getRentalRate());
		builder.append(", getLength()=");
		builder.append(getLength());
		builder.append(", getReplacementCost()=");
		builder.append(getReplacementCost());
		builder.append(", getRating()=");
		builder.append(getRating());
		builder.append(", getSpecialFeatures()=");
		builder.append(getSpecialFeatures());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

//	hash and equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + id;
		result = prime * result + languageId;
		long temp;
		temp = Double.doubleToLongBits(length);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((rating == null) ? 0 : rating.hashCode());
		result = prime * result + releaseYear;
		result = prime * result + rentalDuration;
		temp = Double.doubleToLongBits(rentalRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(replacementCost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((specialFeatures == null) ? 0 : specialFeatures.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Film other = (Film) obj;
		if (description == null) {
			if (other.description != null) {
				return false;
			}
		} else if (!description.equals(other.description)) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (languageId != other.languageId) {
			return false;
		}
		if (Double.doubleToLongBits(length) != Double.doubleToLongBits(other.length)) {
			return false;
		}
		if (rating == null) {
			if (other.rating != null) {
				return false;
			}
		} else if (!rating.equals(other.rating)) {
			return false;
		}
		if (releaseYear != other.releaseYear) {
			return false;
		}
		if (rentalDuration != other.rentalDuration) {
			return false;
		}
		if (Double.doubleToLongBits(rentalRate) != Double.doubleToLongBits(other.rentalRate)) {
			return false;
		}
		if (Double.doubleToLongBits(replacementCost) != Double.doubleToLongBits(other.replacementCost)) {
			return false;
		}
		if (specialFeatures == null) {
			if (other.specialFeatures != null) {
				return false;
			}
		} else if (!specialFeatures.equals(other.specialFeatures)) {
			return false;
		}
		if (title == null) {
			if (other.title != null) {
				return false;
			}
		} else if (!title.equals(other.title)) {
			return false;
		}
		return true;
	}
}
