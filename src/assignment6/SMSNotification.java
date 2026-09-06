package assignment6;

public class SMSNotification implements Notification{
	
	long mobileNumber;
	String provider;
	
	SMSNotification(long mobileNumber, String provider) {
		this.mobileNumber = mobileNumber;
		this.provider = provider;
	}
	@Override
	public void sendnotification(String Message) {
		System.out.println("Message sent through SMS");
	}
	@Override
	public void showStatus() {
		System.out.println("SMS Delivered");
	}
	
	public void display() {
		System.out.println("Mobile : " + mobileNumber);
		System.out.println("Provider : " + provider);
	}

}
