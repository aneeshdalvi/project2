package edu.asu.ser516.quiz.model;


public class QuizDetails{
	
	private String title;
	private String instructions;
	private String assignmentGroup;
	private Boolean isShuffled;
	private Boolean isGraded;
	private Integer timeLimit;
	private Boolean isMultipleAttempt;
	
	public QuizDetails(String title, String instructions, String assignmentGroup, Boolean isShuffled, Boolean isGraded,
			Integer timeLimit, Boolean isMultipleAttempt) {
		super();
		this.title = title;
		this.instructions = instructions;
		this.assignmentGroup = assignmentGroup;
		this.isShuffled = isShuffled;
		this.isGraded = isGraded;
		this.timeLimit = timeLimit;
		this.isMultipleAttempt = isMultipleAttempt;
	}
	
	@Override
	public String toString() {
		return "QuizDetails [title=" + title + ", instructions=" + instructions + ", assignmentGroup=" + assignmentGroup
				+ ", isShuffled=" + isShuffled + ", isGraded=" + isGraded + ", timeLimit=" + timeLimit
				+ ", isMultipleAttempt=" + isMultipleAttempt + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public String getAssignmentGroup() {
		return assignmentGroup;
	}

	public void setAssignmentGroup(String assignmentGroup) {
		this.assignmentGroup = assignmentGroup;
	}

	public Boolean getIsShuffled() {
		return isShuffled;
	}

	public void setIsShuffled(Boolean isShuffled) {
		this.isShuffled = isShuffled;
	}

	public Boolean getIsGraded() {
		return isGraded;
	}

	public void setIsGraded(Boolean isGraded) {
		this.isGraded = isGraded;
	}

	public Integer getTimeLimit() {
		return timeLimit;
	}

	public void setTimeLimit(Integer timeLimit) {
		this.timeLimit = timeLimit;
	}

	public Boolean getIsMultipleAttempt() {
		return isMultipleAttempt;
	}

	public void setIsMultipleAttempt(Boolean isMultipleAttempt) {
		this.isMultipleAttempt = isMultipleAttempt;
	}

    
}



