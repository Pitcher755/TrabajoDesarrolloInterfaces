/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InterfazGrafica;

import com.toedter.calendar.JDateChooser;

/**
 *
 * @author JFG
 */

public class VentanaRegistroAlquiler extends javax.swing.JFrame {

    /**
     * Creates new form VentanaRegistroAlquiler
     */
    public VentanaRegistroAlquiler() {
        initComponents();
    }
    
    /**
     * 
     */
    public void registrarAlquiler(){
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipal = new javax.swing.JPanel();
        jpCliente = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtDni = new javax.swing.JTextField();
        jtBanco = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jlTelefono = new javax.swing.JLabel();
        jtTelefono = new javax.swing.JTextField();
        jtApellidos = new javax.swing.JTextField();
        jlEmail = new javax.swing.JLabel();
        jtEmail = new javax.swing.JTextField();
        jpDatosVivienda = new javax.swing.JPanel();
        jlReferencia = new javax.swing.JLabel();
        jlDatosVivienda = new javax.swing.JLabel();
        jlUbicacion = new javax.swing.JLabel();
        jlMetros = new javax.swing.JLabel();
        jlHabitaciones = new javax.swing.JLabel();
        jlBanios = new javax.swing.JLabel();
        jlPrecio = new javax.swing.JLabel();
        jtUbicacion = new javax.swing.JTextField();
        jtMetros = new javax.swing.JTextField();
        jtHabitaciones = new javax.swing.JTextField();
        jtBanos = new javax.swing.JTextField();
        jtPrecio = new javax.swing.JTextField();
        jtReferencia = new javax.swing.JTextField();
        jpDatosAlquiler = new javax.swing.JPanel();
        jlDatosAlquiler = new javax.swing.JLabel();
        jlExplediente = new javax.swing.JLabel();
        jlFechaFin = new javax.swing.JLabel();
        jlFechaInicio = new javax.swing.JLabel();
        jtExpediente = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jpBotones = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 835));
        setSize(new java.awt.Dimension(1280, 835));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setText("DNI");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setText("Cuenta Bancaria");

        jtNombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtNombre.setText("Nombre ");
        jtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setText("Datos del cliente");

        jtDni.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtDni.setText("DNI");
        jtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDniActionPerformed(evt);
            }
        });

        jtBanco.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtBanco.setText("IBAN");
        jtBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtBancoActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setText("Nombre Completo");

        jlTelefono.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlTelefono.setText("Teléfono");

        jtTelefono.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtTelefono.setText("Nº de teléfono");
        jtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtTelefonoActionPerformed(evt);
            }
        });

        jtApellidos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtApellidos.setText("Apellidos");
        jtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtApellidosActionPerformed(evt);
            }
        });

        jlEmail.setText("jLabel1");

        jtEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtEmail.setText("email");
        jtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpClienteLayout = new javax.swing.GroupLayout(jpCliente);
        jpCliente.setLayout(jpClienteLayout);
        jpClienteLayout.setHorizontalGroup(
            jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpClienteLayout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpClienteLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpClienteLayout.createSequentialGroup()
                        .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14))
                        .addGap(64, 64, 64)
                        .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtDni)
                            .addComponent(jtBanco)
                            .addGroup(jpClienteLayout.createSequentialGroup()
                                .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtApellidos))))
                    .addGroup(jpClienteLayout.createSequentialGroup()
                        .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlTelefono)
                            .addComponent(jlEmail)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtEmail)
                            .addComponent(jtTelefono)))))
        );
        jpClienteLayout.setVerticalGroup(
            jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(46, 46, 46)
                .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(52, 52, 52)
                .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEmail)
                    .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        jlReferencia.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlReferencia.setText("Ref. Vivienda");

        jlDatosVivienda.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jlDatosVivienda.setText("Datos de la vivienda");

        jlUbicacion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlUbicacion.setText("Ubicación");

        jlMetros.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlMetros.setText("Metros");

        jlHabitaciones.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlHabitaciones.setText("Habitaciones");

        jlBanios.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlBanios.setText("Nª de Baños");

        jlPrecio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlPrecio.setText("Precio Mensual");

        jtUbicacion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtUbicacion.setText("Dirección");
        jtUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtUbicacionActionPerformed(evt);
            }
        });

        jtMetros.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtMetros.setText("Metros cuadrados");
        jtMetros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtMetrosActionPerformed(evt);
            }
        });

        jtHabitaciones.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtHabitaciones.setText("Número de habitaciones");
        jtHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtHabitacionesActionPerformed(evt);
            }
        });

        jtBanos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtBanos.setText("Número de baños");
        jtBanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtBanosActionPerformed(evt);
            }
        });

        jtPrecio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtPrecio.setText("Precio Mensual");
        jtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPrecioActionPerformed(evt);
            }
        });

        jtReferencia.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtReferencia.setText("Referencia");
        jtReferencia.setSelectionColor(new java.awt.Color(0, 255, 0));
        jtReferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtReferenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpDatosViviendaLayout = new javax.swing.GroupLayout(jpDatosVivienda);
        jpDatosVivienda.setLayout(jpDatosViviendaLayout);
        jpDatosViviendaLayout.setHorizontalGroup(
            jpDatosViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDatosViviendaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jpDatosViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlBanios, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlHabitaciones)
                    .addComponent(jlMetros, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jpDatosViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtBanos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtHabitaciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtMetros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtUbicacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtReferencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jpDatosViviendaLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jlDatosVivienda)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpDatosViviendaLayout.setVerticalGroup(
            jpDatosViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosViviendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlDatosVivienda)
                .addGap(42, 42, 42)
                .addGroup(jpDatosViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtReferencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlReferencia))
                .addGap(63, 63, 63)
                .addGroup(jpDatosViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtUbicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlUbicacion))
                .addGap(64, 64, 64)
                .addGroup(jpDatosViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtMetros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlMetros))
                .addGap(65, 65, 65)
                .addGroup(jpDatosViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtHabitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlHabitaciones))
                .addGap(57, 57, 57)
                .addGroup(jpDatosViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlBanios)
                    .addComponent(jtBanos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jpDatosViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPrecio)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jlDatosAlquiler.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jlDatosAlquiler.setText("Datos del alquiler");

        jlExplediente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlExplediente.setText("Nª Expediente");

        jlFechaFin.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlFechaFin.setText("Fecha de Fin");

        jlFechaInicio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlFechaInicio.setText("Fecha de Inicio");

        jtExpediente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtExpediente.setText("Expediente");
        jtExpediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtExpedienteActionPerformed(evt);
            }
        });

        jDateChooser1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jDateChooser2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        javax.swing.GroupLayout jpDatosAlquilerLayout = new javax.swing.GroupLayout(jpDatosAlquiler);
        jpDatosAlquiler.setLayout(jpDatosAlquilerLayout);
        jpDatosAlquilerLayout.setHorizontalGroup(
            jpDatosAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosAlquilerLayout.createSequentialGroup()
                .addGroup(jpDatosAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDatosAlquilerLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jpDatosAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlExplediente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(70, 70, 70)
                        .addGroup(jpDatosAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtExpediente, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)))
                    .addGroup(jpDatosAlquilerLayout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jlDatosAlquiler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpDatosAlquilerLayout.setVerticalGroup(
            jpDatosAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosAlquilerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlDatosAlquiler, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addGroup(jpDatosAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlExplediente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtExpediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jpDatosAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addGroup(jpDatosAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setText("Completar Registro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBotonesLayout = new javax.swing.GroupLayout(jpBotones);
        jpBotones.setLayout(jpBotonesLayout);
        jpBotonesLayout.setHorizontalGroup(
            jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBotonesLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jpBotonesLayout.setVerticalGroup(
            jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrincipalLayout.createSequentialGroup()
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpDatosAlquiler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpDatosVivienda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrincipalLayout.createSequentialGroup()
                        .addComponent(jpBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addContainerGap())
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addComponent(jpDatosVivienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jpBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addComponent(jpDatosAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtExpedienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtExpedienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtExpedienteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jtBanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtBanosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtBanosActionPerformed

    private void jtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTelefonoActionPerformed

    private void jtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreActionPerformed

    private void jtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDniActionPerformed

    private void jtBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtBancoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtBancoActionPerformed

    private void jtReferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtReferenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtReferenciaActionPerformed

    private void jtUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtUbicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtUbicacionActionPerformed

    private void jtMetrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtMetrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtMetrosActionPerformed

    private void jtHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtHabitacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtHabitacionesActionPerformed

    private void jtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPrecioActionPerformed

    private void jtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtApellidosActionPerformed

    private void jtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtEmailActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jlBanios;
    private javax.swing.JLabel jlDatosAlquiler;
    private javax.swing.JLabel jlDatosVivienda;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlExplediente;
    private javax.swing.JLabel jlFechaFin;
    private javax.swing.JLabel jlFechaInicio;
    private javax.swing.JLabel jlHabitaciones;
    private javax.swing.JLabel jlMetros;
    private javax.swing.JLabel jlPrecio;
    private javax.swing.JLabel jlReferencia;
    private javax.swing.JLabel jlTelefono;
    private javax.swing.JLabel jlUbicacion;
    private javax.swing.JPanel jpBotones;
    private javax.swing.JPanel jpCliente;
    private javax.swing.JPanel jpDatosAlquiler;
    private javax.swing.JPanel jpDatosVivienda;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JTextField jtApellidos;
    private javax.swing.JTextField jtBanco;
    private javax.swing.JTextField jtBanos;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtExpediente;
    private javax.swing.JTextField jtHabitaciones;
    private javax.swing.JTextField jtMetros;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtReferencia;
    private javax.swing.JTextField jtTelefono;
    private javax.swing.JTextField jtUbicacion;
    // End of variables declaration//GEN-END:variables
}
