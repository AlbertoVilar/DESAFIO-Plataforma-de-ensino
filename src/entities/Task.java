package entities;

public class Task extends Lesson {

	private String description;
	private Integer questioncount;
	
	public Task() {
		super();
	}

	public Task(String title, String description, Integer questioncount) {
		super(title);
		this.description = description;
		this.questioncount = questioncount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getQuestioncount() {
		return questioncount;
	}

	public void setQuestioncount(Integer questioncount) {
		this.questioncount = questioncount;
	}

	@Override
	public Integer duration() {
		
		return 60 * 5 * questioncount;
	}

	@Override
	public String toString() {
		return super.getTitle() +  description + ", questioncount=" + questioncount;
	}
	
	
	
	
}
