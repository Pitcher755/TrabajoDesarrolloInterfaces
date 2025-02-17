/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InterfazGrafica;

import Controladores.ControladorAlquiler;
import Modelos.Alquiler;
import Modelos.Cliente;
import Modelos.Vivienda;
import com.toedter.calendar.JDateChooser;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Ventana para registrar un nuevo alquiler. Permite al usuario ingresar los
 * datos del cliente, vivienda y detalles del alquiler, y los guarda en la base
 * de datos.
 *
 * @author JFG
 */
public class VentanaRegistroAlquiler extends javax.swing.JFrame {

    private ControladorAlquiler controladorAlquiler;

    /**
     * Constructor
     */
    public VentanaRegistroAlquiler() {
        initComponents();
        controladorAlquiler = new ControladorAlquiler();
        centrarVentana();
    }
    
    /**
     * Método que coloca la ventana en el centro.
     */
    private void centrarVentana(){
        Dimension tamanioVentana  = getSize();
        Dimension tamanioPantalla = getToolkit().getDefaultToolkit().getScreenSize();
        
        int x = (tamanioPantalla.width - tamanioVentana.width) / 2;
        int y = (tamanioPantalla.height - tamanioVentana.height) / 2;
        
        setLocation(x, y);
    }

    // Setters
    public void setControladorAlquiler(ControladorAlquiler controladorAlquiler) {
        this.controladorAlquiler = controladorAlquiler;
    }

    public void setJtDni(String dni) {
        jtDni.setText(dni);
    }

    public void setJtNombre(String nombre) {
        jtNombre.setText(nombre);
    }

    public void setJtApellidos(String apelliddos) {
        jtApellidos.setText(apelliddos);
    }
    
    public void setJtTelefono(String telefono) {
        jtTelefono.setText(telefono);
    }
    
    public void setJtEmail(String email) {
        jtEmail.setText(email);
    }
    
    public void setJtFacturacion(String facturacion) {
        jtFacturacion.setText(facturacion);
    }

    public void setJtReferencia(String referencia) {
        jtReferencia.setText(referencia);
    }
    
    public void setJtUbicacion(String ubicacion) {
        jtUbicacion.setText(ubicacion);
    }
    
    public void setJtMetros(String metros) {
        jtMetros.setText(metros);
    }
    
    public void setJtHabitaciones(String habitaciones) {
        jtHabitaciones.setText(habitaciones);
    }
    
    public void setJtBanos(String banos) {
        jtBanos.setText(banos);
    }
    
    public void setJtPrecio(String precio) {
        jtPrecio.setText(precio);
    }
    
    public void setJDateChooser1(java.util.Date fechaInicio) {
        jDateChooser1.setDate(fechaInicio);
    }
    
    public void setJtDuracion(String duracion) {
        jtDuracion.setText(duracion);
    }
            
   
  
    public void setJtPagado(String pagado) {
        jtPagado.setText(pagado);
    }
    

    /**
     * Registra un nuevo alquiler utilizando los datos ingresados en el
     * formulario.
     */
    public void registrarAlquiler() {
        try {
            // Obtener los datos de un cliente
            String dni = jtDni.getText().trim();
            String nombre = jtNombre.getText().trim();
            String apellidos = jtApellidos.getText().trim();
            String telefono = jtTelefono.getText().trim();
            String email = jtEmail.getText().trim();
            String direccion = jtFacturacion.getText().trim();

            Cliente cliente = new Cliente(dni, nombre, apellidos, telefono, email, direccion);

            // Obtener datos de la vivienda
            String referencia = jtReferencia.getText().trim();
            String ubicacion = jtUbicacion.getText().trim();
            int metros = Integer.parseInt(jtMetros.getText().trim());
            int habitaciones = Integer.parseInt(jtHabitaciones.getText().trim());
            int banios = Integer.parseInt(jtBanos.getText().trim());
            double precio = Double.parseDouble(jtPrecio.getText().trim());

            Vivienda vivienda = new Vivienda(referencia, ubicacion, metros, habitaciones, banios, precio);

            // Obtener los datos del alquiler
            String fechaInicio = new SimpleDateFormat("yyy-MM-dd").format(jDateChooser1.getDate());
            int duracionMeses = Integer.parseInt(jtDuracion.getText().trim());
            boolean estadoPago = Boolean.parseBoolean(jtPagado.getText().trim());

            Alquiler alquiler = new Alquiler(0, fechaInicio, duracionMeses, cliente, vivienda, estadoPago);

            // Guardar el alquiler en la base de datos
            controladorAlquiler.guardarAlquiler(alquiler);

            JOptionPane.showMessageDialog(this, "El alquiler se ha registrado correctamente.");
            limpiarCampos();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al requistrar el alquiler: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    /**
     * Limpia todos los campos del formulario
     */
    private void limpiarCampos() {

        jtDni.setText("");
        jtNombre.setText("");
        jtApellidos.setText("");
        jtTelefono.setText("");
        jtEmail.setText("");
        jtFacturacion.setText("");
        jtReferencia.setText("");
        jtUbicacion.setText("");
        jtMetros.setText("");
        jtHabitaciones.setText("");
        jtBanos.setText("");
        jtPrecio.setText("");
        jDateChooser1.setDate(null);
        jtDuracion.setText("");
        jtPagado.setText("");
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
        jlDni = new javax.swing.JLabel();
        jlFacturacion = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jlDatosCliente = new javax.swing.JLabel();
        jtDni = new javax.swing.JTextField();
        jtFacturacion = new javax.swing.JTextField();
        jlNombre = new javax.swing.JLabel();
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
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jtDuracion = new javax.swing.JTextField();
        jlPago = new javax.swing.JLabel();
        jtPagado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jpBotones = new javax.swing.JPanel();
        jbVolver = new javax.swing.JButton();
        jbRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 935));
        setSize(new java.awt.Dimension(1280, 835));

        jlDni.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlDni.setText("DNI");

        jlFacturacion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlFacturacion.setText("Dirección");

        jtNombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreActionPerformed(evt);
            }
        });

        jlDatosCliente.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jlDatosCliente.setText("Datos del cliente");

        jtDni.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDniActionPerformed(evt);
            }
        });

        jtFacturacion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtFacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtFacturacionActionPerformed(evt);
            }
        });

        jlNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlNombre.setText("Nombre y Apellidos");

        jlTelefono.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlTelefono.setText("Teléfono");

        jtTelefono.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtTelefonoActionPerformed(evt);
            }
        });

        jtApellidos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtApellidosActionPerformed(evt);
            }
        });

        jlEmail.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlEmail.setText("Email");

        jtEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
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
                .addComponent(jlDatosCliente)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpClienteLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpClienteLayout.createSequentialGroup()
                        .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlTelefono)
                            .addComponent(jlEmail))
                        .addGap(125, 125, 125)
                        .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtTelefono)
                            .addComponent(jtEmail)))
                    .addGroup(jpClienteLayout.createSequentialGroup()
                        .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlDni)
                            .addComponent(jlFacturacion))
                        .addGap(119, 119, 119)
                        .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtFacturacion)
                            .addComponent(jtDni)
                            .addGroup(jpClienteLayout.createSequentialGroup()
                                .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpClienteLayout.createSequentialGroup()
                        .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jpClienteLayout.setVerticalGroup(
            jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlDatosCliente)
                .addGap(46, 46, 46)
                .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNombre)
                    .addComponent(jtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlDni))
                .addGap(52, 52, 52)
                .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlFacturacion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtFacturacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        jtUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtUbicacionActionPerformed(evt);
            }
        });

        jtMetros.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtMetros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtMetrosActionPerformed(evt);
            }
        });

        jtHabitaciones.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtHabitacionesActionPerformed(evt);
            }
        });

        jtBanos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtBanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtBanosActionPerformed(evt);
            }
        });

        jtPrecio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPrecioActionPerformed(evt);
            }
        });

        jtReferencia.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
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
                    .addComponent(jlBanios, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlHabitaciones)
                    .addComponent(jlMetros, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                .addGap(18, 18, 18)
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
        jlFechaFin.setText("Duración");

        jlFechaInicio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlFechaInicio.setText("Fecha de Inicio");

        jDateChooser1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jtDuracion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jlPago.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlPago.setText("Estado de Pago");

        jtPagado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtPagado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPagadoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("AutoIncrementado");

        javax.swing.GroupLayout jpDatosAlquilerLayout = new javax.swing.GroupLayout(jpDatosAlquiler);
        jpDatosAlquiler.setLayout(jpDatosAlquilerLayout);
        jpDatosAlquilerLayout.setHorizontalGroup(
            jpDatosAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosAlquilerLayout.createSequentialGroup()
                .addGroup(jpDatosAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDatosAlquilerLayout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jlDatosAlquiler, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE))
                    .addGroup(jpDatosAlquilerLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jpDatosAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpDatosAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlExplediente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jpDatosAlquilerLayout.createSequentialGroup()
                                .addComponent(jlPago)
                                .addGap(66, 66, 66)))
                        .addGroup(jpDatosAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtDuracion)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtPagado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jpDatosAlquilerLayout.setVerticalGroup(
            jpDatosAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosAlquilerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlDatosAlquiler, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jpDatosAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlExplediente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addGap(45, 45, 45)
                .addGroup(jpDatosAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jpDatosAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jpDatosAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPago)
                    .addComponent(jtPagado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jbVolver.setBackground(new java.awt.Color(255, 204, 204));
        jbVolver.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbVolver.setForeground(new java.awt.Color(0, 0, 0));
        jbVolver.setText("Volver");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });

        jbRegistrar.setBackground(new java.awt.Color(204, 255, 204));
        jbRegistrar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        jbRegistrar.setText("Completar Registro");
        jbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBotonesLayout = new javax.swing.GroupLayout(jpBotones);
        jpBotones.setLayout(jpBotonesLayout);
        jpBotonesLayout.setHorizontalGroup(
            jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBotonesLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jbVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jpBotonesLayout.setVerticalGroup(
            jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        // registra el alquiler
        registrarAlquiler();
    }//GEN-LAST:event_jbRegistrarActionPerformed

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        // Vuelve a la ventana de inicio
        new VentanaInicio().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbVolverActionPerformed

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

    private void jtFacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtFacturacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtFacturacionActionPerformed

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

    private void jtPagadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPagadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPagadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JButton jbVolver;
    private javax.swing.JLabel jlBanios;
    private javax.swing.JLabel jlDatosAlquiler;
    private javax.swing.JLabel jlDatosCliente;
    private javax.swing.JLabel jlDatosVivienda;
    private javax.swing.JLabel jlDni;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlExplediente;
    private javax.swing.JLabel jlFacturacion;
    private javax.swing.JLabel jlFechaFin;
    private javax.swing.JLabel jlFechaInicio;
    private javax.swing.JLabel jlHabitaciones;
    private javax.swing.JLabel jlMetros;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlPago;
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
    private javax.swing.JTextField jtBanos;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtDuracion;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtFacturacion;
    private javax.swing.JTextField jtHabitaciones;
    private javax.swing.JTextField jtMetros;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtPagado;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtReferencia;
    private javax.swing.JTextField jtTelefono;
    private javax.swing.JTextField jtUbicacion;
    // End of variables declaration//GEN-END:variables

}
