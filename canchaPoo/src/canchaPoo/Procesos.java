package canchaPoo;

import javax.swing.*;

public class Procesos {
    int numer;
    int i, neg = 0, par = 0;
    
    /*La clase "Procesos" tiene tres variables: "numer" (que representa el n�mero ingresado por el usuario), 
     "neg" (que representa la cantidad de n�meros negativos) y "par" (que representa la cantidad de n�meros pares).*/

    public void entrada() {
        for (i = 0; i < 5; i++) {
            numer = ingresarDatos("Digite 1 n�mero");

            if (numer % 2 == 0) {
                par++;
            }

            if (numer < 0) {
                neg++;
            }
        }
        
        /*El m�todo "entrada" utiliza un bucle "for" para repetir cinco veces el proceso de pedir un n�mero al usuario.
          Despu�s de que el usuario ingresa un n�mero, el programa verifica si es par o negativo.
          Si el n�mero es par (es decir, divisible por 2), se incrementa la variable "par" en uno.
		  Si el n�mero es negativo (es decir, menor que cero), se incrementa la variable "neg" en uno.*/

        JOptionPane.showMessageDialog(null, "El n�mero de n�meros pares es: " + par +
                " y el n�mero de n�meros negativos es: " + neg);
        
        /*Despu�s de que se ingresan los cinco n�meros, se muestra una ventana 
         con un mensaje que indica la cantidad de n�meros pares y negativos que se ingresaron.*/
    }

    public static int ingresarDatos(String mensaje) {
        String cadena = JOptionPane.showInputDialog(null, mensaje);
        int valor = Integer.parseInt(cadena);
        return valor;
    }
}


