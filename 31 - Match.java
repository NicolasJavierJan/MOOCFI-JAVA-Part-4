/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nico
 */
public class Match {
    private String local;
    private String visitor;
    private int localPoints;
    private int visitorPoints;
    
    public Match(String local, String visitor, int localPoints, int visitorPoints){
        this.local = local;
        this.visitor = visitor;
        this.localPoints = localPoints;
        this.visitorPoints = visitorPoints;
    }
    
    public String getLocalName(){
        return local;
    }
    
    public String getVisitorName(){
        return visitor;
    }
    
    public int getLocalPoints(){
        return localPoints;
    }
    
    public int getVisitorPoints(){
        return visitorPoints;
    }
}
