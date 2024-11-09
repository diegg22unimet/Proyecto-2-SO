/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg2.so;

/**
 *
 * @author User
 */
public class Admin extends Thread{
    IA cpu;
    Arena arena;
    int turn = 0;
    
    public Admin(Arena arena, IA cpu){
        this.arena = arena;
        this.cpu = cpu;
    }
    
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            Character[] fighters = arena.getFighters();
            if(fighters[0] != null || fighters[1] != null){
                continue;
            }
                          
            turn++;
            
            // Set fighters in arena
            arena.fighter1 = arena.chooseFighter(arena.fran1);
            arena.fighter2 = arena.chooseFighter(arena.fran2);
            if(arena.fighter1 == null || arena.fighter2 == null){
                Thread.currentThread().interrupt();
                cpu.interrupt();
                arena.GUI.updateIAStatus("Fin de Simulación");
                arena.GUI.updateResult("Fin de Simulación");
                break;
            }
            
            arena.GUI.updateArenaS1();
            arena.GUI.updateArenaS2();
            
            // Update queues
            arena.fran1.updateCounter();
            arena.fran2.updateCounter();
            arena.fran1.checkReinforcement();
            arena.fran2.checkReinforcement();
            
            if(turn % 3 == 0){
                int random = (int)(Math.random() * 100);
                if(random <= 80){
                    arena.fran1.addNewCharacterToQueue();
                    arena.fran2.addNewCharacterToQueue();
                }
            } 
        }   
    }
}

