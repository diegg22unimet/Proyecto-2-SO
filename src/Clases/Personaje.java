/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author User
 */
public class Personaje {
    
    int ID; //id del personaje
    int priority; 
    int counter; // contador para aumentar prioridad
    String name;
    int atributosCalidad = 0;
    int hp, strength, agility, ability; //atributos
    
    public Personaje(int ID, String name, int ph, int stregth, int agility, int ability){
        this.ID = ID;
        this.name = name;
        this.hp = hp;
        this.strength = strength;
        this.agility = agility;
        this.ability = ability;
        counter = 0;
        getInitialPriority();
    }
    
    public void checkQuality(int probability){
        int random = (int)(Math.random() * 100);
        if(random <= probability){
            atributosCalidad++;
        }   
    }
    
    public boolean updateCounter(){
        counter++;
        if(counter == 8){
            if(priority != 1){
                counter = 0;
                priority -= 1;
                return true;
            }
        }
        return false;
    }
    
    //Basicamente se cuantan los atributos que pasaron la prueva de calidad y en base al nro se designa la prioridad
    public void getInitialPriority(){
        checkQuality(60); //Abilities
        checkQuality(70); // ph
        checkQuality(50); // Strenght
        checkQuality(40); // Agility
        
        switch(atributosCalidad){
            case 0, 1 -> priority = 3;
            case 2 -> priority = 2;
            case 3, 4 -> priority = 1;                     
        }
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}

