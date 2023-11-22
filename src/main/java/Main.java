import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        Object BankAccount = null;

        System.out.println("Enter a password");
        String passwordAttempt = scanner.next();

        System.out.println("Re-enter password");
        String confirmPass = scanner.next();

        if(passwordAttempt == confirmPass){
            System.out.println("Password updated.");
            String hashedPassword = doHashing(passwordAttempt);
            BankAccount.set

        }else{
            System.out.println("Passwords do not match. Try again.");
        }

        String username = "Izuyh";







        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();


        session.save(BankAccount);

        session.getTransaction().commit();
        session.close();
    }



    public static String doHashing(String password){
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(password.getBytes());
            byte[] byteArray = messageDigest.digest();
            StringBuilder sb = new StringBuilder();

            for(byte b : byteArray){
                sb.append(String.format("%02x", b));
            }

            return  sb.toString();

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }


}
