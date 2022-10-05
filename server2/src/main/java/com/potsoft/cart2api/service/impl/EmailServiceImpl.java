package com.potsoft.cart2api.service.impl;

import com.potsoft.cart2api.service.EmailService;

import org.springframework.stereotype.Service;

//import com.icegreen.greenmail.junit.GreenMailRule;
//import com.icegreen.greenmail.util.ServerSetupTest;
//import org.junit.Before;
//import org.junit.Rule;
//import org.junit.Test;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.IOException;

//import static org.junit.Assert.assertEquals;


import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
//import javax.mail.internet.MimeMessage;
//import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.net.URI;
import java.util.Properties;


import javax.mail.BodyPart;
    
    
@Service
public class EmailServiceImpl implements EmailService 
{
    /** 
	@Override
	public String sendSms()
	{
		return "";
	}

	*/

    private String username;
    private String password;
    private String host;
    private int port;    

    private Properties prop;



    public int init(String host, int port, String username, String password) {
        prop = new Properties();
        prop.put("mail.smtp.auth", true);
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.host", host);
        prop.put("mail.smtp.port", port);
        prop.put("mail.smtp.ssl.trust", host);

        this.username = username;
        this.password = password;
        this.host = host;
        this.port = port;
        return 0;
    }

    public int init(String host, int port) {
        prop = new Properties();
        prop.put("mail.smtp.host", host);
        prop.put("mail.smtp.port", port);
        this.host = host;
        this.port = port;
        return 0;
    }

    public int init(String username, String password, String host, int port)
    {
        this.username = username;
        this.password = password;
        this.host = host;
        this.port = port;
        return 0;
    }

    public Session getSession() {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", this.host);
        props.put("mail.smtp.port", this.port);

        return Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
    }

    public void sendMail() throws Exception {

        Session session = Session.getInstance(prop, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress("from@gmail.com"));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("to@gmail.com"));
        message.setSubject("Mail Subject");

        String msg = "This is my first email using JavaMailer";

        MimeBodyPart mimeBodyPart = new MimeBodyPart();
        mimeBodyPart.setContent(msg, "text/html; charset=utf-8");

        String msgStyled = "This is my <b style='color:red;'>bold-red email</b> using JavaMailer";
        MimeBodyPart mimeBodyPartWithStyledText = new MimeBodyPart();
        mimeBodyPartWithStyledText.setContent(msgStyled, "text/html; charset=utf-8");

        MimeBodyPart attachmentBodyPart = new MimeBodyPart();

        attachmentBodyPart.attachFile(getFile());

        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(mimeBodyPart);
        multipart.addBodyPart(mimeBodyPartWithStyledText);
        multipart.addBodyPart(attachmentBodyPart);

        message.setContent(multipart);

        Transport.send(message);
    }


 
    
    
        public void sendMail(Session session) throws MessagingException, IOException {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("mail@gmail.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("mail@gmail.com"));
            message.setSubject("Testing Subject");
    
            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText("This is message body");
    
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
    
            MimeBodyPart attachmentPart = new MimeBodyPart();
            attachmentPart.attachFile(getFile("attachment.txt"));
            multipart.addBodyPart(attachmentPart);
    
            MimeBodyPart attachmentPart2 = new MimeBodyPart();
            attachmentPart2.attachFile(getFile("attachment2.txt"));
            multipart.addBodyPart(attachmentPart2);
    
            message.setContent(multipart);
            Transport.send(message);
        }


        private File getFile(String filename) {
            try {
                URI uri = this.getClass()
                  .getClassLoader()
                  .getResource(filename)
                  .toURI();
                return new File(uri);
            } catch (Exception e) {
                throw new IllegalArgumentException("Unable to find file from resources: " + filename);
            }
        }
        
    private File getFile() throws Exception {
        URI uri = this.getClass()
          .getClassLoader()
          .getResource("attachment.txt")
          .toURI();
        return new File(uri);
    }


    public void test(String... args) {
        try {
            init("smtp.mailtrap.io", 25, "87ba3d9555fae8", "91cb4379af43ed");
            sendMail();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	

		//@Rule
		//public final GreenMailRule greenMail = new GreenMailRule(ServerSetupTest.SMTP);
	
		//private EmailService emailService;
	
		//@Before
		//public void setup() {
		//	emailService = new EmailService("localhost", greenMail.getSmtp().getPort());
		//}
	
		//@Test
		public void givenEmailMessageWithAttachment_whenEmailIsSent_MessageIsReceived() throws Exception {
	
			sendMail();
	
			MimeMessage[] receivedMessages = new MimeMessage[1];// greenMail.getReceivedMessages();
			//assertEquals(1, receivedMessages.length);
	
			MimeMessage receivedMessage = receivedMessages[0];
			//assertEquals("Mail Subject", subjectFromMessage(receivedMessage));
			//assertEquals("This is my first email using JavaMailer", emailTextFrom(receivedMessage));
			//assertEquals("This is my <b style='color:red;'>bold-red email</b> using JavaMailer", emailStyledTextFrom(receivedMessage));
			//assertEquals("sample attachment content", attachmentContentsFrom(receivedMessage));
            emailStyledTextFrom(receivedMessage);
            emailTextFrom(receivedMessage);
            subjectFromMessage(receivedMessage);
            attachmentContentsFrom(receivedMessage);
		}
	
		private static String subjectFromMessage(MimeMessage receivedMessage) throws MessagingException {
			return receivedMessage.getSubject();
		}
	
		private static String emailTextFrom(MimeMessage receivedMessage) throws IOException, MessagingException {
			return ((MimeMultipart) receivedMessage.getContent())
			  .getBodyPart(0)
			  .getContent()
			  .toString();
		}
	
		private static String emailStyledTextFrom(MimeMessage receivedMessage) throws IOException, MessagingException {
			return ((MimeMultipart) receivedMessage.getContent())
				.getBodyPart(1)
				.getContent()
				.toString();
		}
	
		private static String attachmentContentsFrom(MimeMessage receivedMessage) throws Exception {
			return ((MimeMultipart) receivedMessage.getContent())
			  .getBodyPart(2)
			  .getContent()
			  .toString();
		}


	
}





