
package lexicosintactico;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Ventana extends javax.swing.JFrame {
    FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos Word y txt", "docx", "txt");
    File f;
    JFileChooser j = new JFileChooser();
    String data1[][] = {};
    String cabecera1[] = { "No.", " Token ", " Tipo" };
    String path;
    int cont = 0;
    int errores;
    String mensajini = "";
    String tipo = "";

    public Ventana() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        txtATexto1 = new javax.swing.JEditorPane();
        Lineas = new javax.swing.JEditorPane();
        LineaError = new javax.swing.JEditorPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtATraducido = new javax.swing.JTextArea();
        btnTraducir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Digite el código C#");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txtATexto1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtATexto1.setText("public class Program\n{\n    public static void Main()\n    {\n        int num1=10;\n        double num2=5;\n        string mensaje=\"Hola, mundo!\";\n\n        Console.WriteLine(\"Número 1: \" + num1);\n        Console.WriteLine(\"Número 2: \" + num2);\n        Console.WriteLine(\"Mensaje: \" + mensaje);\n\n      \n        for (int i=0;i<5; i++)\n        {\n            Console.WriteLine(\"Iteración \" + i);\n        }\n\n        \n        if (num1>5)\n        {\n            Console.WriteLine(\"Número 1 es mayor que 5\");\n        }\n        else\n        {\n            Console.WriteLine(\"Número 1 no es mayor que 5\");\n        }\n    }\n}\n");
        txtATexto1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtATexto1FocusLost(evt);
            }
        });

        Lineas.setEditable(false);
        Lineas.setText("1");
        Lineas.setOpaque(false);

        LineaError.setEditable(false);
        LineaError.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LineaError.setForeground(java.awt.Color.red);
        LineaError.setToolTipText("");
        LineaError.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(LineaError, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Lineas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtATexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lineas, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
            .addComponent(LineaError)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtATexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        txtATraducido.setColumns(20);
        txtATraducido.setRows(5);
        jScrollPane1.setViewportView(txtATraducido);

        btnTraducir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnTraducir.setText("Traducir a JAVA");
        btnTraducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraducirActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Codigo traducido a java");
        jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTraducir, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(343, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(6, 6, 6)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTraducir, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1966, Short.MAX_VALUE))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtATexto1FocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_txtATexto1FocusLost
        // TODO add your handling code here:
    }// GEN-LAST:event_txtATexto1FocusLost

    private void btnTraducirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnTraducirActionPerformed

        txtATraducido.setText("");
        StringTokenizer st = new StringTokenizer(txtATexto1.getText(), "\n");
        String token;

        while (st.hasMoreTokens()) {
            token = st.nextToken();
            txtATraducido.append(translateCSharpToJava(token) + "\n");
        }
    }

    private String translateCSharpToJava(String cSharpCode) {
        if (cSharpCode.contains("public") && cSharpCode.contains("class")) {
            // Traducir la declaración de clase
            return translateClassDeclaration(cSharpCode);
        } else if (cSharpCode.contains("static") && cSharpCode.contains("void") && cSharpCode.contains("main")) {
            // Traducir la firma del método Main
            return translateMainMethodSignature(cSharpCode);
        } else if (cSharpCode.contains("int") || cSharpCode.contains("double") || cSharpCode.contains("string")) {
            // Traducir declaraciones de variables
            return translateVariableDeclaration(cSharpCode);
        } else if (cSharpCode.contains("Console.WriteLine")) {
            // Traducir la salida a consola
            return translateConsoleWriteLine(cSharpCode);
        }
       

        // Si no coincide con ningún caso específico, simplemente retornar la línea sin cambios
        return cSharpCode;
    }

    private String translateClassDeclaration(String cSharpClass) {
        // Implementa la lógica para traducir la declaración de clase de C# a Java
        return cSharpClass.replace("class", "class");
    }

    private String translateMainMethodSignature(String cSharpSignature) {
        if (cSharpSignature.contains("public static void main()")) {
            
            return cSharpSignature.replace("public static void main()", "public static void main(String[] args)");
        } else if (cSharpSignature.contains("public static void Main")) {
            
            return cSharpSignature.replace("public static void Main", "public static void main(String[] args) throws Exception");
        }
        
        return cSharpSignature;
    }

    private String translateVariableDeclaration(String cSharpDeclaration) {
        // Implementa la lógica para traducir declaraciones de variables de C# a Java
       
        return cSharpDeclaration.replace("int", "int").replace("double", "double").replace("string", "String");
    }

    private String translateConsoleWriteLine(String cSharpPrint) {
        // Implementa la lógica para traducir la salida a consola de C# a Java
       
        return cSharpPrint.replace("Console.WriteLine", "System.out.println");
    }

    // GEN-LAST:event_btnTraducirActionPerformed

 

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane LineaError;
    private javax.swing.JEditorPane Lineas;
    private javax.swing.JButton btnTraducir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel1;
    private javax.swing.JEditorPane txtATexto1;
    private javax.swing.JTextArea txtATraducido;
    // End of variables declaration//GEN-END:variables
}
