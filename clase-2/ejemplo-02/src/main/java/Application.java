public class Application {
    public static void main(String[] args) {
        VehiculoFactory vehiculoFactory = new VehiculoFactory();
        
        Bicicleta vehiculo1 = (Bicicleta) vehiculoFactory.getVehiculo("BICICLETA");
        vehiculo1.acelerar();
        vehiculo1.frenar();
        vehiculo1.girar();
        

        Coche vehiculo2 = (Coche) vehiculoFactory.getVehiculo("COCHE");
        vehiculo2.acelerar();
        vehiculo2.frenar();
        vehiculo2.girar();
       

    }
    
}