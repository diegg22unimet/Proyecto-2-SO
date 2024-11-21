/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Franquicia {
    String name;
    int winners;
    Cola<Personaje> p1, p2, p3, reinforcement;
    ListaEnlazada<Personaje> characters;
    Interfaz GUI;
    
    public Franquicia(String name, Interfaz GUI){
        this.name = name;
        this.GUI = GUI;
        p1 = new Cola<>();
        p2 = new Cola<>();
        p3 = new Cola<>();
        reinforcement = new Cola<>();
        characters = new ListaEnlazada<>();
        loadCharacters();
    }
    
    public void loadCharacters(){
        String filename = "src\\ArchivosTXT\\" + name + ".txt";
        
        try{
           File myObj = new File(filename);
           Scanner myReader = new Scanner(myObj);
           
           for(int i=0; i < 30; i++){
                String line = myReader.nextLine();
                String nameC = line;
                line = myReader.nextLine();
                int hp = Integer. parseInt(line.split(": ")[1]);
                line = myReader.nextLine();
                int strength = Integer. parseInt(line.split(": ")[1]);
                line = myReader.nextLine();
                int agility = Integer. parseInt(line.split(": ")[1]);
                line = myReader.nextLine();
                int ability = Integer. parseInt(line.split(": ")[1]);
                line = myReader.nextLine();
                Personaje newPersonaje = new Personaje(GUI.getID(), nameC, hp, strength, agility, ability);
                
                if(i < 10){
                    switch(newPersonaje.atributosCalidad){
                        case 0, 1 -> p3.InsertInFinal(newPersonaje);
                        case 2 -> p2.InsertInFinal(newPersonaje);
                        case 3, 4 -> p1.InsertInFinal(newPersonaje);                     
                    }
                
                }  else{
                    characters.append(newPersonaje);
                }
           }
        } catch (FileNotFoundException e) {
            System.out.println("Ha ocurrido un error");
            e.printStackTrace();
        }
    }
    
    public void addToP1(Personaje fighter){
        p1.InsertInFinal(fighter);
    }
    
    public void addToReinforcement(Personaje fighter){
        reinforcement.InsertInFinal(fighter);
    }
    
    public void addNewCharacterToQueue(){
        if(characters.getSize() > 0){
            Personaje c = characters.get(0);
            characters.delete(c);
            switch(c.atributosCalidad){
                case 0, 1 -> p3.InsertInFinal(c);
                case 2 -> p2.InsertInFinal(c);
                case 3, 4 -> p1.InsertInFinal(c);                     
            }
        }
    }
    
    public void checkReinforcement(){
        if(!reinforcement.isEmpty()){
            Personaje c = reinforcement.dispatch();
            int random = (int)(Math.random() * 100);
            if(random <= 40){
                p1.InsertInFinal(c);
                if(name.equals("StarWars")){
                    GUI.actualizarP1_SW();
                    GUI.actualizarRef_SW();
                }else{
                    GUI.actualizarP1_ST();
                    GUI.actualizarRef_ST();
                }
            }else{
                reinforcement.InsertInFinal(c);
                if(name.equals("StarWars")){
                    GUI.actualizarRef_SW();
                }else{
                    GUI.actualizarRef_ST();
                }
            }
        }
    }
    
    public void actualizarContador(){
        Node<Personaje> node = p2.getFirst();
        while(node != null){
            Personaje c = node.getElement();
            boolean movePriority = c.actualizarContador();
            if(movePriority){
                p2.removeN(c); //OJO
                p1.InsertInFinal(c);
                
                if(name.equals("StarWars")){
                    GUI.actualizarP1_SW();
                    GUI.actualizarP2_SW();
                }else{
                    GUI.actualizarP1_ST();
                    GUI.actualizarP2_ST();
                }
            }
            node = node.getNext();
        }
        
        node = p3.getFirst();
        while(node != null){
            Personaje c = node.getElement();
            boolean movePriority = c.actualizarContador();
            if(movePriority){
                p3.removeN(c); //OJO
                p2.InsertInFinal(c);
                
                if(name.equals("StarWars")){
                    GUI.actualizarP2_SW();
                    GUI.actualizarP3_SW();
                }else{
                    GUI.actualizarP2_ST();
                    GUI.actualizarP3_ST();
                }
            }
            node = node.getNext();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWinners() {
        return winners;
    }

    public void setWinners(int winners) {
        this.winners = winners;
    }

    public Cola<Personaje> getP1() {
        return p1;
    }

    public void setP1(Cola<Personaje> p1) {
        this.p1 = p1;
    }

    public Cola<Personaje> getP2() {
        return p2;
    }

    public void setP2(Cola<Personaje> p2) {
        this.p2 = p2;
    }

    public Cola<Personaje> getP3() {
        return p3;
    }

    public void setP3(Cola<Personaje> p3) {
        this.p3 = p3;
    }

    public Cola<Personaje> getReinforcement() {
        return reinforcement;
    }

    public void setReinforcement(Cola<Personaje> reinforcement) {
        this.reinforcement = reinforcement;
    }
    
}