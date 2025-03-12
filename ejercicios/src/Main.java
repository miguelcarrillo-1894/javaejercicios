import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n*** MENU DE EJERCICIOS ***");
            System.out.println("1. Simulacion de Factura");
            System.out.println("2. Simulacion de Ascensor");
            System.out.println("3. Ascensor con limite de peso");
            System.out.println("4. Sensor de Temperatura");
            System.out.println("5. Sensor de Temperatura con Alerta");
            System.out.println("6. Ascensor Inteligente con Control de Temperatura");
            System.out.println("7. Calculo de Compra con Descuentos");
            System.out.println("8. Asistente Nutricionista (Calculo de IMC)");
            System.out.println("9. Asistente Virtual de Cine");
            System.out.println("10. Clasificacion en Campeonato Deportivo");
            System.out.println("11. Menu de Restaurante con Descuento");
            System.out.println("12. Cajero Automatico");
            System.out.println("13. Compra en Tienda en Linea");
            System.out.println("14. Simulacion de Impresora");
            System.out.println("15. Simulacion de Viaje en Coche");
            System.out.println("16. Cuenta Regresiva");
            System.out.println("17. Juego de Adivinanza");
            System.out.println("18. Registro de Biblioteca");
            System.out.println("19. Menu de Comida Rapida");
            System.out.println("20. Sensor de Temperatura con Rango Aceptable");
            System.out.println("21. Calculo de Promedio de Examenes");
            System.out.println("22. Gestion de Tareas");
            System.out.println("23. Registro de Ventas");
            System.out.println("24. Registro de Vehiculos en Parqueadero");
            System.out.println("25. Tienda Virtual");
            System.out.println("26. Agenda de Contactos");
            System.out.println("27. Suma de Numeros");
            System.out.println("28. Control de Ventas en Tienda");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un numero valido.");
                scanner.next();
            }

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    Factura factura = new Factura();
                    factura.calcularFactura();
                    break;
                case 2:
                    Ascensor ascensor = new Ascensor();
                    ascensor.moverAscensor();
                    break;
                case 3:
                    AscensorConPeso ascensorPeso = new AscensorConPeso();
                    ascensorPeso.moverAscensor();
                    break;
                case 4:
                    SensorTemperatura sensor = new SensorTemperatura();
                    sensor.verificarTemperatura();
                    break;
                case 5:
                    SensorTemperaturaAlerta sensorAlerta = new SensorTemperaturaAlerta();
                    sensorAlerta.verificarTemperaturaConAlerta();
                    break;
                case 6:
                    AscensorInteligente ascensorInteligente = new AscensorInteligente();
                    ascensorInteligente.moverAscensorSiTemperaturaAdecuada();
                    break;
                case 7:
                    Tienda tienda = new Tienda();
                    tienda.calcularCompra();
                    break;
                case 8:
                    Nutricionista nutricionista = new Nutricionista();
                    nutricionista.calcularIMC();
                    break;
                case 9:
                    Cine cine = new Cine();
                    cine.recomendarPelicula();
                    break;
                case 10:
                    Campeonato campeonato = new Campeonato();
                    campeonato.clasificarEquipo();
                    break;
                case 11:
                    Restaurante restaurante = new Restaurante();
                    restaurante.calcularCuenta();
                    break;
                case 12:
                    CajeroAutomatico cajero = new CajeroAutomatico();
                    cajero.realizarRetiros();
                    break;
                case 13:
                    TiendaEnLinea tiendaLinea = new TiendaEnLinea();
                    tiendaLinea.realizarCompra();
                    break;
                case 14:
                    Impresora impresora = new Impresora();
                    impresora.imprimirPaginas();
                    break;
                case 15:
                    ViajeEnCoche viaje = new ViajeEnCoche();
                    viaje.calcularTiempoDeViaje();
                    break;
                case 16:
                    CuentaRegresiva cuenta = new CuentaRegresiva();
                    cuenta.iniciarCuentaRegresiva();
                    break;
                case 17:
                    JuegoAdivinanza adivinanza = new JuegoAdivinanza();
                    adivinanza.jugar();
                    break;
                case 18:
                    Biblioteca biblioteca = new Biblioteca();
                    biblioteca.registrarLibros();
                    break;
                case 19:
                    ComidaRapida comidaRapida = new ComidaRapida();
                    comidaRapida.realizarPedido();
                    break;
                case 20:
                    SensorTemperaturaRango sensorRango = new SensorTemperaturaRango();
                    sensorRango.verificarTemperatura();
                    break;
                case 21:
                    PromedioExamenes promedio = new PromedioExamenes();
                    promedio.calcularPromedio();
                    break;
                case 22:
                    GestionTareas tareas = new GestionTareas();
                    tareas.gestionarTareas();
                    break;
                case 23:
                    RegistroVentas registro = new RegistroVentas();
                    registro.registrarVentas();
                    break;
                case 24:
                    RegistroParqueadero parqueadero = new RegistroParqueadero();
                    parqueadero.registrarVehiculos();
                    break;
                case 25:
                    TiendaVirtual tiendaVirtual = new TiendaVirtual();
                    tiendaVirtual.realizarCompra();
                    break;
                case 26:
                    AgendaContactos agenda = new AgendaContactos();
                    agenda.registrarContactos();
                    break;
                case 27:
                    SumaNumeros suma = new SumaNumeros();
                    suma.calcularSuma();
                    break;
                case 28:
                    ControlVentas ventas = new ControlVentas();
                    ventas.registrarVentas();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida, intente de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}