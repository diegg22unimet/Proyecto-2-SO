/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg2.so;

/**
 *
 * @author User
 */
public class Personaje {
    
    int ID; //id del personaje
    int priority; 
    int counter; // contador para aumentar prioridad
    String name;
    int atributasCalidad = 0; //contador de atributos de calidad
    int ph, strength, agility; //atributos
    int nAbilities; // se cuenta los elementos de la lista
    String abilities; //nombre de las habilidades, se le pasa una lista con varios nombres
    
    public Personaje(int ID, String name, int ph, int stregth, int agility, String abilities){
        this.ID = ID;
        this.name = name;
        this.ph = ph;
        this.strength = stregth;
        this.agility = agility;
        this.abilities = abilities;
        this.nAbilities = abilities.split(",").length; // de esta forma se cuentan los elementos de la lista 
        counter = 0;
        getInitialPriority();
    }
    
    //En esta funcion se le pasa el % de probabilidad y aleatoriamente se saca un numero 
    //se verifica si el numero aleatorio esta dentro de la probabilidad asignada, de ser asi se considera un atributo de calidad
    public void checkQuality(int probability){
        int random = (int)(Math.random() * 100);
        if(random <= probability){
            atributasCalidad++;
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
        
        switch(atributasCalidad){
            case 0, 1 -> priority = 3;
            case 2 -> priority = 2;
            case 3, 4 -> priority = 1;                     
        }
    }
}

