/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jasper
 */
public class Player {
    private String name;
    private char token;
    private int score;
    
    public Player(String name, char token){
        this.name = name;
        this.token = token;
    }
    
    public String getName(){
        return name;
        
    }
    
    public char getToken(){
        return token;
    }
    
    public int getScore(){
        return score;
    }
    
    public void addScore(){
        score++;
    }
}
