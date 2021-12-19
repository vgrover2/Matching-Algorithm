/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vedantgrover
 */
public class LinkUser {
    private int Person_ID;
    private int TopicNo;
    private int LevelOnTopic; 
    private int LinkNo;
    private int PassionLevel;
    public LinkUser(int LinkNo, int Person_ID, int TopicNo, int LevelOnTopic, int PassionLevel){
        this.Person_ID=Person_ID;
        this.TopicNo=TopicNo;
        this.LevelOnTopic=LevelOnTopic;
        this.LinkNo=LinkNo;
        this.PassionLevel=PassionLevel;
        
    }
    public int getLinkNo(){
        return LinkNo;
    }
    public int getPerson_ID(){
        return Person_ID;
    } 
     public int getTopicNo(){
        return TopicNo;
    }
    public int getLevelOnTopic(){
        return LevelOnTopic; 
    }   
    public int getPassionLevel(){
        return PassionLevel;
    }
}
