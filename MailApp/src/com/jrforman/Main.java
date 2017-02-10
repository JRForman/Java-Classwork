package com.jrforman;

import javax.mail.*;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {
        //String to = "9282796892@messaging.sprintpcs.com";
        String to = "6027080825@vtext.com";
        String from = "Your_Garden";
       // String host = "localhost";
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        props.put("mail.smtp.user", "jason.reed.forman@gmail.com");
        props.put("mail.smtp.password", "3HMSefomb");
        Session session = Session.getDefaultInstance(props);

        try {
            MimeMessage message = new MimeMessage(session);

            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            //message.setSubject("Sent from the computer");
            message.setText("Your fucking parts are done.");
            Transport transport = session.getTransport("smtp");
            transport.connect("smtp.gmail.com", "jason.reed.forman@gmail.com", "3HMSefomb");
            transport.sendMessage(message, message.getAllRecipients());
            System.out.println("Message sent");


        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}
