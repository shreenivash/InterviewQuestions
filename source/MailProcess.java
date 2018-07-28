import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class MailProcess {
	
	public static void main(String args[]) {
		String givenArray[][] = {{"abhi47roy@gmail.com", "abhiramkumar@outlook.com"}, {"nivash0shree@gmail.com", "justram93@gmail.com"}, 
				{"abiram.abiram@soprasteria.com", "abhi47roy@gmail.com"} };
		MailProcess.sendMail(givenArray);
		System.out.println("Done");
	}
	
    public static void sendMail(String friendsArray[][]) {
    	//Getting all email of the friends array 
    	ArrayList<String> friendsArrayList = new ArrayList<String>();
    	for(int i= 0 ;i <friendsArray.length ; i++) {
    		for(int j=0;j<i;j++) {
    			if(!friendsArrayList.contains(friendsArray[i][j])) {
    				friendsArrayList.add(friendsArray[i][j]);
    			}
    		}
    	}
    	
    	System.out.println("The list " + friendsArrayList);
    	
    	ArrayList<String> checkEntrys = new ArrayList<String>();
        
    	//Setting up configurations for the email connection to the Google SMTP server using TLS
        Properties props = new Properties();
        props.put("mail.smtp.host", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        //Establishing a session with required user details
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("justram93@gmail.com", "JustRam@321");
            }
        });
        try {
            //Creating a Message object to set the email content
            MimeMessage msg = new MimeMessage(session);
             String to = "abhi47roy@gmail.com,abhi47roy@gmail.com";
           
             /*Parsing the String with defualt delimiter as a comma by marking the boolean as true and storing the email
            addresses in an array of InternetAddress objects*/
            InternetAddress[] address = InternetAddress.parse(to, true);
            System.out.println(address);
            for(int i=0 ; i<address.length; i++)  {
            if(!checkEntrys.contains(address[1].toString())){
            	msg.setRecipients(Message.RecipientType.TO, address);
                String timeStamp = new SimpleDateFormat("yyyymmdd_hh-mm-ss").format(new Date());
                msg.setSubject("Sample Mail : " + timeStamp);
                msg.setSentDate(new Date());
                msg.setText("This is the message that will be sent to the friends");
                msg.setHeader("XPriority", "1");
                Transport.send(msg);
                checkEntrys.add(address[0].toString()); 
                System.out.println("Mail has been sent successfully");
            }
            else {
            	System.out.println("Message already send");
            }
        } 
            
        } catch (MessagingException mex) {
            System.out.println("Unable to send an email" + mex);
        }
    }
}
