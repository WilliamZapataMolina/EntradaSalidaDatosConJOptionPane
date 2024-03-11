package entradasalidadatosconjoptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author William Zapata
 */
public class EntradaSalidaDatosConJOptionPane {

    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;
        
        /*
        Con JOptionPane lo que nos va a pedir y dar es datos a través de 
        ventanas emergentes
        */
        cadena = JOptionPane.showInputDialog("Digite una cadena:");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero"));
        letra = JOptionPane.showInputDialog("Digite un caracter").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal"));

        JOptionPane.showMessageDialog(null, "La cadena es:" + cadena);
        JOptionPane.showMessageDialog(null, "El número entero es:" + entero);
        JOptionPane.showMessageDialog(null, "El caracter es:" + letra);
        JOptionPane.showMessageDialog(null, "El número decimal es:" + decimal);
        //Con JOptionPane los números decimales se deben escribir con punto Ej: 13.5

    }

}
