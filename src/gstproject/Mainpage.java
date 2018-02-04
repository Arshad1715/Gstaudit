package gstproject;
import java.awt.*;
import javax.swing.*;
public class Mainpage extends javax.swing.JFrame {
    public Mainpage() {
        initComponents();
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(d.width/5,d.height/10);
        acname_text.setText((String)acname_choice.getItemAt(0));
        acname_choice.addItem("Arshad");
        gst_panel.setEnabled(false);
        gst_panel1.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgroup_gst = new javax.swing.ButtonGroup();
        bgroup_manual = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        purchaserpanel = new javax.swing.JPanel();
        purname_label = new javax.swing.JLabel();
        purname_choice = new javax.swing.JComboBox();
        acname_label = new javax.swing.JLabel();
        acname_choice = new javax.swing.JComboBox();
        acname_text = new javax.swing.JTextField();
        purname_text = new javax.swing.JTextField();
        name_label = new javax.swing.JLabel();
        gstid_label = new javax.swing.JLabel();
        purgstid_text = new javax.swing.JTextField();
        pro_label = new javax.swing.JLabel();
        purpro_choice = new javax.swing.JComboBox();
        purunit_label = new javax.swing.JLabel();
        purunits_choice = new javax.swing.JComboBox();
        purquan_label = new javax.swing.JLabel();
        purquan_choice = new javax.swing.JComboBox();
        purpro_text = new javax.swing.JTextField();
        purunit_text = new javax.swing.JTextField();
        purquan_text = new javax.swing.JTextField();
        puramt_label = new javax.swing.JLabel();
        puramt_text = new javax.swing.JTextField();
        intrastate_rbutton = new javax.swing.JRadioButton();
        interstate_rbutton = new javax.swing.JRadioButton();
        manual_rbutton = new javax.swing.JRadioButton();
        button_submit = new javax.swing.JButton();
        gstamount_label = new javax.swing.JLabel();
        gstamount_text = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        gst_panel = new javax.swing.JPanel();
        cgst_choice = new javax.swing.JComboBox();
        cgst_label = new javax.swing.JLabel();
        gstmanual_choice = new javax.swing.JComboBox();
        sgst_label = new javax.swing.JLabel();
        sgst_choice = new javax.swing.JComboBox();
        salespanel = new javax.swing.JPanel();
        purchaserpanel1 = new javax.swing.JPanel();
        purname_label1 = new javax.swing.JLabel();
        purname_choice1 = new javax.swing.JComboBox();
        acname_label1 = new javax.swing.JLabel();
        acname_choice1 = new javax.swing.JComboBox();
        acname_text1 = new javax.swing.JTextField();
        purname_text1 = new javax.swing.JTextField();
        name_label1 = new javax.swing.JLabel();
        gstid_label1 = new javax.swing.JLabel();
        purgstid_text1 = new javax.swing.JTextField();
        pro_label1 = new javax.swing.JLabel();
        purpro_choice1 = new javax.swing.JComboBox();
        purunit_label1 = new javax.swing.JLabel();
        purunits_choice1 = new javax.swing.JComboBox();
        purquan_label1 = new javax.swing.JLabel();
        purquan_choice1 = new javax.swing.JComboBox();
        purpro_text1 = new javax.swing.JTextField();
        purunit_text1 = new javax.swing.JTextField();
        purquan_text1 = new javax.swing.JTextField();
        puramt_label1 = new javax.swing.JLabel();
        puramt_text1 = new javax.swing.JTextField();
        intrastate_rbutton1 = new javax.swing.JRadioButton();
        interstate_rbutton1 = new javax.swing.JRadioButton();
        manual_rbutton1 = new javax.swing.JRadioButton();
        button_submit1 = new javax.swing.JButton();
        gstamount_label1 = new javax.swing.JLabel();
        gstamount_text1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        gst_panel1 = new javax.swing.JPanel();
        cgst_choice1 = new javax.swing.JComboBox();
        cgst_label1 = new javax.swing.JLabel();
        gstmanual_choice1 = new javax.swing.JComboBox();
        sgst_label1 = new javax.swing.JLabel();
        sgst_choice1 = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(getMaximizedBounds());
        setResizable(false);

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        purname_label.setText("Seller name:");

        purname_choice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purname_choiceActionPerformed(evt);
            }
        });

        acname_label.setText("Account name:");

        acname_choice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acname_choiceActionPerformed(evt);
            }
        });

        acname_text.setEditable(false);
        acname_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acname_textActionPerformed(evt);
            }
        });

        purname_text.setEditable(false);

        name_label.setText(" Seller:");

        gstid_label.setText("Gst Id no:");

        purgstid_text.setEditable(false);

        pro_label.setText("Purchased Product:");

        purunit_label.setText("Units:");

        purquan_label.setText("Quantity:");

        purpro_text.setEditable(false);

        purunit_text.setEditable(false);

        purquan_text.setEditable(false);

        puramt_label.setText("Purchase Amount:");

        bgroup_gst.add(intrastate_rbutton);
        intrastate_rbutton.setText("Intra State");
        intrastate_rbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intrastate_rbuttonActionPerformed(evt);
            }
        });

        bgroup_gst.add(interstate_rbutton);
        interstate_rbutton.setText("InterState");
        interstate_rbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interstate_rbuttonActionPerformed(evt);
            }
        });

        bgroup_gst.add(manual_rbutton);
        manual_rbutton.setText("Manual");
        manual_rbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manual_rbuttonActionPerformed(evt);
            }
        });

        button_submit.setBackground(java.awt.Color.green);
        button_submit.setText("Submit");

        gstamount_label.setText("GST Amount:");

        gstamount_text.setEditable(false);

        jLabel1.setText("Account:");

        jLabel2.setText("Product:");

        jLabel3.setText("Units:");

        jLabel4.setText("Quantity:");

        cgst_choice.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2.5", "5", "7.5", "12" }));
        cgst_choice.setEnabled(false);

        cgst_label.setText("CGST:");
        cgst_label.setEnabled(false);

        gstmanual_choice.setEditable(true);
        gstmanual_choice.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Intra State", "Inter State" }));
        gstmanual_choice.setEnabled(false);
        gstmanual_choice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gstmanual_choiceActionPerformed(evt);
            }
        });

        sgst_label.setText("SGST:");
        sgst_label.setEnabled(false);

        sgst_choice.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2.5", "5", "7.5", "12" }));
        sgst_choice.setEnabled(false);

        javax.swing.GroupLayout gst_panelLayout = new javax.swing.GroupLayout(gst_panel);
        gst_panel.setLayout(gst_panelLayout);
        gst_panelLayout.setHorizontalGroup(
            gst_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gst_panelLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(gst_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(gstmanual_choice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(gst_panelLayout.createSequentialGroup()
                        .addGroup(gst_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sgst_label)
                            .addComponent(cgst_label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(gst_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cgst_choice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sgst_choice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(72, 72, 72))
        );
        gst_panelLayout.setVerticalGroup(
            gst_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gst_panelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(gstmanual_choice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(gst_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cgst_label)
                    .addComponent(cgst_choice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gst_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sgst_label)
                    .addComponent(sgst_choice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout purchaserpanelLayout = new javax.swing.GroupLayout(purchaserpanel);
        purchaserpanel.setLayout(purchaserpanelLayout);
        purchaserpanelLayout.setHorizontalGroup(
            purchaserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, purchaserpanelLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(purchaserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, purchaserpanelLayout.createSequentialGroup()
                        .addGroup(purchaserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, purchaserpanelLayout.createSequentialGroup()
                                .addGroup(purchaserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(purchaserpanelLayout.createSequentialGroup()
                                        .addGroup(purchaserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(purname_label)
                                            .addComponent(acname_label)
                                            .addComponent(pro_label)
                                            .addComponent(purunit_label)
                                            .addComponent(purquan_label))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(purchaserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(purchaserpanelLayout.createSequentialGroup()
                                                .addGroup(purchaserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(purchaserpanelLayout.createSequentialGroup()
                                                        .addGroup(purchaserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(acname_choice, 0, 155, Short.MAX_VALUE)
                                                            .addComponent(purname_choice, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(purpro_choice, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addGroup(purchaserpanelLayout.createSequentialGroup()
                                                        .addComponent(purunits_choice, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGap(227, 227, 227)))
                                                .addGroup(purchaserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, purchaserpanelLayout.createSequentialGroup()
                                                .addComponent(purquan_choice, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel4))
                                            .addGroup(purchaserpanelLayout.createSequentialGroup()
                                                .addComponent(intrastate_rbutton)
                                                .addGap(63, 63, 63)
                                                .addComponent(interstate_rbutton)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(purchaserpanelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(purchaserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(name_label, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(gstid_label, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(10, 10, 10)
                                .addGroup(purchaserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(purname_text, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(acname_text, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(purgstid_text, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(purpro_text, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(purquan_text, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(purunit_text, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(purchaserpanelLayout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addGroup(purchaserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(purchaserpanelLayout.createSequentialGroup()
                                        .addGroup(purchaserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(purchaserpanelLayout.createSequentialGroup()
                                                .addComponent(puramt_label)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(puramt_text, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(manual_rbutton, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(18, 18, 18)
                                        .addComponent(gst_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(purchaserpanelLayout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(gstamount_label)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(gstamount_text, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, purchaserpanelLayout.createSequentialGroup()
                        .addComponent(button_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(337, 337, 337))))
        );
        purchaserpanelLayout.setVerticalGroup(
            purchaserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(purchaserpanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(purchaserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acname_choice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(acname_label)
                    .addComponent(acname_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(purchaserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_label)
                    .addComponent(purname_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(purchaserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(purchaserpanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(purchaserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(purgstid_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gstid_label)))
                    .addGroup(purchaserpanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(purchaserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(purname_choice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(purname_label))))
                .addGap(52, 52, 52)
                .addGroup(purchaserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pro_label)
                    .addComponent(purpro_choice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(purpro_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(purchaserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(purunit_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(purunit_label)
                    .addComponent(purunits_choice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(purchaserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(purquan_label)
                    .addComponent(purquan_choice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(purquan_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(38, 38, 38)
                .addGroup(purchaserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(purchaserpanelLayout.createSequentialGroup()
                        .addGroup(purchaserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(puramt_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(puramt_label))
                        .addGap(32, 32, 32)
                        .addGroup(purchaserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(intrastate_rbutton)
                            .addComponent(interstate_rbutton)
                            .addComponent(manual_rbutton)))
                    .addComponent(gst_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(purchaserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gstamount_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gstamount_label))
                .addGap(26, 26, 26)
                .addComponent(button_submit)
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab("purchase", purchaserpanel);

        salespanel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                salespanelFocusGained(evt);
            }
        });

        purname_label1.setText("Seller name:");

        purname_choice1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purname_choice1ActionPerformed(evt);
            }
        });

        acname_label1.setText("Account name:");

        acname_choice1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acname_choice1ActionPerformed(evt);
            }
        });

        acname_text1.setEditable(false);
        acname_text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acname_text1ActionPerformed(evt);
            }
        });

        purname_text1.setEditable(false);

        name_label1.setText(" Seller:");

        gstid_label1.setText("Gst Id no:");

        purgstid_text1.setEditable(false);

        pro_label1.setText("Purchased Product:");

        purunit_label1.setText("Units:");

        purquan_label1.setText("Quantity:");

        purpro_text1.setEditable(false);

        purunit_text1.setEditable(false);

        purquan_text1.setEditable(false);

        puramt_label1.setText("Purchase Amount:");

        bgroup_gst.add(intrastate_rbutton1);
        intrastate_rbutton1.setText("Intra State");
        intrastate_rbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intrastate_rbutton1ActionPerformed(evt);
            }
        });

        bgroup_gst.add(interstate_rbutton1);
        interstate_rbutton1.setText("InterState");
        interstate_rbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interstate_rbutton1ActionPerformed(evt);
            }
        });

        bgroup_gst.add(manual_rbutton1);
        manual_rbutton1.setText("Manual");
        manual_rbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manual_rbutton1ActionPerformed(evt);
            }
        });

        button_submit1.setBackground(java.awt.Color.green);
        button_submit1.setText("Submit");

        gstamount_label1.setText("GST Amount:");

        gstamount_text1.setEditable(false);

        jLabel5.setText("Account:");

        jLabel6.setText("Product:");

        jLabel7.setText("Units:");

        jLabel8.setText("Quantity:");

        cgst_choice1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2.5", "5", "7.5", "12" }));
        cgst_choice1.setEnabled(false);

        cgst_label1.setText("CGST:");
        cgst_label1.setEnabled(false);

        gstmanual_choice1.setEditable(true);
        gstmanual_choice1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Intra State", "Inter State" }));
        gstmanual_choice1.setEnabled(false);
        gstmanual_choice1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gstmanual_choice1ActionPerformed(evt);
            }
        });

        sgst_label1.setText("SGST:");
        sgst_label1.setEnabled(false);

        sgst_choice1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2.5", "5", "7.5", "12" }));
        sgst_choice1.setEnabled(false);

        javax.swing.GroupLayout gst_panel1Layout = new javax.swing.GroupLayout(gst_panel1);
        gst_panel1.setLayout(gst_panel1Layout);
        gst_panel1Layout.setHorizontalGroup(
            gst_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gst_panel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(gst_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(gstmanual_choice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(gst_panel1Layout.createSequentialGroup()
                        .addGroup(gst_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sgst_label1)
                            .addComponent(cgst_label1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(gst_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cgst_choice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sgst_choice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(72, 72, 72))
        );
        gst_panel1Layout.setVerticalGroup(
            gst_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gst_panel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(gstmanual_choice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(gst_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cgst_label1)
                    .addComponent(cgst_choice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gst_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sgst_label1)
                    .addComponent(sgst_choice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout purchaserpanel1Layout = new javax.swing.GroupLayout(purchaserpanel1);
        purchaserpanel1.setLayout(purchaserpanel1Layout);
        purchaserpanel1Layout.setHorizontalGroup(
            purchaserpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, purchaserpanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(purchaserpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, purchaserpanel1Layout.createSequentialGroup()
                        .addGroup(purchaserpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, purchaserpanel1Layout.createSequentialGroup()
                                .addGroup(purchaserpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(purchaserpanel1Layout.createSequentialGroup()
                                        .addGroup(purchaserpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(purname_label1)
                                            .addComponent(acname_label1)
                                            .addComponent(pro_label1)
                                            .addComponent(purunit_label1)
                                            .addComponent(purquan_label1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(purchaserpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(purchaserpanel1Layout.createSequentialGroup()
                                                .addGroup(purchaserpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(purchaserpanel1Layout.createSequentialGroup()
                                                        .addGroup(purchaserpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(acname_choice1, 0, 155, Short.MAX_VALUE)
                                                            .addComponent(purname_choice1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(purpro_choice1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addGroup(purchaserpanel1Layout.createSequentialGroup()
                                                        .addComponent(purunits_choice1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGap(227, 227, 227)))
                                                .addGroup(purchaserpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, purchaserpanel1Layout.createSequentialGroup()
                                                .addComponent(purquan_choice1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel8))
                                            .addGroup(purchaserpanel1Layout.createSequentialGroup()
                                                .addComponent(intrastate_rbutton1)
                                                .addGap(63, 63, 63)
                                                .addComponent(interstate_rbutton1)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(purchaserpanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(purchaserpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(name_label1, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(gstid_label1, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(10, 10, 10)
                                .addGroup(purchaserpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(purname_text1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(acname_text1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(purgstid_text1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(purpro_text1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(purquan_text1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(purunit_text1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(purchaserpanel1Layout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addGroup(purchaserpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(purchaserpanel1Layout.createSequentialGroup()
                                        .addGroup(purchaserpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(purchaserpanel1Layout.createSequentialGroup()
                                                .addComponent(puramt_label1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(puramt_text1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(manual_rbutton1, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(18, 18, 18)
                                        .addComponent(gst_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(purchaserpanel1Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(gstamount_label1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(gstamount_text1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, purchaserpanel1Layout.createSequentialGroup()
                        .addComponent(button_submit1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(337, 337, 337))))
        );
        purchaserpanel1Layout.setVerticalGroup(
            purchaserpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(purchaserpanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(purchaserpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acname_choice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(acname_label1)
                    .addComponent(acname_text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(purchaserpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_label1)
                    .addComponent(purname_text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(purchaserpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(purchaserpanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(purchaserpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(purgstid_text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gstid_label1)))
                    .addGroup(purchaserpanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(purchaserpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(purname_choice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(purname_label1))))
                .addGap(52, 52, 52)
                .addGroup(purchaserpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pro_label1)
                    .addComponent(purpro_choice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(purpro_text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(purchaserpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(purunit_text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(purunit_label1)
                    .addComponent(purunits_choice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(purchaserpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(purquan_label1)
                    .addComponent(purquan_choice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(purquan_text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(38, 38, 38)
                .addGroup(purchaserpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(purchaserpanel1Layout.createSequentialGroup()
                        .addGroup(purchaserpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(puramt_text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(puramt_label1))
                        .addGap(32, 32, 32)
                        .addGroup(purchaserpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(intrastate_rbutton1)
                            .addComponent(interstate_rbutton1)
                            .addComponent(manual_rbutton1)))
                    .addComponent(gst_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(purchaserpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gstamount_text1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gstamount_label1))
                .addGap(26, 26, 26)
                .addComponent(button_submit1)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout salespanelLayout = new javax.swing.GroupLayout(salespanel);
        salespanel.setLayout(salespanelLayout);
        salespanelLayout.setHorizontalGroup(
            salespanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salespanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(purchaserpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        salespanelLayout.setVerticalGroup(
            salespanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salespanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(purchaserpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("sales", salespanel);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 738, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Initialize", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manual_rbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manual_rbuttonActionPerformed
        gst(true);
        gstmanual_choice.setEnabled(true);
    }//GEN-LAST:event_manual_rbuttonActionPerformed

    private void intrastate_rbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intrastate_rbuttonActionPerformed
        JOptionPane.showMessageDialog(new Frame(),"Inside State \n CGST=2.5% \n SGST=2.5%","Inside State",JOptionPane.INFORMATION_MESSAGE);
        gst(false);
        gstmanual_choice.setEnabled(false);
    }//GEN-LAST:event_intrastate_rbuttonActionPerformed

    private void acname_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acname_textActionPerformed

    }//GEN-LAST:event_acname_textActionPerformed

    private void acname_choiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acname_choiceActionPerformed
        acname_text.setText((String)acname_choice.getSelectedItem());
    }//GEN-LAST:event_acname_choiceActionPerformed

    private void purname_choiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purname_choiceActionPerformed

    }//GEN-LAST:event_purname_choiceActionPerformed

    private void gstmanual_choiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gstmanual_choiceActionPerformed
        if(gstmanual_choice.getSelectedItem().equals("Intra State"))
        {
            cgst_label.setText("CGST");
            gst(true);  
        }
        else
        {
            gst(false);
            cgst_label.setText("IGST");
            cgst_label.setEnabled(true);
            cgst_choice.setEnabled(true);        
        }
    }//GEN-LAST:event_gstmanual_choiceActionPerformed

    private void interstate_rbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interstate_rbuttonActionPerformed
        JOptionPane.showMessageDialog(new Frame(),"Outside state \n IGST=5%","Outside State",JOptionPane.INFORMATION_MESSAGE);
        gst(false);
        gstmanual_choice.setEnabled(false);
    }//GEN-LAST:event_interstate_rbuttonActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged

    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void salespanelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_salespanelFocusGained
    }//GEN-LAST:event_salespanelFocusGained

    private void purname_choice1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purname_choice1ActionPerformed
    }//GEN-LAST:event_purname_choice1ActionPerformed

    private void acname_choice1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acname_choice1ActionPerformed
    }//GEN-LAST:event_acname_choice1ActionPerformed

    private void acname_text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acname_text1ActionPerformed
    }//GEN-LAST:event_acname_text1ActionPerformed

    private void intrastate_rbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intrastate_rbutton1ActionPerformed
        JOptionPane.showMessageDialog(new Frame(),"Inside State \n CGST=2.5% \n SGST=2.5%","Inside State",JOptionPane.INFORMATION_MESSAGE);
        gst1(false);
        gstmanual_choice1.setEnabled(false);
    }//GEN-LAST:event_intrastate_rbutton1ActionPerformed

    private void interstate_rbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interstate_rbutton1ActionPerformed
        JOptionPane.showMessageDialog(new Frame(),"Outside state \n IGST=5%","Outside State",JOptionPane.INFORMATION_MESSAGE);
        gst1(false);
        gstmanual_choice1.setEnabled(false);
    }//GEN-LAST:event_interstate_rbutton1ActionPerformed

    private void manual_rbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manual_rbutton1ActionPerformed
        gst1(true);
        gstmanual_choice1.setEnabled(true);
    }//GEN-LAST:event_manual_rbutton1ActionPerformed

    private void gstmanual_choice1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gstmanual_choice1ActionPerformed
         if(gstmanual_choice1.getSelectedItem().equals("Intra State"))
        {
            cgst_label1.setText("CGST");
            gst1(true);  
        }
        else
        {
            gst1(false);
            cgst_label1.setText("IGST");
            cgst_label1.setEnabled(true);
            cgst_choice1.setEnabled(true);        
        }

    }//GEN-LAST:event_gstmanual_choice1ActionPerformed
    public void gst(boolean b)
    {
    cgst_label.setEnabled(b);
    sgst_label.setEnabled(b);
    cgst_choice.setEnabled(b);
    sgst_choice.setEnabled(b);
    }
    public void gst1(boolean b)
    {
    cgst_label1.setEnabled(b);
    sgst_label1.setEnabled(b);
    cgst_choice1.setEnabled(b);
    sgst_choice1.setEnabled(b);
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox acname_choice;
    private javax.swing.JComboBox acname_choice1;
    private javax.swing.JLabel acname_label;
    private javax.swing.JLabel acname_label1;
    private javax.swing.JTextField acname_text;
    private javax.swing.JTextField acname_text1;
    private javax.swing.ButtonGroup bgroup_gst;
    private javax.swing.ButtonGroup bgroup_manual;
    private javax.swing.JButton button_submit;
    private javax.swing.JButton button_submit1;
    private javax.swing.JComboBox cgst_choice;
    private javax.swing.JComboBox cgst_choice1;
    private javax.swing.JLabel cgst_label;
    private javax.swing.JLabel cgst_label1;
    private javax.swing.JPanel gst_panel;
    private javax.swing.JPanel gst_panel1;
    private javax.swing.JLabel gstamount_label;
    private javax.swing.JLabel gstamount_label1;
    private javax.swing.JTextField gstamount_text;
    private javax.swing.JTextField gstamount_text1;
    private javax.swing.JLabel gstid_label;
    private javax.swing.JLabel gstid_label1;
    private javax.swing.JComboBox gstmanual_choice;
    private javax.swing.JComboBox gstmanual_choice1;
    private javax.swing.JRadioButton interstate_rbutton;
    private javax.swing.JRadioButton interstate_rbutton1;
    private javax.swing.JRadioButton intrastate_rbutton;
    private javax.swing.JRadioButton intrastate_rbutton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton manual_rbutton;
    private javax.swing.JRadioButton manual_rbutton1;
    private javax.swing.JLabel name_label;
    private javax.swing.JLabel name_label1;
    private javax.swing.JLabel pro_label;
    private javax.swing.JLabel pro_label1;
    private javax.swing.JLabel puramt_label;
    private javax.swing.JLabel puramt_label1;
    private javax.swing.JTextField puramt_text;
    private javax.swing.JTextField puramt_text1;
    private javax.swing.JPanel purchaserpanel;
    private javax.swing.JPanel purchaserpanel1;
    private javax.swing.JTextField purgstid_text;
    private javax.swing.JTextField purgstid_text1;
    private javax.swing.JComboBox purname_choice;
    private javax.swing.JComboBox purname_choice1;
    private javax.swing.JLabel purname_label;
    private javax.swing.JLabel purname_label1;
    private javax.swing.JTextField purname_text;
    private javax.swing.JTextField purname_text1;
    private javax.swing.JComboBox purpro_choice;
    private javax.swing.JComboBox purpro_choice1;
    private javax.swing.JTextField purpro_text;
    private javax.swing.JTextField purpro_text1;
    private javax.swing.JComboBox purquan_choice;
    private javax.swing.JComboBox purquan_choice1;
    private javax.swing.JLabel purquan_label;
    private javax.swing.JLabel purquan_label1;
    private javax.swing.JTextField purquan_text;
    private javax.swing.JTextField purquan_text1;
    private javax.swing.JLabel purunit_label;
    private javax.swing.JLabel purunit_label1;
    private javax.swing.JTextField purunit_text;
    private javax.swing.JTextField purunit_text1;
    private javax.swing.JComboBox purunits_choice;
    private javax.swing.JComboBox purunits_choice1;
    private javax.swing.JPanel salespanel;
    private javax.swing.JComboBox sgst_choice;
    private javax.swing.JComboBox sgst_choice1;
    private javax.swing.JLabel sgst_label;
    private javax.swing.JLabel sgst_label1;
    // End of variables declaration//GEN-END:variables
}
