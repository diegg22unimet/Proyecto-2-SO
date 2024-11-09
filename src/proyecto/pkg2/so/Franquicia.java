/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg2.so;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Franquicia {
    String name;
    int winners;
    Cola<Character> p1, p2, p3, reinforcement;
    Cola<Personaje> characters;
    Proyecto2GUI GUI;
    
    public Franquicia(String name, Proyecto2GUI GUI){
        this.name = name;
        this.GUI = GUI;
        p1 = new Cola<>();
        p2 = new Cola<>();
        p3 = new Cola<>();
        reinforcement = new Cola<>();
        characters = new Cola<>();
        loadCharacters();
    }
    
    public void loadCharacters(){
        String filename = System.getProperty("user.dir") + "\\src\\" + name + "Characters.txt" ;
      
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
                String abilities = line.split(": ")[1];
                line = myReader.nextLine();
                Personaje newCharacter = new Personaje(GUI.getID(), nameC, hp, strength, agility, abilities);
                
                if(i < 10){
                    switch(newCharacter.atributasCalidad){
                        case 0, 1 -> p3.InsertInFinal(newCharacter);
                        case 2 -> p2.InsertInFinal(newCharacter);
                        case 3, 4 -> p1.InsertInFinal(newCharacter);                     
                    }
                
                }  else{
                    characters.InsertInFinal(newCharacter);
                }
           }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    public void addToP1(Character fighter){
        p1.InsertInFinal(fighter);
    }
    
    public void addToReinforcement(Character fighter){
        reinforcement.InsertInFinal(fighter);
    }
    
    public void addNewCharacterToQueue(){
        if(characters.getSize() > 0){
            Node<Personaje> node = characters.getFirst();
            Personaje c = node.getElement();
            characters.remove();
            switch(c.atributasCalidad){
                case 0, 1 -> p3.InsertInFinal(c);
                case 2 -> p2.InsertInFinal(c);
                case 3, 4 -> p1.InsertInFinal(c);                     
            }
        }
    }
    
    public void checkReinforcement(){
        if(!reinforcement.isEmpty()){
            Character c = reinforcement.dispatch();
            int random = (int)(Math.random() * 100);
            if(random <= 40){
                p1.InsertInFinal(c);
                if(name.equals("Star Wars")){
                    GUI.updateP1QueueS1();
                    GUI.updateRefQueueS1();
                }else{
                    GUI.updateP1QueueS2();
                    GUI.updateRefQueueS2();
                }
            }else{
                reinforcement.InsertInFinal(c);
                if(name.equals("Star Wars")){
                    GUI.updateRefQueueS1();
                }else{
                    GUI.updateRefQueueS2();
                }
            }
        }
    }
    
    public void updateCounter(){
        Node<Personaje> node = p2.getFirst();
        while(node != null){
            Personaje c = node.getElement();
            boolean movePriority = c.updateCounter();
            if(movePriority){
                p2.remove();
                p1.InsertInFinal(c);
                
                if(name.equals("Star Wars")){
                    GUI.updateP1QueueS1();
                    GUI.updateP2QueueS1();
                }else{
                    GUI.updateP1QueueS2();
                    GUI.updateP2QueueS2();
                }
            }
            node = node.getNext();
        }
        
        node = p3.getFirst();
        while(node != null){
            Personaje c = node.getElement();
            boolean movePriority = c.updateCounter();
            if(movePriority){
                p3.remove();
                p2.InsertInFinal(c);
                
                if(name.equals("Star Wars")){
                    GUI.updateP2QueueS1();
                    GUI.updateP3QueueS1();
                }else{
                    GUI.updateP2QueueS2();
                    GUI.updateP3QueueS2();
                }
            }
            node = node.getNext();
        }
    }
}