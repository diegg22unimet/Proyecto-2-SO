/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author User
 */
public class IA extends Thread{
    Arena arena;
    int velocity;
    
    public IA(Arena arena, int velocity) {
        this.arena = arena;
        this.velocity = velocity;
    }
    
    public void processWinner(Personaje f1, Personaje f2){
        while (f1.getHp()> 0 && f2.getHp()> 0) {
            Personaje atacante, defensor;

            //Se determina quién ataca primero según la agilidad
            if (f1.getAgility()>= f2.getAgility()) {
                atacante = f1;
                defensor = f2;
            } else {
                atacante = f2;
                defensor = f1;
            }

            //Turno del atacante
            System.out.println(atacante.getName()+ " ataca.");
            boolean usarHabilidadEspecial = atacante.tieneVidaBaja();
            int danio = atacante.atacar(usarHabilidadEspecial);
            if (!defensor.evadir(atacante.getAgility())) {
                defensor.recibirDanio(danio);
                System.out.println(defensor.getName()+ " recibe " + danio + " de daño. Vida restante: " + defensor.getHp());
            } else {
                System.out.println(defensor.getName()+ " evade el ataque.");
            }
            
            //Verificar si el defensor ha sido derrotado
            if (defensor.getHp()<= 0) {
                System.out.println(defensor.getName()+ " ha sido derrotado.");
                arena.winners.InsertInFinal(atacante);
                if(atacante.name.equals(f1.name)){
                    arena.franquicia1.winners++;
                    arena.GUI.actualizarGanadores_SW(); 
                    arena.GUI.actualizarListaWinners_SW(f1.name + " (ID: " + f1.ID + ")");
                } else {
                    arena.franquicia2.winners++;
                    arena.GUI.actualizarGanadores_ST();
                    arena.GUI.actualizarListaWinners_ST(f2.name + " (ID: " + f2.ID + ")");
                }
                arena.GUI.mostrarResultado("Ganó " + atacante.name);
                break; // Sale del bucle si hay un ganador
            }

            //Se intercambian los roles para el siguiente turno
            Personaje temp = atacante;
            atacante = defensor;
            defensor = temp;
        }
    }
    
    public void processTie(Personaje fighter1, Personaje fighter2){
        //Ambos personajes son enviados a la cola de prioridad alta de últimos
        arena.franquicia1.addToP1(fighter1);
        arena.franquicia2.addToP1(fighter2);
        arena.GUI.actualizarP1_SW();
        arena.GUI.actualizarP1_ST();
        arena.GUI.mostrarResultado("Empate");
    }
    
    public void processNull(Personaje fighter1, Personaje fighter2){
        //Ambos personajes se mueven a la cola de resfuerzo
        arena.franquicia1.addToReinforcement(fighter1);
        arena.franquicia2.addToReinforcement(fighter2);
        arena.GUI.actualizarRef_SW();
        arena.GUI.actualizarRef_ST();
        arena.GUI.mostrarResultado("No se realizó");
    }
    
    public void setVelocity(int velocity){
        this.velocity = velocity;
    }
    
    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                arena.GUI.actualizarEstadoIA("Esperando");
                Personaje[] fighters = arena.getFighters();
                if(fighters[0] == null || fighters[1] == null){
                    continue;
                }
                // Wait for result
                arena.GUI.actualizarEstadoIA("Decidiendo");
                Thread.sleep(10*1000/(velocity));
                
                // Process result
                int random = (int)(Math.random() * 100);
                if(random <= 40){
                    processWinner(fighters[0], fighters[1]);
                } else if(random <= 67){
                    processTie(fighters[0], fighters[1]);
                } else {
                    processNull(fighters[0], fighters[1]);
                }     
                
                arena.GUI.actualizarEstadoIA("Resultado:");
                Thread.sleep(3*1000/(velocity));
                
                arena.GUI.mostrarResultado("Procesando");
                arena.fighter1 = null;
                arena.fighter2 = null;
            }   
        } catch(InterruptedException e){
            //Thread killed
        }
        
    }
}
