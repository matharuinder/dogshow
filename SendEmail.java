package ca.sheridancollege.Logic;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import ca.sheridancollege.Beans.Dog;
import ca.sheridancollege.dao.DAO;

public class SendEmail {

	public static void main(String[] args) {

		Dog d = DAO.getLastDog();
		
		send("inderpreet400@gmail.com",d);
	}
	
	public static void send(String rec,Dog d) {
		String username = "javaproject.emails@gmail.com";
		String password = "JavaAssignment2";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("javaproject.emails@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(rec));
			message.setSubject("Dog registed successfully!");
			message.setText("Your Dog was successfully registered.   Name:"+d.getName()+"   ID:"+d.getId());
			
			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
	
}