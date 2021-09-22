import javax.swing.*;

public class ConversionTemperatura {
    public static void main(String[] args){
        System.out.println("Conversion de temperatura: F a C");
        String temperatura = JOptionPane.showInputDialog(null, "Ingrese la temperatura en Fahrenheit");
        float celcius = 0;
        float temperaturaFahrenheit = 0;

        try{
            temperaturaFahrenheit = Float.parseFloat(temperatura);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error, ingrese un numero valido");
            main(args);
            System.exit(0);
        }
        celcius = (temperaturaFahrenheit - 32) * 5/9;
        System.out.println("La conversion de la temperatura Fahrenheit: " + temperaturaFahrenheit + " es = " + celcius + "C");

        String mensaje = "La conversion de la temperatura Fahrenheit: " + temperaturaFahrenheit + "F" + " es = " + celcius + "C";
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
