public class Calculadora {
    public static void main(String[] args) {
        String a = "2";
        String b = "1";
        // Parsear a entero 
        int primerNumero = Integer.parseInt(a);
        int segundoNumero = Integer.parseInt(b);
        int resultado = primerNumero + segundoNumero;
        System.out.println("El resultado es: " + resultado);
    }
}
