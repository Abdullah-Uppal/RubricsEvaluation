/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubricsevaluation;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import java.awt.Toolkit;
import java.util.*;
import java.text.SimpleDateFormat;

/**
 *
 * @author abdullah
 */
public class Main extends javax.swing.JFrame {
    
    private static final int WIDTH = Toolkit.getDefaultToolkit().getScreenSize().width;
    private static final int HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height;
    //Few Colors
    private static final Color brightLilac = new Color(205, 132, 241);
    private static final Color prettyPlease = new Color(255, 204, 204);
    private static final Color lightRed = new Color(255, 77, 77);
    private static final Color lightPurple = new Color(197, 108, 240);
    private static final Color white = new Color(255, 255, 255);
    private static final Color electricBlue = new Color(126, 255, 245);
    
    
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        this.setLocation((WIDTH-this.getWidth())/2, (HEIGHT-this.getHeight())/2);
        
        //Date and time
        SimpleDateFormat date = new SimpleDateFormat("EEEE dd");
        SimpleDateFormat time = new SimpleDateFormat("hh:mm a");
        dateLabel.setText(date.format(new Date()));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new RoundedPanel(30);
        bar = new RoundedPanel(30);
        logoPanel = new RoundedPanel(30);
        logoLabel = new javax.swing.JLabel();
        homeButtonPanel = new RoundedPanel(30);
        homeButtonLabel = new javax.swing.JLabel();
        courseButtonPanel = new RoundedPanel(30);
        courseButtonLabel = new javax.swing.JLabel();
        studentButtonPanel = new RoundedPanel(30);
        studentButtonLabel = new javax.swing.JLabel();
        assessmentButtonPanel = new RoundedPanel(30);
        assessmentButtonLabel = new javax.swing.JLabel();
        stack = new javax.swing.JPanel();
        dashboard = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userinfo = new RoundedPanel(30);
        displayPicture = new javax.swing.JLabel();
        clockPanel = new RoundedPanel(30);
        dateLabel = new javax.swing.JLabel();
        coursesPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        studentPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        assessmentPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rubrics Evaluation");
        setUndecorated(true);
        setResizable(false);

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setForeground(new java.awt.Color(255, 255, 255));

        bar.setBackground(lightPurple);
        bar.setForeground(lightPurple);

        logoPanel.setBackground(lightPurple);
        logoPanel.setForeground(lightPurple);

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubricsevaluation/icons8-inspection-64.png"))); // NOI18N

        javax.swing.GroupLayout logoPanelLayout = new javax.swing.GroupLayout(logoPanel);
        logoPanel.setLayout(logoPanelLayout);
        logoPanelLayout.setHorizontalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        logoPanelLayout.setVerticalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        homeButtonPanel.setBackground(new java.awt.Color(255, 255, 255));
        homeButtonPanel.setForeground(lightPurple);

        homeButtonLabel.setBackground(new java.awt.Color(255, 255, 255));
        homeButtonLabel.setForeground(new java.awt.Color(255, 255, 255));
        homeButtonLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubricsevaluation/icons8-home-64.png"))); // NOI18N
        homeButtonLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeButtonLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout homeButtonPanelLayout = new javax.swing.GroupLayout(homeButtonPanel);
        homeButtonPanel.setLayout(homeButtonPanelLayout);
        homeButtonPanelLayout.setHorizontalGroup(
            homeButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeButtonLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        homeButtonPanelLayout.setVerticalGroup(
            homeButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeButtonLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        courseButtonPanel.setBackground(lightPurple);
        courseButtonPanel.setForeground(lightPurple);

        courseButtonLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubricsevaluation/icons8-course-64.png"))); // NOI18N
        courseButtonLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                courseButtonLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout courseButtonPanelLayout = new javax.swing.GroupLayout(courseButtonPanel);
        courseButtonPanel.setLayout(courseButtonPanelLayout);
        courseButtonPanelLayout.setHorizontalGroup(
            courseButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(courseButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(courseButtonLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        courseButtonPanelLayout.setVerticalGroup(
            courseButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(courseButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(courseButtonLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        studentButtonPanel.setBackground(lightPurple);
        studentButtonPanel.setForeground(lightPurple);

        studentButtonLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubricsevaluation/icons8-person-64.png"))); // NOI18N
        studentButtonLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentButtonLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout studentButtonPanelLayout = new javax.swing.GroupLayout(studentButtonPanel);
        studentButtonPanel.setLayout(studentButtonPanelLayout);
        studentButtonPanelLayout.setHorizontalGroup(
            studentButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studentButtonLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        studentButtonPanelLayout.setVerticalGroup(
            studentButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studentButtonLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        assessmentButtonPanel.setBackground(lightPurple);
        assessmentButtonPanel.setForeground(lightPurple);

        assessmentButtonLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubricsevaluation/rsz_icons8-scorecard-64.png"))); // NOI18N
        assessmentButtonLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                assessmentButtonLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout assessmentButtonPanelLayout = new javax.swing.GroupLayout(assessmentButtonPanel);
        assessmentButtonPanel.setLayout(assessmentButtonPanelLayout);
        assessmentButtonPanelLayout.setHorizontalGroup(
            assessmentButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assessmentButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(assessmentButtonLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        assessmentButtonPanelLayout.setVerticalGroup(
            assessmentButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assessmentButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(assessmentButtonLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout barLayout = new javax.swing.GroupLayout(bar);
        bar.setLayout(barLayout);
        barLayout.setHorizontalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(studentButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(barLayout.createSequentialGroup()
                        .addGroup(barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(homeButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(courseButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(assessmentButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        barLayout.setVerticalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(homeButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(courseButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(studentButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(assessmentButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        logoPanel.setOpaque(false);
        homeButtonPanel.setOpaque(false);
        courseButtonPanel.setOpaque(false);
        studentButtonPanel.setOpaque(false);
        assessmentButtonPanel.setOpaque(false);

        stack.setBackground(new java.awt.Color(255, 255, 255));
        stack.setForeground(new java.awt.Color(255, 255, 255));
        stack.setLayout(new java.awt.CardLayout());

        dashboard.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("DashBoard");

        userinfo.setBackground(prettyPlease);
        userinfo.setForeground(prettyPlease);

        displayPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rubricsevaluation/icons8-school-director-male-skin-type-7-64.png"))); // NOI18N

        clockPanel.setBackground(lightPurple);
        clockPanel.setForeground(lightPurple);

        dateLabel.setForeground(new java.awt.Color(255, 255, 255));
        dateLabel.setText("Sunday 04");

        javax.swing.GroupLayout clockPanelLayout = new javax.swing.GroupLayout(clockPanel);
        clockPanel.setLayout(clockPanelLayout);
        clockPanelLayout.setHorizontalGroup(
            clockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clockPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(dateLabel)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        clockPanelLayout.setVerticalGroup(
            clockPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clockPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(dateLabel)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout userinfoLayout = new javax.swing.GroupLayout(userinfo);
        userinfo.setLayout(userinfoLayout);
        userinfoLayout.setHorizontalGroup(
            userinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userinfoLayout.createSequentialGroup()
                .addGroup(userinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userinfoLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(clockPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(userinfoLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(displayPicture)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        userinfoLayout.setVerticalGroup(
            userinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userinfoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(displayPicture)
                .addGap(93, 93, 93)
                .addComponent(clockPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(300, Short.MAX_VALUE))
        );

        clockPanel.setOpaque(false);

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 359, Short.MAX_VALUE)
                .addComponent(userinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userinfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        userinfo.setOpaque(false);

        stack.add(dashboard, "card2");

        coursesPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("CoursesPanel");

        javax.swing.GroupLayout coursesPanelLayout = new javax.swing.GroupLayout(coursesPanel);
        coursesPanel.setLayout(coursesPanelLayout);
        coursesPanelLayout.setHorizontalGroup(
            coursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coursesPanelLayout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(jLabel2)
                .addContainerGap(450, Short.MAX_VALUE))
        );
        coursesPanelLayout.setVerticalGroup(
            coursesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coursesPanelLayout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel2)
                .addContainerGap(359, Short.MAX_VALUE))
        );

        stack.add(coursesPanel, "card3");

        studentPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("This is student panelo");

        javax.swing.GroupLayout studentPanelLayout = new javax.swing.GroupLayout(studentPanel);
        studentPanel.setLayout(studentPanelLayout);
        studentPanelLayout.setHorizontalGroup(
            studentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentPanelLayout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jLabel3)
                .addContainerGap(455, Short.MAX_VALUE))
        );
        studentPanelLayout.setVerticalGroup(
            studentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentPanelLayout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(jLabel3)
                .addContainerGap(279, Short.MAX_VALUE))
        );

        stack.add(studentPanel, "card4");

        assessmentPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("This is assessment panel");

        javax.swing.GroupLayout assessmentPanelLayout = new javax.swing.GroupLayout(assessmentPanel);
        assessmentPanel.setLayout(assessmentPanelLayout);
        assessmentPanelLayout.setHorizontalGroup(
            assessmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assessmentPanelLayout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel4)
                .addContainerGap(492, Short.MAX_VALUE))
        );
        assessmentPanelLayout.setVerticalGroup(
            assessmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assessmentPanelLayout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(jLabel4)
                .addContainerGap(329, Short.MAX_VALUE))
        );

        stack.add(assessmentPanel, "card5");

        javax.swing.GroupLayout backLayout = new javax.swing.GroupLayout(back);
        back.setLayout(backLayout);
        backLayout.setHorizontalGroup(
            backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        backLayout.setVerticalGroup(
            backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(stack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        bar.setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        //back.setOpaque(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonLabelMouseClicked
        // TODO add your handling code here:
        
        //homeButtonPanel.setForeground(white);
        
        courseButtonPanel.setBackground(lightPurple);
        //courseButtonLabel.setForeground(lightPurple);
        
        studentButtonPanel.setBackground(lightPurple);
        //studentButtonLabel.setForeground(lightPurple);
        
        //assessmentButtonLabel.setForeground(lightPurple);
        assessmentButtonPanel.setBackground(lightPurple);
        homeButtonPanel.setBackground(white);
        
        //Changing the view
        stack.removeAll();
        stack.add(dashboard);
        stack.repaint();
        stack.revalidate();
    }//GEN-LAST:event_homeButtonLabelMouseClicked

    private void courseButtonLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courseButtonLabelMouseClicked
        // TODO add your handling code here:
        
        //courseButtonPanel.setForeground(white);
        
        homeButtonPanel.setBackground(lightPurple);
        //homeButtonPanel.setForeground(lightPurple);
        
        studentButtonPanel.setBackground(lightPurple);
        //studentButtonPanel.setForeground(lightPurple);
        
        
        //assessmentButtonPanel.setForeground(lightPurple);
        assessmentButtonPanel.setBackground(lightPurple);
        courseButtonPanel.setBackground(white);
        
        
        //Changing the view
        stack.removeAll();
        stack.add(coursesPanel);
        stack.repaint();
        stack.revalidate();
        
       
    }//GEN-LAST:event_courseButtonLabelMouseClicked

    private void studentButtonLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentButtonLabelMouseClicked
        // TODO add your handling code here:
        
        homeButtonPanel.setBackground(lightPurple);
        //homeButtonPanel.setForeground(lightPurple);
        
        courseButtonPanel.setBackground(lightPurple);
        //courseButtonPanel.setForeground(lightPurple);
        
        //assessmentButtonPanel.setForeground(lightPurple);
        assessmentButtonPanel.setBackground(lightPurple);
        studentButtonPanel.setBackground(white);

        stack.removeAll();
        stack.add(studentPanel);
        stack.repaint();
        stack.revalidate();
        
    }//GEN-LAST:event_studentButtonLabelMouseClicked

    private void assessmentButtonLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assessmentButtonLabelMouseClicked
        // TODO add your handling code here:
        //assessmentButtonPanel.setForeground(white);
        assessmentButtonPanel.setBackground(white);
        
        homeButtonPanel.setBackground(lightPurple);
        //homeButtonPanel.setForeground(lightPurple);
        
        studentButtonPanel.setBackground(lightPurple);
        //studentButtonPanel.setForeground(lightPurple);
        
        courseButtonPanel.setBackground(lightPurple);
        //courseButtonPanel.setForeground(lightPurple);
        
        stack.removeAll();
        stack.add(assessmentPanel);
        stack.repaint();
        stack.revalidate();
    }//GEN-LAST:event_assessmentButtonLabelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel assessmentButtonLabel;
    private javax.swing.JPanel assessmentButtonPanel;
    private javax.swing.JPanel assessmentPanel;
    private javax.swing.JPanel back;
    private javax.swing.JPanel bar;
    private javax.swing.JPanel clockPanel;
    private javax.swing.JLabel courseButtonLabel;
    private javax.swing.JPanel courseButtonPanel;
    private javax.swing.JPanel coursesPanel;
    private javax.swing.JPanel dashboard;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel displayPicture;
    private javax.swing.JLabel homeButtonLabel;
    private javax.swing.JPanel homeButtonPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JPanel stack;
    private javax.swing.JLabel studentButtonLabel;
    private javax.swing.JPanel studentButtonPanel;
    private javax.swing.JPanel studentPanel;
    private javax.swing.JPanel userinfo;
    // End of variables declaration//GEN-END:variables
}