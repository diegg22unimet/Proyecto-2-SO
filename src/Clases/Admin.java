/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

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
            Personaje[] fighters = arena.getFighters();
            if(fighters[0] != null || fighters[1] != null){
                continue;
            }
                          
            turn++;
            
            // Setear peleadores en la arena
            arena.fighter1 = arena.chooseFighter(arena.franquicia1);
            arena.fighter2 = arena.chooseFighter(arena.franquicia2);
            if(arena.fighter1 == null || arena.fighter2 == null){
                Thread.currentThread().interrupt();
                cpu.interrupt();
                arena.GUI.actualizarEstadoIA("Fin de Simulación");
                arena.GUI.mostrarResultado("Fin de Simulación");
                break;
            }
            
            arena.GUI.actualizarArena_SW();
            arena.GUI.actualizarArena_ST();
            
            // Actualizar las colas
            arena.franquicia1.actualizarContador();
            arena.franquicia2.actualizarContador();
            arena.franquicia1.checkReinforcement();
            arena.franquicia2.checkReinforcement();
            
            if(turn % 3 == 0){
                int random = (int)(Math.random() * 100);
                if(random <= 80){
                    arena.franquicia1.addNewCharacterToQueue();
                    arena.franquicia2.addNewCharacterToQueue();
                }
            } 
        }   
    }
}

