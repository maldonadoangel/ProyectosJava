import javax.swing.*;

public class SistemaNumerico {
    public static void main(String[] args){
        int numeroDecimal = 0;
        System.out.println("Sistema Numerico");
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero: ");
        try{
             numeroDecimal = Integer.parseInt(numeroStr);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error, ingrese un numero valido");
            main(args);
            System.exit(0);
        }

        System.out.println("El valor binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
        System.out.println("El valor octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
        System.out.println("El valor Hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        String mensaje = "El valor binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        mensaje += "\nEl valor octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        mensaje += "\nEl valor Hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
