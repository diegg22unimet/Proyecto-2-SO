/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Random;

/**
 *
 * @author User
 */
public class Personaje {
    
    int ID;
    int priority; 
    int counter; //Contador para aumentar prioridad
    String name;
    int atributosCalidad = 0;
    int hp, strength, agility, ability, hp_max; //Atributos de combate
    
    public Personaje(int ID, String name, int hp, int strength, int agility, int ability){
        this.ID = ID;
        this.name = name;
        this.hp = hp;
        this.strength = strength;
        this.agility = agility;
        this.ability = ability;
        this.hp_max = hp;
        counter = 0;
        getInitialPriority();
    }
    
    public int atacar(boolean usarHabilidadEspecial) {
        Random rand = new Random();
        double multiplicadorCritico = (rand.nextInt(100) < ability * 10) ? 1.5 : 1.0;
        int danio = (int) (strength * multiplicadorCritico);

        //Usar habilidad especial si se activa
        if (usarHabilidadEspecial) {
            danio *= 2; // Doble daño
            System.out.println(name + " usa su habilidad especial!");
        }
        return danio;
    }
    
    public boolean evadir(int ataqueAgilidad) {
        Random rand = new Random();
        double probabilidadEvasion = (double) agility / (agility + ataqueAgilidad);
        return rand.nextDouble() < probabilidadEvasion;
    }
    
    public void recibirDanio(int danio) {
        hp -= danio;
        if (hp < 0) hp = 0;
    }
    
    public void curarse(int cantidad) {
        hp += cantidad;
        if (hp > hp_max) hp = hp_max; // No superar la vida máxima
    }
    
    public boolean tieneVidaBaja() {
        //Se activa si la vida está por debajo del 30%
        return hp < hp_max * 0.3;
    }
    
    public void comprobarCalidad(int probability){
        int random = (int)(Math.random() * 100);
        if(random <= probability){
            atributosCalidad++;
        }   
    }
    
    public boolean actualizarContador(){
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
    
    //Basicamente se cuentan los atributos que pasaron la prueva de calidad y en base al nro se designa la prioridad
    public void getInitialPriority(){
        comprobarCalidad(60); //Ability
        comprobarCalidad(70); //HP
        comprobarCalidad(50); //Strenght
        comprobarCalidad(40); //Agility
        
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

    public int getHp() {
        return hp;
    }

    public int getAgility() {
        return agility;
    }

    public int getHp_max() {
        return hp_max;
    }
 
}

