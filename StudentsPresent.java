

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vedantgrover
 */
public class StudentsPresent {
    
    //variables for one instance of a student 
    private String Name;
    private String TopicName; 
    private int LevelOnTopic; 
    private int PassionLevel;
    private int NoOfPeopleToTeach; 
    
    
    public StudentsPresent(){
        
    }
    
    //when program is run this constructor is called, arraylists of students and clients are created
    //assinging values for these variables for each student and client using the accessors and mutators
    
    public StudentsPresent(String Name, String TopicName, int NoOfPeopleToTeach, int LevelOnTopic, int PassionLevel){
        this.Name=Name;
        this.TopicName=TopicName; 
        this.PassionLevel=PassionLevel; 
        this.LevelOnTopic=LevelOnTopic; 
        this.NoOfPeopleToTeach=NoOfPeopleToTeach; 
        
    }
    
    //accessors
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
    
    //mutators
    public void setName(String Name){
        this.Name=Name; 
    }
    public void setTopicName(String TopicName){
        this.TopicName=TopicName; 
    } 
    public void setNoOfPeopleToTeach(int NoOfPeopleToTeach){
        this.NoOfPeopleToTeach=NoOfPeopleToTeach; 
    }
    public void setPassionLevel(int PassionLevel){
        this.PassionLevel=PassionLevel; 
    }
    public void setLevelOnTopic(int LevelOnTopic){
        this.LevelOnTopic=LevelOnTopic; 
    } 
    
}
