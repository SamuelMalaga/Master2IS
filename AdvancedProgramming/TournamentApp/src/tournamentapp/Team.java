/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tournamentapp;

/**
 *
 * @author luffy
 */
public class Team {
    private String name;
    private String country;
    
    public Team(String _name, String _country)
    {
        this.name = _name;
        this.country = _country;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getCountry()
    {
        return this.country;
    }
    
    public void setName(String _name)
    {
        this.name = _name;
    }
    
    public void setCountry(String _country)
    {
        this.country = _country;
    }
    
    public String toString()
    {
        return this.name;
    }
}
