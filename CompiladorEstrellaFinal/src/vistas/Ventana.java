/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.text.BadLocationException;


public class Ventana extends javax.swing.JFrame {

  private final NumeroLinea lineas;
  private int fila;
  private int columna;
  private final String nombreArchivo;

  /**
   * Creates new form ventana
   */
  public Ventana() {
    initComponents();
    lineas = new NumeroLinea(this.areaCodigo);
    this.panelBarrasCodigo.setRowHeaderView(lineas);
    fila = 1;
    columna = 1;
    nombreArchivo = "Sin nombre";
  }

  public void addEventos(Controlador contr) {
    this.botonAbrir.addActionListener(contr);
    this.botonAnalisis.addActionListener(contr);
    this.botonGuardar.addActionListener(contr);
    this.botonEjecutar.addActionListener(contr);
    this.areaCodigo.addCaretListener(contr);
  }


  public void ajustarSeparador(int espacio) {
    panelDoble.setDividerLocation(this.getHeight() - espacio);
  }

  public void posicionCursor() {
    int pos = areaCodigo.getCaretPosition();
    try {
      fila = areaCodigo.getLineOfOffset(pos) + 1;
      columna = pos - areaCodigo.getLineStartOffset(fila - 1) + 1;
      this.etiquetaFC.setText("Fila: " + fila + ", Columna: " + columna);
    } catch (BadLocationException e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorde = new javax.swing.JPanel();
        panelNorte = new javax.swing.JPanel();
        panelBotones = new javax.swing.JPanel();
        botonAbrir = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        botonAnalisis = new javax.swing.JButton();
        botonEjecutar = new javax.swing.JButton();
        panelDoble = new javax.swing.JSplitPane();
        panelPestañasCodigo = new javax.swing.JTabbedPane();
        panelBarrasCodigo = new javax.swing.JScrollPane();
        areaCodigo = new javax.swing.JTextArea();
        panelPestañasTerminal = new javax.swing.JTabbedPane();
        panelBarrasTerminal = new javax.swing.JScrollPane();
        areaTerminal = new javax.swing.JTextArea();
        panelSur = new javax.swing.JPanel();
        etiquetaArchivo = new javax.swing.JLabel();
        etiquetaFC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Compilador Estrella");

        panelBorde.setBorder(javax.swing.BorderFactory.createLineBorder(getBackground(), 10));
        panelBorde.setLayout(new java.awt.BorderLayout());

        panelNorte.setLayout(new java.awt.BorderLayout());

        botonAbrir.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        botonAbrir.setText("Abrir Archivo");
        botonAbrir.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        botonAbrir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botonAbrir.setName("abrir"); // NOI18N
        botonAbrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelBotones.add(botonAbrir);

        botonGuardar.setFont(botonAbrir.getFont());
        botonGuardar.setText("Guardar");
        botonGuardar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        botonGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botonGuardar.setName("guardar"); // NOI18N
        botonGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelBotones.add(botonGuardar);

        botonAnalisis.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        botonAnalisis.setText("Compilar");
        botonAnalisis.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        botonAnalisis.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botonAnalisis.setName("analisis"); // NOI18N
        botonAnalisis.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelBotones.add(botonAnalisis);

        botonEjecutar.setFont(botonAbrir.getFont());
        botonEjecutar.setText("Ejecutar");
        botonEjecutar.setEnabled(false);
        botonEjecutar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        botonEjecutar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        botonEjecutar.setName("ejecutar"); // NOI18N
        botonEjecutar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelBotones.add(botonEjecutar);

        panelNorte.add(panelBotones, java.awt.BorderLayout.CENTER);

        panelBorde.add(panelNorte, java.awt.BorderLayout.NORTH);

        panelDoble.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        areaCodigo.setColumns(20);
        areaCodigo.setFont(areaTerminal.getFont());
        areaCodigo.setRows(5);
        areaCodigo.setTabSize(2);
        areaCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                areaCodigoKeyPressed(evt);
            }
        });
        panelBarrasCodigo.setViewportView(areaCodigo);

        panelPestañasCodigo.addTab("Codigo fuente", panelBarrasCodigo);

        panelDoble.setLeftComponent(panelPestañasCodigo);

        areaTerminal.setEditable(false);
        areaTerminal.setColumns(20);
        areaTerminal.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        areaTerminal.setRows(5);
        areaTerminal.setTabSize(2);
        panelBarrasTerminal.setViewportView(areaTerminal);

        panelPestañasTerminal.addTab("Terminal", panelBarrasTerminal);

        panelDoble.setRightComponent(panelPestañasTerminal);

        panelBorde.add(panelDoble, java.awt.BorderLayout.CENTER);

        panelSur.setLayout(new java.awt.BorderLayout());

        etiquetaArchivo.setText("Sin guardar");
        panelSur.add(etiquetaArchivo, java.awt.BorderLayout.CENTER);

        etiquetaFC.setText("Fila: " + fila + " Columna: " + columna);
        panelSur.add(etiquetaFC, java.awt.BorderLayout.LINE_END);

        panelBorde.add(panelSur, java.awt.BorderLayout.SOUTH);

        getContentPane().add(panelBorde, java.awt.BorderLayout.CENTER);

        getAccessibleContext().setAccessibleName("Compilador Estrella");

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void areaCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_areaCodigoKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_TAB) {
      evt.consume();
      int pos = areaCodigo.getCaretPosition();
      String text = areaCodigo.getText();
      String newText = text.substring(0, pos) + "       " + text.substring(pos);
      areaCodigo.setText(newText);
      areaCodigo.setCaretPosition(pos + 7);
    }
  }//GEN-LAST:event_areaCodigoKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaCodigo;
    private javax.swing.JTextArea areaTerminal;
    private javax.swing.JButton botonAbrir;
    private javax.swing.JButton botonAnalisis;
    private javax.swing.JButton botonEjecutar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JLabel etiquetaArchivo;
    private javax.swing.JLabel etiquetaFC;
    private javax.swing.JScrollPane panelBarrasCodigo;
    private javax.swing.JScrollPane panelBarrasTerminal;
    private javax.swing.JPanel panelBorde;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JSplitPane panelDoble;
    private javax.swing.JPanel panelNorte;
    private javax.swing.JTabbedPane panelPestañasCodigo;
    private javax.swing.JTabbedPane panelPestañasTerminal;
    private javax.swing.JPanel panelSur;
    // End of variables declaration//GEN-END:variables

  public JLabel getEtiquetaArchivo() {
    return etiquetaArchivo;
  }

  public JLabel getEtiquetaFC() {
    return etiquetaFC;
  }

  public JTextArea getAreaTerminal() {
    return areaTerminal;
  }

  public void setAreaTerminal(JTextArea bottomArea) {
    this.areaTerminal = bottomArea;
  }

  public JTextArea getAreaCodigo() {
    return areaCodigo;
  }

  public JButton getBotonEjecutar() {
    return botonEjecutar;
  }
}
