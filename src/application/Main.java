package application;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HomePanel = new javax.swing.JPanel();
        MainMenuBar = new javax.swing.JMenuBar();
        ProcessMenu = new javax.swing.JMenu();
        ProcessMenuItem = new javax.swing.JMenuItem();
        ExitMenuItem = new javax.swing.JMenuItem();
        InformationMenu = new javax.swing.JMenu();
        AboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("The Scheduler » Home");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(705, 515));
        setName("Main"); // NOI18N
        setResizable(false);

        HomePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout HomePanelLayout = new javax.swing.GroupLayout(HomePanel);
        HomePanel.setLayout(HomePanelLayout);
        HomePanelLayout.setHorizontalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
        );
        HomePanelLayout.setVerticalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
        );

        ProcessMenu.setText("File");

        ProcessMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        ProcessMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/application_new.png"))); // NOI18N
        ProcessMenuItem.setText("New Process");
        ProcessMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ProcessMenuItemMousePressed(evt);
            }
        });
        ProcessMenu.add(ProcessMenuItem);

        ExitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        ExitMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/door_out.png"))); // NOI18N
        ExitMenuItem.setText("Exit");
        ExitMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ExitMenuItemMousePressed(evt);
            }
        });
        ProcessMenu.add(ExitMenuItem);

        MainMenuBar.add(ProcessMenu);

        InformationMenu.setText("Information");

        AboutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        AboutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/information.png"))); // NOI18N
        AboutMenuItem.setText("About");
        AboutMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AboutMenuItemMousePressed(evt);
            }
        });
        InformationMenu.add(AboutMenuItem);

        MainMenuBar.add(InformationMenu);

        setJMenuBar(MainMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProcessMenuItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProcessMenuItemMousePressed
        new Process().setVisible(true);
    }//GEN-LAST:event_ProcessMenuItemMousePressed

    private void AboutMenuItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutMenuItemMousePressed
        new About().setVisible(true);
}//GEN-LAST:event_AboutMenuItemMousePressed

    private void ExitMenuItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMenuItemMousePressed
        System.exit(0);
    }//GEN-LAST:event_ExitMenuItemMousePressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AboutMenuItem;
    private javax.swing.JMenuItem ExitMenuItem;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JMenu InformationMenu;
    private javax.swing.JMenuBar MainMenuBar;
    private javax.swing.JMenu ProcessMenu;
    private javax.swing.JMenuItem ProcessMenuItem;
    // End of variables declaration//GEN-END:variables
}