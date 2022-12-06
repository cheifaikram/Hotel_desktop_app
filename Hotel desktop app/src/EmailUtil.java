

import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

public class EmailUtil {
    
    
public static void sendMail(String  recepient){
    try{
        Properties props = new Properties();
     props.put("mail.smtp.auth", "true");
     props.put("mail.smtp.starttls.enable", "true");
     props.put("mail.smtp.host", "smtp.gmail.com");
     props.put("mail.smtp.port", "587");
     props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
String myAcountEmail = "hotellagazelle5@gmail.com";
String password = "nourikram123";
Session session = Session.getDefaultInstance(props, new Authenticator(){
         protected PasswordAuthentication getPasswordAuthentication() {  return new PasswordAuthentication(myAcountEmail,password);}}
    );
        
        Message msg =  prepareMessage( session,myAcountEmail ,recepient);
        Transport.send(msg);  

        
}catch (Exception e) {
	      e.printStackTrace();}}
	
	public static Message prepareMessage(Session session, String myAcountEmail , String  recepient){
		try
	    {   
	      MimeMessage msg = new MimeMessage(session);
	      //set message headers
	      msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
	      msg.addHeader("format", "flowed");
	      msg.addHeader("Content-Transfer-Encoding", "8bit");

	      msg.setFrom(new InternetAddress(myAcountEmail));
              msg.setSubject( "recuperation du mot de passe");
	      msg.setText("heyyy girllll");

	      msg.setSentDate(new Date());

	      msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recepient));
	        return msg;
    	 

	      
	    }
	    catch (Exception e) {
	      e.printStackTrace();
	    } return null;
	}
}

