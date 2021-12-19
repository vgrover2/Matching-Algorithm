
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vedantgrover
 */
public class ClientsPresent {
    private String Name;
    private String TopicName; 
    private int LevelOnTopic;
    private int PassionLevel; 
    private int NoOfPeopleToTeach; 
    
    public ClientsPresent(){
        
    }
    
    public ClientsPresent(String Name, String TopicName, int NoOfPeopleToTeach, int LevelOnTopic, int PassionLevel){
        this.Name=Name; 
        this.LevelOnTopic=LevelOnTopic;
        this.PassionLevel=PassionLevel;
        this.TopicName=TopicName; 
        this.NoOfPeopleToTeach=NoOfPeopleToTeach; 
    }
    
    public void setName(String Name){
        this.Name=Name; 
    }
    public void setTopicName(String TopicName){
        this.TopicName=TopicName; 
    }
    public void setNoOfPeopleToTeach(int NoOfPeopleToTeach){
        this.NoOfPeopleToTeach=NoOfPeopleToTeach; 
    }
    public void setLevelOnTopic(int LevelOnTopic){
        this.LevelOnTopic=LevelOnTopic; 
    }
    public void setPassionLevel(int PassionLevel){
        this.PassionLevel=PassionLevel;
    }
    public String getName(){
        return Name;
    }
    public String getTopicName(){
        return TopicName; 
    }  
    public int getNoOfPeopleToTeach(){
        return NoOfPeopleToTeach; 
    }
    public int getPassionLevel(){
        return PassionLevel; 
    } 
    public int getLevelOnTopic(){
        return LevelOnTopic; 
    }
    
}
