/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vedantgrover
 */
public class PeopleUser {
    private int Id;
    private String ClientOrStudent;
    private String Name;  
    public PeopleUser(int Id, String ClientOrStudent, String Name)
    {
        this.Id=Id;
        this.ClientOrStudent=ClientOrStudent;
        this.Name=Name;
    }
    public int getId(){
        return Id;
    } 
    public String getClientOrStudent(){
        return ClientOrStudent;
    }
    public String getName(){
        return Name;
    }
    
}
