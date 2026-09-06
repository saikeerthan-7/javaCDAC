package assignment6;

public class NotificationDemo {

	public static void main(String[] args) {
		EmailNotification e1 = new EmailNotification("Saikeerthan@gmail.com", "Account Update");
		e1.display();
		e1.sendnotification("Message sent through Email");
		e1.showStatus();
		System.out.println();
		
		SMSNotification s1 = new SMSNotification(999999999, "Airtel");
		s1.display();
		s1.sendnotification("Message sent through SMS");
		s1.showStatus();
		System.out.println();
		
		PushNotification p1 = new PushNotification("SAI1417", "Amazon");
		p1.display();
		p1.sendnotification("Message sent through Push Notification");
		p1.showStatus();
	}

}
