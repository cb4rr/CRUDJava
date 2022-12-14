/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Pipe
 */
public class JFrame_main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    
    public static PreparedStatement ps;
    public static ResultSet rs;
    public String regexRUN = "([0-9|.]{1,10}-[K|k0-9])";
    public String regexFecha = "([0][1-9]|[12][0-9]|3[01])(\\/|-)([0][1-9]|[1][0-2])\\2(\\d{4})(\\s)([0-1][1-9]|[2][0-3])(:)([0-5][0-9])";
    public String regexNombreApellido = "^([A-Za-zÁÉÍÓÚñáéíóúÑ]{0}?[A-Za-zÁÉÍÓÚñáéíóúÑ']+\\s)+([A-Za-zÁÉÍÓÚñáéíóúÑ]{0}?[A-Za-zÁÉÍÓÚñáéíóúÑ'])+\\s?([A-Za-zÁÉÍÓÚñáéíóúÑ]{0}?[A-Za-zÁÉÍÓÚñáéíóúÑ'])?$";
    
    

    
    public JFrame_main() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        setTitle("Base de Datos Instituto");
        setLocationRelativeTo(null);
    }
    
    // Conexion a base de datos
    public static Connection getConnection() {
        String URL = "jdbc:mysql://localhost:3306/mydbinstituto";
        String USERNAME = "root";
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, "");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "No se ha encendido el servidor...", "Error al conectar a base de datos", JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }
     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JTabbedPane jTabbedPane1 = new javax.swing.JTabbedPane();
        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JButton btn_Consultar_Alumnos = new javax.swing.JButton();
        btn_Salir_Alumnos = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_RunAlum = new javax.swing.JTextField();
        txt_ExpeAlum = new javax.swing.JTextField();
        txt_NombreAlum = new javax.swing.JTextField();
        txt_AppAlum = new javax.swing.JTextField();
        txt_ApmAlum = new javax.swing.JTextField();
        txt_FechNacAlum = new javax.swing.JTextField();
        txt_DireccionAlum = new javax.swing.JTextField();
        // Variables declaration - do not modify//GEN-BEGIN:variables
        javax.swing.JButton btn_AgregarAlum = new javax.swing.JButton();
        btn_ModificarAlum = new javax.swing.JButton();
        javax.swing.JButton btn_EliminarAlum = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        javax.swing.JSeparator jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txt_BuscarAlum = new javax.swing.JTextField();
        btn_LimpiarAlum = new javax.swing.JButton();
        combo_CursoAlum = new javax.swing.JComboBox<>();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        table_Alumnos = new javax.swing.JTable();
        javax.swing.JLabel jLabel9 = new javax.swing.JLabel();
        combo_todosAlumnos = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        javax.swing.JButton btn_AgregarProf = new javax.swing.JButton();
        btn_ModificarProf = new javax.swing.JButton();
        javax.swing.JButton btn_EliminarProf = new javax.swing.JButton();
        javax.swing.JLabel labelRunProfe = new javax.swing.JLabel();
        javax.swing.JButton btn_ConsultarProfesores = new javax.swing.JButton();
        btn_Salir_Prof = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        javax.swing.JSeparator jSeparator2 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt_RunProf = new javax.swing.JTextField();
        txt_nomProfe = new javax.swing.JTextField();
        txt_ApellidoPaternoProf = new javax.swing.JTextField();
        txt_ApellidoMaternoProf = new javax.swing.JTextField();
        txt_FechaNacProf = new javax.swing.JTextField();
        txt_BuscarProfe = new javax.swing.JTextField();
        txt_DireccionProf = new javax.swing.JTextField();
        btn_LimpiarProf = new javax.swing.JButton();
        txt_TelefonoProf = new javax.swing.JTextField();
        javax.swing.JScrollPane jScrollPane2 = new javax.swing.JScrollPane();
        table_Profesores = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        combo_todosProfesores = new javax.swing.JComboBox<>();
        javax.swing.JPanel jPanel3 = new javax.swing.JPanel();
        txt_nombreModulo = new javax.swing.JTextField();
        btn_Salir_Modulo = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        txt_cantiHorasModulo = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txt_BuscarModulo = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        javax.swing.JButton btn_AgregarModulo = new javax.swing.JButton();
        btn_LimpiarModulo = new javax.swing.JButton();
        btn_ModificarModulo = new javax.swing.JButton();
        javax.swing.JSeparator jSeparator3 = new javax.swing.JSeparator();
        javax.swing.JButton btn_EliminarModulo = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        javax.swing.JLabel labelRunProfe1 = new javax.swing.JLabel();
        javax.swing.JButton btn_ConsultarModulo = new javax.swing.JButton();
        txt_codigoModulo = new javax.swing.JTextField();
        combo_SemestreModulos = new javax.swing.JComboBox<>();
        combo_JornadaModulos = new javax.swing.JComboBox<>();
        combo_todosModulos = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel7 = new javax.swing.JPanel();
        txt_nomProfeImpartir = new javax.swing.JTextField();
        txt_ApellidoPaternoImpartir = new javax.swing.JTextField();
        txt_ApellidoMaternoImpartir = new javax.swing.JTextField();
        txt_BuscarImpartir = new javax.swing.JTextField();
        javax.swing.JButton btn_AgregarImpartir = new javax.swing.JButton();
        btn_LimpiarImpartir = new javax.swing.JButton();
        btn_ModificarImpartir = new javax.swing.JButton();
        javax.swing.JButton btn_EliminarImpartir = new javax.swing.JButton();
        javax.swing.JLabel labelRunProfe5 = new javax.swing.JLabel();
        javax.swing.JScrollPane jScrollPane7 = new javax.swing.JScrollPane();
        table_Impartir = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        javax.swing.JButton btn_ConsultarImpartir = new javax.swing.JButton();
        btn_Salir_Impartir = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        javax.swing.JSeparator jSeparator7 = new javax.swing.JSeparator();
        jLabel38 = new javax.swing.JLabel();
        txt_RunProfImpartir = new javax.swing.JTextField();
        javax.swing.JLabel jLabel52 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel53 = new javax.swing.JLabel();
        combo_ModuloImpartir = new javax.swing.JComboBox<>();
        combo_todosProfesores1 = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel8 = new javax.swing.JPanel();
        txt_nomMatri = new javax.swing.JTextField();
        txt_ApellidoPaternoMatri = new javax.swing.JTextField();
        txt_ApellidoMaternoMatri = new javax.swing.JTextField();
        txt_BuscarAlumMatri = new javax.swing.JTextField();
        javax.swing.JButton btn_AgregarMatri = new javax.swing.JButton();
        btn_LimpiarMatri = new javax.swing.JButton();
        btn_ModificarMatri = new javax.swing.JButton();
        javax.swing.JButton btn_EliminarMatri = new javax.swing.JButton();
        javax.swing.JLabel labelRunProfe6 = new javax.swing.JLabel();
        javax.swing.JScrollPane jScrollPane8 = new javax.swing.JScrollPane();
        table_Matriculas = new javax.swing.JTable();
        jLabel40 = new javax.swing.JLabel();
        javax.swing.JButton btn_ConsultarMatri = new javax.swing.JButton();
        btn_SalirMatri = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        javax.swing.JSeparator jSeparator8 = new javax.swing.JSeparator();
        jLabel46 = new javax.swing.JLabel();
        txt_RunMatri = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel48 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel49 = new javax.swing.JLabel();
        combo_moduloMatriculas = new javax.swing.JComboBox<>();
        combo_todosAlumnosMatri = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel4 = new javax.swing.JPanel();
        btn_ModificarCursos = new javax.swing.JButton();
        javax.swing.JButton btn_EliminarCursos = new javax.swing.JButton();
        txt_codCursoTabCursos = new javax.swing.JTextField();
        javax.swing.JButton btn_AgregarCursos = new javax.swing.JButton();
        btn_Salir_Cursos = new javax.swing.JButton();
        btn_LimpiarCursos = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        combo_todosCursosTab = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabel44 = new javax.swing.JLabel();
        txt_nomCursoTabCursos = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        javax.swing.JScrollPane jScrollPane9 = new javax.swing.JScrollPane();
        table_Cursos = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        combo_todosAlumnostabCursos = new javax.swing.JComboBox<>();
        javax.swing.JSeparator jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        setResizable(false);

        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setRequestFocusEnabled(false);

        btn_Consultar_Alumnos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_Consultar_Alumnos.setText("Consultar");
        btn_Consultar_Alumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Consultar_AlumnosActionPerformed(evt);
            }
        });

        btn_Salir_Alumnos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_Salir_Alumnos.setText("Salir");
        btn_Salir_Alumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Salir_AlumnosActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Apellido paterno");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Apellido materno");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Fecha de nacimiento");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Curso");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Dirección");

        txt_RunAlum.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_RunAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RunAlumActionPerformed(evt);
            }
        });

        txt_ExpeAlum.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_NombreAlum.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_NombreAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreAlumActionPerformed(evt);
            }
        });

        txt_AppAlum.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_ApmAlum.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_FechNacAlum.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_DireccionAlum.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btn_AgregarAlum.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_AgregarAlum.setText("Agregar");
        btn_AgregarAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarAlumActionPerformed(evt);
            }
        });

        btn_ModificarAlum.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_ModificarAlum.setText("Modificar");
        btn_ModificarAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarAlumActionPerformed(evt);
            }
        });

        btn_EliminarAlum.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_EliminarAlum.setText("Eliminar");
        btn_EliminarAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarAlumActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Run");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Nro. Expediente");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Buscar alumno por Run");

        txt_BuscarAlum.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_BuscarAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BuscarAlumActionPerformed(evt);
            }
        });

        btn_LimpiarAlum.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_LimpiarAlum.setText("Limpiar");
        btn_LimpiarAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimpiarAlumActionPerformed(evt);
            }
        });

        combo_CursoAlum.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        combo_CursoAlum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Técnico en Enfermería", "Técnico en Informática ", "Técnico en Preparación Física", "Técnico en Odontología", "Administración de Empresas", "Técnico en Automatización y Control Industria", "Técnico en Educación Parvularia", "Técnico en Contabilidad y Gestión de Negocios" }));
        combo_CursoAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_CursoAlumActionPerformed(evt);
            }
        });

        table_Alumnos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        table_Alumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Semestre", "Cantidad de Horas", "Jornada"
            }
        ) {
            final boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_Alumnos);

        jLabel9.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
        jLabel9.setText("Matriculado en:");

        combo_todosAlumnos.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
        combo_todosAlumnos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona" }));
        combo_todosAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_todosAlumnosActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel31.setText("Todos los alumnos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(429, 429, 429)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_RunAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_ExpeAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_NombreAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_AppAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_ApmAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(130, 130, 130)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_AgregarAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_ModificarAlum)
                                    .addComponent(btn_LimpiarAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(494, 494, 494)
                                        .addComponent(txt_DireccionAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Salir_Alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(405, 405, 405)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_FechNacAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo_CursoAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(130, 130, 130)
                                .addComponent(btn_EliminarAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(419, 419, 419)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel31))
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(combo_todosAlumnos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_BuscarAlum, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE))
                        .addGap(89, 89, 89)
                        .addComponent(btn_Consultar_Alumnos)))
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_todosAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_Consultar_Alumnos)
                        .addComponent(txt_BuscarAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_RunAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_ExpeAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txt_NombreAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txt_AppAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txt_ApmAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_AgregarAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ModificarAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_LimpiarAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_FechNacAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(combo_CursoAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btn_EliminarAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel10))
                            .addComponent(txt_DireccionAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_Salir_Alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        jTabbedPane1.addTab("Alumnos", jPanel1);

        jPanel2.setPreferredSize(new java.awt.Dimension(1366, 768));

        btn_AgregarProf.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_AgregarProf.setText("Agregar");
        btn_AgregarProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarProfActionPerformed(evt);
            }
        });

        btn_ModificarProf.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_ModificarProf.setText("Modificar");
        btn_ModificarProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarProfActionPerformed(evt);
            }
        });

        btn_EliminarProf.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_EliminarProf.setText("Eliminar");
        btn_EliminarProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarProfActionPerformed(evt);
            }
        });

        labelRunProfe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelRunProfe.setText("Run");

        btn_ConsultarProfesores.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_ConsultarProfesores.setText("Consultar");
        btn_ConsultarProfesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultarProfesoresActionPerformed(evt);
            }
        });

        btn_Salir_Prof.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_Salir_Prof.setText("Salir");
        btn_Salir_Prof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Salir_ProfActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Nombre");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Apellido paterno");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Apellido materno");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("Fecha de nacimiento");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Telefono");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("Buscar profesor por Run");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("Dirección");

        txt_RunProf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_RunProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RunProfActionPerformed(evt);
            }
        });

        txt_nomProfe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_ApellidoPaternoProf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_ApellidoPaternoProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ApellidoPaternoProfActionPerformed(evt);
            }
        });

        txt_ApellidoMaternoProf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_FechaNacProf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_BuscarProfe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_BuscarProfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BuscarProfeActionPerformed(evt);
            }
        });

        txt_DireccionProf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btn_LimpiarProf.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_LimpiarProf.setText("Limpiar");
        btn_LimpiarProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimpiarProfActionPerformed(evt);
            }
        });

        txt_TelefonoProf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        table_Profesores.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        table_Profesores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Semestre", "Cantidad de Horas", "Jornada"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table_Profesores);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Imparte módulos:");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel32.setText("Todos los profesores");

        combo_todosProfesores.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        combo_todosProfesores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona" }));
        combo_todosProfesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_todosProfesoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel16)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 983, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_Salir_Prof, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(494, 494, 494)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_DireccionProf, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_TelefonoProf, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(130, 130, 130)
                                .addComponent(btn_EliminarProf, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelRunProfe)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15))
                                .addGap(405, 405, 405)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_RunProf, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nomProfe, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_ApellidoPaternoProf, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_ApellidoMaternoProf, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_FechaNacProf, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(130, 130, 130)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_AgregarProf, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_ModificarProf)
                                    .addComponent(btn_LimpiarProf, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(401, 401, 401)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel32))
                        .addGap(95, 95, 95)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_BuscarProfe, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                            .addComponent(combo_todosProfesores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(103, 103, 103)
                        .addComponent(btn_ConsultarProfesores)))
                .addGap(48, 48, 48))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Salir_Prof, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel32)
                            .addComponent(combo_todosProfesores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_ConsultarProfesores)
                                .addComponent(txt_BuscarProfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_AgregarProf, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_ModificarProf, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_LimpiarProf, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(labelRunProfe)
                                        .addGap(18, 18, Short.MAX_VALUE)
                                        .addComponent(jLabel12))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(txt_RunProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_nomProfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_ApellidoPaternoProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_ApellidoMaternoProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_FechaNacProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(btn_EliminarProf, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_DireccionProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(txt_TelefonoProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
        );

        jTabbedPane1.addTab("Profesores", jPanel2);

        jPanel3.setPreferredSize(new java.awt.Dimension(1366, 768));

        txt_nombreModulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btn_Salir_Modulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_Salir_Modulo.setText("Salir");
        btn_Salir_Modulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Salir_ModuloActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setText("Nombre");

        txt_cantiHorasModulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setText("Semestre");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setText("Cantidad de Horas");

        txt_BuscarModulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setText("Jornada");

        btn_AgregarModulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_AgregarModulo.setText("Agregar");
        btn_AgregarModulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarModuloActionPerformed(evt);
            }
        });

        btn_LimpiarModulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_LimpiarModulo.setText("Limpiar");
        btn_LimpiarModulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimpiarModuloActionPerformed(evt);
            }
        });

        btn_ModificarModulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_ModificarModulo.setText("Modificar");
        btn_ModificarModulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarModuloActionPerformed(evt);
            }
        });

        btn_EliminarModulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_EliminarModulo.setText("Eliminar");
        btn_EliminarModulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarModuloActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel24.setText("Buscar módulo por código");

        labelRunProfe1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelRunProfe1.setText("Código");

        btn_ConsultarModulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_ConsultarModulo.setText("Consultar");
        btn_ConsultarModulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultarModuloActionPerformed(evt);
            }
        });

        txt_codigoModulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_codigoModulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigoModuloActionPerformed(evt);
            }
        });

        combo_SemestreModulos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        combo_SemestreModulos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Primer Semestre", "Segundo Semestre", "Tercer Semestre", "Cuarto Semestre" }));

        combo_JornadaModulos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        combo_JornadaModulos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Diurno", "Vespertino" }));

        combo_todosModulos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        combo_todosModulos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona" }));
        combo_todosModulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combo_todosModulosMouseClicked(evt);
            }
        });
        combo_todosModulos.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                combo_todosModulosComponentShown(evt);
            }
        });
        combo_todosModulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_todosModulosActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel30.setText("Todos los módulos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_Salir_Modulo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelRunProfe1)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22))
                                .addGap(419, 419, 419)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_cantiHorasModulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nombreModulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_codigoModulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo_SemestreModulos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo_JornadaModulos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_AgregarModulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_ModificarModulo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_LimpiarModulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_EliminarModulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(413, 413, 413)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel30))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_BuscarModulo, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                            .addComponent(combo_todosModulos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(125, 125, 125)
                        .addComponent(btn_ConsultarModulo)))
                .addGap(48, 48, 48))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel30)
                    .addComponent(combo_todosModulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_BuscarModulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24))
                    .addComponent(btn_ConsultarModulo))
                .addGap(22, 22, 22)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_AgregarModulo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ModificarModulo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_LimpiarModulo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(labelRunProfe1)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel19))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(txt_codigoModulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_nombreModulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20)
                            .addComponent(combo_SemestreModulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel21)
                                .addGap(24, 24, 24)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22)
                                    .addComponent(combo_JornadaModulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txt_cantiHorasModulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(3, 3, 3)
                .addComponent(btn_EliminarModulo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 286, Short.MAX_VALUE)
                .addComponent(btn_Salir_Modulo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        jTabbedPane1.addTab("Módulos", jPanel3);

        jPanel7.setPreferredSize(new java.awt.Dimension(1366, 768));

        txt_nomProfeImpartir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_ApellidoPaternoImpartir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_ApellidoPaternoImpartir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ApellidoPaternoImpartirActionPerformed(evt);
            }
        });

        txt_ApellidoMaternoImpartir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_BuscarImpartir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btn_AgregarImpartir.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_AgregarImpartir.setText("Agregar");
        btn_AgregarImpartir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarImpartirActionPerformed(evt);
            }
        });

        btn_LimpiarImpartir.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_LimpiarImpartir.setText("Limpiar");
        btn_LimpiarImpartir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimpiarImpartirActionPerformed(evt);
            }
        });

        btn_ModificarImpartir.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_ModificarImpartir.setText("Modificar");
        btn_ModificarImpartir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarImpartirActionPerformed(evt);
            }
        });

        btn_EliminarImpartir.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_EliminarImpartir.setText("Eliminar");
        btn_EliminarImpartir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarImpartirActionPerformed(evt);
            }
        });

        labelRunProfe5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelRunProfe5.setText("Run");

        table_Impartir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        table_Impartir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Semestre", "Cantidad de Horas", "Jornada"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(table_Impartir);

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel27.setText("Imparte módulos:");

        btn_ConsultarImpartir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_ConsultarImpartir.setText("Consultar");
        btn_ConsultarImpartir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultarImpartirActionPerformed();
            }
        });

        btn_Salir_Impartir.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_Salir_Impartir.setText("Salir");
        btn_Salir_Impartir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Salir_ImpartirActionPerformed();
            }
        });

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel29.setText("Nombre");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel34.setText("Apellido paterno");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel35.setText("Apellido materno");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel38.setText("Buscar por Run de profesor");

        txt_RunProfImpartir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_RunProfImpartir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RunProfImpartirActionPerformed();
            }
        });

        jLabel52.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel52.setText("Asignar a");

        jLabel53.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel53.setText("Módulo");

        combo_ModuloImpartir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        combo_ModuloImpartir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona" }));

        combo_todosProfesores1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        combo_todosProfesores1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona" }));
        combo_todosProfesores1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_todosProfesores1ActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel36.setText("Todos los profesores");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel52)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel53)
                                        .addGap(16, 16, 16)
                                        .addComponent(combo_ModuloImpartir, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Salir_Impartir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 983, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)
                                .addComponent(btn_EliminarImpartir, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelRunProfe5)
                                            .addComponent(jLabel29)
                                            .addComponent(jLabel34)
                                            .addComponent(jLabel35))
                                        .addGap(429, 429, 429)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_RunProfImpartir, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_nomProfeImpartir, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_ApellidoPaternoImpartir, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_ApellidoMaternoImpartir, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel27))
                                .addGap(130, 130, 130)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_AgregarImpartir, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_LimpiarImpartir, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_ModificarImpartir, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(jLabel36))
                        .addGap(104, 104, 104)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_BuscarImpartir, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                            .addComponent(combo_todosProfesores1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(151, 151, 151)
                        .addComponent(btn_ConsultarImpartir)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Salir_Impartir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel36)
                            .addComponent(combo_todosProfesores1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_BuscarImpartir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38)
                            .addComponent(btn_ConsultarImpartir))
                        .addGap(22, 22, 22)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(btn_AgregarImpartir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_ModificarImpartir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_LimpiarImpartir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btn_EliminarImpartir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(labelRunProfe5)
                                        .addGap(18, 18, Short.MAX_VALUE)
                                        .addComponent(jLabel29))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                        .addComponent(txt_RunProfImpartir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_nomProfeImpartir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_ApellidoPaternoImpartir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel34))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_ApellidoMaternoImpartir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel35))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel52)
                        .addGap(15, 15, 15)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel53)
                            .addComponent(combo_ModuloImpartir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 98, Short.MAX_VALUE)))
                .addGap(45, 45, 45))
        );

        jTabbedPane1.addTab("Impartir", jPanel7);

        jPanel8.setPreferredSize(new java.awt.Dimension(1366, 768));

        txt_nomMatri.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_ApellidoPaternoMatri.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_ApellidoPaternoMatri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ApellidoPaternoMatriActionPerformed();
            }
        });

        txt_ApellidoMaternoMatri.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txt_BuscarAlumMatri.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btn_AgregarMatri.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_AgregarMatri.setText("Agregar");
        btn_AgregarMatri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarMatriActionPerformed();
            }
        });

        btn_LimpiarMatri.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_LimpiarMatri.setText("Limpiar");
        btn_LimpiarMatri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimpiarMatriActionPerformed();
            }
        });

        btn_ModificarMatri.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_ModificarMatri.setText("Modificar");
        btn_ModificarMatri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarMatriActionPerformed();
            }
        });

        btn_EliminarMatri.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_EliminarMatri.setText("Eliminar");
        btn_EliminarMatri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarMatriActionPerformed(evt);
            }
        });

        labelRunProfe6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelRunProfe6.setText("Run");

        table_Matriculas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        table_Matriculas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Semestre", "Cantidad de Horas", "Jornada"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(table_Matriculas);

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel40.setText("Matriculado en");

        btn_ConsultarMatri.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_ConsultarMatri.setText("Consultar");
        btn_ConsultarMatri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultarMatriActionPerformed();
            }
        });

        btn_SalirMatri.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_SalirMatri.setText("Salir");
        btn_SalirMatri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirMatriActionPerformed();
            }
        });

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel41.setText("Nombre");

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel42.setText("Apellido paterno");

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel43.setText("Apellido materno");

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel46.setText("Busqueda por Run de alumno");

        txt_RunMatri.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_RunMatri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RunMatriActionPerformed();
            }
        });

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel48.setText("Matricular a");

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel49.setText("Módulo");

        combo_moduloMatriculas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        combo_moduloMatriculas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona" }));
        combo_moduloMatriculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_moduloMatriculasActionPerformed(evt);
            }
        });

        combo_todosAlumnosMatri.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        combo_todosAlumnosMatri.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona" }));
        combo_todosAlumnosMatri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_todosAlumnosMatriActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel37.setText("Todos los Alumnos");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel46)
                            .addComponent(jLabel37))
                        .addGap(123, 123, 123)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_BuscarAlumMatri, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                            .addComponent(combo_todosAlumnosMatri, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(69, 69, 69)
                        .addComponent(btn_ConsultarMatri))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_SalirMatri, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel48)
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(labelRunProfe6)
                                                .addComponent(jLabel41)
                                                .addComponent(jLabel42)
                                                .addComponent(jLabel43))
                                            .addGap(429, 429, 429)
                                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txt_RunMatri, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txt_nomMatri, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txt_ApellidoPaternoMatri, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txt_ApellidoMaternoMatri, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel33)
                                        .addComponent(jLabel40))
                                    .addGap(136, 136, 136)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn_AgregarMatri, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_ModificarMatri)
                                        .addComponent(btn_LimpiarMatri, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 1244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                            .addComponent(jLabel49)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(combo_moduloMatriculas, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 983, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(130, 130, 130)
                                    .addComponent(btn_EliminarMatri, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel37)
                    .addComponent(combo_todosAlumnosMatri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_BuscarAlumMatri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46)
                    .addComponent(btn_ConsultarMatri))
                .addGap(22, 22, 22)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btn_AgregarMatri, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ModificarMatri, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_LimpiarMatri, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(labelRunProfe6)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(jLabel41))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                .addComponent(txt_RunMatri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_nomMatri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_ApellidoPaternoMatri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_ApellidoMaternoMatri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel33)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btn_EliminarMatri, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel48)
                .addGap(15, 15, 15)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(combo_moduloMatriculas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(btn_SalirMatri, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        jTabbedPane1.addTab("Matriculas", jPanel8);

        jPanel4.setPreferredSize(new java.awt.Dimension(1366, 768));

        btn_ModificarCursos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_ModificarCursos.setText("Modificar");
        btn_ModificarCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarCursosActionPerformed(evt);
            }
        });

        btn_EliminarCursos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_EliminarCursos.setText("Eliminar");
        btn_EliminarCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarCursosActionPerformed(evt);
            }
        });

        txt_codCursoTabCursos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btn_AgregarCursos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_AgregarCursos.setText("Agregar");
        btn_AgregarCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarCursosActionPerformed(evt);
            }
        });

        btn_Salir_Cursos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_Salir_Cursos.setText("Salir");
        btn_Salir_Cursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Salir_CursosActionPerformed(evt);
            }
        });

        btn_LimpiarCursos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_LimpiarCursos.setText("Limpiar");
        btn_LimpiarCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimpiarCursosActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel28.setText("Código");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel39.setText("Todos los cursos");

        combo_todosCursosTab.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        combo_todosCursosTab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona" }));
        combo_todosCursosTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_todosCursosTabActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel44.setText("Nombre Curso");

        txt_nomCursoTabCursos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setText("Asignados a este curso");

        table_Cursos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        table_Cursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Run", "Nombre", "Apellido Paterno", "Apellido Materno"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(table_Cursos);

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setText("Opciones a");

        combo_todosAlumnostabCursos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        combo_todosAlumnostabCursos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona" }));
        combo_todosAlumnostabCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_todosAlumnostabCursosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_ModificarCursos))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(combo_todosAlumnostabCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel39)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(combo_todosCursosTab, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel28)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txt_codCursoTabCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel44)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txt_nomCursoTabCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 983, Short.MAX_VALUE))
                                        .addGap(130, 130, 130)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_LimpiarCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_EliminarCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_AgregarCursos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Salir_Cursos, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel39)
                    .addComponent(combo_todosCursosTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_codCursoTabCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btn_AgregarCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_ModificarCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(combo_todosAlumnostabCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel44)
                        .addComponent(txt_nomCursoTabCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btn_LimpiarCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btn_EliminarCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(btn_Salir_Cursos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        jTabbedPane1.addTab("Cursos", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_RunMatriActionPerformed() {//GEN-FIRST:event_txt_RunMatriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_RunMatriActionPerformed

    private void btn_SalirMatriActionPerformed() {//GEN-FIRST:event_btn_SalirMatriActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_SalirMatriActionPerformed

    private void btn_ConsultarMatriActionPerformed() {//GEN-FIRST:event_btn_ConsultarMatriActionPerformed
        // TODO add your handling code here:
        
         Connection con;

        try{
            con = getConnection();
            ps = con.prepareStatement("Select * from alumnos where runAlum = ?");
            ps.setString(1, txt_BuscarAlumMatri.getText());

            rs = ps.executeQuery();

            if(rs.next() && txt_BuscarAlumMatri.getText().matches(regexRUN)){
                // Seteamos los datos a las cajas.

                txt_RunMatri.setText(rs.getString("runAlum"));
                txt_nomMatri.setText(rs.getString("nomAlum"));
                txt_ApellidoPaternoMatri.setText(rs.getString("appAlum"));
                txt_ApellidoMaternoMatri.setText(rs.getString("apmAlum"));

                // Query modulos
                String[] data = null;
                con = getConnection();
                ps = con.prepareStatement("SELECT alumnos.runAlum, modulos.*, matriculas.*, jornadas.nomJorn, semestres.nomSeme FROM matriculas INNER JOIN alumnos ON matriculas.runAlum = alumnos.runAlum INNER JOIN modulos ON modulos.codMod = matriculas.codMod INNER JOIN jornadas ON modulos.codJorn = jornadas.codJorn INNER JOIN semestres on modulos.codSeme = semestres.codSeme where alumnos.runAlum = ?");
                ps.setString(1, txt_BuscarAlumMatri.getText());

                rs = ps.executeQuery();
                                
                DefaultTableModel tabla1 = (DefaultTableModel) table_Matriculas.getModel();
                tabla1.setRowCount(0);
                
                
                while(rs.next()){
                    String modulo = rs.getString("codMod");
                    String nombre = rs.getString("nomMod");
                    String semestre = rs.getString("nomSeme");
                    String horas = rs.getString("canthrsMod");
                    String jornada = rs.getString("nomJorn");

                    data = new String[] { modulo, nombre, semestre, horas, jornada};

                    DefaultTableModel tabla = (DefaultTableModel) table_Matriculas.getModel();
                    tabla.addRow(data);
                 }
                 
                if(!rs.next() && data == null){
                JOptionPane.showMessageDialog(null, "El profesor no está a cargo de ningún módulo", "Sin módulos", JOptionPane.ERROR_MESSAGE);
                DefaultTableModel tabla = (DefaultTableModel) table_Matriculas.getModel();
                tabla.setRowCount(0);
                }

                
                
            }else{
                JOptionPane.showMessageDialog(null, "Profesor no encontrado...", "Error al buscar Profesor...", JOptionPane.ERROR_MESSAGE);
                limpiarCamposMatricula();
            }
            
            con.close();
        } catch (SQLException e){
               JOptionPane.showMessageDialog(null, "Profesor no encontrado...", "Error al buscar Profesor...", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btn_ConsultarMatriActionPerformed

    private void btn_EliminarMatriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarMatriActionPerformed
        // TODO add your handling code here:
        String codModulo = txt_RunMatri.getText();
          
        Connection con;

        try {
            con = getConnection();
            ps = con.prepareStatement("DELETE FROM matriculas WHERE runAlum = '"+codModulo+"'");

            int res = ps.executeUpdate();

            if(res > 0){
                JOptionPane.showMessageDialog(null, "Matricula eliminada satisfactoriamente", "Matricula eliminada", JOptionPane.DEFAULT_OPTION);
                limpiarCamposMatricula();
            }else{
                JOptionPane.showMessageDialog(null, "Matricula no encontrado...", "Error al eliminar matricula", JOptionPane.ERROR_MESSAGE);
                limpiarCamposMatricula();
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_btn_EliminarMatriActionPerformed

    private void btn_ModificarMatriActionPerformed() {//GEN-FIRST:event_btn_ModificarMatriActionPerformed
        // TODO add your handling code here:
        Connection con;
        try{
            
            con = getConnection();
            ps = con.prepareStatement("SELECT * FROM modulos where nomMod = ?");
            ps.setString(1, combo_moduloMatriculas.getSelectedItem().toString());
            rs = ps.executeQuery();
            
            if(rs.next() && txt_RunMatri.getText().matches(regexRUN)){
                String codModulo = rs.getString("codMod");
                
                con = getConnection();
                ps = con.prepareStatement("UPDATE matriculas SET runAlum = ? WHERE codMod = ?");
                ps.setString(1, txt_RunMatri.getText());
                ps.setString(2, codModulo);
                int res = ps.executeUpdate();
                
             if(res > 0){
                JOptionPane.showMessageDialog(null, "Matricula modificada exitosamente...", "Modificar matricula", JOptionPane.DEFAULT_OPTION);
                limpiarCamposImpartir();
            }else{
                JOptionPane.showMessageDialog(null, "Matricula no encontrado...", "Error al modificar matricula", JOptionPane.ERROR_MESSAGE);
                limpiarCamposImpartir();
            }
            }
            
        } catch (SQLException e){
               JOptionPane.showMessageDialog(null, e, "Error al buscar matricula...", JOptionPane.ERROR_MESSAGE);
        }  
    }//GEN-LAST:event_btn_ModificarMatriActionPerformed

    private void btn_LimpiarMatriActionPerformed() {//GEN-FIRST:event_btn_LimpiarMatriActionPerformed
        // TODO add your handling code here:
        limpiarCamposMatricula();
    }//GEN-LAST:event_btn_LimpiarMatriActionPerformed

    private void btn_AgregarMatriActionPerformed() {//GEN-FIRST:event_btn_AgregarMatriActionPerformed
        // TODO add your handling code here:
           Connection con;
          
        try{
            
            con = getConnection();
            ps = con.prepareStatement("SELECT * FROM modulos where nomMod = ?");
            ps.setString(1, combo_moduloMatriculas.getSelectedItem().toString());
            rs = ps.executeQuery();
            
            if(rs.next() && txt_RunMatri.getText().matches(regexRUN)){
                String codModulo = rs.getString("codMod");
                
                con = getConnection();
                ps = con.prepareStatement("INSERT INTO matriculas(runAlum, codMod) values (?,?)");
                ps.setString(1, txt_RunMatri.getText());
                ps.setString(2, codModulo);
                int res = ps.executeUpdate();
                
             if(res > 0){
                JOptionPane.showMessageDialog(null, "Matricula añadida exitosamente...", "Añadir matricula", JOptionPane.PLAIN_MESSAGE);
                limpiarCamposImpartir();
            }else{
                JOptionPane.showMessageDialog(null, "Matricula no encontrado...", "Error al añadir matricula", JOptionPane.ERROR_MESSAGE);
                limpiarCamposImpartir();
            }
            }
            
        } catch (SQLException e){
               JOptionPane.showMessageDialog(null, e, "Error al buscar matricula...", JOptionPane.ERROR_MESSAGE);
        }  
    }//GEN-LAST:event_btn_AgregarMatriActionPerformed

    private void txt_ApellidoPaternoMatriActionPerformed() {//GEN-FIRST:event_txt_ApellidoPaternoMatriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ApellidoPaternoMatriActionPerformed

    private void txt_RunProfImpartirActionPerformed() {//GEN-FIRST:event_txt_RunProfImpartirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_RunProfImpartirActionPerformed

    private void btn_Salir_ImpartirActionPerformed() {//GEN-FIRST:event_btn_Salir_ImpartirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_Salir_ImpartirActionPerformed

    private void btn_ConsultarImpartirActionPerformed() {//GEN-FIRST:event_btn_ConsultarImpartirActionPerformed
        // TODO add your handling code here:
        Connection con = null;

        try{
            con = getConnection();
            ps = con.prepareStatement("Select * from profesores where runProf = ?");
            ps.setString(1, txt_BuscarImpartir.getText());

            rs = ps.executeQuery();

            if(rs.next() && txt_BuscarImpartir.getText().matches(regexRUN)){
                // Seteamos los datos a las cajas.

                txt_RunProfImpartir.setText(rs.getString("runProf"));
                txt_nomProfeImpartir.setText(rs.getString("nomProf"));
                txt_ApellidoPaternoImpartir.setText(rs.getString("appProf"));
                txt_ApellidoMaternoImpartir.setText(rs.getString("apmProf"));

                // Query modulos
                String[] data = null;
                con = getConnection();
                ps = con.prepareStatement("SELECT profesores.runProf, modulos.*, impartir.runProf, jornadas.nomJorn, semestres.nomSeme FROM impartir INNER JOIN profesores ON profesores.runProf = impartir.runProf INNER JOIN modulos ON modulos.codMod = impartir.codMod INNER JOIN jornadas ON modulos.codJorn = jornadas.codJorn INNER JOIN semestres on modulos.codSeme = semestres.codSeme where profesores.runProf = ?");
                ps.setString(1, txt_BuscarImpartir.getText());

                rs = ps.executeQuery();
                
                                
                while(rs.next()){
                    String modulo = rs.getString("codMod");
                    String nombre = rs.getString("nomMod");
                    String semestre = rs.getString("nomSeme");
                    String horas = rs.getString("canthrsMod");
                    String jornada = rs.getString("nomJorn");

                    data = new String[] { modulo, nombre, semestre, horas, jornada};

                    DefaultTableModel tabla = (DefaultTableModel) table_Impartir.getModel();
                    tabla.addRow(data);
                 }
                 
                if(!rs.next() && data == null){
                JOptionPane.showMessageDialog(null, "El profesor no está a cargo de ningún módulo", "Sin módulos", JOptionPane.ERROR_MESSAGE);
                DefaultTableModel tabla = (DefaultTableModel) table_Impartir.getModel();
                tabla.setRowCount(0);
                }

                
                
            }else{
                JOptionPane.showMessageDialog(null, "Profesor no encontrado...", "Error al buscar Profesor...", JOptionPane.ERROR_MESSAGE);
                limpiarCamposAlum();
            }
            
            con.close();
        } catch (SQLException e){
               JOptionPane.showMessageDialog(null, "Profesor no encontrado...", "Error al buscar Profesor...", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btn_ConsultarImpartirActionPerformed

    private void btn_EliminarImpartirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarImpartirActionPerformed
        // TODO add your handling code here:
        
          String codModulo = txt_RunProfImpartir.getText();
          
        Connection con = null;

        try {
            con = getConnection();
            ps = con.prepareStatement("DELETE FROM impartir WHERE runProf = '"+codModulo+"'");

            int res = ps.executeUpdate();

            if(res > 0){
                JOptionPane.showMessageDialog(null, "Impartición eliminada satisfactoriamente", "Impartición eliminada", JOptionPane.DEFAULT_OPTION);
                limpiarCamposImpartir();
            }else{
                JOptionPane.showMessageDialog(null, "Impartición no encontrado...", "Error al eliminar impartición", JOptionPane.ERROR_MESSAGE);
                limpiarCamposImpartir();
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        
    }//GEN-LAST:event_btn_EliminarImpartirActionPerformed

    private void btn_ModificarImpartirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarImpartirActionPerformed
        // TODO add your handling code here:
              Connection con = null;
          
        try{
            
            con = getConnection();
            ps = con.prepareStatement("SELECT * FROM modulos where nomMod = ?");
            ps.setString(1, combo_ModuloImpartir.getSelectedItem().toString());
            rs = ps.executeQuery();
            
            if(rs.next() && txt_RunProfImpartir.getText().matches(regexRUN)){
                String codModulo = rs.getString("codMod");
                
                con = getConnection();
                ps = con.prepareStatement("UPDATE impartir SET runProf = ? WHERE codMod = ?");
                ps.setString(1, txt_RunProfImpartir.getText());
                ps.setString(2, codModulo);
                int res = ps.executeUpdate();
                
             if(res > 0){
                JOptionPane.showMessageDialog(null, "Impartición añadida exitosamente...", "Añadir impartición", JOptionPane.DEFAULT_OPTION);
                limpiarCamposImpartir();
            }else{
                JOptionPane.showMessageDialog(null, "Profesor no encontrado...", "Error al añadir impartición", JOptionPane.ERROR_MESSAGE);
                limpiarCamposImpartir();
            }
            }
            
        } catch (SQLException e){
               JOptionPane.showMessageDialog(null, e, "Error al buscar Profesor...", JOptionPane.ERROR_MESSAGE);
        }  
    }//GEN-LAST:event_btn_ModificarImpartirActionPerformed

    private void btn_LimpiarImpartirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimpiarImpartirActionPerformed
        // TODO add your handling code here:
        limpiarCamposImpartir();
    }//GEN-LAST:event_btn_LimpiarImpartirActionPerformed

    private void btn_AgregarImpartirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarImpartirActionPerformed
        // TODO add your handling code here:
          Connection con = null;
          
        try{
            
            con = getConnection();
            ps = con.prepareStatement("SELECT * FROM modulos where nomMod = ?");
            ps.setString(1, combo_ModuloImpartir.getSelectedItem().toString());
            rs = ps.executeQuery();
            
            if(rs.next() && txt_RunProfImpartir.getText().matches(regexRUN)){
                String codModulo = rs.getString("codMod");
                
                con = getConnection();
                ps = con.prepareStatement("INSERT INTO impartir(runProf, codMod) values (?,?)");
                ps.setString(1, txt_RunProfImpartir.getText());
                ps.setString(2, codModulo);
                int res = ps.executeUpdate();
                
             if(res > 0){
                JOptionPane.showMessageDialog(null, "Impartición añadida exitosamente...", "Añadir impartición", JOptionPane.DEFAULT_OPTION);
                limpiarCamposImpartir();
            }else{
                JOptionPane.showMessageDialog(null, "Profesor no encontrado...", "Error al añadir impartición", JOptionPane.ERROR_MESSAGE);
                limpiarCamposImpartir();
            }
            }
            
        } catch (SQLException e){
               JOptionPane.showMessageDialog(null, e, "Error al buscar Profesor...", JOptionPane.ERROR_MESSAGE);
        }  
    }//GEN-LAST:event_btn_AgregarImpartirActionPerformed

    private void txt_ApellidoPaternoImpartirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ApellidoPaternoImpartirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ApellidoPaternoImpartirActionPerformed

    private void txt_codigoModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoModuloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigoModuloActionPerformed

    private void btn_ConsultarModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultarModuloActionPerformed
        // TODO add your handling code here:
         Connection con = null;

        try{
            con = getConnection();
            ps = con.prepareStatement("Select modulos.*, semestres.*, jornadas.* from modulos INNER JOIN jornadas ON jornadas.codJorn = modulos.codJorn INNER JOIN semestres ON semestres.codSeme = modulos.codSeme where codMod = ?");
            ps.setString(1, txt_BuscarModulo.getText());

            rs = ps.executeQuery();

            if(rs.next()){
                // Seteamos los datos a las cajas.

                txt_codigoModulo.setText(rs.getString("codMod"));
                txt_nombreModulo.setText(rs.getString("nomMod"));
                txt_cantiHorasModulo.setText(rs.getString("canthrsMod"));
               
                String modulo_combo = rs.getString("nomSeme");
                combo_SemestreModulos.setSelectedItem(modulo_combo);
                
                String jornada_combo = rs.getString("nomJorn");
                combo_JornadaModulos.setSelectedItem(jornada_combo);
               
                
            }else{
                JOptionPane.showMessageDialog(null, "Módulo no encontrado...", "Error al buscar módulo...", JOptionPane.ERROR_MESSAGE);
                limpiarCamposAlum();
            }
            con.close();
        } catch (SQLException e){
               JOptionPane.showMessageDialog(null, "Módulo no encontrado...", "Error al buscar módulo...", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_ConsultarModuloActionPerformed

    private void btn_EliminarModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarModuloActionPerformed
        // TODO add your handling code here:
        
        String codModulo = txt_codigoModulo.getText();
        Connection con = null;

        try {
            con = getConnection();
            ps = con.prepareStatement("DELETE FROM modulos WHERE codMod = '"+codModulo+"'");

            int res = ps.executeUpdate();

            if(res > 0){
                JOptionPane.showMessageDialog(null, "Módulo eliminado satisfactoriamente", "Módulo eliminado", JOptionPane.DEFAULT_OPTION);
                limpiarCamposAlum();
            }else{
                JOptionPane.showMessageDialog(null, "Módulo no encontrado...", "Error al eliminar módulo", JOptionPane.ERROR_MESSAGE);
                limpiarCamposAlum();
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_btn_EliminarModuloActionPerformed

    private void btn_ModificarModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarModuloActionPerformed
        // TODO add your handling code here:
        Connection con = null;
        
         try{
            con = getConnection();
            ps = con.prepareStatement("UPDATE modulos SET nomMod=?, canthrsMod=?, codJorn=?, codSeme=? where codMod=?"); // Entre comillas va a el codigo  INSERT INTO
            ps.setString(1,txt_nombreModulo.getText());
            ps.setString(2,txt_cantiHorasModulo.getText());

            int jornada = combo_JornadaModulos.getSelectedIndex();
            switch (jornada) {
                case 1:
                    ps.setString(3,"DIUR1");
                    break;
                case 2:
                    ps.setString(3, "VESP1");
                    break;
                default:
                    ps.setString(3,null);
                    break;
            }
            
            int semestre = combo_SemestreModulos.getSelectedIndex();
            switch (semestre) {
                case 1:
                    ps.setString(4,"SEME1");
                    break;
                case 2:
                    ps.setString(4, "SEME2");
                    break;
                case 3:
                    ps.setString(4, "SEME3");
                    break;
                case 4:
                    ps.setString(4, "SEME4");
                    break;
                default:
                    ps.setString(4,null);
                    break;
            }
            
            ps.setString(5,txt_codigoModulo.getText());
            
            int res = ps.executeUpdate();

            if(res > 0){
                JOptionPane.showMessageDialog(null, "Módulo actualizado satisfactoriamente...", "Modificar módulo", JOptionPane.DEFAULT_OPTION);
                limpiarCamposAlum();
            }else{
                JOptionPane.showMessageDialog(null, "No se ha podido modificar...", "Error al modificar módulo", JOptionPane.ERROR_MESSAGE);
                limpiarCamposAlum();
            }
        }catch(SQLException e){
            System.err.println(e);
        }
        
    }//GEN-LAST:event_btn_ModificarModuloActionPerformed

    private void btn_LimpiarModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimpiarModuloActionPerformed
        // TODO add your handling code here:
        limpiarCamposModulos();
    }//GEN-LAST:event_btn_LimpiarModuloActionPerformed

    private void btn_AgregarModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarModuloActionPerformed
        // TODO add your handling code here:
        
         Connection con = null;

        try{
            con = getConnection();
            ps = con.prepareStatement("INSERT INTO modulos (codMod, nomMod, codSeme, canthrsMod, codJorn) VALUES (?,?,?,?,?)"); // Entre comillas va a el codigo  INSERT INTO
            ps.setString(1, txt_codigoModulo.getText());
            ps.setString(2, txt_nombreModulo.getText());
            ps.setString(4,txt_cantiHorasModulo.getText());
            
            int jornada = combo_JornadaModulos.getSelectedIndex();
            switch (jornada) {
                case 1:
                    ps.setString(5,"DIUR1");
                    break;
                case 2:
                    ps.setString(5, "VESP1");
                    break;
                default:
                    ps.setString(5,null);
                    break;
            }
            
            int semestre = combo_SemestreModulos.getSelectedIndex();
            switch (semestre) {
                case 1:
                    ps.setString(3,"SEME1");
                    break;
                case 2:
                    ps.setString(3, "SEME2");
                    break;
                case 3:
                    ps.setString(3, "SEME3");
                    break;
                case 4:
                    ps.setString(3, "SEME4");
                    break;
                default:
                    ps.setString(3,null);
                    break;
            }

            int res = ps.executeUpdate();

            if(res > 0){
                JOptionPane.showMessageDialog(null, "Profesor añadido satisfactoriamente...", "Añadir profesor", JOptionPane.DEFAULT_OPTION);
                limpiarCamposAlum();
            }else{
                JOptionPane.showMessageDialog(null, "Profesor no encontrado...", "Error al eliminar Profesor", JOptionPane.ERROR_MESSAGE);
                limpiarCamposAlum();
            }
        }catch(SQLException e){
            System.err.println(e);
        }
        
    }//GEN-LAST:event_btn_AgregarModuloActionPerformed

    private void btn_Salir_ModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Salir_ModuloActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_btn_Salir_ModuloActionPerformed

    private void btn_LimpiarProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimpiarProfActionPerformed
        // TODO add your handling code here:
        limpiarCamposProfe();
    }//GEN-LAST:event_btn_LimpiarProfActionPerformed

    private void txt_ApellidoPaternoProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ApellidoPaternoProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ApellidoPaternoProfActionPerformed

    private void txt_RunProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RunProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_RunProfActionPerformed

    private void btn_Salir_ProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Salir_ProfActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_Salir_ProfActionPerformed

    private void btn_ConsultarProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultarProfesoresActionPerformed
        // TODO add your handling code here:
        
         Connection con = null;
        String codigoCurso = "";

        try{
            con = getConnection();
            ps = con.prepareStatement("Select * from profesores where runProf = ?");
            ps.setString(1, txt_BuscarProfe.getText());

            rs = ps.executeQuery();

            if(rs.next() && txt_BuscarProfe.getText().matches(regexRUN)){
                // Seteamos los datos a las cajas.

                txt_RunProf.setText(rs.getString("runProf"));
                txt_nomProfe.setText(rs.getString("nomProf"));
                txt_ApellidoPaternoProf.setText(rs.getString("appProf"));
                txt_ApellidoMaternoProf.setText(rs.getString("apmProf"));
                txt_FechaNacProf.setText(rs.getString("fecnacProf"));
                txt_DireccionProf.setText(rs.getString("dirProf"));
                txt_TelefonoProf.setText(rs.getString("telProf"));

                // Query modulos
                String[] data = null;
                con = getConnection();
                ps = con.prepareStatement("SELECT profesores.runProf, modulos.*, impartir.runProf, jornadas.nomJorn, semestres.nomSeme FROM impartir INNER JOIN profesores ON profesores.runProf = impartir.runProf INNER JOIN modulos ON modulos.codMod = impartir.codMod INNER JOIN jornadas ON modulos.codJorn = jornadas.codJorn INNER JOIN semestres on modulos.codSeme = semestres.codSeme where profesores.runProf = ?");
                ps.setString(1, txt_BuscarProfe.getText());

                rs = ps.executeQuery();
                
                                
                while(rs.next()){
                    String modulo = rs.getString("codMod");
                    String nombre = rs.getString("nomMod");
                    String semestre = rs.getString("nomSeme");
                    String horas = rs.getString("canthrsMod");
                    String jornada = rs.getString("nomJorn");

                    data = new String[] { modulo, nombre, semestre, horas, jornada};

                    DefaultTableModel tabla = (DefaultTableModel) table_Profesores.getModel();
                    tabla.addRow(data);
                 }
                 
                if(!rs.next() && data == null){
                JOptionPane.showMessageDialog(null, "El profesor no está a cargo de ningún módulo", "Sin módulos", JOptionPane.ERROR_MESSAGE);
                DefaultTableModel tabla = (DefaultTableModel) table_Profesores.getModel();
                tabla.setRowCount(0);
                }

                
                
            }else{
                JOptionPane.showMessageDialog(null, "Profesor no encontrado...", "Error al buscar Profesor...", JOptionPane.ERROR_MESSAGE);
                limpiarCamposAlum();
            }
            
            con.close();
        } catch (SQLException e){
               JOptionPane.showMessageDialog(null, "Profesor no encontrado...", "Error al buscar Profesor...", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btn_ConsultarProfesoresActionPerformed

    private void btn_EliminarProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarProfActionPerformed
        // TODO add your handling code here:
        
          String runProfe = txt_RunProf.getText();
        Connection con = null;

        try {
            con = getConnection();
            ps = con.prepareStatement("DELETE FROM profesores WHERE runProf = '"+runProfe+"'");

            int res = ps.executeUpdate();

            if(res > 0){
                JOptionPane.showMessageDialog(null, "Profesor eliminado satisfactoriamente", "Profesor eliminado", JOptionPane.DEFAULT_OPTION);
                limpiarCamposAlum();
            }else{
                JOptionPane.showMessageDialog(null, "Profesor no encontrado...", "Error al eliminar profesor", JOptionPane.ERROR_MESSAGE);
                limpiarCamposAlum();
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        
    }//GEN-LAST:event_btn_EliminarProfActionPerformed

    private void btn_ModificarProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarProfActionPerformed
        // TODO add your handling code here:
        Connection con = null;
        
         try{
            if(txt_RunProf.getText().matches(regexRUN) && txt_nomProfe.getText().matches(regexNombreApellido) && txt_ApellidoPaternoProf.getText().matches(regexNombreApellido) && txt_ApellidoMaternoProf.getText().matches(regexNombreApellido) && txt_FechaNacProf.getText().matches(regexFecha)){
            con = getConnection();
            ps = con.prepareStatement("UPDATE profesores SET nomProf=?, appProf=?, apmProf=?, dirProf=?, telProf=?, fecnacProf=? where runProf=?"); // Entre comillas va a el codigo  INSERT INTO
            ps.setString(1, txt_nomProfe.getText());
            ps.setString(2, txt_ApellidoPaternoProf.getText());
            ps.setString(3, txt_ApellidoMaternoProf.getText());
            ps.setString(4,txt_DireccionAlum.getText());
            ps.setString(5, txt_TelefonoProf.getText());
            ps.setString(6, txt_FechaNacProf.getText());
            ps.setString(7,txt_RunProf.getText());

            int res = ps.executeUpdate();

            if(res > 0){
                JOptionPane.showMessageDialog(null, "Profesor actualizado satisfactoriamente...", "Modificar profesor", JOptionPane.DEFAULT_OPTION);
                limpiarCamposProfe();
            }else{
                JOptionPane.showMessageDialog(null, "No se ha podido modificar...", "Error al modificar profesor", JOptionPane.ERROR_MESSAGE);
                limpiarCamposProfe();
            }
            }
        }catch(SQLException e){
            System.err.println(e);
        }
        
        
    }//GEN-LAST:event_btn_ModificarProfActionPerformed

    private void btn_AgregarProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarProfActionPerformed
        // TODO add your handling code here:
        
         Connection con = null;

        try{
            if(txt_RunProf.getText().matches(regexRUN) && txt_nomProfe.getText().matches(regexNombreApellido) && txt_ApellidoPaternoProf.getText().matches(regexNombreApellido) && txt_ApellidoMaternoProf.getText().matches(regexNombreApellido) && txt_FechaNacProf.getText().matches(regexFecha)){
            con = getConnection();
            ps = con.prepareStatement("INSERT INTO profesores (runProf, nomProf, appProf, apmProf, dirProf, telProf, fecnacProf) VALUES (?,?,?,?,?,?,?)"); // Entre comillas va a el codigo  INSERT INTO
            ps.setString(1, txt_RunProf.getText());
            ps.setString(2, txt_nomProfe.getText());
            ps.setString(3, txt_ApellidoPaternoProf.getText());
            ps.setString(4, txt_ApellidoMaternoProf.getText());
            ps.setString(5,txt_DireccionProf.getText());
            ps.setString(6,txt_TelefonoProf.getText());
            ps.setString(7,txt_FechaNacProf.getText());

            int res = ps.executeUpdate();

            if(res > 0){
                JOptionPane.showMessageDialog(null, "Profesor añadido satisfactoriamente...", "Añadir profesor", JOptionPane.DEFAULT_OPTION);
                limpiarCamposProfe();
            }else{
                JOptionPane.showMessageDialog(null, "Profesor no encontrado...", "Error al eliminar Profesor", JOptionPane.ERROR_MESSAGE);
                limpiarCamposProfe();
            }
        }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Verifique los datos que desea ingresar...", "Error al ingresar Profesor", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_AgregarProfActionPerformed

    private void combo_CursoAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_CursoAlumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_CursoAlumActionPerformed

    private void btn_LimpiarAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimpiarAlumActionPerformed
        // TODO add your handling code here:
        limpiarCamposAlum();
    }//GEN-LAST:event_btn_LimpiarAlumActionPerformed

    private void btn_EliminarAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarAlumActionPerformed

        String runAlum = txt_BuscarAlum.getText();
        Connection con = null;

        try {
            con = getConnection();
            ps = con.prepareStatement("DELETE FROM alumnos WHERE runAlum = '"+runAlum+"'");

            int res = ps.executeUpdate();

            if(res > 0){
                JOptionPane.showMessageDialog(null, "Alumno eliminado satisfactoriamente", "Alumno eliminado", JOptionPane.DEFAULT_OPTION);
                limpiarCamposAlum();
            }else{
                JOptionPane.showMessageDialog(null, "Alumno no encontrado...", "Error al eliminar Alumno", JOptionPane.ERROR_MESSAGE);
                limpiarCamposAlum();
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_btn_EliminarAlumActionPerformed

    private void btn_ModificarAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarAlumActionPerformed
        // TODO add your handling code here:
        // mOdificar

        Connection con = null;

        try{
            con = getConnection();
            ps = con.prepareStatement("SELECT * FROM cursos where nomCurso = ?");
            ps.setString(1, combo_CursoAlum.getSelectedItem().toString());
            rs = ps.executeQuery();

            if(rs.next() && txt_RunAlum.getText().matches(regexRUN) && txt_NombreAlum.getText().matches(regexNombreApellido) && txt_AppAlum.getText().matches(regexNombreApellido) && txt_ApmAlum.getText().matches(regexNombreApellido) && txt_FechNacAlum.getText().matches(regexFecha)){
            
            String curso_Alum = rs.getString("codCurso");

            con = getConnection();
            ps = con.prepareStatement("UPDATE alumnos SET nroexpeAlum=?, nomAlum=?, appAlum=?, apmAlum=?, fecnacAlum=?, codCurso=?, runAlumD=?, dirAlum=? where runAlum=?"); // Entre comillas va a el codigo  INSERT INTO
            ps.setString(1, txt_ExpeAlum.getText());
            ps.setString(2, txt_NombreAlum.getText());
            ps.setString(3, txt_AppAlum.getText());
            ps.setString(4,txt_ApmAlum.getText());
            ps.setString(5, txt_FechNacAlum.getText());
            ps.setString(6, curso_Alum);
            ps.setString(7, "");
            ps.setString(8, txt_DireccionAlum.getText());
            ps.setString(9, txt_RunAlum.getText());

            int res = ps.executeUpdate();

            if(res > 0){
                JOptionPane.showMessageDialog(null, "Alumno actualizado satisfactoriamente...", "Modificar alumno", JOptionPane.DEFAULT_OPTION);
                limpiarCamposAlum();
            }else{
                JOptionPane.showMessageDialog(null, "No se ha podido modificar...", "Error al modificar alumno", JOptionPane.ERROR_MESSAGE);
                limpiarCamposAlum();
            }
            }
        }catch(SQLException e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btn_ModificarAlumActionPerformed

    private void btn_AgregarAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarAlumActionPerformed
        // TODO add your handling code here:
        // Agregar

        Connection con = null;

        try{
            con = getConnection();
            ps = con.prepareStatement("SELECT * FROM cursos where nomCurso = ?");
            ps.setString(1, combo_CursoAlum.getSelectedItem().toString());
            rs = ps.executeQuery();

            if(rs.next() && txt_RunAlum.getText().matches(regexRUN) && txt_NombreAlum.getText().matches(regexNombreApellido) && txt_AppAlum.getText().matches(regexNombreApellido) && txt_ApmAlum.getText().matches(regexNombreApellido) && txt_FechNacAlum.getText().matches(regexFecha)){
            
            String curso_Alum = rs.getString("codCurso");
                
            con = getConnection();
            ps = con.prepareStatement("INSERT INTO alumnos (runAlum, nroexpeAlum, nomAlum, appAlum, apmAlum, fecnacAlum, codCurso, runAlumD, dirAlum) VALUES (?,?,?,?,?,?,?,?,?)"); // Entre comillas va a el codigo  INSERT INTO
            ps.setString(1, txt_RunAlum.getText());
            ps.setString(2, txt_ExpeAlum.getText());
            ps.setString(3, txt_NombreAlum.getText());
            ps.setString(4, txt_AppAlum.getText());
            ps.setString(5,txt_ApmAlum.getText());
            ps.setString(6, txt_FechNacAlum.getText());
            ps.setString(7, curso_Alum);
            ps.setString(8, "");
            ps.setString(9, txt_DireccionAlum.getText());

            int res = ps.executeUpdate();

            if(res > 0){
                System.out.println("Guardado");
                JOptionPane.showMessageDialog(null, "Alumno añadido satisfactoriamente...", "Añadir alumno", JOptionPane.DEFAULT_OPTION);
                limpiarCamposAlum();
            }else{
                JOptionPane.showMessageDialog(null, "Alumno no encontrado...", "Error al eliminar Alumno", JOptionPane.ERROR_MESSAGE);
                limpiarCamposAlum();
            }
            }
        }catch(SQLException e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btn_AgregarAlumActionPerformed

    private void txt_NombreAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreAlumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombreAlumActionPerformed

    private void txt_RunAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RunAlumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_RunAlumActionPerformed

    private void btn_Salir_AlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Salir_AlumnosActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_Salir_AlumnosActionPerformed

    private void btn_Consultar_AlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Consultar_AlumnosActionPerformed
        // TODO add your handling code here:
        Connection con = null;

        try{
            con = getConnection();
            ps = con.prepareStatement("SELECT alumnos.*, cursos.nomCurso from alumnos INNER join cursos ON alumnos.codCurso = cursos.codCurso WHERE runAlum = ?");
            ps.setString(1, txt_BuscarAlum.getText());

            rs = ps.executeQuery();

            if(rs.next() && txt_BuscarAlum.getText().matches(regexRUN)){
                // Seteamos los datos a las cajas.

                txt_RunAlum.setText(rs.getString("runAlum"));
                txt_ExpeAlum.setText(rs.getString("nroexpeAlum"));
                txt_NombreAlum.setText(rs.getString("nomAlum"));
                txt_AppAlum.setText(rs.getString("appAlum"));
                txt_ApmAlum.setText(rs.getString("apmAlum"));
                txt_FechNacAlum.setText(rs.getString("fecnacAlum"));
                txt_DireccionAlum.setText(rs.getString("dirAlum"));

                String curso_Alum = rs.getString("nomCurso");
                combo_CursoAlum.setSelectedItem(curso_Alum);

                // Query modulos
                String[] data = null;
                con = getConnection();
                ps = con.prepareStatement("SELECT alumnos.runAlum, modulos.*, matriculas.runAlum, jornadas.nomJorn, semestres.nomSeme FROM matriculas INNER JOIN alumnos ON alumnos.runAlum = matriculas.runAlum INNER JOIN modulos ON matriculas.codMod = modulos.codMod INNER JOIN jornadas ON modulos.codJorn = jornadas.codJorn INNER JOIN semestres on modulos.codSeme = semestres.codSeme where alumnos.runAlum = ?");
                ps.setString(1, txt_BuscarAlum.getText());

                rs = ps.executeQuery();
                
                                
                while(rs.next()){
                    String modulo = rs.getString("codMod");
                    String nombre = rs.getString("nomMod");
                    String semestre = rs.getString("nomSeme");
                    String horas = rs.getString("canthrsMod");
                    String jornada = rs.getString("nomJorn");

                    data = new String[] { modulo, nombre, semestre, horas, jornada};

                    DefaultTableModel tabla = (DefaultTableModel) table_Alumnos.getModel();
                    tabla.addRow(data);
                 }
                 
                if(!rs.next() && data == null){
                JOptionPane.showMessageDialog(null, "El alumno no está inscrito en ningún módulo", "Sin módulos", JOptionPane.ERROR_MESSAGE);
                DefaultTableModel tabla = (DefaultTableModel) table_Alumnos.getModel();
                tabla.setRowCount(0);
                }

                
                
            }else{
                JOptionPane.showMessageDialog(null, "Alumno no encontrado...", "Error al buscar Alumno...", JOptionPane.ERROR_MESSAGE);
                limpiarCamposAlum();
            }
            con.close();
        } catch (SQLException e){
               JOptionPane.showMessageDialog(null, "Alumno no encontrado...", "Error al buscar Alumno...", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_Consultar_AlumnosActionPerformed

    private void combo_todosModulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_todosModulosActionPerformed
        // TODO add your handling code here:
        Connection con = null;
        
        Object selectedCombo = combo_todosModulos.getSelectedItem();
        
        
         try{
            con = getConnection();
            ps = con.prepareStatement("Select modulos.*, semestres.*, jornadas.* from modulos INNER JOIN jornadas ON jornadas.codJorn = modulos.codJorn INNER JOIN semestres ON semestres.codSeme = modulos.codSeme where nomMod = '"+selectedCombo+"'");

            rs = ps.executeQuery();

            if(rs.next()){
                // Seteamos los datos a las cajas.

                txt_codigoModulo.setText(rs.getString("codMod"));
                txt_nombreModulo.setText(rs.getString("nomMod"));
                txt_cantiHorasModulo.setText(rs.getString("canthrsMod"));
               
                String modulo_combo = rs.getString("nomSeme");
                combo_SemestreModulos.setSelectedItem(modulo_combo);
                
                String jornada_combo = rs.getString("nomJorn");
                combo_JornadaModulos.setSelectedItem(jornada_combo);
               
                
            }else{
                JOptionPane.showMessageDialog(null, "Módulo no encontrado...", "Error al buscar módulo...", JOptionPane.ERROR_MESSAGE);
                limpiarCamposAlum();
            }
            con.close();
        } catch (SQLException e){
               JOptionPane.showMessageDialog(null, "Módulo no encontrado...", "Error al buscar módulo...", JOptionPane.ERROR_MESSAGE);
        }
         
    }//GEN-LAST:event_combo_todosModulosActionPerformed

    private void combo_todosModulosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_todosModulosMouseClicked
        // TODO add your handling code he
    }//GEN-LAST:event_combo_todosModulosMouseClicked

    private void combo_todosModulosComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_combo_todosModulosComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_todosModulosComponentShown

    private void combo_todosProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_todosProfesoresActionPerformed
        // TODO add your handling code here:
        
         Connection con = null;
        Object selectedCombo = combo_todosProfesores.getSelectedItem();
        try{
            con = getConnection();
            ps = con.prepareStatement("Select * from profesores where nomProf = '"+selectedCombo+"'");

            rs = ps.executeQuery();

            if(rs.next()){
                // Seteamos los datos a las cajas.

                txt_RunProf.setText(rs.getString("runProf"));
                txt_nomProfe.setText(rs.getString("nomProf"));
                txt_ApellidoPaternoProf.setText(rs.getString("appProf"));
                txt_ApellidoMaternoProf.setText(rs.getString("apmProf"));
                txt_FechaNacProf.setText(rs.getString("fecnacProf"));
                txt_DireccionProf.setText(rs.getString("dirProf"));
                txt_TelefonoProf.setText(rs.getString("telProf"));

                // Query modulos
                String[] data = null;
                con = getConnection();
                ps = con.prepareStatement("SELECT profesores.runProf, modulos.*, impartir.runProf, jornadas.nomJorn, semestres.nomSeme FROM impartir INNER JOIN profesores ON profesores.runProf = impartir.runProf INNER JOIN modulos ON modulos.codMod = impartir.codMod INNER JOIN jornadas ON modulos.codJorn = jornadas.codJorn INNER JOIN semestres on modulos.codSeme = semestres.codSeme where profesores.nomProf = '"+selectedCombo+"'");

                rs = ps.executeQuery();
                
                DefaultTableModel tabla1 = (DefaultTableModel) table_Profesores.getModel();
                tabla1.setRowCount(0);
                
                
                while(rs.next()){
                    String modulo = rs.getString("codMod");
                    String nombre = rs.getString("nomMod");
                    String semestre = rs.getString("nomSeme");
                    String horas = rs.getString("canthrsMod");
                    String jornada = rs.getString("nomJorn");

                    data = new String[] { modulo, nombre, semestre, horas, jornada};

                    DefaultTableModel tabla = (DefaultTableModel) table_Profesores.getModel();
                    tabla.addRow(data);
                 }
                 
                if(!rs.next() && data == null){
                JOptionPane.showMessageDialog(null, "El profesor no está a cargo de ningún módulo", "Sin módulos", JOptionPane.ERROR_MESSAGE);
                DefaultTableModel tabla = (DefaultTableModel) table_Profesores.getModel();
                tabla.setRowCount(0);
                }

                
                
            }else{
                JOptionPane.showMessageDialog(null, "Profesor no encontrado...", "Error al buscar Profesor...", JOptionPane.ERROR_MESSAGE);
                limpiarCamposAlum();
            }
            
            con.close();
        } catch (SQLException e){
               JOptionPane.showMessageDialog(null, "Profesor no encontrado...", "Error al buscar Profesor...", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_combo_todosProfesoresActionPerformed

    private void combo_todosAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_todosAlumnosActionPerformed
        // TODO add your handling code here:
        Connection con = null;

        Object selectedCombo = combo_todosAlumnos.getSelectedItem();
        
        try{
            con = getConnection();
            ps = con.prepareStatement("SELECT alumnos.*, cursos.nomCurso from alumnos INNER join cursos ON alumnos.codCurso = cursos.codCurso WHERE nomAlum = '"+selectedCombo+"'");

            rs = ps.executeQuery();

            if(rs.next()){
                // Seteamos los datos a las cajas.

                txt_RunAlum.setText(rs.getString("runAlum"));
                txt_ExpeAlum.setText(rs.getString("nroexpeAlum"));
                txt_NombreAlum.setText(rs.getString("nomAlum"));
                txt_AppAlum.setText(rs.getString("appAlum"));
                txt_ApmAlum.setText(rs.getString("apmAlum"));
                txt_FechNacAlum.setText(rs.getString("fecnacAlum"));
                txt_DireccionAlum.setText(rs.getString("dirAlum"));

                String curso_Alum = rs.getString("nomCurso");
                combo_CursoAlum.setSelectedItem(curso_Alum);

                // Query modulos
                String[] data = null;
                con = getConnection();
                ps = con.prepareStatement("SELECT alumnos.*, modulos.*, matriculas.runAlum, jornadas.nomJorn, semestres.nomSeme FROM matriculas INNER JOIN alumnos ON alumnos.runAlum = matriculas.runAlum INNER JOIN modulos ON matriculas.codMod = modulos.codMod INNER JOIN jornadas ON modulos.codJorn = jornadas.codJorn INNER JOIN semestres on modulos.codSeme = semestres.codSeme where alumnos.nomAlum = '"+selectedCombo+"'");

                rs = ps.executeQuery();
                
                DefaultTableModel tabla1 = (DefaultTableModel) table_Alumnos.getModel();
                tabla1.setRowCount(0);
                
                
                
                while(rs.next()){
                    String modulo = rs.getString("codMod");
                    String nombre = rs.getString("nomMod");
                    String semestre = rs.getString("nomSeme");
                    String horas = rs.getString("canthrsMod");
                    String jornada = rs.getString("nomJorn");

                    data = new String[] { modulo, nombre, semestre, horas, jornada};

                    DefaultTableModel tabla = (DefaultTableModel) table_Alumnos.getModel();
                    tabla.addRow(data);
                 }
                 
                if(!rs.next() && data == null){
                JOptionPane.showMessageDialog(null, "El alumno no está inscrito en algún módulo", "Sin módulos", JOptionPane.ERROR_MESSAGE);
                DefaultTableModel tabla = (DefaultTableModel) table_Alumnos.getModel();
                tabla.setRowCount(0);
                }

                
                
            }else{
                JOptionPane.showMessageDialog(null, "Alumno no encontrado...", "Error al buscar Alumno...", JOptionPane.ERROR_MESSAGE);
                limpiarCamposAlum();
            }
            con.close();
        } catch (SQLException e){
               JOptionPane.showMessageDialog(null, "Alumno no encontrado...", "Error al buscar Alumno...", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_combo_todosAlumnosActionPerformed

    private void combo_todosProfesores1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_todosProfesores1ActionPerformed
        // TODO add your handling code here:
        
        Connection con = null;

        Object selectedCombo = combo_todosProfesores1.getSelectedItem();
        
        try{
            con = getConnection();
            ps = con.prepareStatement("Select * from profesores where nomProf = '"+selectedCombo+"'");

            rs = ps.executeQuery();

            if(rs.next()){
                // Seteamos los datos a las cajas.

                txt_RunProfImpartir.setText(rs.getString("runProf"));
                txt_nomProfeImpartir.setText(rs.getString("nomProf"));
                txt_ApellidoPaternoImpartir.setText(rs.getString("appProf"));
                txt_ApellidoMaternoImpartir.setText(rs.getString("apmProf"));

                // Query modulos
                String[] data = null;
                con = getConnection();
                ps = con.prepareStatement("SELECT profesores.*, modulos.*, impartir.runProf, jornadas.nomJorn, semestres.nomSeme FROM impartir INNER JOIN profesores ON profesores.runProf = impartir.runProf INNER JOIN modulos ON modulos.codMod = impartir.codMod INNER JOIN jornadas ON modulos.codJorn = jornadas.codJorn INNER JOIN semestres on modulos.codSeme = semestres.codSeme where profesores.nomProf = '"+selectedCombo+"'");

                rs = ps.executeQuery();
                
                DefaultTableModel tabla1 = (DefaultTableModel) table_Impartir.getModel();
                tabla1.setRowCount(0);
                
                                
                while(rs.next()){
                    String modulo = rs.getString("codMod");
                    String nombre = rs.getString("nomMod");
                    String semestre = rs.getString("nomSeme");
                    String horas = rs.getString("canthrsMod");
                    String jornada = rs.getString("nomJorn");

                    data = new String[] { modulo, nombre, semestre, horas, jornada};

                    DefaultTableModel tabla = (DefaultTableModel) table_Impartir.getModel();
                    tabla.addRow(data);
                 }
                 
                if(!rs.next() && data == null){
                JOptionPane.showMessageDialog(null, "El profesor no está a cargo de ningún módulo", "Sin módulos", JOptionPane.ERROR_MESSAGE);
                DefaultTableModel tabla = (DefaultTableModel) table_Profesores.getModel();
                tabla.setRowCount(0);
                }

                
                
            }else{
                JOptionPane.showMessageDialog(null, "Profesor no encontrado...", "Error al buscar Profesor...", JOptionPane.ERROR_MESSAGE);
                limpiarCamposImpartir();
            }
            
            con.close();
        } catch (SQLException e){
               JOptionPane.showMessageDialog(null, "Profesor no encontrado...", "Error al buscar Profesor...", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_combo_todosProfesores1ActionPerformed

    private void combo_todosAlumnosMatriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_todosAlumnosMatriActionPerformed
        // TODO add your handling code here:
        
        Connection con = null;

        String selectedCombo = combo_todosAlumnosMatri.getSelectedItem().toString();
        
        try{
            con = getConnection();
            ps = con.prepareStatement("SELECT alumnos.*, cursos.nomCurso from alumnos INNER join cursos ON alumnos.codCurso = cursos.codCurso WHERE nomAlum = '"+selectedCombo+"'");

            rs = ps.executeQuery();

            if(rs.next()){
                // Seteamos los datos a las cajas.

                txt_RunMatri.setText(rs.getString("runAlum"));
                txt_nomMatri.setText(rs.getString("nomAlum"));
                txt_ApellidoPaternoMatri.setText(rs.getString("appAlum"));
                txt_ApellidoMaternoMatri.setText(rs.getString("apmAlum"));


                // Query modulos
                String[] data = null;
                con = getConnection();
                ps = con.prepareStatement("SELECT alumnos.*, modulos.*, matriculas.runAlum, jornadas.nomJorn, semestres.nomSeme FROM matriculas INNER JOIN alumnos ON alumnos.runAlum = matriculas.runAlum INNER JOIN modulos ON matriculas.codMod = modulos.codMod INNER JOIN jornadas ON modulos.codJorn = jornadas.codJorn INNER JOIN semestres on modulos.codSeme = semestres.codSeme where alumnos.nomAlum = '"+selectedCombo+"'");

                rs = ps.executeQuery();
                
                DefaultTableModel tabla1 = (DefaultTableModel) table_Matriculas.getModel();
                tabla1.setRowCount(0);
                    
                    
                while(rs.next()){
                    String modulo = rs.getString("codMod");
                    String nombre = rs.getString("nomMod");
                    String semestre = rs.getString("nomSeme");
                    String horas = rs.getString("canthrsMod");
                    String jornada = rs.getString("nomJorn");

                    data = new String[] { modulo, nombre, semestre, horas, jornada};

                    DefaultTableModel tabla = (DefaultTableModel) table_Matriculas.getModel();
                    tabla.addRow(data);
                 }
                 
                if(!rs.next() && data == null){
                JOptionPane.showMessageDialog(null, "El alumno no está inscrito en algún módulo", "Sin módulos", JOptionPane.ERROR_MESSAGE);
                DefaultTableModel tabla = (DefaultTableModel) table_Matriculas.getModel();
                tabla.setRowCount(0);
                }

                
                
            }else{
                JOptionPane.showMessageDialog(null, "Alumno no encontrado...", "Error al buscar Alumno...", JOptionPane.ERROR_MESSAGE);
                limpiarCamposAlum();
            }
            con.close();
        } catch (SQLException e){
               JOptionPane.showMessageDialog(null, "Alumno no encontrado...", "Error al buscar Alumno...", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_combo_todosAlumnosMatriActionPerformed

    private void txt_BuscarProfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BuscarProfeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BuscarProfeActionPerformed

    private void combo_moduloMatriculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_moduloMatriculasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_moduloMatriculasActionPerformed

    private void combo_todosAlumnostabCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_todosAlumnostabCursosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_todosAlumnostabCursosActionPerformed

    private void combo_todosCursosTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_todosCursosTabActionPerformed
        // TODO add your handling code here:
        Connection con = null;

        String selectedCombo = combo_todosCursosTab.getSelectedItem().toString();

        try{
            con = getConnection();
            ps = con.prepareStatement("SELECT cursos.* FROM cursos WHERE nomCurso = '"+selectedCombo+"'");

            rs = ps.executeQuery();

            if(rs.next()){
                // Seteamos los datos a las cajas.

                txt_codCursoTabCursos.setText(rs.getString("codCurso"));
                txt_nomCursoTabCursos.setText(rs.getString("nomCurso"));

                String[] data = null;
                con = getConnection();
                ps = con.prepareStatement("SELECT alumnos.*, cursos.* FROM alumnos INNER JOIN cursos on alumnos.codCurso = cursos.codCurso WHERE nomCurso = '"+selectedCombo+"'");

                rs = ps.executeQuery();

                
                DefaultTableModel tabla = (DefaultTableModel) table_Cursos.getModel();
                tabla.setRowCount(0);
                    
                while(rs.next()){
                    String runAlum = rs.getString("runAlum");
                    String nombreAlum = rs.getString("nomAlum");
                    String apellidoP = rs.getString("appAlum");
                    String apellidoM = rs.getString("apmAlum");


                    
                    data = new String[] { runAlum, nombreAlum, apellidoP, apellidoM};

                    DefaultTableModel tabla1 = (DefaultTableModel) table_Cursos.getModel();
                    tabla1.addRow(data);
                }
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error al buscar curso...", "Error al buscar curso...", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_combo_todosCursosTabActionPerformed

    private void btn_LimpiarCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimpiarCursosActionPerformed
        // TODO add your handling code here:
        limpiarCamposCursos();
    }//GEN-LAST:event_btn_LimpiarCursosActionPerformed

    private void btn_Salir_CursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Salir_CursosActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_Salir_CursosActionPerformed

    private void btn_AgregarCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarCursosActionPerformed
        // TODO add your handling code here:

        Connection con = null;

        try{
            con = getConnection();
            ps = con.prepareStatement("SELECT * FROM cursos where nomCurso = ?");
            ps.setString(1, combo_todosCursosTab.getSelectedItem().toString());
            rs = ps.executeQuery();

            if(rs.next()){
                String codCurso = rs.getString("codCurso");

                con = getConnection();
                ps = con.prepareStatement("UPDATE alumnos SET codCurso = ? WHERE runAlum = ?");
                ps.setString(1, codCurso);
                ps.setString(2, combo_todosAlumnostabCursos.getSelectedItem().toString());
                int res = ps.executeUpdate();

                if(res > 0){
                    JOptionPane.showMessageDialog(null, "Curso añadido exitosamente...", "Curso matricula", JOptionPane.DEFAULT_OPTION);
                    limpiarCamposImpartir();
                }else{
                    JOptionPane.showMessageDialog(null, "Curso no encontrado...", "Error al añadir curso", JOptionPane.ERROR_MESSAGE);
                    limpiarCamposImpartir();
                }
            }

        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e, "Error al buscar curso...", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_AgregarCursosActionPerformed

    private void btn_EliminarCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarCursosActionPerformed
        // TODO add your handling code here:
        Connection con = null;

        try {
            con = getConnection();
            ps = con.prepareStatement("DELETE FROM alumnos WHERE runAlum = ?");
            ps.setString(1,combo_todosAlumnostabCursos.getSelectedItem().toString());
            
            
            int res = ps.executeUpdate();

            if(res > 0){
                JOptionPane.showMessageDialog(null, "Curso eliminado satisfactoriamente", "Curso eliminado", JOptionPane.DEFAULT_OPTION);
                limpiarCamposCursos();
            }else{
                JOptionPane.showMessageDialog(null, "Curso no encontrado...", "Error al eliminar Curso", JOptionPane.ERROR_MESSAGE);
                limpiarCamposCursos();
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_btn_EliminarCursosActionPerformed

    private void btn_ModificarCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarCursosActionPerformed
        // TODO add your handling code here:
        
        Connection con = null;

        try{

            con = getConnection();
            ps = con.prepareStatement("SELECT * FROM cursos where nomCurso = ?");
            ps.setString(1, combo_todosCursosTab.getSelectedItem().toString());
            rs = ps.executeQuery();

            if(rs.next()){
                String codCurso = rs.getString("codCurso");

                con = getConnection();
                ps = con.prepareStatement("UPDATE alumnos SET codCurso = ? WHERE nomAlum = ?");
                ps.setString(1, codCurso);
                ps.setString(2, combo_todosAlumnostabCursos.getSelectedItem().toString());
                int res = ps.executeUpdate();

                if(res > 0){
                    JOptionPane.showMessageDialog(null, "Curso modificado exitosamente...", "Modificar curso", JOptionPane.DEFAULT_OPTION);
                    limpiarCamposImpartir();
                }else{
                    JOptionPane.showMessageDialog(null, "Curso no encontrado...", "Error al modificar curso", JOptionPane.ERROR_MESSAGE);
                    limpiarCamposImpartir();
                }
            }

        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e, "Error al buscar curso...", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btn_ModificarCursosActionPerformed

    private void txt_BuscarAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BuscarAlumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BuscarAlumActionPerformed

    public static void cargarModulos(){
        Connection con = null;
        try{
            con = getConnection();
            ps = con.prepareStatement("SELECT modulos.nomMod FROM modulos");
            rs = ps.executeQuery();

            while(rs.next()){
            combo_todosModulos.addItem(rs.getString("nomMod"));
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al cargar Base de Datos...", "Error al cargar base de datos...", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void cargarModulosMatriculas(){
         Connection con = null;
        try{
            con = getConnection();
            ps = con.prepareStatement("SELECT modulos.nomMod FROM modulos");
            rs = ps.executeQuery();

            while(rs.next()){
            combo_moduloMatriculas.addItem(rs.getString("nomMod"));
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al cargar Base de Datos...", "Error al cargar base de datos...", JOptionPane.ERROR_MESSAGE);
        }


    }
    
    public static void cargarModulosImpartir(){
         Connection con = null;
        try{
            con = getConnection();
            ps = con.prepareStatement("SELECT modulos.nomMod FROM modulos");
            rs = ps.executeQuery();

            while(rs.next()){
            combo_ModuloImpartir.addItem(rs.getString("nomMod"));
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al cargar Base de Datos...", "Error al cargar base de datos...", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    public static void cargarAlumnos(){
                Connection con = null;
        try{
            con = getConnection();
            ps = con.prepareStatement("SELECT alumnos.* FROM alumnos");
            rs = ps.executeQuery();

            while(rs.next()){
            combo_todosAlumnos.addItem(rs.getString("nomAlum"));
            combo_todosAlumnosMatri.addItem(rs.getString("nomAlum"));
            combo_todosAlumnostabCursos.addItem(rs.getString("runAlum"));
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al cargar Base de Datos...", "Error al cargar base de datos...", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void cargasProfesores(){
        Connection con = null;
        try{
            con = getConnection();
            ps = con.prepareStatement("SELECT profesores.nomProf FROM profesores");
            rs = ps.executeQuery();

            while(rs.next()){
            combo_todosProfesores.addItem(rs.getString("nomProf"));
            combo_todosProfesores1.addItem(rs.getString("nomProf"));
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al cargar Base de Datos...", "Error al cargar base de datos...", JOptionPane.ERROR_MESSAGE);
        }
    }
       
        public static void cargarCursos(){
        Connection con;
        try{
            con = getConnection();
            ps = con.prepareStatement("SELECT nomCurso FROM cursos");
            rs = ps.executeQuery();

            while(rs.next()){
                combo_todosCursosTab.addItem(rs.getString("nomCurso"));
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al cargar Base de Datos...", "Error al cargar base de datos...", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new JFrame_main().setVisible(true));
        
        cargarModulos();
        cargarAlumnos();
        cargasProfesores();
        cargarModulosImpartir();
        cargarModulosMatriculas();
        cargarCursos();
    }

    private javax.swing.JButton btn_LimpiarAlum;
    private javax.swing.JButton btn_LimpiarCursos;
    private javax.swing.JButton btn_LimpiarImpartir;
    private javax.swing.JButton btn_LimpiarMatri;
    private javax.swing.JButton btn_LimpiarModulo;
    private javax.swing.JButton btn_LimpiarProf;
    private javax.swing.JButton btn_ModificarAlum;
    private javax.swing.JButton btn_ModificarCursos;
    private javax.swing.JButton btn_ModificarImpartir;
    private javax.swing.JButton btn_ModificarMatri;
    private javax.swing.JButton btn_ModificarModulo;
    private javax.swing.JButton btn_ModificarProf;
    private javax.swing.JButton btn_SalirMatri;
    private javax.swing.JButton btn_Salir_Alumnos;
    private javax.swing.JButton btn_Salir_Cursos;
    private javax.swing.JButton btn_Salir_Impartir;
    private javax.swing.JButton btn_Salir_Modulo;
    private javax.swing.JButton btn_Salir_Prof;
    private javax.swing.JComboBox<String> combo_CursoAlum;
    private javax.swing.JComboBox<String> combo_JornadaModulos;
    private static javax.swing.JComboBox<String> combo_ModuloImpartir;
    private javax.swing.JComboBox<String> combo_SemestreModulos;
    private static javax.swing.JComboBox<String> combo_moduloMatriculas;
    private static javax.swing.JComboBox<String> combo_todosAlumnos;
    private static javax.swing.JComboBox<String> combo_todosAlumnosMatri;
    private static javax.swing.JComboBox<String> combo_todosAlumnostabCursos;
    public static javax.swing.JComboBox<String> combo_todosCursosTab;
    private static javax.swing.JComboBox<String> combo_todosModulos;
    private static javax.swing.JComboBox<String> combo_todosProfesores;
    private static javax.swing.JComboBox<String> combo_todosProfesores1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JTable table_Alumnos;
    private javax.swing.JTable table_Cursos;
    private javax.swing.JTable table_Impartir;
    private javax.swing.JTable table_Matriculas;
    private javax.swing.JTable table_Profesores;
    private javax.swing.JTextField txt_ApellidoMaternoImpartir;
    private javax.swing.JTextField txt_ApellidoMaternoMatri;
    private javax.swing.JTextField txt_ApellidoMaternoProf;
    private javax.swing.JTextField txt_ApellidoPaternoImpartir;
    private javax.swing.JTextField txt_ApellidoPaternoMatri;
    private javax.swing.JTextField txt_ApellidoPaternoProf;
    private javax.swing.JTextField txt_ApmAlum;
    private javax.swing.JTextField txt_AppAlum;
    private javax.swing.JTextField txt_BuscarAlum;
    private javax.swing.JTextField txt_BuscarAlumMatri;
    private javax.swing.JTextField txt_BuscarImpartir;
    private javax.swing.JTextField txt_BuscarModulo;
    private javax.swing.JTextField txt_BuscarProfe;
    private javax.swing.JTextField txt_DireccionAlum;
    private javax.swing.JTextField txt_DireccionProf;
    private javax.swing.JTextField txt_ExpeAlum;
    private javax.swing.JTextField txt_FechNacAlum;
    private javax.swing.JTextField txt_FechaNacProf;
    private javax.swing.JTextField txt_NombreAlum;
    private javax.swing.JTextField txt_RunAlum;
    private javax.swing.JTextField txt_RunMatri;
    private javax.swing.JTextField txt_RunProf;
    private javax.swing.JTextField txt_RunProfImpartir;
    private javax.swing.JTextField txt_TelefonoProf;
    private javax.swing.JTextField txt_cantiHorasModulo;
    private javax.swing.JTextField txt_codCursoTabCursos;
    private javax.swing.JTextField txt_codigoModulo;
    private javax.swing.JTextField txt_nomCursoTabCursos;
    private javax.swing.JTextField txt_nomMatri;
    private javax.swing.JTextField txt_nomProfe;
    private javax.swing.JTextField txt_nomProfeImpartir;
    private javax.swing.JTextField txt_nombreModulo;
    // End of variables declaration//GEN-END:variables

    public void limpiarCamposMatricula(){
        txt_nomMatri.setText(null);
        txt_ApellidoPaternoMatri.setText(null);
        txt_ApellidoMaternoMatri.setText(null);
        txt_RunMatri.setText(null);
        DefaultTableModel tabla = (DefaultTableModel) table_Matriculas.getModel();
        tabla.setRowCount(0);
    }
    
    public void limpiarCamposAlum() {
        txt_BuscarAlum.setText(null);
        txt_RunAlum.setText(null);
        txt_ExpeAlum.setText(null);
	txt_NombreAlum.setText(null);
        txt_AppAlum.setText(null);
        txt_ApmAlum.setText(null);
        txt_FechNacAlum.setText(null);
        combo_CursoAlum.setSelectedIndex(0);
        txt_DireccionAlum.setText(null);
        DefaultTableModel tabla = (DefaultTableModel) table_Alumnos.getModel();
        tabla.setRowCount(0);
    }
    
        public void limpiarCamposProfe() {
        txt_BuscarProfe.setText(null);
        txt_RunProf.setText(null);
	txt_nomProfe.setText(null);
        txt_ApellidoPaternoProf.setText(null);
        txt_ApellidoMaternoProf.setText(null);
        txt_FechaNacProf.setText(null);
        txt_DireccionProf.setText(null);
        txt_TelefonoProf.setText(null);
        
        DefaultTableModel tabla = (DefaultTableModel) table_Profesores.getModel();
        tabla.setRowCount(0);
    }
        
        public void limpiarCamposModulos() {
        txt_codigoModulo.setText(null);
        txt_nombreModulo.setText(null);
        txt_cantiHorasModulo.setText(null);
	combo_SemestreModulos.setSelectedIndex(0);
        combo_JornadaModulos.setSelectedIndex(0);
    }
        
    public void limpiarCamposImpartir(){
        txt_BuscarModulo.setText(null);
        txt_nomProfeImpartir.setText(null);
        txt_RunProfImpartir.setText(null);
        txt_ApellidoMaternoImpartir.setText(null);
        txt_ApellidoPaternoImpartir.setText(null);
        DefaultTableModel tabla = (DefaultTableModel) table_Impartir.getModel();
        tabla.setRowCount(0);
	combo_ModuloImpartir.setSelectedIndex(0);
    }

    public void limpiarCamposCursos() {
        txt_codCursoTabCursos.setText(null);
        txt_nomCursoTabCursos.setText(null);
        combo_todosCursosTab.setSelectedIndex(0);
        combo_todosAlumnostabCursos.setSelectedIndex(0);
        DefaultTableModel tabla = (DefaultTableModel) table_Cursos.getModel();
        tabla.setRowCount(0);
    }
}
