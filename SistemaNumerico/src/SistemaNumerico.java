import javax.swing.*;

public class SistemaNumerico {
    public static void main(String[] args){
        System.out.println("Sistema Numerico");
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero: ");
        int numeroDecimal = Integer.parseInt(numeroStr);
        System.out.println("El valor binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
        System.out.println("El valor octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
        System.out.println("El valor Hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        String mensaje = "El valor binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        mensaje += "\nEl valor octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        mensaje += "\nEl valor Hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
