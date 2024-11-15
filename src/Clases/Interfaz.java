/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Clases;

/**
 *
 * @author manza
 */
public class Interfaz extends javax.swing.JFrame {
    static Arena arena;
    static Admin admin;
    static IA cpu;
    int currentID = 0;
    

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        this.init();
    }
    
    private void init() {
        arena = new Arena(this);
        cpu = new IA(arena, 1);
        admin = new Admin(arena, cpu);
        updateP1QueueS1();
        updateP2QueueS1();
        updateP3QueueS1();
        updateP1QueueS2();
        updateP2QueueS2();
        updateP3QueueS2();
    }
    
    int getID() {
        int ID = currentID;
        currentID++;
        return ID;
    }
    
    void updateP1QueueS1() {
        Franquicia studio1 = arena.franquicia1;
        Cola<Personaje> p1 = studio1.p1;
        String text = "";

        Node<Personaje> node = p1.getFirst();
        while (node != null) {
            text += node.getElement().name + " (ID: " + node.getElement().ID + ")" + ", ";
            node = node.getNext();
        }

        P1Area_SW.setText(text);
    }
    
    void updateP2QueueS1() {
        Franquicia studio1 = arena.franquicia1;
        Cola<Personaje> p2 = studio1.p2;
        String text = "";

        Node<Personaje> node = p2.getFirst();
        while (node != null) {
            text += node.getElement().name + " (ID: " + node.getElement().ID + ")" + ", ";
            node = node.getNext();
        }

        P2Area_SW.setText(text);
    }

    void updateP3QueueS1() {
        Franquicia studio1 = arena.franquicia1;
        Cola<Personaje> p3 = studio1.p3;
        String text = "";

        Node<Personaje> node = p3.getFirst();
        while (node != null) {
            text += node.getElement().name + " (ID: " + node.getElement().ID + ")" + ", ";
            node = node.getNext();
        }

        P3Area_SW.setText(text);
    }

    void updateP1QueueS2() {
        Franquicia studio2 = arena.franquicia2;
        Cola<Personaje> p1 = studio2.p1;
        String text = "";

        Node<Personaje> node = p1.getFirst();
        while (node != null) {
            text += node.getElement().name + " (ID: " + node.getElement().ID + ")" + ", ";
            node = node.getNext();
        }

        P1Area_ST.setText(text);
    }

    void updateP2QueueS2() {
        Franquicia studio2 = arena.franquicia2;
        Cola<Personaje> p2 = studio2.p2;
        String text = "";

        Node<Personaje> node = p2.getFirst();
        while (node != null) {
            text += node.getElement().name + " (ID: " + node.getElement().ID + ")" + ", ";
            node = node.getNext();
        }

        P3Area_ST.setText(text);
    }

    void updateP3QueueS2() {
        Franquicia studio2 = arena.franquicia2;
        Cola<Personaje> p3 = studio2.p3;
        String text = "";

        Node<Personaje> node = p3.getFirst();
        while (node != null) {
            text += node.getElement().name + " (ID: " + node.getElement().ID + ")" + ", ";
            node = node.getNext();
        }

        P3Area_ST.setText(text);
    }

    void updateRefQueueS1() {
        Franquicia studio1 = arena.franquicia1;
        Cola<Personaje> ref = studio1.reinforcement;
        String text = "";

        Node<Personaje> node = ref.getFirst();
        while (node != null) {
            text += node.getElement().name + " (ID: " + node.getElement().ID + ")" + ", ";
            node = node.getNext();
        }

        P4Area_SW.setText(text);
    }

    void updateRefQueueS2() {
        Franquicia studio2 = arena.franquicia2;
        Cola<Personaje> ref = studio2.reinforcement;
        String text = "";

        Node<Personaje> node = ref.getFirst();
        while (node != null) {
            text += node.getElement().name + " (ID: " + node.getElement().ID + ")" + ", ";
            node = node.getNext();
        }

        P4Area_ST.setText(text);
    }
    
    void updateArenaS1() {
//        Character c = arena.fighter1;
//        nintendoArena.setText(c.name + ":\n  --HP: " + c.hitPoints + "\n  --Strength: " + c.strength + "\n  --Agiity: "
//                + c.agility + "\n  --Abilities: " + c.abilities);
    }

    void updateArenaS2() {
//        Character c = arena.fighter2;
//        capcomArena.setText(c.name + ":\n  --HP: " + c.hitPoints + "\n  --Strength: " + c.strength + "\n  --Agiity: "
//                + c.agility + "\n  --Abilities: " + c.abilities);
    }
    
    void updateIAStatus(String status) {
//        statusText.setText("Estado Actual: " + status);
    }

    void updateGamesWonS1() {
//        nintendoGamesWon.setText("Juegos Ganados por Avatar: " + arena.studio1.winners);
    }

    void updateGamesWonS2() {
//        capcomGamesWon.setText("Juegos Ganados por Un Show Más: " + arena.studio2.winners);
    }

    void updateResult(String result) {
//        resultText.setText("Resultado: \n" + result);
    }

    void updateS1Winners(String winner) {
//        String before = s1Winners.getText();
//        s1Winners.setText(before + winner + "\n");
    }

    void updateS2Winners(String winner) {
//        String before = s2Winners.getText();
//        s2Winners.setText(before + winner + "\n");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainWindow = new javax.swing.JPanel();
        panelStarWars = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        totalWinners_SW = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        P1Area_SW = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        P2Area_SW = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        P4Area_SW = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        P3Area_SW = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        characterStarTrek = new javax.swing.JLabel();
        characterStarWars = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        matchStatus = new javax.swing.JLabel();
        panelStarTrek = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        totalWinners_ST = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        P1Area_ST = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        P2Area_ST = new javax.swing.JTextArea();
        jScrollPane15 = new javax.swing.JScrollPane();
        P4Area_ST = new javax.swing.JTextArea();
        jScrollPane16 = new javax.swing.JScrollPane();
        P3Area_ST = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        logoStarWars = new javax.swing.JLabel();
        logoStarTrek = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        speedLabel = new javax.swing.JLabel();
        speedSimulation = new javax.swing.JLabel();
        decreaseSpeed = new javax.swing.JButton();
        increaseSpeed = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelStarWars.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Prioridad alta");

        jLabel4.setText("Prioridad baja");

        jLabel5.setText("Prioridad media");

        totalWinners_SW.setBackground(new java.awt.Color(153, 255, 204));
        totalWinners_SW.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        totalWinners_SW.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalWinners_SW.setText("0");

        jLabel12.setText("Combates ganados");

        P1Area_SW.setColumns(20);
        P1Area_SW.setRows(5);
        jScrollPane9.setViewportView(P1Area_SW);

        P2Area_SW.setColumns(20);
        P2Area_SW.setRows(5);
        jScrollPane10.setViewportView(P2Area_SW);

        P4Area_SW.setColumns(20);
        P4Area_SW.setRows(5);
        jScrollPane11.setViewportView(P4Area_SW);

        P3Area_SW.setColumns(20);
        P3Area_SW.setRows(5);
        jScrollPane12.setViewportView(P3Area_SW);

        jLabel6.setText("Resfuerzos");

        javax.swing.GroupLayout panelStarWarsLayout = new javax.swing.GroupLayout(panelStarWars);
        panelStarWars.setLayout(panelStarWarsLayout);
        panelStarWarsLayout.setHorizontalGroup(
            panelStarWarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelStarWarsLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(66, 66, 66))
            .addGroup(panelStarWarsLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelStarWarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(panelStarWarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
            .addGroup(panelStarWarsLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(78, 78, 78))
            .addGroup(panelStarWarsLayout.createSequentialGroup()
                .addGroup(panelStarWarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelStarWarsLayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(totalWinners_SW, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelStarWarsLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelStarWarsLayout.setVerticalGroup(
            panelStarWarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStarWarsLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalWinners_SW, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelStarWarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelStarWarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(jScrollPane9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelStarWarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelStarWarsLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelStarWarsLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );

        characterStarTrek.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        characterStarWars.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("VS");
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        matchStatus.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        matchStatus.setText("ESTATUS JUEGO");

        panelStarTrek.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("Prioridad alta");

        jLabel8.setText("Prioridad baja");

        jLabel9.setText("Prioridad media");

        totalWinners_ST.setBackground(new java.awt.Color(153, 255, 204));
        totalWinners_ST.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        totalWinners_ST.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalWinners_ST.setText("0");

        jLabel14.setText("Combates ganados");

        P1Area_ST.setColumns(20);
        P1Area_ST.setRows(5);
        jScrollPane13.setViewportView(P1Area_ST);

        P2Area_ST.setColumns(20);
        P2Area_ST.setRows(5);
        jScrollPane14.setViewportView(P2Area_ST);

        P4Area_ST.setColumns(20);
        P4Area_ST.setRows(5);
        jScrollPane15.setViewportView(P4Area_ST);

        P3Area_ST.setColumns(20);
        P3Area_ST.setRows(5);
        jScrollPane16.setViewportView(P3Area_ST);

        jLabel10.setText("Resfuerzos");

        javax.swing.GroupLayout panelStarTrekLayout = new javax.swing.GroupLayout(panelStarTrek);
        panelStarTrek.setLayout(panelStarTrekLayout);
        panelStarTrekLayout.setHorizontalGroup(
            panelStarTrekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStarTrekLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelStarTrekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(panelStarTrekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
            .addGroup(panelStarTrekLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(78, 78, 78))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelStarTrekLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelStarTrekLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelStarTrekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelStarTrekLayout.createSequentialGroup()
                        .addComponent(totalWinners_ST, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelStarTrekLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(152, 152, 152))))
        );
        panelStarTrekLayout.setVerticalGroup(
            panelStarTrekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStarTrekLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalWinners_ST, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelStarTrekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelStarTrekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(jScrollPane13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelStarTrekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelStarTrekLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelStarTrekLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );

        logoStarWars.setText("LOGO STAR WARS");

        logoStarTrek.setText("LOGO STAR TREK");

        startButton.setText("INICIAR");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        speedLabel.setText("Velocidad");

        speedSimulation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        speedSimulation.setText("1");

        decreaseSpeed.setText("-");

        increaseSpeed.setText("+");
        increaseSpeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                increaseSpeedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainWindowLayout = new javax.swing.GroupLayout(mainWindow);
        mainWindow.setLayout(mainWindowLayout);
        mainWindowLayout.setHorizontalGroup(
            mainWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainWindowLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(panelStarWars, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(mainWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainWindowLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(matchStatus))
                    .addGroup(mainWindowLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(mainWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(characterStarTrek, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(characterStarWars, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mainWindowLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(panelStarTrek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainWindowLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(logoStarWars)
                .addGap(170, 170, 170)
                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainWindowLayout.createSequentialGroup()
                        .addComponent(decreaseSpeed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(speedSimulation, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(speedLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(increaseSpeed)
                .addGap(230, 230, 230)
                .addComponent(logoStarTrek)
                .addGap(167, 167, 167))
        );
        mainWindowLayout.setVerticalGroup(
            mainWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainWindowLayout.createSequentialGroup()
                .addGroup(mainWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainWindowLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainWindowLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(mainWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(logoStarWars)
                            .addComponent(logoStarTrek)))
                    .addGroup(mainWindowLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(speedLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(speedSimulation)
                            .addComponent(increaseSpeed)
                            .addComponent(decreaseSpeed))))
                .addGap(56, 56, 56)
                .addGroup(mainWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelStarWars, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelStarTrek, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainWindowLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(matchStatus)
                        .addGap(68, 68, 68)
                        .addComponent(characterStarWars, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel17)
                        .addGap(33, 33, 33)
                        .addComponent(characterStarTrek, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        // TODO add your handling code here:
        admin.start();
        cpu.start();
    }//GEN-LAST:event_startButtonActionPerformed

    private void increaseSpeedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_increaseSpeedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_increaseSpeedActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea P1Area_ST;
    private javax.swing.JTextArea P1Area_SW;
    private javax.swing.JTextArea P2Area_ST;
    private javax.swing.JTextArea P2Area_SW;
    private javax.swing.JTextArea P3Area_ST;
    private javax.swing.JTextArea P3Area_SW;
    private javax.swing.JTextArea P4Area_ST;
    private javax.swing.JTextArea P4Area_SW;
    private javax.swing.JLabel characterStarTrek;
    private javax.swing.JLabel characterStarWars;
    private javax.swing.JButton decreaseSpeed;
    private javax.swing.JButton increaseSpeed;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel logoStarTrek;
    private javax.swing.JLabel logoStarWars;
    private javax.swing.JPanel mainWindow;
    private javax.swing.JLabel matchStatus;
    private javax.swing.JPanel panelStarTrek;
    private javax.swing.JPanel panelStarWars;
    private javax.swing.JLabel speedLabel;
    private javax.swing.JLabel speedSimulation;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel totalWinners_ST;
    private javax.swing.JLabel totalWinners_SW;
    // End of variables declaration//GEN-END:variables
}
