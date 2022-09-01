/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.compilador.view;

import com.mycompany.compilador.model.FileService;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author Gabriel Kresin
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu2
     */
    public MainMenu() {
        initComponents();
        jTextArea_editor.setBorder(new NumberedBorder());

        // Configura as barras de rolagens para estarem sempre visíveis
        jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // Configura o texto dos botões para serem exibidos abaixo dos ícones
        jButton_new.setVerticalTextPosition(JButton.BOTTOM);
        jButton_new.setHorizontalTextPosition(JButton.CENTER);
        jButton_open.setVerticalTextPosition(JButton.BOTTOM);
        jButton_open.setHorizontalTextPosition(JButton.CENTER);
        jButton_save.setVerticalTextPosition(JButton.BOTTOM);
        jButton_save.setHorizontalTextPosition(JButton.CENTER);
        jButton_copy.setVerticalTextPosition(JButton.BOTTOM);
        jButton_copy.setHorizontalTextPosition(JButton.CENTER);
        jButton_paste.setVerticalTextPosition(JButton.BOTTOM);
        jButton_paste.setHorizontalTextPosition(JButton.CENTER);
        jButton_cut.setVerticalTextPosition(JButton.BOTTOM);
        jButton_cut.setHorizontalTextPosition(JButton.CENTER);
        jButton_compile.setVerticalTextPosition(JButton.BOTTOM);
        jButton_compile.setHorizontalTextPosition(JButton.CENTER);
        jButton_team.setVerticalTextPosition(JButton.BOTTOM);
        jButton_team.setHorizontalTextPosition(JButton.CENTER);

        // Configura os atalhos dos botões
        int condition = JComponent.WHEN_IN_FOCUSED_WINDOW;

        // Atalho para criar novo arquivo
        KeyStroke keyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK);
        InputMap inputMap = jButton_new.getInputMap(condition);
        ActionMap actionMap = jButton_new.getActionMap();
        inputMap.put(keyStroke, keyStroke.toString());
        actionMap.put(keyStroke.toString(), new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton_newActionPerformed(e);
            }
        });

        // Atalho para abrir arquivo
        keyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK);
        inputMap = jButton_open.getInputMap(condition);
        actionMap = jButton_open.getActionMap();
        inputMap.put(keyStroke, keyStroke.toString());
        actionMap.put(keyStroke.toString(), new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton_openActionPerformed(e);
            }
        });

        // Atalho para salvar arquivo
        keyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK);
        inputMap = jButton_open.getInputMap(condition);
        actionMap = jButton_open.getActionMap();
        inputMap.put(keyStroke, keyStroke.toString());
        actionMap.put(keyStroke.toString(), new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton_newActionPerformed(e);
            }
        });

        // Atalho para copiar texto
        keyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK);
        inputMap = jButton_open.getInputMap(condition);
        actionMap = jButton_open.getActionMap();
        inputMap.put(keyStroke, keyStroke.toString());
        actionMap.put(keyStroke.toString(), new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton_newActionPerformed(e);
            }
        });

        // Atalho para colar texto
        keyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_DOWN_MASK);
        inputMap = jButton_open.getInputMap(condition);
        actionMap = jButton_open.getActionMap();
        inputMap.put(keyStroke, keyStroke.toString());
        actionMap.put(keyStroke.toString(), new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton_newActionPerformed(e);
            }
        });

        // Atalho para recortar texto
        keyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_DOWN_MASK);
        inputMap = jButton_open.getInputMap(condition);
        actionMap = jButton_open.getActionMap();
        inputMap.put(keyStroke, keyStroke.toString());
        actionMap.put(keyStroke.toString(), new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton_newActionPerformed(e);
            }
        });

        // Atalho para compilar arquivo
        keyStroke = KeyStroke.getKeyStroke("F7");
        inputMap = jButton_open.getInputMap(condition);
        actionMap = jButton_open.getActionMap();
        inputMap.put(keyStroke, keyStroke.toString());
        actionMap.put(keyStroke.toString(), new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton_newActionPerformed(e);
            }
        });

        // Atalho para abrir a equipe
        keyStroke = KeyStroke.getKeyStroke("F1");
        inputMap = jButton_open.getInputMap(condition);
        actionMap = jButton_open.getActionMap();
        inputMap.put(keyStroke, keyStroke.toString());
        actionMap.put(keyStroke.toString(), new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton_newActionPerformed(e);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton_new = new javax.swing.JButton();
        jButton_open = new javax.swing.JButton();
        jButton_save = new javax.swing.JButton();
        jButton_copy = new javax.swing.JButton();
        jButton_paste = new javax.swing.JButton();
        jButton_cut = new javax.swing.JButton();
        jButton_compile = new javax.swing.JButton();
        jButton_team = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_editor = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_messages = new javax.swing.JTextArea();
        jLabel_statusBar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(910, 600));

        jButton_new.setIcon(new javax.swing.ImageIcon(getClass().getResource("/new_file_icon.png"))); // NOI18N
        jButton_new.setText("Novo");
        jButton_new.setToolTipText("Criar novo arquivo (ctrl + n)");
        jButton_new.setHideActionText(true);
        jButton_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_newActionPerformed(evt);
            }
        });

        jButton_open.setIcon(new javax.swing.ImageIcon(getClass().getResource("/open_file_icon.png"))); // NOI18N
        jButton_open.setText("Abrir");
        jButton_open.setToolTipText("Abrir um arquivo (ctrl + o)");
        jButton_open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_openActionPerformed(evt);
            }
        });

        jButton_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save_file_icon.png"))); // NOI18N
        jButton_save.setText("Salvar");
        jButton_save.setToolTipText("Salvar aequivo (ctrl + s)");
        jButton_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_saveActionPerformed(evt);
            }
        });

        jButton_copy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/copy_icon.png"))); // NOI18N
        jButton_copy.setText("Copiar");
        jButton_copy.setToolTipText("Copiar texto (ctrl + c)");
        jButton_copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_copyActionPerformed(evt);
            }
        });

        jButton_paste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paste_icon.png"))); // NOI18N
        jButton_paste.setText("Colar");
        jButton_paste.setToolTipText("Colar texto (ctrl + v)");
        jButton_paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_pasteActionPerformed(evt);
            }
        });

        jButton_cut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cut_icon.png"))); // NOI18N
        jButton_cut.setText("Recortar");
        jButton_cut.setToolTipText("Recortar texto (ctrl + x)");
        jButton_cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cutActionPerformed(evt);
            }
        });

        jButton_compile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compile_icon.png"))); // NOI18N
        jButton_compile.setText("Compilar");
        jButton_compile.setToolTipText("Compilar o código (F7)");
        jButton_compile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_compileActionPerformed(evt);
            }
        });

        jButton_team.setIcon(new javax.swing.ImageIcon(getClass().getResource("/team_icon.png"))); // NOI18N
        jButton_team.setText("Equipe");
        jButton_team.setToolTipText("Mostrar integrantes (F1)");
        jButton_team.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_teamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_new, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_open, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_save, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_copy, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_paste, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_cut, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_compile, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_team)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton_compile, jButton_copy, jButton_cut, jButton_new, jButton_open, jButton_paste, jButton_save, jButton_team});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_cut, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_paste, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_copy, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_save, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_open, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_new, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_compile, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_team, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton_compile, jButton_copy, jButton_cut, jButton_new, jButton_open, jButton_paste, jButton_save, jButton_team});

        jTextArea_editor.setColumns(20);
        jTextArea_editor.setRows(5);
        jScrollPane1.setViewportView(jTextArea_editor);

        jTextArea_messages.setColumns(20);
        jTextArea_messages.setRows(5);
        jTextArea_messages.setEnabled(false);
        jScrollPane2.setViewportView(jTextArea_messages);

        jLabel_statusBar.setMinimumSize(new java.awt.Dimension(898, 28));
        jLabel_statusBar.setPreferredSize(new java.awt.Dimension(898, 28));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_statusBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_statusBar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>                        

    private void jButton_newActionPerformed(java.awt.event.ActionEvent evt) {                                            
        jTextArea_editor.setText("");
        jTextArea_messages.setText("");
        jLabel_statusBar.setText("");
    }                                           

    private void jButton_openActionPerformed(java.awt.event.ActionEvent evt) {                                             
        JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        fileChooser.setDialogTitle("Selecione um arquivo de texto");
        fileChooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("Arquivos TXT", "txt");
        fileChooser.addChoosableFileFilter(extensionFilter);

        int valueSelected = fileChooser.showOpenDialog(null);
        if (valueSelected == JFileChooser.APPROVE_OPTION) {
            System.out.println("Arquivo selecionado: " + fileChooser.getSelectedFile().getPath());
            FileService fileService = new FileService();
            String fileContent = fileService.loadFileContent(fileChooser.getSelectedFile().getPath());
            jTextArea_editor.setText(fileContent);
            jLabel_statusBar.setText(fileChooser.getSelectedFile().getPath());
        }
    }                                            

    private void jButton_saveActionPerformed(java.awt.event.ActionEvent evt) {                                             
        FileService fileService = new FileService();
        if (jLabel_statusBar.getText().isEmpty()) {
            JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
            fileChooser.setDialogTitle("Salve o arquivo");
            fileChooser.setAcceptAllFileFilterUsed(false);
            FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("Arquivos TXT", "txt");
            fileChooser.addChoosableFileFilter(extensionFilter);

            int valueSelected = fileChooser.showSaveDialog(null);
            if (valueSelected == JFileChooser.APPROVE_OPTION) {
                if (fileService.validateFileFormat(fileChooser.getSelectedFile().getPath())) {
                    String content = jTextArea_editor.getText();
                    fileService.saveFile(fileChooser.getSelectedFile().getPath(), content);
                    jTextArea_messages.setText("");
                    jLabel_statusBar.setText(fileChooser.getSelectedFile().getPath());
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Formato de arquivo inválido. São aceitos apenas arquivos no formato TXT",
                            "Formato inválido", JOptionPane.WARNING_MESSAGE);
                }
            }
        } else {
            fileService.saveFile(jLabel_statusBar.getText(), jTextArea_editor.getText());
            jTextArea_messages.setText("");
        }
    }                                            

    private void jButton_copyActionPerformed(java.awt.event.ActionEvent evt) {                                             
        JFrame f = new JFrame("frame");
        JDialog d = new JDialog(f, "dialog Box");
        d.setVisible(true);
    }                                            

    private void jButton_pasteActionPerformed(java.awt.event.ActionEvent evt) {                                              
        JFrame f = new JFrame("frame");
        JDialog d = new JDialog(f, "dialog Box");
        d.setVisible(true);
    }                                             

    private void jButton_cutActionPerformed(java.awt.event.ActionEvent evt) {                                            
        JFrame f = new JFrame("frame");
        JDialog d = new JDialog(f, "dialog Box");
        d.setVisible(true);
    }                                           

    private void jButton_compileActionPerformed(java.awt.event.ActionEvent evt) {                                                
        JFrame f = new JFrame("frame");
        JDialog d = new JDialog(f, "dialog Box");
        d.setVisible(true);
    }                                               

    private void jButton_teamActionPerformed(java.awt.event.ActionEvent evt) {                                             
        JFrame f = new JFrame("frame");
        JDialog d = new JDialog(f, "dialog Box");
        d.setVisible(true);
    }                                            

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton_compile;
    private javax.swing.JButton jButton_copy;
    private javax.swing.JButton jButton_cut;
    private javax.swing.JButton jButton_new;
    private javax.swing.JButton jButton_open;
    private javax.swing.JButton jButton_paste;
    private javax.swing.JButton jButton_save;
    private javax.swing.JButton jButton_team;
    private javax.swing.JLabel jLabel_statusBar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea_editor;
    private javax.swing.JTextArea jTextArea_messages;
    // End of variables declaration                   
}
