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
        actualizarP1_SW();
        actualizarP2_SW();
        actualizarP3_SW();
        actualizarP1_ST();
        actualizarP2_ST();
        actualizarP3_ST();
    }
    
    int getID() {
        int ID = currentID;
        currentID++;
        return ID;
    }
    
    void actualizarP1_SW() {
        Franquicia studio1 = arena.franquicia1;
        Cola<Personaje> p1 = studio1.p1;
        String text = "";

        Node<Personaje> node = p1.getFirst();
        while (node != null) {
            text += " " + node.getElement().ID + ". - " + node.getElement().name + "\n";
            node = node.getNext();
        }

        P1Area_SW.setText(text);
    }
    
    void actualizarP2_SW() {
        Franquicia studio1 = arena.franquicia1;
        Cola<Personaje> p2 = studio1.p2;
        String text = "";

        Node<Personaje> node = p2.getFirst();
        while (node != null) {
            text += " " + node.getElement().ID + ". - " + node.getElement().name + "\n";
            node = node.getNext();
        }

        P2Area_SW.setText(text);
    }

    void actualizarP3_SW() {
        Franquicia studio1 = arena.franquicia1;
        Cola<Personaje> p3 = studio1.p3;
        String text = "";

        Node<Personaje> node = p3.getFirst();
        while (node != null) {
            text += " " + node.getElement().ID + ". - " + node.getElement().name + "\n";
            node = node.getNext();
        }

        P3Area_SW.setText(text);
    }

    void actualizarP1_ST() {
        Franquicia studio2 = arena.franquicia2;
        Cola<Personaje> p1 = studio2.p1;
        String text = "";

        Node<Personaje> node = p1.getFirst();
        while (node != null) {
            text += " " + node.getElement().ID + ". - " + node.getElement().name + "\n";
            node = node.getNext();
        }

        P1Area_ST.setText(text);
    }

    void actualizarP2_ST() {
        Franquicia studio2 = arena.franquicia2;
        Cola<Personaje> p2 = studio2.p2;
        String text = "";

        Node<Personaje> node = p2.getFirst();
        while (node != null) {
            text += " " + node.getElement().ID + ". - " + node.getElement().name + "\n";
            node = node.getNext();
        }

        P2Area_ST.setText(text);
    }

    void actualizarP3_ST() {
        Franquicia studio2 = arena.franquicia2;
        Cola<Personaje> p3 = studio2.p3;
        String text = "";

        Node<Personaje> node = p3.getFirst();
        while (node != null) {
            text += " " + node.getElement().ID + ". - " + node.getElement().name + "\n";
            node = node.getNext();
        }

        P3Area_ST.setText(text);
    }

    void actualizarRef_SW() {
        Franquicia studio1 = arena.franquicia1;
        Cola<Personaje> ref = studio1.reinforcement;
        String text = "";

        Node<Personaje> node = ref.getFirst();
        while (node != null) {
            text += " " + node.getElement().ID + ". - " + node.getElement().name + "\n";
            node = node.getNext();
        }

        P4Area_SW.setText(text);
    }

    void actualizarRef_ST() {
        Franquicia studio2 = arena.franquicia2;
        Cola<Personaje> ref = studio2.reinforcement;
        String text = "";

        Node<Personaje> node = ref.getFirst();
        while (node != null) {
            text += " " + node.getElement().ID + ". - " + node.getElement().name + "\n";
            node = node.getNext();
        }

        P4Area_ST.setText(text);
    }
    
    void actualizarArena_SW() {
        Personaje c = arena.fighter1;
        characterStarWars.setText(" " + c.name + ":\n  Salud: " + c.hp + "\n  Fuerza: " + c.strength + "\n  Agilidad: "
                + c.agility + "\n  Habilidad: " + c.ability);
    }

    void actualizarArena_ST() {
        Personaje c = arena.fighter2;
        characterStarTrek.setText(" " + c.name + ":\n  Salud: " + c.hp + "\n  Fuerza: " + c.strength + "\n  Agilidad: "
                + c.agility + "\n  Habilidad: " + c.ability);
    }

    void actualizarGanadores_SW() {
        totalWinners_SW.setText("" + arena.franquicia1.winners);
    }

    void actualizarGanadores_ST() {
        totalWinners_ST.setText("" + arena.franquicia2.winners);
    }
    
    void actualizarEstadoIA(String status) {
        matchStatus.setText("" + status);
    }

    void mostrarResultado(String result) {
        matchResult.setText("" + result);
    }

    void actualizarListaWinners_SW(String winner) {
        String before = winnerList_SW.getText();
        winnerList_SW.setText(before + winner + "\n");
    }

    void actualizarListaWinners_ST(String winner) {
        String before = winnerList_ST.getText();
        winnerList_ST.setText(before + winner + "\n");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        winnersList = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        winnerList_SW = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        winnerList_ST = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        characterStarWars = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        characterStarTrek = new javax.swing.JTextArea();
        matchResult = new javax.swing.JLabel();
        showWinners = new javax.swing.JButton();

        winnerList_SW.setColumns(20);
        winnerList_SW.setRows(5);
        jScrollPane3.setViewportView(winnerList_SW);

        winnerList_ST.setColumns(20);
        winnerList_ST.setRows(5);
        jScrollPane4.setViewportView(winnerList_ST);

        jLabel1.setText("Ganadores de Star Trek");

        jLabel2.setText("Ganadores de Star Wars");

        javax.swing.GroupLayout winnersListLayout = new javax.swing.GroupLayout(winnersList.getContentPane());
        winnersList.getContentPane().setLayout(winnersListLayout);
        winnersListLayout.setHorizontalGroup(
            winnersListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, winnersListLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(winnersListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(winnersListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(39, 39, 39))
        );
        winnersListLayout.setVerticalGroup(
            winnersListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(winnersListLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(winnersListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(winnersListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

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

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("VS");
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        matchStatus.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        matchStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        matchStatus.setText("...");

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

        logoStarWars.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/StarWars.png"))); // NOI18N

        logoStarTrek.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/StarTrek.png"))); // NOI18N

        startButton.setBackground(new java.awt.Color(255, 255, 255));
        startButton.setForeground(new java.awt.Color(255, 255, 255));
        startButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/BotonPlay.png"))); // NOI18N
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        speedLabel.setText("Velocidad");

        speedSimulation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        speedSimulation.setText("1");

        decreaseSpeed.setText("-");
        decreaseSpeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decreaseSpeedActionPerformed(evt);
            }
        });

        increaseSpeed.setText("+");
        increaseSpeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                increaseSpeedActionPerformed(evt);
            }
        });

        characterStarWars.setColumns(20);
        characterStarWars.setRows(5);
        jScrollPane1.setViewportView(characterStarWars);

        characterStarTrek.setColumns(20);
        characterStarTrek.setRows(5);
        jScrollPane2.setViewportView(characterStarTrek);

        matchResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        matchResult.setText("...");

        showWinners.setBackground(new java.awt.Color(255, 255, 255));
        showWinners.setForeground(new java.awt.Color(0, 0, 0));
        showWinners.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/BotonTrophy.png"))); // NOI18N
        showWinners.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showWinnersActionPerformed(evt);
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
                        .addGap(128, 128, 128)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainWindowLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(mainWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(mainWindowLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(mainWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(matchStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(matchResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 68, Short.MAX_VALUE)
                .addComponent(panelStarTrek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainWindowLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(logoStarWars)
                .addGroup(mainWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainWindowLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(mainWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainWindowLayout.createSequentialGroup()
                                .addComponent(decreaseSpeed)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(speedSimulation, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(speedLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(increaseSpeed))
                    .addGroup(mainWindowLayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addComponent(showWinners, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(104, 104, 104)
                .addComponent(logoStarTrek)
                .addGap(91, 91, 91))
        );
        mainWindowLayout.setVerticalGroup(
            mainWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainWindowLayout.createSequentialGroup()
                .addGroup(mainWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainWindowLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(mainWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logoStarTrek)
                            .addComponent(logoStarWars)))
                    .addGroup(mainWindowLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(mainWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showWinners, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(speedLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(speedSimulation)
                            .addComponent(increaseSpeed)
                            .addComponent(decreaseSpeed))))
                .addGap(35, 35, 35)
                .addGroup(mainWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelStarWars, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelStarTrek, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainWindowLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(matchStatus)
                        .addGap(18, 18, 18)
                        .addComponent(matchResult)
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel17)
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        int newVelocity = cpu.velocity + 1;
        cpu.setVelocity(newVelocity);
        speedSimulation.setText("" + newVelocity);
    }//GEN-LAST:event_increaseSpeedActionPerformed

    private void decreaseSpeedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decreaseSpeedActionPerformed
        // TODO add your handling code here:
        if (cpu.velocity > 1) {
            int newVelocity = cpu.velocity - 1;
            cpu.setVelocity(newVelocity);
            speedSimulation.setText("" + newVelocity);
        }
    }//GEN-LAST:event_decreaseSpeedActionPerformed

    private void showWinnersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showWinnersActionPerformed
        // TODO add your handling code here:
        winnersList.pack();
        winnersList.setVisible(true);
    }//GEN-LAST:event_showWinnersActionPerformed

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
    private javax.swing.JTextArea characterStarTrek;
    private javax.swing.JTextArea characterStarWars;
    private javax.swing.JButton decreaseSpeed;
    private javax.swing.JButton increaseSpeed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel logoStarTrek;
    private javax.swing.JLabel logoStarWars;
    private javax.swing.JPanel mainWindow;
    private javax.swing.JLabel matchResult;
    private javax.swing.JLabel matchStatus;
    private javax.swing.JPanel panelStarTrek;
    private javax.swing.JPanel panelStarWars;
    private javax.swing.JButton showWinners;
    private javax.swing.JLabel speedLabel;
    private javax.swing.JLabel speedSimulation;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel totalWinners_ST;
    private javax.swing.JLabel totalWinners_SW;
    private javax.swing.JTextArea winnerList_ST;
    private javax.swing.JTextArea winnerList_SW;
    private javax.swing.JDialog winnersList;
    // End of variables declaration//GEN-END:variables
}
