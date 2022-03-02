package wildfly_bootable.models;

public class HelloModel {

	private String message;

	public HelloModel(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
