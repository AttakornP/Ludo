package ludo;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cartoonmed
 */
public class BoardPanel extends javax.swing.JPanel {

    /**
     * Creates new form BoardPanel
     */
    //Yellow
    public int poX_Y[] = {298,251,251,251,251,216,162,108,54,18,54,108,162,216,251,251,251,251,298,361,361,361,361,395,450,503,557,594,557,503,450,395,361,361,361,361,306,306,306,306};
    public int poY_Y[] = {595,558,504,451,395,360,360,360,360,301,251,251,251,251,217,162,109,54,19,54,109,162,216,251,251,251,251,301,360,360,360,360,395,451,504,558,558,504,451,395};
 
 //Red
    public int poX_R[] = {298,361,361,361,361,395,450,503,557,594,557,503,450,395,361,361,361,361,298,251,251,251,251,216,162,108,54,18,54,108,162,216,251,251,251,251,306,306,306,306};
    public int poY_R[] = {19,54,109,162,216,251,251,251,251,301,360,360,360,360,395,451,504,558,595,558,504,451,395,360,360,360,360,301,251,251,251,251,217,162,109,54,54,109,162,216};
 
 //Green
    public int poX_G[] = {18,54,108,162,216,251,251,251,251,298,361,361,361,361,395,450,503,557,594,557,503,450,395,361,361,361,361,298,251,251,251,251,216,162,108,54,54,108,162,216};
    public int poY_G[] = {301,251,251,251,251,217,162,109,54,19,54,109,162,216,251,251,251,251,301,360,360,360,360,395,451,504,558,595,558,504,451,395,360,360,360,360,305,305,305,305};
    
 //Blue
    public int poX_B[] = {594,557,503,450,395,361,361,361,361,298,251,251,251,251,216,162,108,54,18,54,108,162,216,251,251,251,251,298,361,361,361,361,395,450,503,557,557,503,450,395};
    public int poY_B[] = {301,301,360,360,360,360,395,451,504,558,595,558,504,451,395,360,360,360,360,301,251,251,251,251,217,162,109,54,19,54,109,162,216,251,251,251,251,305,305,305,305};
  
    //==Player
        Player P1 = new Player();
        Player P2 = new Player();
        Player P3 = new Player();
        Player P4 = new Player();   
    
        private int round = 1;
    
    public BoardPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        LayerBG = new javax.swing.JLayeredPane();
        LayerP1_1 = new javax.swing.JLayeredPane();
        LabelP1_1 = new javax.swing.JLabel();
        LayerP2_1 = new javax.swing.JLayeredPane();
        LabelP2_1 = new javax.swing.JLabel();
        LayerP3_1 = new javax.swing.JLayeredPane();
        LabelP3_1 = new javax.swing.JLabel();
        LayerP4_1 = new javax.swing.JLayeredPane();
        LabelP4_1 = new javax.swing.JLabel();
        LabelBG = new javax.swing.JLabel();
        bt_roll_die = new javax.swing.JButton();
        
        
        
        //set Player position to start
        P1.setPoX_start(108);
        P1.setPoY_start(184);
        P2.setPoX_start(162);
        P2.setPoY_start(475);
        P3.setPoX_start(432);
        P3.setPoY_start(495);
        P4.setPoX_start(433);
        P4.setPoY_start(127);
        P1.settable_current(0);
        
        
        
        
        bt_roll_die.setText("Die");
        bt_roll_die.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_roll_dieActionPerformed(evt);
            }
        });        
        bt_roll_die.setBounds(570, 580, 80, 70);
        LayerP4_1.add(bt_roll_die, javax.swing.JLayeredPane.DEFAULT_LAYER);
        
        //==Add BG 
        Icon BG = new ImageIcon("../Ludo/img/Ludo.png");
        LabelBG = new JLabel(BG);
        //==
        
        //==Add player Red 
        Icon P1_1 = new ImageIcon("../Ludo/img/Red.png");
        LabelP1_1 = new JLabel(P1_1);
        //==
        
        //==Add player Green 
        Icon P2_1 = new ImageIcon("../Ludo/img/Green.png");
        LabelP2_1 = new JLabel(P2_1);
        
        //==Add player Yellow 
        Icon P3_1 = new ImageIcon("../Ludo/img/Yellow.png");
        LabelP3_1 = new JLabel(P3_1);
        //==
        
        //==Add player Blue 
        Icon P4_1 = new ImageIcon("../Ludo/img/Blue.png");
        LabelP4_1 = new JLabel(P4_1);

        //==

        setBackground(new java.awt.Color(255, 51, 51));
        setPreferredSize(new java.awt.Dimension(850, 650));
        
        //== Layer P4_1
        //LabelP4_1.setBounds(433, 127, 36, 36);
        LayerP4_1.add(LabelP4_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        LayerP4_1.setBounds(0, 0, 650, 650);
        LayerP3_1.add(LayerP4_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        
        
        //== Layer P3_1
        LabelP3_1.setBounds(432, 495, 36, 36);
        LayerP3_1.add(LabelP3_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        LayerP3_1.setBounds(0, 0, 650, 650);
        LayerP2_1.add(LayerP3_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        
        //== Layer P2_1
        LabelP2_1.setBounds(162, 475, 36, 36);
        LayerP2_1.add(LabelP2_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        LayerP2_1.setBounds(0, 0, 650, 650);
        LayerP1_1.add(LayerP2_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        
        //== Layer P1_1
        LabelP1_1.setBounds(108, 184, 36, 36);
        LayerP1_1.add(LabelP1_1, javax.swing.JLayeredPane.DEFAULT_LAYER); 
        LayerP1_1.setBounds(0, 0, 650, 650);
        LayerBG.add(LayerP1_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        
        //== Layer BG
        LabelBG.setBounds(0, 0, 850, 650);
        LayerBG.add(LabelBG, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LayerBG, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LayerBG, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
    }// </editor-fold>
    
    
        private void bt_roll_dieActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Die point = new Die();
        Move nextP = new Move();
        int point_die = point.roll_die();
        Icon P4_1 = new ImageIcon("../Ludo/img/Blue.png");
        bt_roll_die.setIcon(P4_1);
        int nextT = 0;
        int x = 0;
        int y = 0;        
        //==P1 Red Play     
        if(round % 4 == 1){
            nextT = nextP.nextPosition(P1.gettable_current(), point_die);
            P1.settable_current(nextT);

            x = poX_R[P1.gettable_current()];
            y = poY_R[P1.gettable_current()];
            LabelP1_1.setBounds(x, y, 36, 36);
        }
        //==P2 Green Play
        else if(round % 4 == 2){
            nextT = nextP.nextPosition(P2.gettable_current(), point_die);
            P2.settable_current(nextT);
        
            x = poX_G[P2.gettable_current()];
            y = poY_G[P2.gettable_current()];
            LabelP2_1.setBounds(x, y, 36, 36);
        }
        //==P3 Yellow Play
        else if(round % 4 == 3){
            nextT = nextP.nextPosition(P3.gettable_current(), point_die);
            P3.settable_current(nextT);
        
            x = poX_Y[P3.gettable_current()];
            y = poY_Y[P3.gettable_current()];
            LabelP3_1.setBounds(x, y, 36, 36);
        }
        //==P4 Blue Play
        else{
            nextT = nextP.nextPosition(P4.gettable_current(), point_die);
            P4.settable_current(nextT);
        
            x = poX_B[P4.gettable_current()];
            y = poY_B[P4.gettable_current()];
            LabelP4_1.setBounds(x, y, 36, 36);
        }
        round++;
        
        
    }
    
    
    
    // Variables declaration - do not modify
    private javax.swing.JLabel LabelBG;
    private javax.swing.JLabel LabelP1_1;
    private javax.swing.JLabel LabelP2_1;
    private javax.swing.JLabel LabelP3_1;
    private javax.swing.JLabel LabelP4_1;
    private javax.swing.JLayeredPane LayerBG;
    private javax.swing.JLayeredPane LayerP1_1;
    private javax.swing.JLayeredPane LayerP2_1;
    private javax.swing.JLayeredPane LayerP3_1;
    private javax.swing.JLayeredPane LayerP4_1;
    private javax.swing.JButton bt_roll_die;
    // End of variables declaration
}
