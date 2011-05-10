package ProcessScheduling;

import javax.swing.JTextField;

public class FIFO extends javax.swing.JFrame {

    JTextField[] ProcessIdList;
    JTextField[] BurstList;
    JTextField[] ArrivalList;
    JTextField[] PriorityList;

    public FIFO(JTextField[] ProcessId, JTextField[] Burst, JTextField[] Arrival, JTextField[] Priority) {
        this.ProcessIdList = ProcessId;
        this.BurstList = Burst;
        this.ArrivalList = Arrival;
        this.PriorityList = Priority;
        initFIFO();
        initComponents();
        setLocationRelativeTo(null);
    }

    public final void initFIFO() {
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FIFOPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("The Scheduler » FIFO");
        setMinimumSize(new java.awt.Dimension(705, 515));
        setName("FIFO"); // NOI18N

        FIFOPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout FIFOPanelLayout = new javax.swing.GroupLayout(FIFOPanel);
        FIFOPanel.setLayout(FIFOPanelLayout);
        FIFOPanelLayout.setHorizontalGroup(
            FIFOPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
        );
        FIFOPanelLayout.setVerticalGroup(
            FIFOPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 487, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FIFOPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FIFOPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
//                new FIFO().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FIFOPanel;
    // End of variables declaration//GEN-END:variables
}