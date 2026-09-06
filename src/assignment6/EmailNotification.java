package assignment6;

public class EmailNotification implements Notification{
	String emailId;
	String subject;
	
	EmailNotification(String emailId, String subject) {
		this.emailId = emailId;
		this.subject = subject;
	}
	@Override
	public void sendnotification(String Message) {
		System.out.println("Message sent through Email");
		
	}
	@Override
	public void showStatus() {
		System.out.println("Email Delivered");
	}
	
	public void display() {
		System.out.println("Email : " + emailId);
		System.out.println("Subject : " + subject);
	}

}

