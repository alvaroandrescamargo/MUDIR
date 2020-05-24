package Vista;

import Modelo.EntidadPaciente;
import com.sun.glass.events.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Alvaro Andres
 */
public class CrearEstudiante extends javax.swing.JFrame implements  ActionListener{

    public CrearEstudiante() {
        
        initComponents();
        this.setTitle("Crear Estudiante");
        JBTNCrear.addActionListener(this);
        JBTNActualizar.addActionListener(this);
        JBTNEliminar.addActionListener(this);
        JBTNCancelar.addActionListener(this);
        
    }
    
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo_boton = new javax.swing.ButtonGroup();
        JBTNCrear = new javax.swing.JButton();
        JBTNCancelar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        JTXNombresEstudiante = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        JTXApellidosEstudiante = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        JCBXTipoDocumentoEstudiante = new javax.swing.JComboBox<>();
        JTXDocumentoEstudiante = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        JDCHFechaIngreso = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        JRBMasculino = new javax.swing.JRadioButton();
        JRBFemenino = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTXObservaciones = new javax.swing.JTextArea();
        JCBXEps = new javax.swing.JComboBox<>();
        JCBXRepitente = new javax.swing.JComboBox<>();
        JCBXUltimoGradoCursado = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        JBTNCrear3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        JTXNombresAcudiente = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        JTXApellidosAcudiente = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        JCBXTipoDocumentoAcudiente = new javax.swing.JComboBox<>();
        JTXDocumentoAcudiente = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        JTXDireccionAcudiente = new javax.swing.JTextField();
        JTXTelefonoAcudiente = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        JTXCorreoAcudiente = new javax.swing.JTextField();
        JBTNEliminar = new javax.swing.JButton();
        JBTNActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JBTNCrear.setText("Crear");
        JBTNCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTNCrearActionPerformed(evt);
            }
        });

        JBTNCancelar.setText("Cancelar");
        JBTNCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTNCancelarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Agregar Nuevo Estudiante");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estudiante"));

        jLabel14.setText("Nombres");

        JTXNombresEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTXNombresEstudianteKeyTyped(evt);
            }
        });

        jLabel15.setText("Apellidos");

        JTXApellidosEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTXApellidosEstudianteKeyTyped(evt);
            }
        });

        jLabel16.setText("Tipo de documento");

        JCBXTipoDocumentoEstudiante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   ", "CC", "CE", "TI", "RC" }));

        JTXDocumentoEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTXDocumentoEstudianteKeyTyped(evt);
            }
        });

        jLabel17.setText("Numero");

        jLabel18.setText("Fecha de Ingreso");

        jLabel19.setText("Sexo");

        Grupo_boton.add(JRBMasculino);
        JRBMasculino.setText("Masculino");

        Grupo_boton.add(JRBFemenino);
        JRBFemenino.setText("Femenino");

        jLabel20.setText("Observaciones");

        JTXObservaciones.setColumns(20);
        JTXObservaciones.setRows(5);
        JTXObservaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTXObservacionesKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(JTXObservaciones);

        JCBXEps.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "Cafesalud ", "Calisalud ", "Caprecom ", "Capresoca", "Colmédica", "Compensar", "Comfenalco Antioquia", "Comfenalco Valle", "Convida ARS", "Coomeva EPS", "Cruz Blanca", "Famisanar ", "Humana Vivir", "Instituto de los Seguros Sociales", "Salud Colmena ", "Salud Colpatria", "Salud Total", "Saludcolombia EPS S.A.", "SaludCoop ", "Saludvida ", "Sanitas", "Selvasalud ", "Solsalud ", "S.O.S EPS ", "Susalud" }));

        JCBXRepitente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "SI", "NO" }));

        JCBXUltimoGradoCursado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11" }));

        jLabel21.setText("Ultimo Grado Cursado");

        jLabel22.setText("Entidad Promotora de Salud");

        jLabel23.setText("Repitente");

        JBTNCrear3.setText("Crear");
        JBTNCrear3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTNCrear3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(10, 10, 10)
                                .addComponent(JTXApellidosEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(10, 10, 10)
                                .addComponent(JTXNombresEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addGap(10, 10, 10)
                                .addComponent(JCBXTipoDocumentoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JTXDocumentoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JDCHFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel21))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JCBXRepitente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JCBXUltimoGradoCursado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JCBXEps, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(28, 28, 28)
                                .addComponent(JRBMasculino)
                                .addGap(10, 10, 10)
                                .addComponent(JRBFemenino)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBTNCrear3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JTXNombresEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)
                        .addComponent(JCBXTipoDocumentoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17)
                        .addComponent(JTXDocumentoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JBTNCrear3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel14)))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTXApellidosEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JDCHFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel18))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel19))
                            .addComponent(JRBMasculino)
                            .addComponent(JRBFemenino))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(15, 15, 15)
                                .addComponent(jLabel22)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel21))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(JCBXRepitente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(JCBXEps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(JCBXUltimoGradoCursado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Acudiente"));

        jLabel24.setText("Nombres");

        JTXNombresAcudiente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTXNombresAcudienteKeyTyped(evt);
            }
        });

        jLabel25.setText("Apellidos");

        JTXApellidosAcudiente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTXApellidosAcudienteKeyTyped(evt);
            }
        });

        jLabel26.setText("Tipo de documento");

        JCBXTipoDocumentoAcudiente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   ", "CC", "CE", "TI", "RC" }));

        JTXDocumentoAcudiente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTXDocumentoAcudienteKeyTyped(evt);
            }
        });

        jLabel27.setText("Numero");

        jLabel32.setText("Telefono");

        jLabel33.setText("Direccion");

        JTXDireccionAcudiente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTXDireccionAcudienteKeyTyped(evt);
            }
        });

        JTXTelefonoAcudiente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTXTelefonoAcudienteKeyTyped(evt);
            }
        });

        jLabel34.setText("Correo");

        JTXCorreoAcudiente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTXCorreoAcudienteKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addGap(10, 10, 10)
                                .addComponent(JTXApellidosAcudiente, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(10, 10, 10)
                                .addComponent(JTXNombresAcudiente, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JCBXTipoDocumentoAcudiente, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JTXDocumentoAcudiente, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JTXTelefonoAcudiente))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTXDireccionAcudiente, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34)
                        .addGap(18, 18, 18)
                        .addComponent(JTXCorreoAcudiente, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JTXNombresAcudiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel26)
                        .addComponent(JCBXTipoDocumentoAcudiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel27)
                        .addComponent(JTXDocumentoAcudiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel24)))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JTXApellidosAcudiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel32)
                        .addComponent(JTXTelefonoAcudiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel25)))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(JTXDireccionAcudiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(JTXCorreoAcudiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JBTNEliminar.setText("Eliminar");
        JBTNEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTNEliminarActionPerformed(evt);
            }
        });

        JBTNActualizar.setText("Actualizar");
        JBTNActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTNActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(JBTNCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(JBTNActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBTNEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBTNCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel9)
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBTNCrear)
                    .addComponent(JBTNActualizar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JBTNCancelar)
                        .addComponent(JBTNEliminar)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTXNombresEstudianteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTXNombresEstudianteKeyTyped
        char c = evt.getKeyChar();

        if(!Character.isLetter(c) && c != KeyEvent.VK_SPACE)
        evt.consume();
    }//GEN-LAST:event_JTXNombresEstudianteKeyTyped

    private void JTXApellidosEstudianteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTXApellidosEstudianteKeyTyped
        char c = evt.getKeyChar();

        if(!Character.isLetter(c) && c != KeyEvent.VK_SPACE)
        evt.consume();
    }//GEN-LAST:event_JTXApellidosEstudianteKeyTyped

    private void JTXObservacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTXObservacionesKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JTXObservacionesKeyTyped

    private void JTXDocumentoEstudianteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTXDocumentoEstudianteKeyTyped
        char c = evt.getKeyChar();

        if(c<'0' || c>'9')
        evt.consume();
    }//GEN-LAST:event_JTXDocumentoEstudianteKeyTyped

    private void JTXNombresAcudienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTXNombresAcudienteKeyTyped
        char c = evt.getKeyChar();

        if(!Character.isLetter(c) && c != KeyEvent.VK_SPACE)
        evt.consume();
    }//GEN-LAST:event_JTXNombresAcudienteKeyTyped

    private void JTXApellidosAcudienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTXApellidosAcudienteKeyTyped
        char c = evt.getKeyChar();

        if(!Character.isLetter(c) && c != KeyEvent.VK_SPACE)
        evt.consume();
    }//GEN-LAST:event_JTXApellidosAcudienteKeyTyped

    private void JTXDireccionAcudienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTXDireccionAcudienteKeyTyped
        char c = evt.getKeyChar();
        
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<'0' || c>'9') && (c<'#' || c>'#') && c != KeyEvent.VK_SPACE)
            evt.consume();
    }//GEN-LAST:event_JTXDireccionAcudienteKeyTyped

    private void JTXTelefonoAcudienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTXTelefonoAcudienteKeyTyped
        char c = evt.getKeyChar();

        if(c<'0' || c>'9')
        evt.consume();
    }//GEN-LAST:event_JTXTelefonoAcudienteKeyTyped

    private void JTXCorreoAcudienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTXCorreoAcudienteKeyTyped
        char c = evt.getKeyChar();
       
          if(c == KeyEvent.VK_SPACE)
            evt.consume();
    }//GEN-LAST:event_JTXCorreoAcudienteKeyTyped

    private void JTXDocumentoAcudienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTXDocumentoAcudienteKeyTyped
        char c = evt.getKeyChar();

        if(c<'0' || c>'9')
        evt.consume();
    }//GEN-LAST:event_JTXDocumentoAcudienteKeyTyped


    private void JBTNCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTNCrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBTNCrearActionPerformed

    private void JBTNEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTNEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBTNEliminarActionPerformed

    private void JBTNActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTNActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBTNActualizarActionPerformed

    private void JBTNCrear3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTNCrear3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBTNCrear3ActionPerformed
    private void JBTNCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTNCancelarActionPerformed
        menu menuPrincipal = new menu();
        menuPrincipal.setVisible(true);
        menuPrincipal.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_JBTNCancelarActionPerformed


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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrearEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Grupo_boton;
    private javax.swing.JButton JBTNActualizar;
    private javax.swing.JButton JBTNCancelar;
    private javax.swing.JButton JBTNCrear;
    private javax.swing.JButton JBTNCrear3;
    private javax.swing.JButton JBTNEliminar;
    private javax.swing.JComboBox<String> JCBXEps;
    private javax.swing.JComboBox<String> JCBXRepitente;
    private javax.swing.JComboBox<String> JCBXTipoDocumentoAcudiente;
    private javax.swing.JComboBox<String> JCBXTipoDocumentoEstudiante;
    private javax.swing.JComboBox<String> JCBXUltimoGradoCursado;
    private com.toedter.calendar.JDateChooser JDCHFechaIngreso;
    private javax.swing.JRadioButton JRBFemenino;
    private javax.swing.JRadioButton JRBMasculino;
    private javax.swing.JTextField JTXApellidosAcudiente;
    private javax.swing.JTextField JTXApellidosEstudiante;
    private javax.swing.JTextField JTXCorreoAcudiente;
    private javax.swing.JTextField JTXDireccionAcudiente;
    private javax.swing.JTextField JTXDocumentoAcudiente;
    private javax.swing.JTextField JTXDocumentoEstudiante;
    private javax.swing.JTextField JTXNombresAcudiente;
    private javax.swing.JTextField JTXNombresEstudiante;
    private javax.swing.JTextArea JTXObservaciones;
    private javax.swing.JTextField JTXTelefonoAcudiente;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        
        
        String comando = ae.getActionCommand();
        if (comando.equalsIgnoreCase("Crear")){
            guardarDatos();
        }
            
        if (comando.equalsIgnoreCase("Actualizar")){
            JOptionPane.showMessageDialog(null, "Esta dentro del Boton Actualizar");
        }
        
        if (comando.equalsIgnoreCase("Eliminar")){
           JOptionPane.showMessageDialog(null, "Esta dentro del Boton Eliminar");
        }
        
        if (comando.equalsIgnoreCase("Cancelar")){
            JOptionPane.showMessageDialog(null, "Esta dentro del Boton Cancelar");
        }
        
    }
    
    private void guardarDatos(){
        String Nombre = JTXNombresEstudiante.getText();
        String Apellido = JTXApellidosEstudiante.getText();
        String TipoDoc = JCBXTipoDocumentoEstudiante.getSelectedItem().toString();
        String Documento = JTXDocumentoEstudiante.getText();
        String FechaIngreso = JDCHFechaIngreso.getDateFormatString();
        String Sexo = "";
        if(JRBMasculino.isSelected()){
            Sexo = "M";
        }
        else if(JRBFemenino.isSelected()){
            Sexo = "F";
        }
        else
            JOptionPane.showMessageDialog(null, "Debe seleccionar un Genero");
        
        String Repitente = JCBXRepitente.getSelectedItem().toString();
        String EPS = JCBXEps.getSelectedItem().toString();
        String UltimoGrado = JCBXUltimoGradoCursado.getSelectedItem().toString();
        String Observaciones = JTXObservaciones.getText();
        
        EntidadPaciente paciente = new EntidadPaciente();
        
        paciente.setNombrePaciente(Nombre);
        paciente.setApellidoPaciente(Apellido);
        paciente.setTipoDocumentoPaciente(TipoDoc);
        paciente.setDocumentoPaciente(Documento);
        paciente.setFechaNacimientoPaciente(FechaIngreso);
        paciente.setGeneroPaciente(Sexo);
        paciente.setRepitente(Repitente);
        paciente.setEpsPaciente(EPS);
        paciente.setUltimoGradoCursado(UltimoGrado);
        paciente.setObservacioines(EPS);
        
    }
    
}
