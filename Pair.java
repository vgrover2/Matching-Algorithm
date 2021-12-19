/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vedantgrover
 */
public class Pair {
    
    //all the variables of an instance of a pair
    private String ClientName; 
    private String StudentName; 
    private String TopicName; 
    private String Name2;
    
    public Pair(){
    }
    //two constructors used below because in the case of uneven pairings,
    //an extra name will be needed (name2)
    
    public Pair(String ClientName, String StudentName, String TopicName){
        this.ClientName = ClientName;
        this.StudentName = StudentName;
        this.TopicName = TopicName;
        this.Name2 = null;
    }
    
    public Pair(String ClientName, String TopicName, String StudentName, String Name2) {
        this.ClientName = ClientName;
        this.TopicName = TopicName; 
        this.StudentName = StudentName; 
        this.Name2 = Name2;
    }
    
    //accessors
    public String getClientName(){
        return ClientName; 
    } 
    public String getStudentName(){
        return StudentName; 
    } 
    public String getTopicName(){
        return TopicName; 
    } 
    public String getName2(){
        return Name2;
    }
    
    //mutators
    public void setClientName(String ClientName){
        this.ClientName=ClientName;
    } 
    public void setStudentName(String StudentName){
        this.StudentName=StudentName; 
    }
    public void setTopicName(String TopicName){
        this.TopicName=TopicName;
    }
    public void setName2(String Name2){
        this.Name2=Name2;
    }
    
}
