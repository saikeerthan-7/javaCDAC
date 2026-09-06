package assignment6;

public class PushNotification implements Notification{
	
	String deviceId;
	String app;
	
	PushNotification(String deviceId, String app) {
		this.deviceId = deviceId;
		this.app = app;
	}
	@Override
	public void sendnotification(String Message) {
		System.out.println("Message sent through Push Notification");
	}
	@Override
	public void showStatus() {
		System.out.println("Notification Delivered");
	}
	
	public void display() {
		System.out.println("Device ID : " + deviceId);
		System.out.println("App : " + app);
	}

}
