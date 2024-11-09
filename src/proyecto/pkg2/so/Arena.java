/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg2.so;

/**
 *
 * @author User
 */
public class Arena {
    Proyecto2GUI GUI;
    Character fighter1, fighter2;
    Franquicia fran1, fran2;
    Cola<Character> winners; 
    
    public Arena(Proyecto2GUI GUI){
        fran1 = new Franquicia("Star Wars", GUI);
        fran2 = new Franquicia("Star Trek", GUI);
        winners = new Cola<>();
        this.GUI = GUI;
    }
    
    public Character chooseFighter(Franquicia fran){
        Character c = null;
        if(!fran.p1.isEmpty()){
            c = fran.p1.dispatch();
            if(fran.name.equals("Star Wars"))
                GUI.updateP1QueueS1();
            else
                GUI.updateP1QueueS2();
        }
        else if(!fran.p2.isEmpty()){
            c = fran.p2.dispatch();
            if(fran.name.equals("Star Wars"))
                GUI.updateP2QueueS1();
            else
                GUI.updateP2QueueS2();
        }
        else if(!fran.p3.isEmpty()){
            c = fran.p3.dispatch();
            if(fran.name.equals("Star Wars"))
                GUI.updateP3QueueS1();
            else
                GUI.updateP3QueueS2();
        }
        return c;
    }
                    
    public Character[] getFighters(){
        Character[] fighters = new Character[2];
        fighters[0] = fighter1;
        fighters[1] = fighter2;
        return fighters;
    }
    
    public void addWinner(Character winner){
        winners.InsertInFinal(winner);
    }
}
