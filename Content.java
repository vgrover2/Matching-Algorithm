/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vedantgrover
 */
public class Content {
    private int TopicNo;
    private String TopicName;
    private int NoOfPeopleToTeach;
    public Content(int TopicNo, String TopicName, int NoOfPeopleToTeach)
    {
        this.NoOfPeopleToTeach=NoOfPeopleToTeach;
        this.TopicName=TopicName;
        this.TopicNo=TopicNo;
              
    } 
    public int getNoOfPeopleToTeach(){
        return NoOfPeopleToTeach;
    }
    public String getTopicName(){
        return TopicName;
    } 
    public int getTopicNo(){
        return TopicNo;
    } 
    
    
}

