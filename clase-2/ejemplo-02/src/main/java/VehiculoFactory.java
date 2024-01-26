public class VehiculoFactory {

    public Vehiculo getVehiculo(String tipo) {
        if (tipo == null) {
            return null;
        }
        if (tipo.equalsIgnoreCase("BICICLETA")) {
            return new Bicicleta();
        } else if (tipo.equalsIgnoreCase("COCHE")) {
            return new Coche();
        }
        return null;
    }
    
}