package Vista;

import Controlador.Controller;
import Modelo.EntidadEmpleado;
import com.sun.glass.events.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


/**
 *
 * @author Alvaro Andres
 */
public class CrearEmpleado extends javax.swing.JFrame implements ActionListener
{
    Controller llamar=null;
    
    public CrearEmpleado()
    {
        llamar= new Controller();
        initComponents();
        this.setTitle("Crear Empleado");
        
        //botones
        bloqueoBotones(BtnGuardar,true);
        bloqueoBotones(BtnEliminar,false);
        bloqueoBotones(jButtonActualizar,false);
        bloqueoBotones(BtnBuscar,false);
        //poner a la escucha 
        BtnGuardar.addActionListener(this);
        BtnEliminar.addActionListener(this);
        BtnBuscar.addActionListener(this);
        jButtonActualizar.addActionListener(this);
        CheckBoxHabilitar.addActionListener(this);
        //no visible los label error 
        labelErrorMasivo(false);
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGTNTipoDoc = new javax.swing.ButtonGroup();
        BGTNTipoEmpleado = new javax.swing.ButtonGroup();
        BtnGuardar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        JRBDocente = new javax.swing.JRadioButton();
        JRBProfesional = new javax.swing.JRadioButton();
        JTXDireccion = new javax.swing.JTextField();
        JTXCelular1 = new javax.swing.JTextField();
        JTXCargo = new javax.swing.JTextField();
        JTXCorreo = new javax.swing.JTextField();
        JTXNombre = new javax.swing.JTextField();
        JRBTNCE = new javax.swing.JRadioButton();
        JRBTNCC = new javax.swing.JRadioButton();
        JTXDocumento = new javax.swing.JTextField();
        JTXApellidos = new javax.swing.JTextField();
        JRBAdministrativo = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        ErrorRol = new javax.swing.JLabel();
        JTXCelular2 = new javax.swing.JTextField();
        CheckBoxHabilitar = new javax.swing.JCheckBox();
        ErrorCorreo = new javax.swing.JLabel();
        ErrorNombre = new javax.swing.JLabel();
        ErrorCelular = new javax.swing.JLabel();
        ErrorCelular2 = new javax.swing.JLabel();
        ErrorTipoDoc = new javax.swing.JLabel();
        ErrorCedula = new javax.swing.JLabel();
        ErrorApellido = new javax.swing.JLabel();
        ErrorDire = new javax.swing.JLabel();
        ErrorEps = new javax.swing.JLabel();
        ErrorCargo = new javax.swing.JLabel();
        JCBXEps = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        JTXNombreRep = new javax.swing.JTextField();
        JTXApellidoRep = new javax.swing.JTextField();
        JTXParentesco = new javax.swing.JTextField();
        JTXCelularRep = new javax.swing.JTextField();
        JTXCorreoRep = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        JTXDocumentorEFERENCIA = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnCancelar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButtonActualizar = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnGuardar.setFont(new java.awt.Font("Hack", 1, 14)); // NOI18N
        BtnGuardar.setText("GUARDAR");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 100, 30));

        BtnEliminar.setFont(new java.awt.Font("Hack", 1, 14)); // NOI18N
        BtnEliminar.setText("ELIMINAR");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, 100, 30));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BGTNTipoEmpleado.add(JRBDocente);
        JRBDocente.setFont(new java.awt.Font("Hack", 1, 15)); // NOI18N
        JRBDocente.setText("Docente");
        JRBDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBDocenteActionPerformed(evt);
            }
        });
        jPanel2.add(JRBDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 110, 40));

        BGTNTipoEmpleado.add(JRBProfesional);
        JRBProfesional.setFont(new java.awt.Font("Hack", 1, 15)); // NOI18N
        JRBProfesional.setText("Profesional");
        JRBProfesional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBProfesionalActionPerformed(evt);
            }
        });
        jPanel2.add(JRBProfesional, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, -1, 40));

        JTXDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTXDireccionKeyTyped(evt);
            }
        });
        jPanel2.add(JTXDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 180, 30));

        JTXCelular1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTXCelular1KeyTyped(evt);
            }
        });
        jPanel2.add(JTXCelular1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 140, 30));

        JTXCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTXCargoActionPerformed(evt);
            }
        });
        JTXCargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTXCargoKeyTyped(evt);
            }
        });
        jPanel2.add(JTXCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 170, 30));

        JTXCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTXCorreoActionPerformed(evt);
            }
        });
        JTXCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTXCorreoKeyTyped(evt);
            }
        });
        jPanel2.add(JTXCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 180, 30));

        JTXNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTXNombreKeyTyped(evt);
            }
        });
        jPanel2.add(JTXNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 140, 30));

        BGTNTipoDoc.add(JRBTNCE);
        JRBTNCE.setText("CE");
        jPanel2.add(JRBTNCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, 30));

        BGTNTipoDoc.add(JRBTNCC);
        JRBTNCC.setText("CC");
        jPanel2.add(JRBTNCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, 30));

        JTXDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTXDocumentoActionPerformed(evt);
            }
        });
        JTXDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTXDocumentoKeyTyped(evt);
            }
        });
        jPanel2.add(JTXDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 180, 30));

        JTXApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTXApellidosActionPerformed(evt);
            }
        });
        JTXApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTXApellidosKeyTyped(evt);
            }
        });
        jPanel2.add(JTXApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 180, 30));

        BGTNTipoEmpleado.add(JRBAdministrativo);
        JRBAdministrativo.setFont(new java.awt.Font("Hack", 1, 15)); // NOI18N
        JRBAdministrativo.setText("Administrativo");
        JRBAdministrativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBAdministrativoActionPerformed(evt);
            }
        });
        jPanel2.add(JRBAdministrativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 170, 40));

        jLabel3.setFont(new java.awt.Font("Hack", 1, 14)); // NOI18N
        jLabel3.setText("APELLIDOS : ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 100, 30));

        jLabel4.setFont(new java.awt.Font("Hack", 1, 14)); // NOI18N
        jLabel4.setText("TIPO DOCUMENTO : ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 30));

        jLabel9.setFont(new java.awt.Font("Hack", 1, 14)); // NOI18N
        jLabel9.setText("DOCUMENTO :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, 30));

        jLabel10.setFont(new java.awt.Font("Hack", 1, 14)); // NOI18N
        jLabel10.setText("CORREO    :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 100, 30));

        jLabel20.setFont(new java.awt.Font("Hack", 1, 14)); // NOI18N
        jLabel20.setText("EPS : ");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 50, 30));

        jLabel21.setFont(new java.awt.Font("Hack", 1, 14)); // NOI18N
        jLabel21.setText("NOMBRE  : ");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 80, 30));

        jLabel22.setFont(new java.awt.Font("Hack", 1, 14)); // NOI18N
        jLabel22.setText("CELULAR : ");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 80, 30));

        jLabel12.setFont(new java.awt.Font("Hack", 1, 14)); // NOI18N
        jLabel12.setText("DIRECCION : ");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 100, 30));

        jLabel23.setFont(new java.awt.Font("Hack", 1, 14)); // NOI18N
        jLabel23.setText("CARGO   :");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, 30));

        jLabel24.setFont(new java.awt.Font("Hack", 1, 14)); // NOI18N
        jLabel24.setText("CELULAR2 : ");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 90, 30));

        ErrorRol.setBackground(new java.awt.Color(255, 51, 51));
        ErrorRol.setForeground(new java.awt.Color(255, 51, 51));
        ErrorRol.setText("OBLIGATORIO");
        ErrorRol.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(ErrorRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 100, 20));

        JTXCelular2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTXCelular2ActionPerformed(evt);
            }
        });
        JTXCelular2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTXCelular2KeyTyped(evt);
            }
        });
        jPanel2.add(JTXCelular2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 140, 30));

        CheckBoxHabilitar.setFont(new java.awt.Font("Hack", 1, 14)); // NOI18N
        CheckBoxHabilitar.setText("EMILIMINAR_O_EDITAR");
        CheckBoxHabilitar.setBorder(null);
        jPanel2.add(CheckBoxHabilitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 20));

        ErrorCorreo.setBackground(new java.awt.Color(255, 51, 51));
        ErrorCorreo.setForeground(new java.awt.Color(255, 51, 51));
        ErrorCorreo.setText("CAMPO OBLIGATORIO");
        ErrorCorreo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(ErrorCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 150, -1));

        ErrorNombre.setBackground(new java.awt.Color(255, 51, 51));
        ErrorNombre.setForeground(new java.awt.Color(255, 51, 51));
        ErrorNombre.setText("CAMPO OBLIGATORIO");
        ErrorNombre.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(ErrorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 140, -1));

        ErrorCelular.setBackground(new java.awt.Color(255, 51, 51));
        ErrorCelular.setForeground(new java.awt.Color(255, 51, 51));
        ErrorCelular.setText("CAMPO OBLIGATORIO");
        ErrorCelular.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(ErrorCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 140, -1));

        ErrorCelular2.setBackground(new java.awt.Color(255, 51, 51));
        ErrorCelular2.setForeground(new java.awt.Color(255, 51, 51));
        ErrorCelular2.setText("CAMPO OBLIGATORIO");
        ErrorCelular2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(ErrorCelular2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 140, -1));

        ErrorTipoDoc.setBackground(new java.awt.Color(255, 51, 51));
        ErrorTipoDoc.setForeground(new java.awt.Color(255, 51, 51));
        ErrorTipoDoc.setText("CAMPO OBLIGATORIO");
        ErrorTipoDoc.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(ErrorTipoDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 140, -1));

        ErrorCedula.setBackground(new java.awt.Color(255, 51, 51));
        ErrorCedula.setForeground(new java.awt.Color(255, 51, 51));
        ErrorCedula.setText("CAMPO OBLIGATORIO");
        ErrorCedula.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(ErrorCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 160, -1));

        ErrorApellido.setBackground(new java.awt.Color(255, 51, 51));
        ErrorApellido.setForeground(new java.awt.Color(255, 51, 51));
        ErrorApellido.setText("CAMPO OBLIGATORIO");
        ErrorApellido.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(ErrorApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 150, -1));

        ErrorDire.setBackground(new java.awt.Color(255, 51, 51));
        ErrorDire.setForeground(new java.awt.Color(255, 51, 51));
        ErrorDire.setText("CAMPO OBLIGATORIO");
        ErrorDire.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(ErrorDire, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 150, -1));

        ErrorEps.setBackground(new java.awt.Color(255, 51, 51));
        ErrorEps.setForeground(new java.awt.Color(255, 51, 51));
        ErrorEps.setText("CAMPO OBLIGATORIO");
        ErrorEps.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(ErrorEps, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 150, -1));

        ErrorCargo.setBackground(new java.awt.Color(255, 51, 51));
        ErrorCargo.setForeground(new java.awt.Color(255, 51, 51));
        ErrorCargo.setText("CAMPO OBLIGATORIO");
        ErrorCargo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(ErrorCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 140, -1));
        jPanel2.add(JCBXEps, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 170, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 550, 330));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Contacto en caso de emergencia"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTXNombreRep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTXNombreRepKeyTyped(evt);
            }
        });
        jPanel1.add(JTXNombreRep, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 160, 30));

        JTXApellidoRep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTXApellidoRepKeyTyped(evt);
            }
        });
        jPanel1.add(JTXApellidoRep, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 170, 30));

        JTXParentesco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTXParentescoKeyTyped(evt);
            }
        });
        jPanel1.add(JTXParentesco, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 170, 30));

        JTXCelularRep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTXCelularRepKeyTyped(evt);
            }
        });
        jPanel1.add(JTXCelularRep, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 160, 30));

        JTXCorreoRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTXCorreoRepActionPerformed(evt);
            }
        });
        JTXCorreoRep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTXCorreoRepKeyTyped(evt);
            }
        });
        jPanel1.add(JTXCorreoRep, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 170, 30));

        jLabel25.setFont(new java.awt.Font("Hack", 1, 14)); // NOI18N
        jLabel25.setText("APELLIDOS : ");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 100, 30));

        jLabel26.setFont(new java.awt.Font("Hack", 1, 14)); // NOI18N
        jLabel26.setText("PARENTESCO :");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 100, 30));

        jLabel27.setFont(new java.awt.Font("Hack", 1, 14)); // NOI18N
        jLabel27.setText("CORREO    :");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 100, 30));

        jLabel28.setFont(new java.awt.Font("Hack", 1, 14)); // NOI18N
        jLabel28.setText("NOMBRE  : ");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 80, 30));

        jLabel29.setFont(new java.awt.Font("Hack", 1, 14)); // NOI18N
        jLabel29.setText("CELULAR : ");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 80, 30));

        jLabel30.setFont(new java.awt.Font("Hack", 1, 14)); // NOI18N
        jLabel30.setText("CEDULA  :");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 80, 30));

        JTXDocumentorEFERENCIA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTXDocumentorEFERENCIAKeyTyped(evt);
            }
        });
        jPanel1.add(JTXDocumentorEFERENCIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 160, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 550, 150));
        jPanel1.getAccessibleContext().setAccessibleName("Llamar en caso de emergencia");
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Hack", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EMPLEADO");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 150, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 550, 30));

        BtnCancelar.setFont(new java.awt.Font("Hack", 1, 14)); // NOI18N
        BtnCancelar.setText("CANCELAR");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 540, 100, 30));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 550, 30));

        jButtonActualizar.setFont(new java.awt.Font("Hack", 1, 14)); // NOI18N
        jButtonActualizar.setText("ACTUALIZAR");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 540, 120, 30));

        BtnBuscar.setFont(new java.awt.Font("Hack", 1, 14)); // NOI18N
        BtnBuscar.setText("BUSCAR");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, 90, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed

     
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void JTXDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTXDocumentoKeyTyped

        char c = evt.getKeyChar();
        
        if(c<'0' || c>'9')
            evt.consume();

    }//GEN-LAST:event_JTXDocumentoKeyTyped

    private void JTXDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTXDireccionKeyTyped

        char c = evt.getKeyChar();
        
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<'0' || c>'9') && (c<'#' || c>'#') && c != KeyEvent.VK_SPACE)
            evt.consume();

    }//GEN-LAST:event_JTXDireccionKeyTyped

    private void JTXCelular1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTXCelular1KeyTyped
       
        char c = evt.getKeyChar();
        
        if(c<'0' || c>'9')
            evt.consume();
        
    }//GEN-LAST:event_JTXCelular1KeyTyped

    private void JTXCargoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTXCargoKeyTyped
          
        char c = evt.getKeyChar();
        
        if((c<'a' || c>'z') && (c<'A' || c>'Z'))
            evt.consume();
        
    }//GEN-LAST:event_JTXCargoKeyTyped

    private void JRBDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBDocenteActionPerformed
     
    }//GEN-LAST:event_JRBDocenteActionPerformed

    private void JRBProfesionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBProfesionalActionPerformed

    }//GEN-LAST:event_JRBProfesionalActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed

        
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void JTXCelularRepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTXCelularRepKeyTyped

        char c = evt.getKeyChar();

        if(c<'0' || c>'9')
        evt.consume();

    }//GEN-LAST:event_JTXCelularRepKeyTyped

    private void JTXParentescoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTXParentescoKeyTyped

        char c = evt.getKeyChar();

        if(c<'0' || c>'9')
        evt.consume();

    }//GEN-LAST:event_JTXParentescoKeyTyped

    private void JTXApellidoRepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTXApellidoRepKeyTyped

        char c = evt.getKeyChar();

        if(!Character.isLetter(c) && c != KeyEvent.VK_SPACE)
        evt.consume();
    }//GEN-LAST:event_JTXApellidoRepKeyTyped

    private void JTXNombreRepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTXNombreRepKeyTyped

        char c = evt.getKeyChar();

        if(!Character.isLetter(c) && c != KeyEvent.VK_SPACE)
        evt.consume();
    }//GEN-LAST:event_JTXNombreRepKeyTyped

    private void JRBAdministrativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBAdministrativoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JRBAdministrativoActionPerformed

    private void JTXNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTXNombreKeyTyped
        char c = evt.getKeyChar();

        if(!Character.isLetter(c) && c != KeyEvent.VK_SPACE)
        evt.consume();
    }//GEN-LAST:event_JTXNombreKeyTyped

    private void JTXApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTXApellidosKeyTyped
        char c = evt.getKeyChar();

        if(!Character.isLetter(c) && c != KeyEvent.VK_SPACE)
        evt.consume();
    }//GEN-LAST:event_JTXApellidosKeyTyped

    private void JTXCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTXCorreoKeyTyped
        char c = evt.getKeyChar();
       
          if(c == KeyEvent.VK_SPACE)
            evt.consume();
    }//GEN-LAST:event_JTXCorreoKeyTyped

    private void JTXCorreoRepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTXCorreoRepKeyTyped
        char c = evt.getKeyChar();
       
          if(c == KeyEvent.VK_SPACE)
            evt.consume();
    }//GEN-LAST:event_JTXCorreoRepKeyTyped

    private void JTXDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTXDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTXDocumentoActionPerformed

    private void JTXApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTXApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTXApellidosActionPerformed

    private void JTXCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTXCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTXCargoActionPerformed

    private void JTXCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTXCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTXCorreoActionPerformed

    private void JTXCorreoRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTXCorreoRepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTXCorreoRepActionPerformed

    private void JTXDocumentorEFERENCIAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTXDocumentorEFERENCIAKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JTXDocumentorEFERENCIAKeyTyped

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
    
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        menu menuPrincipal= new menu();
        menuPrincipal.setVisible(true);
        menuPrincipal.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void JTXCelular2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTXCelular2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTXCelular2ActionPerformed

    private void JTXCelular2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTXCelular2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JTXCelular2KeyTyped

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BGTNTipoDoc;
    private javax.swing.ButtonGroup BGTNTipoEmpleado;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JCheckBox CheckBoxHabilitar;
    public javax.swing.JLabel ErrorApellido;
    public javax.swing.JLabel ErrorCargo;
    private javax.swing.JLabel ErrorCedula;
    public javax.swing.JLabel ErrorCelular;
    public javax.swing.JLabel ErrorCelular2;
    public javax.swing.JLabel ErrorCorreo;
    public javax.swing.JLabel ErrorDire;
    public javax.swing.JLabel ErrorEps;
    public javax.swing.JLabel ErrorNombre;
    public javax.swing.JLabel ErrorRol;
    public javax.swing.JLabel ErrorTipoDoc;
    private javax.swing.JTextField JCBXEps;
    private javax.swing.JRadioButton JRBAdministrativo;
    private javax.swing.JRadioButton JRBDocente;
    private javax.swing.JRadioButton JRBProfesional;
    private javax.swing.JRadioButton JRBTNCC;
    private javax.swing.JRadioButton JRBTNCE;
    private javax.swing.JTextField JTXApellidoRep;
    private javax.swing.JTextField JTXApellidos;
    private javax.swing.JTextField JTXCargo;
    private javax.swing.JTextField JTXCelular1;
    private javax.swing.JTextField JTXCelular2;
    private javax.swing.JTextField JTXCelularRep;
    private javax.swing.JTextField JTXCorreo;
    private javax.swing.JTextField JTXCorreoRep;
    private javax.swing.JTextField JTXDireccion;
    private javax.swing.JTextField JTXDocumento;
    private javax.swing.JTextField JTXDocumentorEFERENCIA;
    private javax.swing.JTextField JTXNombre;
    private javax.swing.JTextField JTXNombreRep;
    private javax.swing.JTextField JTXParentesco;
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String comando = e.getActionCommand();
        if (comando.equalsIgnoreCase("Guardar")) 
            btnGuardar();
        if (comando.equalsIgnoreCase("ELIMINAR"))
            btnElinar();
        if (comando.equalsIgnoreCase("BUSCAR"))
            btnBuscar(); 
        if (comando.equalsIgnoreCase("EMILIMINAR_O_EDITAR"))
        {
            if (CheckBoxHabilitar.isSelected()) 
            {
                limpiarCampos("");
//              JOptionPane.showMessageDialog(null, "Selecionado!!");
                bloqueoBotones(BtnBuscar, true);
                bloqueoBotones(BtnGuardar, false);
            }else{
                limpiarCampos("");
                bloqueoBotones(BtnBuscar, false);
                bloqueoBotones(BtnGuardar, true);
                bloqueoBotones(BtnEliminar,false);
                bloqueoBotones(jButtonActualizar,false);
//                JOptionPane.showMessageDialog(null, "DesSeleciona!!");
            }
        }
    }    
        
    private void  btnBuscar()
    {
        String documento=JTXDocumento.getText();
        if (llamar.validarCampoVacios(documento)) 
        {
            ErrorCedula.setVisible(false);
            boolean respuesta=llamar.validarPersonaExistente("empleado","DocumentoEmpleado",documento);
            if (respuesta) 
            {
//                int b=JCBXEps.getModel().getSize();
//                if (b>0) 
//                {
//                    JCBXEps.removeAllItems();
//                }
                EntidadEmpleado empleado=(EntidadEmpleado) llamar.consultarEmpleado(documento);
                
                if(empleado.getTipoDocumento().equalsIgnoreCase("CE"))
                   JRBTNCE.setSelected(true);
                if (empleado.getTipoDocumento().equalsIgnoreCase("CC")) 
                JRBTNCC.setSelected(true);
                 
                JTXDocumento.setText(empleado.getDocumentoEmpleado());
                JTXNombre.setText(empleado.getNombreEmpleado());
                JTXApellidos.setText(empleado.getApellidosEmpleado());
                JTXCelular1.setText(empleado.getTelefonosEmpleado());
                JTXDireccion.setText(empleado.getDirecionEmpleado());
                JTXCorreo.setText(empleado.getCorreoElectronico());
                JTXCargo.setText(empleado.getCargoEmpleado());
                
                String rol=empleado.getRol();
                if (rol.equals(JRBProfesional.getText())) 
                    JRBProfesional.setSelected(true);
                if(rol.equals(JRBDocente.getText()))
                    JRBDocente.setSelected(true);
                if (rol.equals(JRBAdministrativo.getText())) 
                    JRBAdministrativo.setSelected(true);

                JCBXEps.setText(empleado.getEpsEmpleado());
                bloquearCampos(true);
                bloqueoBotones(BtnBuscar,false);
                bloqueoBotones(BtnEliminar,true);
                jButtonActualizar.setEnabled(true);
            }else{
                JOptionPane.showMessageDialog(null, "La persona no EXISTE!!");
            }
            
        }else{
            ErrorCedula.setVisible(true);
        }
    }
    
    private void btnElinar(){
        
        String cedula=JTXDocumento.getText();
        
        if (!llamar.validarCampoVacios(cedula))
        {
           labelError(ErrorCedula,true); 
           return;
        }
        
        if (llamar.eliminarPersona(cedula)) 
            JOptionPane.showMessageDialog(null, "Empleado Eliminado con exito");
        else
            JOptionPane.showMessageDialog(null, "Error al Eliminado Empleado");     
    }
    
    private void btnGuardar()
    {
        labelErrorMasivo(false);
        
        if (!llamar.validarCampoVacios(JTXDocumento.getText())){
           labelError(ErrorCedula,true); 
           return;
        }
        if (!llamar.validarCampoVacios(JTXNombre.getText())){
          labelError(ErrorNombre,true);
          return; 
        }      
        if (!llamar.validarCampoVacios(JTXApellidos.getText())){
            labelError(ErrorApellido,true);
            return; 
        } 
        if (!llamar.validarCampoVacios(JTXDireccion.getText())){
            labelError(ErrorDire,true);
            return;
        } 
        if (!llamar.validarCampoVacios(JTXCelular1.getText())){
            labelError(ErrorCelular,true);  
            return;
        }
        if (!llamar.validarCampoVacios(JTXCelular2.getText())){
            labelError(ErrorCelular2,true);
            return;    
        }
        if (!llamar.validarCampoVacios(JTXCargo.getText())){
            labelError(ErrorCargo,true);
            return;
        }    
        if (!llamar.validarCampoVacios(JTXCorreo.getText())){
            labelError(ErrorCorreo,true);
            return;
        }    
        if (!llamar.validarCampoVacios(JCBXEps.getText())){
            labelError(ErrorEps,true);
            return;
        }

        if (!JRBTNCE.isSelected())
        {
            if (!JRBTNCC.isSelected())
            {
                labelError(ErrorTipoDoc,true);
                return;
            }
        }
        if (!JRBDocente.isSelected()) {
            if (!JRBProfesional.isSelected())
            {
                if (!JRBAdministrativo.isSelected())
                {
                   labelError(ErrorRol,true);
                   return;
                }
            }
        }       
        EntidadEmpleado entidad= new EntidadEmpleado();
        Controller enviar= new Controller();
        // capturando tipo de documento
        String TipoDoc="";
        String  Rol="";
        if(JRBTNCE.isSelected())
          TipoDoc = "CE";
        if(JRBTNCC.isSelected())
          TipoDoc = "CC";
        if(JRBDocente.isSelected())
          Rol = "Docente";     
        if(JRBProfesional.isSelected())
          Rol = "Profesional";
        if(JRBAdministrativo.isSelected())
            Rol="Administrativo";
            
        //capturando datos personales
        entidad.setTipoDocumento(TipoDoc);
        entidad.setDocumentoEmpleado(JTXDocumento.getText());
        entidad.setNombreEmpleado(JTXNombre.getText());
        entidad.setApellidosEmpleado(JTXApellidos.getText());
        entidad.setDirecionEmpleado(JTXDireccion.getText());
        entidad.setTelefonosEmpleado(JTXCelular1.getText());
        entidad.setCargoEmpleado(JTXCargo.getText());
        entidad.setCorreoElectronico(JTXCorreo.getText());
        entidad.setEpsEmpleado(JCBXEps.getText());
        entidad.setRol(Rol);
        
        if (enviar.insertarDatosPersona(entidad)) 
            JOptionPane.showMessageDialog(null, "Empleado registrado");
        else
            JOptionPane.showMessageDialog(null, "Error al registrar Empleado");     
       
        limpiarCampos("");
    }
    
    private void bloqueoBotones(JButton nombreBoton,boolean opcion)
    {
        nombreBoton.setEnabled(opcion);
    }
    
    private void bloquearCampos(boolean opcion)
    {
        //tipo doucmento
        JRBTNCE.setSelected(opcion);
        JRBTNCC.setSelected(opcion);
                
        //datos basicos bloqueados
        JTXNombre.setEnabled(opcion);
        JTXApellidos.setEnabled(opcion);
        JTXDireccion.setEnabled(opcion);
        JTXCelular1.setEnabled(opcion);
        JTXCorreo.setEnabled(opcion);
        JTXCargo.setEnabled(opcion);
        JTXCelular2.setEnabled(opcion);
        
        //grupo rol bloqueado
        JRBProfesional.setEnabled(opcion);
        JRBDocente.setEnabled(opcion);
        JRBAdministrativo.setEnabled(opcion);
        
        //ComboBox bloqueado
        JCBXEps.setEnabled(opcion);
        
        //referecia personal bloqueda
        JTXDocumentorEFERENCIA.setEnabled(opcion);
        JTXParentesco.setEnabled(opcion);
        JTXNombreRep.setEnabled(opcion);
        JTXCelularRep.setEnabled(opcion);
        JTXApellidoRep.setEnabled(opcion); 
        JTXCorreoRep.setEnabled(opcion);
        JCBXEps.setEnabled(opcion);

    }
    
    private void limpiarCampos(String opcion){
        
        //datos basicos bloqueados
        JTXDocumento.setText(opcion);
        JTXNombre.setText(opcion);
        JTXApellidos.setText(opcion);
        JTXDireccion.setText(opcion);
        JTXCelular1.setText(opcion);
        JTXCorreo.setText(opcion);
        JTXCargo.setText(opcion);
        JTXCelular2.setText(opcion);
        
        //referecia personal bloqueda
        JTXDocumentorEFERENCIA.setText(opcion);
        JTXParentesco.setText(opcion);
        JTXNombreRep.setText(opcion);
        JTXCelularRep.setText(opcion);
        JTXApellidoRep.setText(opcion); 
        JTXCorreoRep.setText(opcion);
        JCBXEps.setText(opcion);
        ErrorCedula.setVisible(false);
//        JTXDocumento.setText(opcion);
    }
    
    private void labelError(JLabel campo, boolean valor){
        campo.setVisible(valor);
    }
    
    private void labelErrorMasivo(boolean valor) 
    {
        labelError(ErrorCedula, valor);
        labelError(ErrorNombre, valor);
        labelError(ErrorApellido, valor);
        labelError(ErrorCelular, valor);
        labelError(ErrorCelular2, valor);
        labelError(ErrorCorreo, valor);
        labelError(ErrorDire, valor);
        labelError(ErrorEps, valor);
        labelError(ErrorCargo, valor);
        labelError(ErrorTipoDoc, valor);
        labelError(ErrorRol, valor);
        
    }
    
}
