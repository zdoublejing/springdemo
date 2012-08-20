package bean;

public class DemoBean {
	
	private String message;
	
	public void display() {
		System.out.println(message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
