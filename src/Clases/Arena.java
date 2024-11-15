/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author User
 */
public class Arena {
    Interfaz GUI;
    Personaje fighter1, fighter2;
    Franquicia franquicia1, franquicia2;
    Cola<Personaje> winners; 
    
    public Arena(Interfaz GUI){
        franquicia1 = new Franquicia("StarWars", GUI);
        franquicia2 = new Franquicia("StarTrek", GUI);
        winners = new Cola<>();
        this.GUI = GUI;
    }
    
    public Personaje chooseFighter(Franquicia fran){
        Personaje c = null;
        if(!fran.p1.isEmpty()){
            c = fran.p1.dispatch();
            if(fran.name.equals("StarWars"))
                GUI.updateP1QueueS1();
            else
                GUI.updateP1QueueS2();
        }
        else if(!fran.p2.isEmpty()){
            c = fran.p2.dispatch();
            if(fran.name.equals("StarWars"))
                GUI.updateP2QueueS1();
            else
                GUI.updateP2QueueS2();
        }
        else if(!fran.p3.isEmpty()){
            c = fran.p3.dispatch();
            if(fran.name.equals("StarWars"))
                GUI.updateP3QueueS1();
            else
                GUI.updateP3QueueS2();
        }
        return c;
    }
                    
    public Personaje[] getFighters(){
        Personaje[] fighters = new Personaje[2];
        fighters[0] = fighter1;
        fighters[1] = fighter2;
        return fighters;
    }
    
    public void addWinner(Personaje winner){
        winners.InsertInFinal(winner);
    }
}
