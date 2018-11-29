package com.grocerygogetters.model;

public class Feedback {

	private int feedback_id;
	private String feedback_rating;
	private String feedback_message;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Feedback(int feedback_id, String feedback_rating, String feedback_message) {
		super();
		this.feedback_id = feedback_id;
		this.feedback_rating = feedback_rating;
		this.feedback_message = feedback_message;
	}
	public int getFeedback_id() {
		return feedback_id;
	}
	public void setFeedback_id(int feedback_id) {
		this.feedback_id = feedback_id;
	}
	public String getFeedback_rating() {
		return feedback_rating;
	}
	public void setFeedback_rating(String feedback_rating) {
		this.feedback_rating = feedback_rating;
	}
	public String getFeedback_message() {
		return feedback_message;
	}
	public void setFeedback_message(String feedback_message) {
		this.feedback_message = feedback_message;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + feedback_id;
		result = prime * result + ((feedback_message == null) ? 0 : feedback_message.hashCode());
		result = prime * result + ((feedback_rating == null) ? 0 : feedback_rating.hashCode());
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
		Feedback other = (Feedback) obj;
		if (feedback_id != other.feedback_id)
			return false;
		if (feedback_message == null) {
			if (other.feedback_message != null)
				return false;
		} else if (!feedback_message.equals(other.feedback_message))
			return false;
		if (feedback_rating == null) {
			if (other.feedback_rating != null)
				return false;
		} else if (!feedback_rating.equals(other.feedback_rating))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Feedback [feedback_id=" + feedback_id + ", feedback_rating=" + feedback_rating + ", feedback_message="
				+ feedback_message + "]";
	}
	
}
