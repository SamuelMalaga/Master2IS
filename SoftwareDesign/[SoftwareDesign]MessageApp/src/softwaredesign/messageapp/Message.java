/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package softwaredesign.messageapp;

//import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author paulo
 */
public class Message {
    public String text;
    private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000); 
    private Integer messageId;
    public Date sendDate;
    public String timeStamp;
    public boolean messageRead;
    public User sender;
    public ArrayList<User> recievers;
    public ArrayList<Message> replies;
    
    public Message(ArrayList<User> _recievers, String _text, User _sender)
    {
        this.sender = _sender;
        this.text = _text;
        this.recievers = _recievers;
        this.replies = new ArrayList<Message>();
        this.messageId = ID_GENERATOR.getAndIncrement();
    }
    
    public int getMessageId(){
        return this.messageId;
    }
    
    public String showThread(){
        String replyMessage = "";
        String repliesMessageHeader = "\n--------REPLIES TO THIS MESSAGE --------\n";
        replyMessage += repliesMessageHeader;
        String repliesDisplayTemplate = "Replier %s| Content -> %s\n ";
        for(Message m:this.replies){
            String replyContent = repliesDisplayTemplate;
            String result = String.format(replyContent, m.sender.name, m.text);
            replyMessage += result;
        }
        return replyMessage;
        
    }
    
    
    @Override
    public String toString(){
        String msgHeader = "Message Sender -> %s | Message content -> %s | MESSAGE ID -> %s\n";
        String result = String.format(msgHeader,this.sender.name, this.text, this.getMessageId());
        String msgInfo = "Message sent to ->";
        for(User u:this.recievers ){
            msgInfo+=u.name + " | ";
        }
        result = result + msgInfo;
        if(!this.replies.isEmpty()){
            result += this.showThread();
        }
        return result;
    }
    
}
