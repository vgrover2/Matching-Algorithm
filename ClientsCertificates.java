/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vedantgrover
 */
public class ClientsCertificates {
    //private variables 
    private String Name; 
    private String TopicName; 
    
    public ClientsCertificates(){
        
    }
    //constructor
    public ClientsCertificates(String Name, String TopicName){
        this.Name = Name;
        this.TopicName = TopicName; 
        
    }
    //mutators
    public void setName(String Name){
        this.Name = Name;
    }
    public void setTopicName(String TopicName){
        this.TopicName = TopicName; 
    }
    //accessors
    public String getName() {
        return Name; 
    }
    public String getTopicName(){
        return TopicName; 
    }
    
}
