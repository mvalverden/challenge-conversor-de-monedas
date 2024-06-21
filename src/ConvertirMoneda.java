import java.util.Scanner;

public class ConvertirMoneda {
    public static void convertir(String monedaBase, String monedaDestino, ConsultarMoneda consulta, Scanner lectura){
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consulta.buscarMoneda(monedaBase, monedaDestino);
        //System.out.println("El tipo de cambio es: \n" + monedaBase + " = " + monedas.conversion_rate() + " " + monedaDestino);
        System.out.println("Ingrese el valor en " + monedaBase + " que deseas convertir:");
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println("El valor " + cantidad + " [" + monedaBase + "] corresponde al valor final de =>>> " + cantidadConvertida + " [" + monedas.target_code() + "]");
    }
}
