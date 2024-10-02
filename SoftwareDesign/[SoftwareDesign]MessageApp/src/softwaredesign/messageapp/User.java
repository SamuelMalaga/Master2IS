/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package softwaredesign.messageapp;

import java.util.ArrayList;



public class User {
    public String name;
    public String image= "default.jpg";
    public String welcomeMessage;
    protected String email;
    protected String DOB;
    
    public User(String _name,
            String _welcomeMessage,
            String _email,
            String _DOB)
    {
        this.name = _name;
        this.welcomeMessage = _welcomeMessage;
        this.email = _email;
        this.DOB = _DOB;   
    }
    public void setImage(String _image){
        this.image = _image;
    }
    
    public Message sendMessage(String _text, ArrayList<User> _recievers)
    {
        Message m = new Message(_recievers, _text, this);
        return m;
    }
    
    public void replyMessage(Message _message,String _text, ArrayList<User> _recievers ){
        Message reply = new Message(_recievers, _text, this );
        _message.replies.add(reply);
    }
    
    @Override
    public String toString(){
        String str = "User -> %s | Welcome message -> %s | email-> %s ";
        String result = String.format(str, this.name, this.welcomeMessage, this.email);
        return result;
    }
    
    
   
}
