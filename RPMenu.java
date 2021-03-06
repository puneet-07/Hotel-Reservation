/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * RPMenu.java
 *
 * Created on Jul 25, 2010, 4:58:45 PM
 */

/**
 *
 * @author megha
 */
import java.sql.*;
public class RPMenu extends javax.swing.JFrame {

    /** Creates new form RPMenu */
    public RPMenu() {
        initComponents();
        EnterRoomDetailsPanel.setVisible(false);
        EnterRoomNoPanel.setVisible(false);
        EnterNewChargesPanel.setVisible(false);
        RoomProcessingOptionsPanel.setVisible(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel2ShowVariousPanels = new javax.swing.JPanel();
        EnterRoomDetailsPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        RNumTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        AddB = new javax.swing.JButton();
        error = new javax.swing.JLabel();
        TCode = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        RoomProcessingOptionsPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        NewRoomB = new javax.swing.JButton();
        CChargesB = new javax.swing.JButton();
        RDetailsB = new javax.swing.JButton();
        EnterNewChargesPanel = new javax.swing.JPanel();
        ChangeB = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        TCode2 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        curCharges = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ChargesTF = new javax.swing.JTextField();
        error1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        EnterRoomNoPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        RNoTF = new javax.swing.JTextField();
        SearchB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        roomDetailsTA = new javax.swing.JTextArea();
        error2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        RoomPrMnubar = new javax.swing.JMenuBar();
        EditMnu = new javax.swing.JMenu();
        AddRoomMItem = new javax.swing.JMenuItem();
        ChangeChargesMItem = new javax.swing.JMenuItem();
        ViewMnu = new javax.swing.JMenu();
        RoomDetailsMItem = new javax.swing.JMenuItem();
        BackMnu = new javax.swing.JMenu();
        back2MainMItem = new javax.swing.JMenuItem();
        logoutMItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Room Processing");

        Panel2ShowVariousPanels.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        Panel2ShowVariousPanels.setMaximumSize(new java.awt.Dimension(214747, 214647));
        Panel2ShowVariousPanels.setLayout(new java.awt.CardLayout());

        EnterRoomDetailsPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EnterRoomDetailsPanel.setMaximumSize(new java.awt.Dimension(277, 200));
        EnterRoomDetailsPanel.setMinimumSize(new java.awt.Dimension(100, 100));
        EnterRoomDetailsPanel.setPreferredSize(new java.awt.Dimension(228, 200));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        jLabel2.setText("Room Number: ");

        RNumTF.setFont(new java.awt.Font("Comic Sans MS", 1, 18));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        jLabel3.setText("Type Code : ");

        AddB.setText("ADD");
        AddB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBActionPerformed(evt);
            }
        });

        error.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        error.setText("           ");
        error.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TCode.setFont(new java.awt.Font("Comic Sans MS", 1, 18));
        TCode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SN", "DB", "DL", "SD" }));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel9.setBackground(new java.awt.Color(255, 153, 153));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 24));
        jLabel9.setText("  ENTER DETAILS OF THE ROOM");
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 28));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ROOM PROCESSING");

        Back.setFont(new java.awt.Font("Century Gothic", 1, 14));
        Back.setText("<< Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        NewRoomB.setFont(new java.awt.Font("Century Gothic", 1, 14));
        NewRoomB.setText("<HTML>Add New<BR>Room</HTML>");
        NewRoomB.setMinimumSize(new java.awt.Dimension(80, 37));
        NewRoomB.setPreferredSize(new java.awt.Dimension(80, 37));
        NewRoomB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewRoomBActionPerformed(evt);
            }
        });

        CChargesB.setFont(new java.awt.Font("Century Gothic", 1, 14));
        CChargesB.setText("<HTML>Change<br>Charges</HTML>");
        CChargesB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CChargesB.setPreferredSize(new java.awt.Dimension(77, 37));
        CChargesB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CChargesBActionPerformed(evt);
            }
        });

        RDetailsB.setFont(new java.awt.Font("Century Gothic", 1, 14));
        RDetailsB.setText("<HTML>Room<BR>Details</HTML>");
        RDetailsB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RDetailsB.setMinimumSize(new java.awt.Dimension(77, 37));
        RDetailsB.setPreferredSize(new java.awt.Dimension(77, 37));
        RDetailsB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RDetailsBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RoomProcessingOptionsPanelLayout = new javax.swing.GroupLayout(RoomProcessingOptionsPanel);
        RoomProcessingOptionsPanel.setLayout(RoomProcessingOptionsPanelLayout);
        RoomProcessingOptionsPanelLayout.setHorizontalGroup(
            RoomProcessingOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
            .addGroup(RoomProcessingOptionsPanelLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(NewRoomB, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 284, Short.MAX_VALUE)
                .addComponent(RDetailsB, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
            .addGroup(RoomProcessingOptionsPanelLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
            .addGroup(RoomProcessingOptionsPanelLayout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(CChargesB, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
        );
        RoomProcessingOptionsPanelLayout.setVerticalGroup(
            RoomProcessingOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RoomProcessingOptionsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CChargesB, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(RoomProcessingOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RDetailsB, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(NewRoomB, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
        );

        javax.swing.GroupLayout EnterRoomDetailsPanelLayout = new javax.swing.GroupLayout(EnterRoomDetailsPanel);
        EnterRoomDetailsPanel.setLayout(EnterRoomDetailsPanelLayout);
        EnterRoomDetailsPanelLayout.setHorizontalGroup(
            EnterRoomDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EnterRoomDetailsPanelLayout.createSequentialGroup()
                .addGroup(EnterRoomDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EnterRoomDetailsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 304, Short.MAX_VALUE)
                        .addComponent(AddB, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EnterRoomDetailsPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(EnterRoomDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 373, Short.MAX_VALUE)
                        .addGroup(EnterRoomDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TCode, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RNumTF, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)))
                    .addGroup(EnterRoomDetailsPanelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(RoomProcessingOptionsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        EnterRoomDetailsPanelLayout.setVerticalGroup(
            EnterRoomDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EnterRoomDetailsPanelLayout.createSequentialGroup()
                .addComponent(RoomProcessingOptionsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(EnterRoomDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RNumTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(66, 66, 66)
                .addGroup(EnterRoomDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107)
                .addGroup(EnterRoomDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddB, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
        );

        Panel2ShowVariousPanels.add(EnterRoomDetailsPanel, "card2");

        EnterNewChargesPanel.setBackground(new java.awt.Color(153, 153, 255));
        EnterNewChargesPanel.setMaximumSize(new java.awt.Dimension(367, 367));
        EnterNewChargesPanel.setPreferredSize(new java.awt.Dimension(87, 104));

        ChangeB.setFont(new java.awt.Font("Century Gothic", 1, 14));
        ChangeB.setText("Change");
        ChangeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeBActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14));
        jLabel4.setText("Type Code");

        TCode2.setFont(new java.awt.Font("Century Gothic", 1, 14));
        TCode2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SN", "DB", "DL", "SD" }));
        TCode2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TCode2ItemStateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14));
        jLabel5.setText("Current Charges:");

        curCharges.setFont(new java.awt.Font("Century Gothic", 1, 14));
        curCharges.setText("                        ");
        curCharges.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14));
        jLabel7.setText("New Charges:    ");

        ChargesTF.setFont(new java.awt.Font("Century Gothic", 1, 14));

        error1.setFont(new java.awt.Font("Century Gothic", 1, 14));
        error1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        error1.setText("           ");
        error1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        error1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel10.setFont(new java.awt.Font("Sylfaen", 1, 36));
        jLabel10.setText("ENTER NEW CHARGES");

        javax.swing.GroupLayout EnterNewChargesPanelLayout = new javax.swing.GroupLayout(EnterNewChargesPanel);
        EnterNewChargesPanel.setLayout(EnterNewChargesPanelLayout);
        EnterNewChargesPanelLayout.setHorizontalGroup(
            EnterNewChargesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EnterNewChargesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EnterNewChargesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EnterNewChargesPanelLayout.createSequentialGroup()
                        .addComponent(error1, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EnterNewChargesPanelLayout.createSequentialGroup()
                        .addGroup(EnterNewChargesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, EnterNewChargesPanelLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(99, 99, 99)
                                .addComponent(ChargesTF, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, EnterNewChargesPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(95, 95, 95)
                                .addComponent(curCharges, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, EnterNewChargesPanelLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(49, 49, 49)
                                .addGroup(EnterNewChargesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ChangeB, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                                    .addComponent(TCode2, 0, 530, Short.MAX_VALUE)))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77))))
        );
        EnterNewChargesPanelLayout.setVerticalGroup(
            EnterNewChargesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EnterNewChargesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(67, 67, 67)
                .addGroup(EnterNewChargesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TCode2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(EnterNewChargesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(curCharges, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(EnterNewChargesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ChargesTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(ChangeB, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(error1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        Panel2ShowVariousPanels.add(EnterNewChargesPanel, "card3");

        jLabel8.setFont(new java.awt.Font("Sylfaen", 1, 36));
        jLabel8.setText("ENTER THE ROOM NO");

        RNoTF.setFont(new java.awt.Font("Comic Sans MS", 1, 14));

        SearchB.setFont(new java.awt.Font("Century Gothic", 1, 14));
        SearchB.setText("Search");
        SearchB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBActionPerformed(evt);
            }
        });

        roomDetailsTA.setColumns(20);
        roomDetailsTA.setFont(new java.awt.Font("Century Gothic", 1, 14));
        roomDetailsTA.setRows(5);
        jScrollPane1.setViewportView(roomDetailsTA);

        error2.setFont(new java.awt.Font("Century Gothic", 1, 14));
        error2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        error2.setText("           ");
        error2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14));
        jLabel11.setText("DETAILS OF THIS ROOM ARE:");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout EnterRoomNoPanelLayout = new javax.swing.GroupLayout(EnterRoomNoPanel);
        EnterRoomNoPanel.setLayout(EnterRoomNoPanelLayout);
        EnterRoomNoPanelLayout.setHorizontalGroup(
            EnterRoomNoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EnterRoomNoPanelLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(175, 175, 175))
            .addGroup(EnterRoomNoPanelLayout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addGroup(EnterRoomNoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, 0, 0, Short.MAX_VALUE)
                    .addComponent(SearchB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RNoTF, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                .addContainerGap(294, Short.MAX_VALUE))
            .addGroup(EnterRoomNoPanelLayout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(262, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EnterRoomNoPanelLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(error2, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                .addGap(135, 135, 135))
        );
        EnterRoomNoPanelLayout.setVerticalGroup(
            EnterRoomNoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EnterRoomNoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SearchB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(error2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        Panel2ShowVariousPanels.add(EnterRoomNoPanel, "card4");

        RoomPrMnubar.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        RoomPrMnubar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        EditMnu.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        EditMnu.setText("Edit");
        EditMnu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EditMnu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        EditMnu.setPreferredSize(new java.awt.Dimension(55, 19));

        AddRoomMItem.setText("Add New Room");
        AddRoomMItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddRoomMItemActionPerformed(evt);
            }
        });
        EditMnu.add(AddRoomMItem);

        ChangeChargesMItem.setText("Change Charges");
        ChangeChargesMItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeChargesMItemActionPerformed(evt);
            }
        });
        EditMnu.add(ChangeChargesMItem);

        RoomPrMnubar.add(EditMnu);

        ViewMnu.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        ViewMnu.setText("View");
        ViewMnu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewMnu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        RoomDetailsMItem.setText("Room Details");
        RoomDetailsMItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomDetailsMItemActionPerformed(evt);
            }
        });
        ViewMnu.add(RoomDetailsMItem);

        RoomPrMnubar.add(ViewMnu);

        BackMnu.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        BackMnu.setText("Back");
        BackMnu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BackMnu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        back2MainMItem.setText("Main Menu");
        back2MainMItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back2MainMItemActionPerformed(evt);
            }
        });
        BackMnu.add(back2MainMItem);

        logoutMItem.setText("Logout");
        logoutMItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutMItemActionPerformed(evt);
            }
        });
        BackMnu.add(logoutMItem);

        RoomPrMnubar.add(BackMnu);

        setJMenuBar(RoomPrMnubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel2ShowVariousPanels, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel2ShowVariousPanels, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBActionPerformed
        // TODO add your handling code here:
        error.setText("  ");
        String Rnum = RNumTF.getText();
        String Tcode = TCode.getSelectedItem().toString();
        try
        {
            Class.forName("java.sql.Driver");
            String database = "jdbc:mysql://localhost:3306/Hotel";
            Connection conn = DriverManager.getConnection(database, "root", "root");
            Statement stmt = conn.createStatement();
            String sql = "Insert into Room values ( '" + Rnum + "','" + Tcode + "')" ;
            stmt.executeUpdate(sql);
            for(int i=1; i<13;i++)
            {
                String sql2 = "Insert into Status" + i + "(RoomNo, TypeCode) values ( '" + Rnum + "','" + Tcode + "')" ;
                Statement stmt2 = conn.createStatement();
                stmt2.executeUpdate(sql2);
            }
            error.setText("Information added");
            stmt.close();
            conn.close();
        }
        catch (Exception e) { error.setText("Incorrect Entry");}
    }//GEN-LAST:event_AddBActionPerformed

    private void TCode2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TCode2ItemStateChanged
        // TODO add your handling code here:
       String code = TCode2.getSelectedItem().toString();
        try
        {

            Class.forName("java.sql.Driver");
            String database = "jdbc:mysql://localhost:3306/Hotel";
            Connection conn = DriverManager.getConnection(database, "root", "root");
            Statement stmt = conn.createStatement();
            String sql = "select Charges from Type where TypeCode = '" + code + "'";
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            String str = rs.getString("Charges");
            rs.close();
            stmt.close();
            conn.close();
            curCharges.setText("Rs " + str);
        } catch (Exception e) { }
}//GEN-LAST:event_TCode2ItemStateChanged

    private void ChangeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeBActionPerformed
        // TODO add your handling code here:
        String code = TCode2.getSelectedItem().toString();
        int charges =Integer.parseInt( ChargesTF.getText());
        try
        {
            Class.forName("java.sql.Driver");
            String database = "jdbc:mysql://localhost:3306/Hotel";
            Connection conn = DriverManager.getConnection(database, "root", "root");
            Statement stmt = conn.createStatement();
            String sql = "update Type set Charges = " + charges + " where TypeCode = '" + code + "'" ;
            stmt.executeUpdate(sql);
            stmt.close();
            conn.close();
            error1.setText("Information added");
        } catch (Exception e) { error1.setText("Invalid Data");}
}//GEN-LAST:event_ChangeBActionPerformed

    private void SearchBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBActionPerformed
        // TODO add your handling code here:
        int rnum =Integer.parseInt(RNoTF.getText());
        try
        {
            Class.forName("java.sql.Driver");
            String database = "jdbc:mysql://localhost:3306/Hotel";
            Connection conn = DriverManager.getConnection(database, "root", "root");
            Statement stmt = conn.createStatement();
            String sql = "select Type.TypeCode, Description, Charges from Type , Room where RoomNo = " + rnum + " and Type.TypeCode = Room.TypeCode";
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            String str = rs.getString("TypeCode");
            roomDetailsTA.setText(str);
            String str1 = rs.getString("Description");
            String str2 = rs.getString("Charges");
            roomDetailsTA.setText("Room Number :" + rnum + "\nType: " + str + "\nDescription: " + str1 + "\nCharges : " + str2);
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) { error2.setText("Room Number Not Found");}
}//GEN-LAST:event_SearchBActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        MainMenu m = new MainMenu();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    private void NewRoomBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewRoomBActionPerformed
        EnterNewChargesPanel.setVisible(false);
        RoomProcessingOptionsPanel.setVisible(false);
        EnterRoomNoPanel.setVisible(false);
        EnterRoomDetailsPanel.setVisible(true);
    }//GEN-LAST:event_NewRoomBActionPerformed

    private void CChargesBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CChargesBActionPerformed
        EnterRoomDetailsPanel.setVisible(false);
         RoomProcessingOptionsPanel.setVisible(false);
        EnterRoomNoPanel.setVisible(false);
        EnterNewChargesPanel.setVisible(true);
    }//GEN-LAST:event_CChargesBActionPerformed

    private void RDetailsBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RDetailsBActionPerformed
            EnterRoomDetailsPanel.setVisible(false);
        EnterNewChargesPanel.setVisible(false);
        RoomProcessingOptionsPanel.setVisible(false);
        EnterRoomNoPanel.setVisible(true);
    }//GEN-LAST:event_RDetailsBActionPerformed

    private void back2MainMItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back2MainMItemActionPerformed
        // TODO add your handling code here:
        MainMenu m = new MainMenu();
        m.setVisible(true);
        this.setVisible(false);
}//GEN-LAST:event_back2MainMItemActionPerformed

    private void logoutMItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutMItemActionPerformed
        // TODO add your handling code here:
        new login().setVisible(true);
        this.setVisible(false);
}//GEN-LAST:event_logoutMItemActionPerformed

    private void AddRoomMItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddRoomMItemActionPerformed
        EnterNewChargesPanel.setVisible(false);
        RoomProcessingOptionsPanel.setVisible(false);
        EnterRoomNoPanel.setVisible(false);
        EnterRoomDetailsPanel.setVisible(true);
}//GEN-LAST:event_AddRoomMItemActionPerformed

    private void ChangeChargesMItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeChargesMItemActionPerformed
        EnterRoomDetailsPanel.setVisible(false);
        RoomProcessingOptionsPanel.setVisible(false);
        EnterRoomNoPanel.setVisible(false);
        EnterNewChargesPanel.setVisible(true);
}//GEN-LAST:event_ChangeChargesMItemActionPerformed

    private void RoomDetailsMItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomDetailsMItemActionPerformed
        EnterRoomDetailsPanel.setVisible(false);
        EnterNewChargesPanel.setVisible(false);
        RoomProcessingOptionsPanel.setVisible(false);
        EnterRoomNoPanel.setVisible(true);
}//GEN-LAST:event_RoomDetailsMItemActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RPMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddB;
    private javax.swing.JMenuItem AddRoomMItem;
    private javax.swing.JButton Back;
    private javax.swing.JMenu BackMnu;
    private javax.swing.JButton CChargesB;
    private javax.swing.JButton ChangeB;
    private javax.swing.JMenuItem ChangeChargesMItem;
    private javax.swing.JTextField ChargesTF;
    private javax.swing.JMenu EditMnu;
    private javax.swing.JPanel EnterNewChargesPanel;
    private javax.swing.JPanel EnterRoomDetailsPanel;
    private javax.swing.JPanel EnterRoomNoPanel;
    private javax.swing.JButton NewRoomB;
    private javax.swing.JPanel Panel2ShowVariousPanels;
    private javax.swing.JButton RDetailsB;
    private javax.swing.JTextField RNoTF;
    private javax.swing.JTextField RNumTF;
    private javax.swing.JMenuItem RoomDetailsMItem;
    private javax.swing.JMenuBar RoomPrMnubar;
    private javax.swing.JPanel RoomProcessingOptionsPanel;
    private javax.swing.JButton SearchB;
    private javax.swing.JComboBox TCode;
    private javax.swing.JComboBox TCode2;
    private javax.swing.JMenu ViewMnu;
    private javax.swing.JMenuItem back2MainMItem;
    private javax.swing.JLabel curCharges;
    private javax.swing.JLabel error;
    private javax.swing.JLabel error1;
    private javax.swing.JLabel error2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem logoutMItem;
    private javax.swing.JTextArea roomDetailsTA;
    // End of variables declaration//GEN-END:variables

}
