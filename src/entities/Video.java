package entities;

public class Video extends Lesson {

	public String url;
	public Integer seconds;

	public Video() {
		super();
	}

	public Video(String title, String url, Integer seconds) {
		super(title);
		this.url = url;
		this.seconds = seconds;
	}
	
	

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setSeconds(Integer seconds) {
		this.seconds = seconds;
	}

	@Override
	public Integer duration() {
		// TODO Auto-generated method stub
		return seconds;
	}

	@Override
	public String toString() {
		return super.getTitle() + url + ", seconds=" + seconds;
	}

}
