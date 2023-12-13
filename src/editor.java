
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class editor extends javax.swing.JFrame {

    ArrayList<kitap> k;
    DefaultTableModel m;
    
    
    public editor() {
        initComponents();
        k = new ArrayList();
        m = (DefaultTableModel) m_table.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        m_dil = new javax.swing.JList<>();
        m_kitap = new javax.swing.JTextField();
        m_yazar = new javax.swing.JTextField();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        m_adet = new javax.swing.JSpinner();
        m_sayfa = new javax.swing.JSpinner();
        m_çeviren = new javax.swing.JTextField();
        m_yayınevi = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        m_tür = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        m_table = new javax.swing.JTable();
        m_kaydet = new javax.swing.JButton();
        m_ara = new javax.swing.JButton();
        m_sil = new javax.swing.JButton();
        m_güncelle = new javax.swing.JButton();
        m_görüntüle = new javax.swing.JButton();
        m_temizle = new javax.swing.JButton();
        m_tarih = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kitap Adı :");

        jLabel2.setText("Yazar Adı :");

        jLabel3.setText("Tür :");

        jLabel4.setText("Adet :");

        jLabel5.setText("Sayfa Sayısı :");

        jLabel6.setText("Kapak :");

        jLabel7.setText("Yayın Yılı :");

        jLabel8.setText("Durum :");

        jLabel9.setText("Çeviren :");

        jLabel10.setText("Yayınevi : ");

        jLabel11.setText("Dil :");

        m_dil.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Türkçe", "İngilizce", "Fransızca", "Çince", "Arapça", "Almanca", "Rusça", "İtalyanca", "Japonca", "DİĞER" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(m_dil);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Ciltli");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Ciltsiz");

        buttonGroup2.add(jCheckBox1);
        jCheckBox1.setText("Rafta");

        buttonGroup2.add(jCheckBox2);
        jCheckBox2.setText("Okuyucuda");

        m_tür.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Edebiyat", "Şiir", "Dil", "Bİyografi", "Çocuk", "Kişisel Gelişim", "Gezi", "Anı", "Din", "Psikoloji", "Tarih", "Felsefe", "Araştırma/İnceleme", "Eğitim" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(m_tür);

        m_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kitap", "Yazar", "Tür", "Durum", "Dil"
            }
        ));
        jScrollPane3.setViewportView(m_table);

        m_kaydet.setText("Kaydet");
        m_kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_kaydetActionPerformed(evt);
            }
        });

        m_ara.setText("Ara");
        m_ara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_araActionPerformed(evt);
            }
        });

        m_sil.setText("Sil");
        m_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_silActionPerformed(evt);
            }
        });

        m_güncelle.setText("Güncelle");
        m_güncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_güncelleActionPerformed(evt);
            }
        });

        m_görüntüle.setText("Görüntüle");
        m_görüntüle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_görüntüleActionPerformed(evt);
            }
        });

        m_temizle.setText("Temizle");
        m_temizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_temizleActionPerformed(evt);
            }
        });

        m_tarih.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022 - 2020", "2020 - 2010", "2010 - 2000", "2000 - 1990", "1990 - 1980", "1980 -  1970", "1970 -  1960", "1960 -  1950", "Diğer" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(27, 27, 27)
                                .addComponent(m_çeviren))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(m_tarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 106, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(m_kitap)
                                    .addComponent(m_yayınevi, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(m_yazar))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(m_kaydet)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(m_ara, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(m_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(m_güncelle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(m_görüntüle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(m_temizle))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(50, 50, 50)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(m_adet, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                                                    .addComponent(m_sayfa, javax.swing.GroupLayout.Alignment.LEADING)))
                                            .addComponent(jLabel5)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jCheckBox1)))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jCheckBox2))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(96, 96, 96)
                                                .addComponent(jLabel3))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(43, 43, 43)
                                        .addComponent(jRadioButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton3)))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(m_kitap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m_adet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(m_yazar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m_sayfa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(m_yayınevi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(m_çeviren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton3)))
                    .addComponent(jScrollPane2)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(m_tarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(m_kaydet)
                        .addComponent(m_ara)
                        .addComponent(m_sil)
                        .addComponent(m_güncelle)
                        .addComponent(m_görüntüle)
                        .addComponent(m_temizle)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void m_kaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_kaydetActionPerformed
        try{
            String durum,kapak;
            
            if(jCheckBox1.isSelected()){
                durum = "Rafta";
            }
            else if(jCheckBox2.isSelected()){
                durum = "Okuyucuda";
            }else{ durum = "Bilinmiyor";}
            
            if(jRadioButton1.isSelected()){
                kapak = "Ciltsiz";
            }
            else if(jCheckBox2.isSelected()){
                kapak = "Ciltli";
            }else{ kapak = "Bilinmiyor";}
            
            kitap yeni = new kitap (m_kitap.getText(),m_yazar.getText(),m_yayınevi.getText(),m_çeviren.getText(),
                    m_tür.getSelectedValue(),m_dil.getSelectedValue(),kapak,durum,m_sayfa.getValue().toString(),
                    m_tarih.getSelectedItem().toString(),m_adet.getValue().toString());
            
            k.add(yeni);
            yazdır();
            
        }catch(Exception e){
            System.out.println("Kayıt başarısız !!");
        }
    }//GEN-LAST:event_m_kaydetActionPerformed

    private void m_araActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_araActionPerformed
        try{
        for(int i=0;i<k.size();i++){
        if(!m_kitap.getText().equals(k.get(i).KitapAd)){
            
        }else if(m_kitap.getText().equals(k.get(i).KitapAd)){
            JOptionPane.showMessageDialog(null,k.get(i).KitapAd+"\n"+k.get(i).Yazar+"\nYayınevi :"+k.get(i).Yayınevi+"\nÇeviren :"+k.get(i).Çeviren
                +"\nBasım Yılı"+k.get(i).Tarih+"\nSayfa :"+k.get(i).Sayfa+"\nAdet :"+k.get(i).Adet+"\nKapak :"+k.get(i).Kapak+"\nDurum :"
                +k.get(i).Durum+"\nTür :"+k.get(i).Tür+"\nDil :"+k.get(i).Dil);
        }
        }
        }catch(Exception e){
            System.out.println("Arama Hatası !!");
        }       
    }//GEN-LAST:event_m_araActionPerformed

    private void m_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_silActionPerformed
        try{
        int i = m_table.getSelectedRow();
        int a = JOptionPane.showConfirmDialog(null,"Emin misin?","Veri Silme",JOptionPane.YES_NO_OPTION); 
        if(a == 0){
            k.remove(i);
        }
        yazdır();
        }catch(Exception e){
            System.out.println("Silme İşleminde Hata Meydana Geldi !!");
        }
    }//GEN-LAST:event_m_silActionPerformed

    private void m_güncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_güncelleActionPerformed
        try{
        int i = m_table.getSelectedRow();
        k.get(i).KitapAd=JOptionPane.showInputDialog(null,"Kitap :");
        k.get(i).Yazar=JOptionPane.showInputDialog(null,"Yazar :");
        k.get(i).Yayınevi=JOptionPane.showInputDialog(null,"Yayınevi :");
        k.get(i).Çeviren=JOptionPane.showInputDialog(null,"Çevirmen :");
        k.get(i).Tarih=JOptionPane.showInputDialog(null,"Basım Tarihi :");
        k.get(i).Adet=JOptionPane.showInputDialog(null,"Adet :");
        k.get(i).Sayfa=JOptionPane.showInputDialog(null,"Sayfa sayısı :");
        k.get(i).Durum=JOptionPane.showInputDialog(null,"Durum :");
        k.get(i).Kapak=JOptionPane.showInputDialog(null,"Kapak :");
        k.get(i).Tür=JOptionPane.showInputDialog(null,"Tür :");
        k.get(i).Dil=JOptionPane.showInputDialog(null,"Dil :");
        k.get(i).Durum=JOptionPane.showInputDialog(null,"Durum :");
        yazdır();
        }catch(Exception e){
            System.out.println("Güncellenemedi !!");
        }
    }//GEN-LAST:event_m_güncelleActionPerformed

    private void m_görüntüleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_görüntüleActionPerformed
        try{
        int i = m_table.getSelectedRow();
        JOptionPane.showMessageDialog(null,k.get(i).KitapAd+"\n"+k.get(i).Yazar+"\nYayınevi :"+k.get(i).Yayınevi+"\nÇeviren :"+k.get(i).Çeviren
                +"\nBasım Yılı"+k.get(i).Tarih+"\nSayfa :"+k.get(i).Sayfa+"\nAdet :"+k.get(i).Adet+"\nKapak :"+k.get(i).Kapak+"\nDurum :"
                +k.get(i).Durum+"\nTür :"+k.get(i).Tür+"\nDil :"+k.get(i).Dil);
        }catch(Exception e){
            System.out.println("Görüntüleme Hatası !!");
        }
    }//GEN-LAST:event_m_görüntüleActionPerformed

    private void m_temizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_temizleActionPerformed
        try{
        m_kitap.setText("");
        m_yazar.setText("");
        m_çeviren.setText("");
        m_yayınevi.setText("");
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        m_adet.setValue(9);
        m_sayfa.setValue(9);
        m_tür.clearSelection();
        m_dil.clearSelection();
        m_tarih.setSelectedIndex(0);
        }catch(Exception e){
            System.out.println("Temizleme Hatası !!");
        }
    }//GEN-LAST:event_m_temizleActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editor().setVisible(true);
            }
        });
    }
    

    void yazdır(){
        try{
        m.setRowCount(0);
        for(int i = 0; i < k.size(); i++){
            Object s[] = {k.get(i).KitapAd,k.get(i).Yazar,k.get(i).Tür,k.get(i).Durum,k.get(i).Dil};
            m.addRow(s);
        }
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, "Tablo Yazdırılamadı.");
        }
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner m_adet;
    private javax.swing.JButton m_ara;
    private javax.swing.JList<String> m_dil;
    private javax.swing.JButton m_görüntüle;
    private javax.swing.JButton m_güncelle;
    private javax.swing.JButton m_kaydet;
    private javax.swing.JTextField m_kitap;
    private javax.swing.JSpinner m_sayfa;
    private javax.swing.JButton m_sil;
    private javax.swing.JTable m_table;
    private javax.swing.JComboBox<String> m_tarih;
    private javax.swing.JButton m_temizle;
    private javax.swing.JList<String> m_tür;
    private javax.swing.JTextField m_yayınevi;
    private javax.swing.JTextField m_yazar;
    private javax.swing.JTextField m_çeviren;
    // End of variables declaration//GEN-END:variables
}
