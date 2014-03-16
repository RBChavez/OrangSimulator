package gui_orang2;
/**
 *
 * @author Aom Boonbutra
 */
import gui_orang2.Properties;
import gui_orang2.ForwardKinematicsSolver;
import gui_orang2.DialogAlert;
import gui_orang2.LogEngine;
import javax.swing.JDialog;
import javax.swing.JFrame;
import java.lang.Object;
import javax.swing.ButtonGroup;
import javax.media.j3d.*;
import com.sun.j3d.utils.universe.*;
import com.sun.j3d.utils.geometry.*;
import java.awt.Color;
import java.awt.peer.CanvasPeer;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
public class OrangG1 extends javax.swing.JFrame {
Properties Properties;
LogEngine logger = new LogEngine(Properties);
JDialog test = new DialogAlert(new JFrame(),"test");
    
    public OrangG1(Properties props) {
        Properties = props;
        initComponents();
        
        initialRendering();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP_Kinematics = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        selectForward = new javax.swing.JRadioButton();
        selectInverse = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        spinnerAngle1 = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        spinnerAngle2 = new javax.swing.JSpinner();
        spinnerAngle3 = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        spinnerAngle4 = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        spinnerAngle5 = new javax.swing.JSpinner();
        spinnerAngle6 = new javax.swing.JSpinner();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        spinner_x = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        spinner_y = new javax.swing.JSpinner();
        spinner_z = new javax.swing.JSpinner();
        jLabel17 = new javax.swing.JLabel();
        sliderSpeed = new javax.swing.JSlider();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        spinnerLink1 = new javax.swing.JSpinner();
        spinnerLink2 = new javax.swing.JSpinner();
        spinnerLink3 = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        try {
            colorComboBox1 = new org.jdesktop.jdnc.incubator.jxcombobox.colorcombo.ColorComboBox();
        } catch (org.jdesktop.jdnc.incubator.jxcombobox.IncompatibleLookAndFeelException e1) {
            e1.printStackTrace();
        }
        jB_Home = new javax.swing.JButton();
        jB_Reset = new javax.swing.JButton();
        jB_Simulate = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jB_reset = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jL_Status = new javax.swing.JLabel();
        jB_zoomOut = new javax.swing.JButton();
        jB_zoonIn = new javax.swing.JButton();
        myCanvasPanel1 = new Canvas.MyCanvasPanel(Properties);
        jP_Detail = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jL_Kinematics = new javax.swing.JLabel();
        jL_trunk1 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jL_joint7 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jL_joint8 = new javax.swing.JLabel();
        jL_joint9 = new javax.swing.JLabel();
        jL_upArm1 = new javax.swing.JLabel();
        jL_joint3_ = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jL_foreArm1 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jL_joint2_ = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jL_joint1_ = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jL_x1 = new javax.swing.JLabel();
        jL_y1 = new javax.swing.JLabel();
        jL_z1 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jL_foreArm = new javax.swing.JLabel();
        jL_trunk = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jL_joint6 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jL_joint2 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jL_joint4 = new javax.swing.JLabel();
        jL_joint1 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jL_joint5 = new javax.swing.JLabel();
        jL_x = new javax.swing.JLabel();
        jL_upArm = new javax.swing.JLabel();
        jL_y = new javax.swing.JLabel();
        jL_joint3 = new javax.swing.JLabel();
        jL_z = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jL_Kinematics1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jB_saveLog = new javax.swing.JButton();
        jB_replay = new javax.swing.JButton();
        jB_ResetLog = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jL_LogNumberLetter = new javax.swing.JLabel();
        jL_LogNumber = new javax.swing.JLabel();
        jL_Saved = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTA_log = new javax.swing.JTextArea();
        jCb_Log = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Orangs G1,2012");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(956, 623));
        setResizable(false);

        jP_Kinematics.setBackground(new java.awt.Color(204, 204, 255));
        jP_Kinematics.setBorder(javax.swing.BorderFactory.createTitledBorder("Kinematics"));
        jP_Kinematics.setMaximumSize(new java.awt.Dimension(388, 444));
        jP_Kinematics.setMinimumSize(new java.awt.Dimension(388, 444));
        jP_Kinematics.setPreferredSize(new java.awt.Dimension(388, 444));

        jLabel1.setText("Properties");

        selectForward.setText("Forward");
        selectForward.setToolTipText("Forward Kinematics \ncalculate the x,y,z coordinator");
        selectForward.setName("selectForward"); // NOI18N
        selectForward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectForwardActionPerformed(evt);
            }
        });

        selectInverse.setText("Inverse");
        selectInverse.setToolTipText("Inverse Kinematics \ncalculate the angle of the robot joint");
        selectInverse.setName("selectInverse"); // NOI18N
        selectInverse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectInverseActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setMaximumSize(new java.awt.Dimension(251, 114));
        jPanel3.setMinimumSize(new java.awt.Dimension(251, 114));

        jLabel8.setText("Joint 1 :");

        spinnerAngle1.setModel(new javax.swing.SpinnerNumberModel());
        spinnerAngle1.setToolTipText("MinJoint1 = 90 , MaxJoint1 = 180");
        spinnerAngle1.setName("spinnerAngle1"); // NOI18N
        spinnerAngle1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpinnerListenerJoint1(evt);
            }
        });

        jLabel9.setText("Joint 2 :");

        jLabel10.setText("Joint 3 :");

        spinnerAngle2.setModel(new javax.swing.SpinnerNumberModel());
        spinnerAngle2.setToolTipText("MinJoint2 = 45, MaxJoint2 = 370");
        spinnerAngle2.setName("spinnerAngle2"); // NOI18N
        spinnerAngle2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpinnerListenerJoint2(evt);
            }
        });

        spinnerAngle3.setModel(new javax.swing.SpinnerNumberModel());
        spinnerAngle3.setToolTipText("MinJoint3 = 45, MaxJoint3 = 230");
        spinnerAngle3.setName("spinnerAngle3"); // NOI18N
        spinnerAngle3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpinnerListenerJoint3(evt);
            }
        });

        jLabel11.setText("Joint 4 :");
        jLabel11.setEnabled(false);

        spinnerAngle4.setModel(new javax.swing.SpinnerNumberModel());
        spinnerAngle4.setEnabled(false);
        spinnerAngle4.setName("spinnerAngle4"); // NOI18N

        jLabel12.setText("Joint 5 :");
        jLabel12.setEnabled(false);

        jLabel13.setText("Joint 6 :");
        jLabel13.setEnabled(false);

        spinnerAngle5.setModel(new javax.swing.SpinnerNumberModel());
        spinnerAngle5.setEnabled(false);
        spinnerAngle5.setName("spinnerAngle5"); // NOI18N

        spinnerAngle6.setModel(new javax.swing.SpinnerNumberModel());
        spinnerAngle6.setEnabled(false);
        spinnerAngle6.setName("spinnerAngle6"); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spinnerAngle1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(spinnerAngle2)
                    .addComponent(spinnerAngle3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spinnerAngle4, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(spinnerAngle5)
                    .addComponent(spinnerAngle6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(spinnerAngle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(spinnerAngle4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(spinnerAngle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerAngle5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(spinnerAngle3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(spinnerAngle6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel4.setMaximumSize(new java.awt.Dimension(128, 109));
        jPanel4.setMinimumSize(new java.awt.Dimension(128, 109));

        jLabel14.setText("X :");

        spinner_x.setModel(new javax.swing.SpinnerNumberModel());
        spinner_x.setName("spinner_x"); // NOI18N

        jLabel15.setText("Y :");

        jLabel16.setText("Z :");

        spinner_y.setModel(new javax.swing.SpinnerNumberModel());
        spinner_y.setName("spinner_y"); // NOI18N

        spinner_z.setModel(new javax.swing.SpinnerNumberModel());
        spinner_z.setName("spinner_z"); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spinner_x, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(spinner_y)
                    .addComponent(spinner_z))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(spinner_x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(spinner_y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(spinner_z, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel17.setText("Speed");

        sliderSpeed.setMaximum(10);
        sliderSpeed.setMinimum(1);
        sliderSpeed.setMinorTickSpacing(1);
        sliderSpeed.setPaintTicks(true);
        sliderSpeed.setSnapToTicks(true);
        sliderSpeed.setToolTipText("Set Speed for robot rendering");
        sliderSpeed.setValue(5);
        sliderSpeed.setName("slide_speed"); // NOI18N
        sliderSpeed.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderSpeedStateChanged(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setText(" Trunk :");

        jLabel3.setText("Upper arm :");

        jLabel4.setText("Forearm :");

        jLabel5.setText("Color of Robot :");

        spinnerLink1.setModel(new javax.swing.SpinnerNumberModel());
        spinnerLink1.setName("spinnerLink2"); // NOI18N

        spinnerLink2.setModel(new javax.swing.SpinnerNumberModel());
        spinnerLink2.setName("spinnerLink2"); // NOI18N

        spinnerLink3.setModel(new javax.swing.SpinnerNumberModel());
        spinnerLink3.setName("spinnerLink3"); // NOI18N

        jLabel6.setText("Length");

        colorComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(spinnerLink1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(spinnerLink2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(spinnerLink3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(35, 35, 35)
                                .addComponent(colorComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spinnerLink3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerLink2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinnerLink1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(colorComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        jB_Home.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jB_Home.setText("Home");
        jB_Home.setToolTipText("Set default properties and set home for robot rendering");
        jB_Home.setMaximumSize(new java.awt.Dimension(73, 23));
        jB_Home.setMinimumSize(new java.awt.Dimension(73, 23));
        jB_Home.setName("bt_reset"); // NOI18N
        jB_Home.setPreferredSize(new java.awt.Dimension(73, 23));
        jB_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_HomeActionPerformed(evt);
            }
        });

        jB_Reset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jB_Reset.setText("Reset");
        jB_Reset.setToolTipText("Stop/move to the pevious coordinate");
        jB_Reset.setName("bt_pulse"); // NOI18N
        jB_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_ResetActionPerformed(evt);
            }
        });

        jB_Simulate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jB_Simulate.setText("Simulate");
        jB_Simulate.setToolTipText("Simulate the robot ");
        jB_Simulate.setName("bt_Simulation"); // NOI18N
        jB_Simulate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_SimulateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jP_KinematicsLayout = new javax.swing.GroupLayout(jP_Kinematics);
        jP_Kinematics.setLayout(jP_KinematicsLayout);
        jP_KinematicsLayout.setHorizontalGroup(
            jP_KinematicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_KinematicsLayout.createSequentialGroup()
                .addGroup(jP_KinematicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jP_KinematicsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jP_KinematicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jP_KinematicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jP_KinematicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jP_KinematicsLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(selectInverse))
                                    .addComponent(selectForward, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel17))
                        .addGroup(jP_KinematicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jP_KinematicsLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jP_KinematicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_KinematicsLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sliderSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jP_KinematicsLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jB_Simulate, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_Home, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jP_KinematicsLayout.setVerticalGroup(
            jP_KinematicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_KinematicsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_KinematicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jP_KinematicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectForward))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jP_KinematicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectInverse)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jP_KinematicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sliderSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(jP_KinematicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jP_KinematicsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jB_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jB_Simulate, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jB_Home, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        selectForward.getAccessibleContext().setAccessibleName("rd_forward");
        selectInverse.getAccessibleContext().setAccessibleName("rb_inverse");

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Robot Rendering"));
        jPanel5.setMaximumSize(new java.awt.Dimension(512, 444));
        jPanel5.setMinimumSize(new java.awt.Dimension(512, 444));

        jB_reset.setText("Reset");
        jB_reset.setToolTipText("Reset view of the robot");
        jB_reset.setMaximumSize(new java.awt.Dimension(65, 22));
        jB_reset.setMinimumSize(new java.awt.Dimension(65, 22));
        jB_reset.setPreferredSize(new java.awt.Dimension(65, 22));
        jB_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_resetActionPerformed(evt);
            }
        });

        jLabel23.setText("Zoom");

        jLabel39.setText("Status:");

        jL_Status.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jL_Status.setText("Idle...");

        jB_zoomOut.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jB_zoomOut.setText("-");
        jB_zoomOut.setToolTipText("Zoon out");
        jB_zoomOut.setMaximumSize(new java.awt.Dimension(41, 22));
        jB_zoomOut.setMinimumSize(new java.awt.Dimension(41, 22));
        jB_zoomOut.setPreferredSize(new java.awt.Dimension(41, 22));
        jB_zoomOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_zoomOutActionPerformed(evt);
            }
        });

        jB_zoonIn.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jB_zoonIn.setText("+");
        jB_zoonIn.setToolTipText("Zoom in");
        jB_zoonIn.setMaximumSize(new java.awt.Dimension(41, 22));
        jB_zoonIn.setMinimumSize(new java.awt.Dimension(41, 22));
        jB_zoonIn.setPreferredSize(new java.awt.Dimension(41, 22));
        jB_zoonIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_zoonInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout myCanvasPanel1Layout = new javax.swing.GroupLayout(myCanvasPanel1);
        myCanvasPanel1.setLayout(myCanvasPanel1Layout);
        myCanvasPanel1Layout.setHorizontalGroup(
            myCanvasPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        myCanvasPanel1Layout.setVerticalGroup(
            myCanvasPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(myCanvasPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addGap(18, 18, 18)
                        .addComponent(jL_Status, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel23)
                        .addGap(31, 31, 31)
                        .addComponent(jB_zoomOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_zoonIn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_reset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(myCanvasPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jB_zoomOut, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jB_zoonIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jB_reset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel23)
                        .addComponent(jLabel39)
                        .addComponent(jL_Status)))
                .addGap(5, 5, 5))
        );

        jP_Detail.setBackground(new java.awt.Color(255, 255, 255));
        jP_Detail.setBorder(javax.swing.BorderFactory.createTitledBorder("Detail"));
        jP_Detail.setMaximumSize(new java.awt.Dimension(512, 120));
        jP_Detail.setMinimumSize(new java.awt.Dimension(512, 120));
        jP_Detail.setPreferredSize(new java.awt.Dimension(512, 120));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 51, 51));
        jLabel37.setText("Kinematics :");

        jL_Kinematics.setForeground(new java.awt.Color(255, 51, 51));
        jL_Kinematics.setText("Initial");

        jL_trunk1.setForeground(new java.awt.Color(51, 0, 204));
        jL_trunk1.setMaximumSize(new java.awt.Dimension(52, 14));
        jL_trunk1.setMinimumSize(new java.awt.Dimension(52, 14));
        jL_trunk1.setPreferredSize(new java.awt.Dimension(52, 14));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(51, 0, 204));
        jLabel36.setText("Joint4 :");
        jLabel36.setEnabled(false);

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(51, 0, 204));
        jLabel38.setText("Joint5 :");
        jLabel38.setEnabled(false);

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(51, 0, 204));
        jLabel41.setText("Joint6 :");
        jLabel41.setEnabled(false);

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(51, 0, 204));
        jLabel42.setText("Joint3 :");

        jL_joint7.setForeground(new java.awt.Color(51, 0, 204));
        jL_joint7.setEnabled(false);
        jL_joint7.setMaximumSize(new java.awt.Dimension(41, 14));
        jL_joint7.setMinimumSize(new java.awt.Dimension(41, 14));
        jL_joint7.setPreferredSize(new java.awt.Dimension(41, 14));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(51, 0, 204));
        jLabel43.setText("X :");

        jL_joint8.setForeground(new java.awt.Color(51, 0, 204));
        jL_joint8.setEnabled(false);
        jL_joint8.setMaximumSize(new java.awt.Dimension(41, 14));
        jL_joint8.setMinimumSize(new java.awt.Dimension(41, 14));
        jL_joint8.setPreferredSize(new java.awt.Dimension(41, 14));

        jL_joint9.setForeground(new java.awt.Color(51, 0, 204));
        jL_joint9.setEnabled(false);
        jL_joint9.setMaximumSize(new java.awt.Dimension(41, 14));
        jL_joint9.setMinimumSize(new java.awt.Dimension(41, 14));
        jL_joint9.setPreferredSize(new java.awt.Dimension(41, 14));

        jL_upArm1.setForeground(new java.awt.Color(51, 0, 204));
        jL_upArm1.setMaximumSize(new java.awt.Dimension(52, 14));
        jL_upArm1.setMinimumSize(new java.awt.Dimension(52, 14));
        jL_upArm1.setPreferredSize(new java.awt.Dimension(52, 14));

        jL_joint3_.setForeground(new java.awt.Color(51, 0, 204));
        jL_joint3_.setMaximumSize(new java.awt.Dimension(40, 14));
        jL_joint3_.setMinimumSize(new java.awt.Dimension(40, 14));
        jL_joint3_.setPreferredSize(new java.awt.Dimension(40, 14));

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(51, 0, 204));
        jLabel44.setText("Z :");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(51, 0, 204));
        jLabel45.setText("Y :");

        jL_foreArm1.setForeground(new java.awt.Color(51, 0, 204));
        jL_foreArm1.setMaximumSize(new java.awt.Dimension(52, 14));
        jL_foreArm1.setMinimumSize(new java.awt.Dimension(52, 14));
        jL_foreArm1.setPreferredSize(new java.awt.Dimension(52, 14));

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(51, 0, 204));
        jLabel46.setText("Forearm     :");

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(51, 0, 204));
        jLabel47.setText("Trunk          :");

        jL_joint2_.setForeground(new java.awt.Color(51, 0, 204));
        jL_joint2_.setMaximumSize(new java.awt.Dimension(40, 14));
        jL_joint2_.setMinimumSize(new java.awt.Dimension(40, 14));
        jL_joint2_.setPreferredSize(new java.awt.Dimension(40, 14));

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(51, 0, 204));
        jLabel48.setText("Joint1 :");

        jL_joint1_.setForeground(new java.awt.Color(51, 0, 204));
        jL_joint1_.setMaximumSize(new java.awt.Dimension(40, 14));
        jL_joint1_.setMinimumSize(new java.awt.Dimension(40, 14));
        jL_joint1_.setPreferredSize(new java.awt.Dimension(40, 14));

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(51, 0, 204));
        jLabel49.setText("Joint2 :");

        jL_x1.setForeground(new java.awt.Color(51, 0, 204));
        jL_x1.setMaximumSize(new java.awt.Dimension(41, 14));
        jL_x1.setMinimumSize(new java.awt.Dimension(41, 14));
        jL_x1.setPreferredSize(new java.awt.Dimension(41, 14));

        jL_y1.setForeground(new java.awt.Color(51, 0, 204));
        jL_y1.setMaximumSize(new java.awt.Dimension(41, 14));
        jL_y1.setMinimumSize(new java.awt.Dimension(41, 14));
        jL_y1.setPreferredSize(new java.awt.Dimension(41, 14));

        jL_z1.setForeground(new java.awt.Color(51, 0, 204));
        jL_z1.setMaximumSize(new java.awt.Dimension(41, 14));
        jL_z1.setMinimumSize(new java.awt.Dimension(41, 14));
        jL_z1.setPreferredSize(new java.awt.Dimension(41, 14));

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(51, 0, 204));
        jLabel50.setText("Upper arm :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Pevious simulation");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Current simulation");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 51, 51));
        jLabel35.setText("Z :");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 51, 51));
        jLabel34.setText("Y :");

        jL_foreArm.setForeground(new java.awt.Color(255, 51, 51));
        jL_foreArm.setMaximumSize(new java.awt.Dimension(52, 14));
        jL_foreArm.setMinimumSize(new java.awt.Dimension(52, 14));
        jL_foreArm.setPreferredSize(new java.awt.Dimension(52, 14));

        jL_trunk.setForeground(new java.awt.Color(255, 51, 51));
        jL_trunk.setMaximumSize(new java.awt.Dimension(52, 14));
        jL_trunk.setMinimumSize(new java.awt.Dimension(52, 14));
        jL_trunk.setPreferredSize(new java.awt.Dimension(52, 14));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 51, 51));
        jLabel33.setText("Joint4 :");
        jLabel33.setEnabled(false);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 51, 51));
        jLabel32.setText("Joint5 :");
        jLabel32.setEnabled(false);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 51, 51));
        jLabel31.setText("Joint6 :");
        jLabel31.setEnabled(false);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 51, 51));
        jLabel30.setText("Joint3 :");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 51, 51));
        jLabel25.setText("Forearm     :");

        jL_joint6.setForeground(new java.awt.Color(255, 51, 51));
        jL_joint6.setEnabled(false);
        jL_joint6.setMaximumSize(new java.awt.Dimension(41, 14));
        jL_joint6.setMinimumSize(new java.awt.Dimension(41, 14));
        jL_joint6.setPreferredSize(new java.awt.Dimension(41, 14));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 51, 51));
        jLabel26.setText("Trunk          :");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 51, 51));
        jLabel27.setText("X :");

        jL_joint2.setForeground(new java.awt.Color(255, 51, 51));
        jL_joint2.setMaximumSize(new java.awt.Dimension(40, 14));
        jL_joint2.setMinimumSize(new java.awt.Dimension(40, 14));
        jL_joint2.setPreferredSize(new java.awt.Dimension(40, 14));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 51, 51));
        jLabel28.setText("Joint1 :");

        jL_joint4.setForeground(new java.awt.Color(255, 51, 51));
        jL_joint4.setEnabled(false);
        jL_joint4.setMaximumSize(new java.awt.Dimension(41, 14));
        jL_joint4.setMinimumSize(new java.awt.Dimension(41, 14));
        jL_joint4.setPreferredSize(new java.awt.Dimension(41, 14));

        jL_joint1.setForeground(new java.awt.Color(255, 51, 51));
        jL_joint1.setMaximumSize(new java.awt.Dimension(40, 14));
        jL_joint1.setMinimumSize(new java.awt.Dimension(40, 14));
        jL_joint1.setPreferredSize(new java.awt.Dimension(40, 14));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 51, 51));
        jLabel29.setText("Joint2 :");

        jL_joint5.setForeground(new java.awt.Color(255, 51, 51));
        jL_joint5.setEnabled(false);
        jL_joint5.setMaximumSize(new java.awt.Dimension(41, 14));
        jL_joint5.setMinimumSize(new java.awt.Dimension(41, 14));
        jL_joint5.setPreferredSize(new java.awt.Dimension(41, 14));

        jL_x.setForeground(new java.awt.Color(255, 51, 51));
        jL_x.setMaximumSize(new java.awt.Dimension(41, 14));
        jL_x.setMinimumSize(new java.awt.Dimension(41, 14));
        jL_x.setPreferredSize(new java.awt.Dimension(41, 14));

        jL_upArm.setForeground(new java.awt.Color(255, 51, 51));
        jL_upArm.setMaximumSize(new java.awt.Dimension(52, 14));
        jL_upArm.setMinimumSize(new java.awt.Dimension(52, 14));
        jL_upArm.setPreferredSize(new java.awt.Dimension(52, 14));

        jL_y.setForeground(new java.awt.Color(255, 51, 51));
        jL_y.setMaximumSize(new java.awt.Dimension(41, 14));
        jL_y.setMinimumSize(new java.awt.Dimension(41, 14));
        jL_y.setPreferredSize(new java.awt.Dimension(41, 14));

        jL_joint3.setForeground(new java.awt.Color(255, 51, 51));
        jL_joint3.setMaximumSize(new java.awt.Dimension(40, 14));
        jL_joint3.setMinimumSize(new java.awt.Dimension(40, 14));
        jL_joint3.setPreferredSize(new java.awt.Dimension(40, 14));

        jL_z.setForeground(new java.awt.Color(255, 51, 51));
        jL_z.setMaximumSize(new java.awt.Dimension(41, 14));
        jL_z.setMinimumSize(new java.awt.Dimension(41, 14));
        jL_z.setPreferredSize(new java.awt.Dimension(41, 14));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 51, 51));
        jLabel24.setText("Upper arm :");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(51, 0, 204));
        jLabel40.setText("Kinematics :");

        jL_Kinematics1.setForeground(new java.awt.Color(51, 0, 204));
        jL_Kinematics1.setText("Initial");

        javax.swing.GroupLayout jP_DetailLayout = new javax.swing.GroupLayout(jP_Detail);
        jP_Detail.setLayout(jP_DetailLayout);
        jP_DetailLayout.setHorizontalGroup(
            jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_DetailLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP_DetailLayout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jL_Kinematics1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jP_DetailLayout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jL_Kinematics, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel19)
                    .addGroup(jP_DetailLayout.createSequentialGroup()
                        .addGroup(jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47)
                            .addComponent(jLabel50)
                            .addComponent(jLabel46))
                        .addGap(16, 16, 16)
                        .addGroup(jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jL_upArm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jL_foreArm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jL_trunk1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jP_DetailLayout.createSequentialGroup()
                                .addComponent(jLabel44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jL_z1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jP_DetailLayout.createSequentialGroup()
                                .addComponent(jLabel43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jL_x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jP_DetailLayout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jL_y1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jP_DetailLayout.createSequentialGroup()
                        .addGroup(jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jP_DetailLayout.createSequentialGroup()
                                .addComponent(jLabel49)
                                .addGap(18, 18, 18)
                                .addComponent(jL_joint2_, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jP_DetailLayout.createSequentialGroup()
                                .addComponent(jLabel48)
                                .addGap(18, 18, 18)
                                .addComponent(jL_joint1_, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jP_DetailLayout.createSequentialGroup()
                                .addComponent(jLabel42)
                                .addGap(18, 18, 18)
                                .addComponent(jL_joint3_, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jP_DetailLayout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jL_joint7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jP_DetailLayout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jL_joint8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jP_DetailLayout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jL_joint9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel7)
                    .addGroup(jP_DetailLayout.createSequentialGroup()
                        .addGroup(jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25))
                        .addGap(16, 16, 16)
                        .addGroup(jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jL_upArm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jL_foreArm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jL_trunk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jP_DetailLayout.createSequentialGroup()
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jL_z, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jP_DetailLayout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jL_x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jP_DetailLayout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jL_y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jP_DetailLayout.createSequentialGroup()
                        .addGroup(jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jP_DetailLayout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(18, 18, 18)
                                .addComponent(jL_joint2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jP_DetailLayout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addGap(18, 18, 18)
                                .addComponent(jL_joint1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jP_DetailLayout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addGap(18, 18, 18)
                                .addComponent(jL_joint3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jP_DetailLayout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jL_joint6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jP_DetailLayout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jL_joint4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jP_DetailLayout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jL_joint5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jP_DetailLayout.setVerticalGroup(
            jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_DetailLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addComponent(jL_Kinematics1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP_DetailLayout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel46)
                            .addComponent(jL_foreArm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jP_DetailLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jP_DetailLayout.createSequentialGroup()
                                .addGroup(jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jP_DetailLayout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel45)
                                            .addComponent(jL_y1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel43)
                                    .addComponent(jL_x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel44)
                                    .addComponent(jL_z1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jP_DetailLayout.createSequentialGroup()
                                .addComponent(jL_trunk1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jL_upArm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP_DetailLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel42))
                    .addGroup(jP_DetailLayout.createSequentialGroup()
                        .addGroup(jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jP_DetailLayout.createSequentialGroup()
                                    .addComponent(jLabel48)
                                    .addGap(11, 11, 11)
                                    .addComponent(jLabel49))
                                .addGroup(jP_DetailLayout.createSequentialGroup()
                                    .addComponent(jL_joint1_, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel38)
                                        .addComponent(jL_joint2_, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jL_joint9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel36)
                            .addComponent(jL_joint8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jP_DetailLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel41)
                                    .addComponent(jL_joint7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jP_DetailLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jL_joint3_, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(17, 17, 17)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addComponent(jL_Kinematics, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP_DetailLayout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jL_foreArm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jP_DetailLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jP_DetailLayout.createSequentialGroup()
                                .addGroup(jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jP_DetailLayout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel34)
                                            .addComponent(jL_y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel27)
                                    .addComponent(jL_x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel35)
                                    .addComponent(jL_z, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jP_DetailLayout.createSequentialGroup()
                                .addComponent(jL_trunk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jL_upArm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP_DetailLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel30))
                    .addGroup(jP_DetailLayout.createSequentialGroup()
                        .addGroup(jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jP_DetailLayout.createSequentialGroup()
                                    .addComponent(jLabel28)
                                    .addGap(11, 11, 11)
                                    .addComponent(jLabel29))
                                .addGroup(jP_DetailLayout.createSequentialGroup()
                                    .addComponent(jL_joint1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel32)
                                        .addComponent(jL_joint2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jL_joint5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel33)
                            .addComponent(jL_joint4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jP_DetailLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jP_DetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31)
                                    .addComponent(jL_joint6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jP_DetailLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jL_joint3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(20, 20, 20))
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Log History"));

        jB_saveLog.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jB_saveLog.setText("Save");
        jB_saveLog.setToolTipText("Save Log history");
        jB_saveLog.setEnabled(false);
        jB_saveLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_saveLogActionPerformed(evt);
            }
        });

        jB_replay.setText("Replay");
        jB_replay.setToolTipText("Replay the Log history");
        jB_replay.setMaximumSize(new java.awt.Dimension(73, 23));
        jB_replay.setMinimumSize(new java.awt.Dimension(73, 23));
        jB_replay.setPreferredSize(new java.awt.Dimension(73, 23));
        jB_replay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_replayActionPerformed(evt);
            }
        });

        jB_ResetLog.setText("Reset");
        jB_ResetLog.setToolTipText("Stop/move the robot to the pevious coordinator");
        jB_ResetLog.setMaximumSize(new java.awt.Dimension(73, 23));
        jB_ResetLog.setMinimumSize(new java.awt.Dimension(73, 23));
        jB_ResetLog.setName("bt_pulse"); // NOI18N
        jB_ResetLog.setPreferredSize(new java.awt.Dimension(73, 23));
        jB_ResetLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_ResetLogActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Replay Log# :");

        jL_LogNumberLetter.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jL_LogNumberLetter.setText("Current Log# :");

        jL_LogNumber.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jL_LogNumber.setMaximumSize(new java.awt.Dimension(48, 14));
        jL_LogNumber.setMinimumSize(new java.awt.Dimension(48, 14));
        jL_LogNumber.setPreferredSize(new java.awt.Dimension(48, 14));

        jL_Saved.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jL_Saved.setForeground(new java.awt.Color(255, 0, 51));
        jL_Saved.setText("Save!");
        jL_Saved.setMaximumSize(new java.awt.Dimension(52, 15));
        jL_Saved.setMinimumSize(new java.awt.Dimension(52, 15));
        jL_Saved.setPreferredSize(new java.awt.Dimension(52, 15));

        jTA_log.setColumns(20);
        jTA_log.setRows(5);
        jTA_log.setBorder(new javax.swing.border.MatteBorder(null));
        jScrollPane1.setViewportView(jTA_log);

        jCb_Log.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCb_LogItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jL_LogNumberLetter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jL_LogNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jL_Saved, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCb_Log, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_replay, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_ResetLog, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jB_saveLog)
                .addGap(6, 6, 6))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jL_LogNumberLetter, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jL_Saved, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jL_LogNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(jB_replay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jB_ResetLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18)
                        .addComponent(jCb_Log, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jB_saveLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jP_Detail, javax.swing.GroupLayout.PREFERRED_SIZE, 284, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jP_Kinematics, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jP_Kinematics, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jP_Detail, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void initialRendering()
	{   
	//set initial value of link lengths
		spinnerLink1.setValue(Properties.getValueLink1());
		spinnerLink2.setValue(Properties.getValueLink2());
		spinnerLink3.setValue(Properties.getValueLink3());
	// set home
		spinner_x.setValue(Properties.homeX);
		spinner_y.setValue(Properties.homeY);
		spinner_z.setValue(Properties.homeZ);
	// set initial value of joints
		spinnerAngle1.setValue(Properties.initValueJoint1);
		spinnerAngle2.setValue(Properties.initValueJoint2);
		spinnerAngle3.setValue(Properties.initValueJoint3);
                spinnerAngle4.setValue(Properties.initValueJoint4);
		spinnerAngle5.setValue(Properties.initValueJoint5);
		spinnerAngle6.setValue(Properties.initValueJoint6);
	// add initial value of speeds
		sliderSpeed.setValue(Properties.initialValueSpeed);
		ButtonGroup kinematicsSelection = new ButtonGroup();
		kinematicsSelection.add(selectForward);
		kinematicsSelection.add(selectInverse);
                this.selectForward.setSelected(true);
                Properties.setKinematicsType("Forward");
                this.spinnerAngle1.setEnabled(true);
                this.spinnerAngle2.setEnabled(true);
                this.spinnerAngle3.setEnabled(true);
                this.spinner_x.setEnabled(false);
                this.spinner_y.setEnabled(false);
                this.spinner_z.setEnabled(false);
                
                this.jB_Reset.setEnabled(false);
                this.jB_ResetLog.setEnabled(false);
                this.jL_LogNumberLetter.setText("Current Log# :"); 
                logger.GetCurrentLogNumber(Properties);
                this.jL_LogNumber.setText(Integer.toString(Properties.getNewLogNumber()));
                //not now Bind_JTextAreaLog(Integer.toString(Properties.getNewLogNumber()));               
                this.jL_Saved.setText(" ");
                this.jB_saveLog.setVisible(false);
                this.jB_saveLog.setEnabled(false);
                
                this.spinnerLink1.setEnabled(false);
                this.spinnerLink2.setEnabled(false);
                this.spinnerLink3.setEnabled(false);
                this.colorComboBox1.setEnabled(false);
                this.jL_trunk.setText(Double.toString(Properties.getInitValueLink1()));
                this.jL_upArm.setText(Double.toString(Properties.getInitValueLink2()));
                this.jL_foreArm.setText(Double.toString(Properties.getInitValueLink3()));
                this.jL_joint1.setText(Double.toString(Properties.getInitValueJoint1()));
                this.jL_joint2.setText(Double.toString(Properties.getInitValueJoint2()));
                this.jL_joint3.setText(Double.toString(Properties.getInitValueJoint3()));
                this.jL_x.setText(Double.toString(Properties.homeX));
                this.jL_y.setText(Double.toString(Properties.homeY));
                this.jL_z.setText(Double.toString(Properties.homeZ));
                this.jCb_Log.removeAllItems();
                this.bind_LogList();
                this.jB_replay.setEnabled(false);
                String[] ListOfLastLog = logger.FindListOfLastLog(Properties);
                this.Bind_JTextAreaLog(ListOfLastLog);

	}
 
    private void jB_SimulateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_SimulateActionPerformed
        // TODO add your handling code here:
        // set all value at Properties class
                // render  pevious value
                this.jL_Kinematics1.setText(this.jL_Kinematics.getText());
                this.jL_trunk1.setText(this.jL_trunk.getText());
                this.jL_upArm1.setText(this.jL_upArm.getText());
                this.jL_foreArm1.setText(this.jL_foreArm.getText());
                this.jL_joint1_.setText(this.jL_joint1.getText());
                this.jL_joint2_.setText(this.jL_joint2.getText());
                this.jL_joint3_.setText(this.jL_joint3.getText());
                this.jL_x1.setText(this.jL_x.getText());
                this.jL_y1.setText(this.jL_y.getText());
                this.jL_z1.setText(this.jL_z.getText());
                this.jB_Reset.setBackground(Color.red);
                
                jL_Status.setText("Setting parameter...");
                Properties.setValueLink1_beforeChange(Double.parseDouble(this.jL_trunk.getText()));
	    	Properties.setValueLink2_beforeChange(Double.parseDouble(this.jL_upArm.getText()));
	    	Properties.setValueLink3_beforeChange(Double.parseDouble(this.jL_foreArm.getText()));
                Double t = Double.parseDouble(this.jL_joint1.getText());
                Properties.setValueJoint1_beforeChange(t.intValue());
                t = Double.parseDouble(this.jL_joint2.getText());
	    	Properties.setValueJoint2_beforeChange(t.intValue());
                t = Double.parseDouble(this.jL_joint3.getText());
	    	Properties.setValueJoint3_beforeChange(t.intValue());

	    	Properties.setValueX_beforeChange(Double.parseDouble(this.jL_x.getText()));
	    	Properties.setValueY_beforeChange(Double.parseDouble(this.jL_y.getText()));
	    	Properties.setValueZ_beforeChange(Double.parseDouble(this.jL_z.getText()));                                

	    	Properties.setValueLink1(Double.parseDouble(spinnerLink1.getValue().toString()));
	    	Properties.setValueLink2(Double.parseDouble(spinnerLink2.getValue().toString()));
	    	Properties.setValueLink3(Double.parseDouble(spinnerLink3.getValue().toString()));

                Properties.setValueJoint1(Double.parseDouble(spinnerAngle1.getValue().toString()));
	    	Properties.setValueJoint2(Double.parseDouble(spinnerAngle2.getValue().toString()));
	    	Properties.setValueJoint3(Double.parseDouble(spinnerAngle3.getValue().toString()));

	    	Properties.setValueX(Double.parseDouble(spinner_x.getValue().toString()));
	    	Properties.setValueY(Double.parseDouble(spinner_y.getValue().toString()));
	    	Properties.setValueZ(Double.parseDouble(spinner_z.getValue().toString()));	    	
	    	Properties.setValueSpeed(sliderSpeed.getValue());
	    	jL_Status.setText("Kinematics running...");

	    	//check Kinematics
	    	String Kinematics_Selected = Properties.getKinematics();
                this.jL_Kinematics.setText(Kinematics_Selected);
             try { 
             
                if (Kinematics_Selected == "Forward")
	    	{
			// use Forword Kinematic from Stephan
	    		//forwardKinematics.calcEndCoordinates(Properties);                      
                ForwardKinematicsSolver forwardKinematics = new ForwardKinematicsSolver(Properties);             
                forwardKinematics.calcEndCoordinates(Properties); 
	    	}
	    	else
	    	{
			// use Inverse Kinematic form Stephan 	
                InverseKinematicsSolver inverseKinematics = new InverseKinematicsSolver(Properties);             
                inverseKinematics.calculateAngles(Properties);
	    	}
             }
            catch (NumberFormatException e) 
             { 
                 JDialog f = new DialogAlert(new JFrame(),e.getMessage());	
				f.show();
             } 
             
             if(!Properties.getCanReach())
             {
                 this.jL_Status.setText(Properties.getErrorMessage());
                 Properties.setValueJoint1(Properties.getValueJoint1_beforeChange());
                 Properties.setValueJoint2(Properties.getValueJoint2_beforeChange());
                 Properties.setValueJoint3(Properties.getValueJoint3_beforeChange());
                 Properties.setValueJoint4(Properties.getValueJoint4_beforeChange());
                 Properties.setValueJoint5(Properties.getValueJoint5_beforeChange());
                 Properties.setValueJoint6(Properties.getValueJoint6_beforeChange());
                 
                 Properties.setValueX(Properties.getValueX_beforeChange());
                 Properties.setValueY(Properties.getValueY_beforeChange());
                 Properties.setValueZ(Properties.getValueZ_beforeChange());
                 
             }
             else{

               
               // get all of the value From Properties for rendering on GUI
             
                jL_joint1.setText(Integer.toString((int)Properties.getValueJoint1()));
                jL_joint2.setText(Integer.toString((int)Properties.getValueJoint2()));
                jL_joint3.setText(Integer.toString((int)Properties.getValueJoint3()));
                jL_joint4.setText(Integer.toString((int)Properties.getValueJoint4()));
                jL_joint5.setText(Integer.toString((int)Properties.getValueJoint5()));
                jL_joint6.setText(Integer.toString((int)Properties.getValueJoint6()));
                jL_trunk.setText(Double.toString(Properties.getValueLink1()));
                jL_upArm.setText(Double.toString(Properties.getValueLink2()));
                jL_foreArm.setText(Double.toString(Properties.getValueLink3()));               
                jL_x.setText(Double.toString(Properties.getValueX()));
                jL_y.setText(Double.toString(Properties.getValueY()));
                jL_z.setText(Double.toString(Properties.getValueZ()));
                
                String TimeStamp = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss").format(new Date());
                
                String KinematicsB = this.jL_Kinematics1.getText();
                String TrunkB = this.jL_trunk1.getText();
                String UpperArmB = this.jL_upArm1.getText();
                String ForeArmB = this.jL_foreArm1.getText();
                String Joint1B = this.jL_joint1_.getText();
                String Joint2B = this.jL_joint2_.getText();
                String Joint3B = this.jL_joint3_.getText();
                String Joint4B = "0";
                String Joint5B = "0";
                String Joint6B = "0";
                String XB = this.jL_x1.getText();
                String YB = this.jL_y1.getText();
                String ZB = this.jL_z1.getText();      
                
                
                String SentToLog;
                SentToLog = "#,"+ Integer.toString(Properties.getNewLogNumber()+1)+"\r\n";  
               SentToLog = SentToLog + TimeStamp + ','+KinematicsB+','+ TrunkB +','+UpperArmB+','+ForeArmB+','+Joint1B+','+Joint2B+','+Joint3B+','+Joint4B+','+Joint5B+','+Joint6B+','+XB+','+YB+','+ZB;
                
                String Kinematics = this.jL_Kinematics.getText();
                String Trunk = this.jL_trunk.getText();
                String UpperArm = this.jL_upArm.getText();
                String ForeArm = this.jL_foreArm.getText();
                String Joint1 = this.jL_joint1.getText();
                String Joint2 = this.jL_joint2.getText();
                String Joint3 = this.jL_joint3.getText();
                String Joint4 = this.jL_joint4.getText();
                String Joint5 = this.jL_joint5.getText();
                String Joint6 = this.jL_joint6.getText();
                String X = this.jL_x.getText();
                String Y = this.jL_y.getText();
                String Z = this.jL_z.getText();      
                
                
                SentToLog = SentToLog +','+ Kinematics+','+Trunk +','+UpperArm+','+ForeArm+','+Joint1+','+Joint2+','+Joint3+','+Joint4+','+Joint5+','+Joint6+','+X+','+Y+','+Z;
                //logger.write(SentToLog);
                logger.WriteToFile(SentToLog);
                this.jCb_Log.removeAllItems();
                this.bind_LogList();  
                jL_Status.setText("Success...");

               
                this.jB_Simulate.setEnabled(false);
                this.jB_Home.setEnabled(false);
                //this.jB_reset.setEnabled(false);
                //this.jB_zoonIn.setEnabled(false);
                //this.jB_zoomOut.setEnabled(false);
                this.colorComboBox1.setEnabled(false);
                this.jL_LogNumberLetter.setText("Current Log# :");
                
                this.jL_LogNumber.setText(Integer.toString(Properties.getNewLogNumber()));
                this.jL_Saved.setText(" ");
                this.jB_Reset.setEnabled(true);
                this.jB_replay.setEnabled(false);
                this.jCb_Log.setEnabled(false);
                this.jB_saveLog.setEnabled(false);
                jL_Status.setText("Robot rendering...");
               // call ola module
//                logger.FindListOfLastLog(Properties);
//                String[] ListOfLastLog = Properties.getList_AfterSim();
                String[] ListOfLastLog = logger.FindListOfLastLog(Properties);
                this.Bind_JTextAreaLog(ListOfLastLog);
                // render in Text Area read current log number to EOF
                
                myCanvasPanel1.runSim((int)Properties.getValueJoint1(), (int)Properties.getValueJoint2(), (int)Properties.getValueJoint3(), (int)Properties.getValueJoint4(), (int)Properties.getValueJoint5(),(int)Properties.getValueJoint6());
             }
                
    }//GEN-LAST:event_jB_SimulateActionPerformed

    private void SpinnerListenerJoint1(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpinnerListenerJoint1
        // TODO add your handling code here:
        int a = (int)Double.parseDouble(spinnerAngle1.getValue().toString());
			//txt_x.setText(Integer.toString(a));			
			if(a < Properties.MinJoint1)
			{
				// alert Min
				JDialog f = new DialogAlert(new JFrame(),"Min is "+ Integer.toString(Properties.MinJoint1));	
				f.show();
				spinnerAngle1.setValue(Properties.MinJoint1);	
			}
			else if (a> Properties.MaxJoint1)
			{
				// alert Max
				JDialog f = new DialogAlert(new JFrame(),"Max is "+ Integer.toString(Properties.MaxJoint1));	
				f.show();
				spinnerAngle1.setValue(Properties.MaxJoint1);	
			}
    }//GEN-LAST:event_SpinnerListenerJoint1

    private void SpinnerListenerJoint2(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpinnerListenerJoint2
        // TODO add your handling code here:
        int a = (int)Double.parseDouble(spinnerAngle2.getValue().toString());
			//txt_y.setText(Integer.toString(a));			
			if(a < Properties.MinJoint2)
			{
				// alert Min
				JDialog f = new DialogAlert(new JFrame(),"Min is "+ Integer.toString(Properties.MinJoint2));	
				f.show();
				spinnerAngle2.setValue(Properties.MinJoint2);	
			}
			else if (a> Properties.MaxJoint2)
			{
				// alert Max
				JDialog f = new DialogAlert(new JFrame(),"Max is "+ Integer.toString(Properties.MaxJoint2));	
				f.show();
				spinnerAngle2.setValue(Properties.MaxJoint2);	
			}
    }//GEN-LAST:event_SpinnerListenerJoint2

    private void SpinnerListenerJoint3(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpinnerListenerJoint3
        // TODO add your handling code here:
        int a = (int)Double.parseDouble(spinnerAngle3.getValue().toString());
			//txt_z.setText(Integer.toString(a));			
			if(a < Properties.MinJoint3)
			{
				// alert Min
				JDialog f = new DialogAlert(new JFrame(),"Min is "+ Integer.toString(Properties.MinJoint3));	
				f.show();
				spinnerAngle3.setValue(Properties.MinJoint3);	
			}
			else if (a> Properties.MaxJoint3)
			{
				// alert Max
				JDialog f = new DialogAlert(new JFrame(),"Max is "+ Integer.toString(Properties.MaxJoint3));	
				f.show();
				spinnerAngle3.setValue(Properties.MaxJoint3);	
			}
                        
    }//GEN-LAST:event_SpinnerListenerJoint3

    private void selectForwardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectForwardActionPerformed
        // TODO add your handling code here:
        Properties.setKinematicsType(evt.getActionCommand().toString());
        this.spinnerAngle1.setEnabled(true);
        this.spinnerAngle2.setEnabled(true);
        this.spinnerAngle3.setEnabled(true);
        this.spinner_x.setEnabled(false);
        this.spinner_y.setEnabled(false);
        this.spinner_z.setEnabled(false);
    }//GEN-LAST:event_selectForwardActionPerformed

    private void selectInverseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectInverseActionPerformed
        // TODO add your handling code here:
        Properties.setKinematicsType(evt.getActionCommand().toString());
       
        this.spinner_x.setEnabled(true);
        this.spinner_y.setEnabled(true);
        this.spinner_z.setEnabled(true);
        
        this.spinnerAngle1.setEnabled(false);
        this.spinnerAngle2.setEnabled(false);
        this.spinnerAngle3.setEnabled(false);
        
    }//GEN-LAST:event_selectInverseActionPerformed

    private void jB_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_HomeActionPerformed
        // TODO add your handling code here:
        //set parameter to home
        initialRendering();
        this.jL_Status.setText("Set default and home...");
        myCanvasPanel1.setSpeed(50);
//         myCanvasPanel1.runSim((int)Properties.getInitValueJoint1(), (int)Properties.getInitValueJoint2(), (int)Properties.getValueJoint3(), (int)Properties.getValueJoint4(), (int)Properties.getValueJoint5(),(int)Properties.getValueJoint6());
        myCanvasPanel1.runSim(0,0,0,0,0,0);
         myCanvasPanel1.setSpeed(this.sliderSpeed.getValue());
        //call Ola robot move to home
                           
 
    }//GEN-LAST:event_jB_HomeActionPerformed

    private void jB_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_ResetActionPerformed
        // TODO add your handling code here:
                this.jB_Simulate.setEnabled(true);
                this.jB_Home.setEnabled(true);
                this.jB_reset.setEnabled(true);
                this.jB_zoonIn.setEnabled(true);
                this.jB_zoomOut.setEnabled(true);
//                this.colorComboBox1.setEnabled(true);
//                this.spinnerLink1.setEnabled(false);
//                this.spinnerLink2.setEnabled(false);
//                this.spinnerLink3.setEnabled(false);
                this.jB_saveLog.setEnabled(true);
                this.jB_Reset.setEnabled(false);
               this.jCb_Log.setEnabled(true);
                this.jL_Status.setText("Stop/move to the pevious coordinate");
           

    }//GEN-LAST:event_jB_ResetActionPerformed

    private void jB_saveLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_saveLogActionPerformed
     
            this.jB_saveLog.setEnabled(false);
            this.jL_LogNumberLetter.setText("Current Log# :"); 
            this.jL_LogNumber.setText(Integer.toString(Properties.getNewLogNumber()));
            String NextLogNumber = "#,"+ Integer.toString(Properties.getNewLogNumber()+1);
            //logger.write(NextLogNumber);
            logger.WriteToFile(NextLogNumber);
            this.jCb_Log.removeAllItems();
            this.bind_LogList();           
            this.jB_replay.setEnabled(false);
            this.jL_Saved.setText("Saved!");
            this.jL_Saved.setEnabled(true);
    }//GEN-LAST:event_jB_saveLogActionPerformed

    private void bind_LogList()
    {
      logger.GetCurrentLogNumber(Properties);       
      for (int i = Properties.getNewLogNumber()-1; i> 0; i--)
            {
               jCb_Log.addItem(i);                
            }     
    }
    private void Bind_JTextAreaLog(String y)
    {
        String[] List =  logger.FindList(Properties,y);
        Properties.setList_Replay(List);
        String str = "";
        for (int i = 0; i<List.length;i++)
                {
                    if (List[i] == null) break;
                    str = str+ List[i]+"\r\n";
                }
        this.jL_Saved.setText("");
        this.jL_LogNumber.setText(y);
        this.jL_LogNumberLetter.setText("Current Log# :"); 
        this.jTA_log.setText(str);
    }
    private void Bind_JTextAreaLog(String[] List)
    {
        Properties.setList_Replay(List);
        String str = "";
        for (int i = 0; i<List.length;i++)
                {
                    if (List[i] == null) break;
                    str = str+ List[i]+"\r\n";
                }
        this.jL_Saved.setText("");
        this.jL_LogNumber.setText(Integer.toString(Properties.getNewLogNumber()));
        this.jL_LogNumberLetter.setText("Current Log# :"); 
        this.jTA_log.setText(str);
    }
    private void jB_replayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_replayActionPerformed
       this.jB_Simulate.setEnabled(false);
                this.jB_Home.setEnabled(false);
                this.jB_reset.setEnabled(false);
                this.jB_zoonIn.setEnabled(false);
                this.jB_zoomOut.setEnabled(false);
                this.colorComboBox1.setEnabled(false);
                //this.jL_LogNumberLetter.setText(" ");
                //this.jL_LogNumber.setText(" ");
                this.jL_Saved.setText(" ");
                this.jB_replay.setEnabled(false);
                this.jB_ResetLog.setEnabled(true);
                this.jB_saveLog.setEnabled(false);
                this.jCb_Log.setEnabled(false);
                this.jB_ResetLog.setBackground(Color.red);
                this.jL_Status.setText("Replaying log history...");
                //int k = Integer.parseInt(jL_LogNumber.getText());
                String[] List_Replay = logger.FindList(Properties,jL_LogNumber.getText());
                //String[] List_Replay = logger.FindList(Properties,this.jL_LogNumber.getText());
                String[] List = new String[27];

                List = List_Replay[0].split(","); //5-10 (joint1-6 Original in the log)
                
                gui_orang2.ReplayFrame newReplay = new gui_orang2.ReplayFrame(Properties
                        ,Integer.parseInt(List[5])
                        ,Integer.parseInt(List[6])
                        ,Integer.parseInt(List[7])
                        ,Integer.parseInt(List[8])
                        ,Integer.parseInt(List[9])
                        ,Integer.parseInt(List[10])
                        ,Integer.parseInt(List[18])
                        ,Integer.parseInt(List[19])
                        ,Integer.parseInt(List[20])
                        ,Integer.parseInt(List[21])
                        ,Integer.parseInt(List[22])
                        ,Integer.parseInt(List[23]));
                newReplay.setVisible(true);
    }//GEN-LAST:event_jB_replayActionPerformed

    private void jB_ResetLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_ResetLogActionPerformed
        // TODO add your handling code here:
                this.jB_Simulate.setEnabled(true);
                this.jB_Home.setEnabled(true);
                this.jB_reset.setEnabled(true);
                this.jB_zoonIn.setEnabled(true);
                this.jB_zoomOut.setEnabled(true);
                this.colorComboBox1.setEnabled(true);
//                this.spinnerLink1.setEnabled(true);
//                this.spinnerLink2.setEnabled(true);
//                this.spinnerLink3.setEnabled(true);
                this.jB_saveLog.setEnabled(true);
                this.jB_Reset.setEnabled(false);
              this.jCb_Log.setEnabled(true);
                this.jB_saveLog.setEnabled(false);
                this.jB_ResetLog.setEnabled(false);
                this.jL_Status.setText("Stop/move to the pevious coordinate");
    }//GEN-LAST:event_jB_ResetLogActionPerformed

    private void jB_zoomOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_zoomOutActionPerformed
                this.jL_Status.setText("Zoom out...");   
                myCanvasPanel1.zoomUp();
                // Call Ola
    }//GEN-LAST:event_jB_zoomOutActionPerformed

    private void jB_zoonInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_zoonInActionPerformed
                this.jL_Status.setText("Zoom in..."); 
                myCanvasPanel1.zoomDown();
                // call Ola
    }//GEN-LAST:event_jB_zoonInActionPerformed

    private void jB_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_resetActionPerformed
                this.jL_Status.setText("Reset the veiw..."); 
                myCanvasPanel1.setZoom(4);
                // call Ola
    }//GEN-LAST:event_jB_resetActionPerformed

    private void jCb_LogItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCb_LogItemStateChanged
        this.jB_replay.setEnabled(true);
        this.jB_saveLog.setEnabled(false);
        Object y = evt.getItem();
        Bind_JTextAreaLog(y.toString());    
    }//GEN-LAST:event_jCb_LogItemStateChanged

    private void sliderSpeedStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderSpeedStateChanged
        myCanvasPanel1.setSpeed(this.sliderSpeed.getValue());
        // TODO add your handlinfgfg code here:
    }//GEN-LAST:event_sliderSpeedStateChanged

    private void colorComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorComboBox1ActionPerformed
        // TODO add your handling code here:
       java.awt.Color myColor;
       myColor = (Color)this.colorComboBox1.getSelectedItem();
       myCanvasPanel1.setColor(myColor.getRed(), myColor.getGreen(), myColor.getBlue());
    }//GEN-LAST:event_colorComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(OrangG1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(OrangG1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(OrangG1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(OrangG1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new OrangG1().setVisible(false);
//            }
//        });
//    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.jdnc.incubator.jxcombobox.colorcombo.ColorComboBox colorComboBox1;
    private javax.swing.JButton jB_Home;
    private javax.swing.JButton jB_Reset;
    private javax.swing.JButton jB_ResetLog;
    private javax.swing.JButton jB_Simulate;
    private javax.swing.JButton jB_replay;
    private javax.swing.JButton jB_reset;
    private javax.swing.JButton jB_saveLog;
    private javax.swing.JButton jB_zoomOut;
    private javax.swing.JButton jB_zoonIn;
    private javax.swing.JComboBox jCb_Log;
    private javax.swing.JLabel jL_Kinematics;
    private javax.swing.JLabel jL_Kinematics1;
    private javax.swing.JLabel jL_LogNumber;
    private javax.swing.JLabel jL_LogNumberLetter;
    private javax.swing.JLabel jL_Saved;
    private javax.swing.JLabel jL_Status;
    private javax.swing.JLabel jL_foreArm;
    private javax.swing.JLabel jL_foreArm1;
    private javax.swing.JLabel jL_joint1;
    private javax.swing.JLabel jL_joint1_;
    private javax.swing.JLabel jL_joint2;
    private javax.swing.JLabel jL_joint2_;
    private javax.swing.JLabel jL_joint3;
    private javax.swing.JLabel jL_joint3_;
    private javax.swing.JLabel jL_joint4;
    private javax.swing.JLabel jL_joint5;
    private javax.swing.JLabel jL_joint6;
    private javax.swing.JLabel jL_joint7;
    private javax.swing.JLabel jL_joint8;
    private javax.swing.JLabel jL_joint9;
    private javax.swing.JLabel jL_trunk;
    private javax.swing.JLabel jL_trunk1;
    private javax.swing.JLabel jL_upArm;
    private javax.swing.JLabel jL_upArm1;
    private javax.swing.JLabel jL_x;
    private javax.swing.JLabel jL_x1;
    private javax.swing.JLabel jL_y;
    private javax.swing.JLabel jL_y1;
    private javax.swing.JLabel jL_z;
    private javax.swing.JLabel jL_z1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jP_Detail;
    private javax.swing.JPanel jP_Kinematics;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTA_log;
    private Canvas.MyCanvasPanel myCanvasPanel1;
    private javax.swing.JRadioButton selectForward;
    private javax.swing.JRadioButton selectInverse;
    private javax.swing.JSlider sliderSpeed;
    private javax.swing.JSpinner spinnerAngle1;
    private javax.swing.JSpinner spinnerAngle2;
    private javax.swing.JSpinner spinnerAngle3;
    private javax.swing.JSpinner spinnerAngle4;
    private javax.swing.JSpinner spinnerAngle5;
    private javax.swing.JSpinner spinnerAngle6;
    private javax.swing.JSpinner spinnerLink1;
    private javax.swing.JSpinner spinnerLink2;
    private javax.swing.JSpinner spinnerLink3;
    private javax.swing.JSpinner spinner_x;
    private javax.swing.JSpinner spinner_y;
    private javax.swing.JSpinner spinner_z;
    // End of variables declaration//GEN-END:variables
}
