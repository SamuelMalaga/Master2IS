/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package softwaredesign.messageapp;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author paulo
 */
public class SoftwareDesignMessageApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        User John = new User("John","John Welcome Message", "john@email.com","02/04/1999");
        User Mary = new User("Mary","Mary Welcome Message", "mary@email.com","03/04/1999");
        User Robert = new User("Robert","Robert Welcome Message", "robert@email.com","03/04/1999");
        ArrayList<User> recievers = new ArrayList<>(Arrays.asList(Robert,Mary));
        Message sentMessage = John.sendMessage("Hello All!", recievers);
        ArrayList<User> replyRecievers = new ArrayList<>(Arrays.asList(Robert,Mary));
        Mary.replyMessage(sentMessage, "Hi guys!", replyRecievers);
        Robert.replyMessage(sentMessage, "Hey everyone!", replyRecievers);
        System.out.println(sentMessage);
    }
    
}
