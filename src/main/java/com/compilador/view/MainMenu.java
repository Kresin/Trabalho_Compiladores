/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.compilador.view;

import com.compilador.model.FileService;
import com.compilador.model.compiler.LexicalError;
import com.compilador.model.compiler.Token;
import com.compilador.model.compiler.Trabalho2;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.StringReader;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author Gabriel.Kresin
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu_
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_new = new javax.swing.JButton();
        jButton_team = new javax.swing.JButton();
        jButton_compile = new javax.swing.JButton();
        jButton_cut = new javax.swing.JButton();
        jButton_paste = new javax.swing.JButton();
        jButton_copy = new javax.swing.JButton();
        jButton_save = new javax.swing.JButton();
        jButton_open = new javax.swing.JButton();
        jLabel_statusBar = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_editor = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_messages = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 600));
        setPreferredSize(new java.awt.Dimension(900, 600));

        jButton_new.setIcon(new javax.swing.ImageIcon(getClass().getResource("/new_file_icon.png"))); // NOI18N
        jButton_new.setText("Novo");
        jButton_new.setToolTipText("Criar novo arquivo (ctrl + n)");
        jButton_new.setHideActionText(true);
        jButton_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_newActionPerformed(evt);
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

        jButton_compile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compile_icon.png"))); // NOI18N
        jButton_compile.setText("Compilar");
        jButton_compile.setToolTipText("Compilar o código (F7)");
        jButton_compile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_compileActionPerformed(evt);
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

        jButton_paste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paste_icon.png"))); // NOI18N
        jButton_paste.setText("Colar");
        jButton_paste.setToolTipText("Colar texto (ctrl + v)");
        jButton_paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_pasteActionPerformed(evt);
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

        jButton_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save_file_icon.png"))); // NOI18N
        jButton_save.setText("Salvar");
        jButton_save.setToolTipText("Salvar aequivo (ctrl + s)");
        jButton_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_saveActionPerformed(evt);
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

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jTextArea_editor.setColumns(20);
        jTextArea_editor.setRows(5);
        jScrollPane1.setViewportView(jTextArea_editor);

        jSplitPane1.setTopComponent(jScrollPane1);

        jTextArea_messages.setColumns(20);
        jTextArea_messages.setRows(5);
        jScrollPane2.setViewportView(jTextArea_messages);

        jSplitPane1.setRightComponent(jScrollPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_statusBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSplitPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_new, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_open, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_save, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_copy, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_paste, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_cut, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_compile, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_team, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 53, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_cut, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_paste, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_copy, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_save, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_open, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_new, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_compile, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_team, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_statusBar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_newActionPerformed
        jTextArea_editor.setText("");
        jTextArea_messages.setText("");
        jLabel_statusBar.setText("");
    }//GEN-LAST:event_jButton_newActionPerformed

    private void jButton_teamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_teamActionPerformed
        jTextArea_messages.setText("Integrantes da equipe de desenvolvimento: Gabriel Kresin, Haziel Albuquerque Netto e Vinícius Zoz");
    }//GEN-LAST:event_jButton_teamActionPerformed

    private void jButton_compileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_compileActionPerformed
        Trabalho2 compiler = new Trabalho2();
        Stream<String> lines = jTextArea_editor.getText().lines();
        int numberLine = 1;

        StringBuilder message = new StringBuilder();
        message.append("linha").append("   ").append("classe").append("               ").append("lexema").append("\n");
        boolean commentBlock = false;
        boolean lineComment = false;
        for (String line : lines.collect(Collectors.toList())) {
            lineComment = false;
            String[] inputs = line.trim().split(" ");
            for (String input : inputs) {
                if (input.equals("{")) {
                    commentBlock = true;
                } else if (input.startsWith("@@")) {
                    lineComment = true;
                }
                if (!commentBlock && !lineComment) {
                    compiler.setInput(new StringReader(input));
                    try {
                        Token token = compiler.nextToken();
                        if (token != null) {
                            StringBuilder newLine = new StringBuilder();
                            newLine.append(getLineText(String.valueOf(numberLine)));
                            newLine.append(getClassText(token.getTokenClass(token.getId())));
                            newLine.append(token.getLexeme());
                            newLine.append("\n");
                            message.append(newLine.toString());
                        }
                    } catch (LexicalError ex) {
                        if (ex.getMessage().contains("símbolo")) {
                            jTextArea_messages.setText(String.format("Erro na linha %s - %s %s", numberLine, input, ex.getMessage()));
                        } else {
                            jTextArea_messages.setText(String.format("Erro na linha %s - %s", numberLine, ex.getMessage()));
                        }
                        throw new RuntimeException("Erro ao compilar o programa. Veja o campo de mensagem para mais detalhes");
                    }
                }
                if (input.equals("}")) {
                    commentBlock = false;
                }
            }
            numberLine++;
        }

        jTextArea_messages.setText(message.toString());
    }//GEN-LAST:event_jButton_compileActionPerformed

    private String getLineText(String text) {
        StringBuilder stringBuilder = new StringBuilder("        ");
        return replaceWhiteSpaces(stringBuilder, text);
    }

    private String getClassText(String text) {
        StringBuilder stringBuilder = new StringBuilder("                     ");
        return replaceWhiteSpaces(stringBuilder, text);
    }

    private String replaceWhiteSpaces(StringBuilder stringBuilder, String text) {
        stringBuilder.replace(0, text.length(), text);
        return stringBuilder.toString();
    }

    private void jButton_cutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cutActionPerformed
        StringSelection conteudo = new StringSelection(jTextArea_editor.getText());
        clipboard.setContents(conteudo, conteudo);
        jTextArea_editor.setText("");
    }//GEN-LAST:event_jButton_cutActionPerformed

    private void jButton_pasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_pasteActionPerformed
        String textoJText = jTextArea_editor.getText();
        Transferable clipData = clipboard.getContents(this);
        String texto;
        try {
            texto = (String) (clipData).getTransferData(DataFlavor.stringFlavor);
        } catch (UnsupportedFlavorException | IOException ex) {
            texto = ex.toString();
        }
        jTextArea_editor.setText(textoJText + texto);
    }//GEN-LAST:event_jButton_pasteActionPerformed

    Clipboard clipboard = getToolkit().getSystemClipboard();
    private void jButton_copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_copyActionPerformed
        StringSelection conteudo = new StringSelection(jTextArea_editor.getText());
        clipboard.setContents(conteudo, conteudo);
    }//GEN-LAST:event_jButton_copyActionPerformed

    private void jButton_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_saveActionPerformed
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
    }//GEN-LAST:event_jButton_saveActionPerformed

    private void jButton_openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_openActionPerformed
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
    }//GEN-LAST:event_jButton_openActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_compile;
    private javax.swing.JButton jButton_copy;
    private javax.swing.JButton jButton_cut;
    private javax.swing.JButton jButton_new;
    private javax.swing.JButton jButton_open;
    private javax.swing.JButton jButton_paste;
    private javax.swing.JButton jButton_save;
    private javax.swing.JButton jButton_team;
    private javax.swing.JLabel jLabel_statusBar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextArea jTextArea_editor;
    private javax.swing.JTextArea jTextArea_messages;
    // End of variables declaration//GEN-END:variables
}
