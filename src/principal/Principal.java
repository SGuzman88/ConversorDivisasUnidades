package principal;

import javax.swing.JOptionPane;

import conversorMonedas.function;
import conversorTemperatura.functionTemperatura;

public class Principal {
    public static void main (String[] args) {

        function monedas = new function();
        functionTemperatura temperatura = new functionTemperatura();
             
        while(true) {
        	
        	String opciones = (JOptionPane.showInputDialog(null, "Selecciona una opción de conversión ", "Menú", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Moneda", "Conversor de Temperatura"}, "Seleccion")).toString();

        	switch(opciones) {
        	case "Conversor de Moneda":
        		 String input = JOptionPane.showInputDialog(null, "Ingresa la cantidad de dinero que deseas convertir: ", "Divisas", JOptionPane.QUESTION_MESSAGE);
                 if(ValidarNumero(input) == true) {
                     double Minput = Double.parseDouble(input);
                     monedas.ConvertirMonedas(Minput);

                     int respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
                     if (JOptionPane.OK_OPTION == respuesta){
                     	System.out.println("Selecciona opción Afirmativa");
                     }else{
                        	JOptionPane.showMessageDialog(null, "¡Hasta la próxima!", "¡Adiós!", JOptionPane.QUESTION_MESSAGE);  
                        	System.exit(1);
                     }

                    } else {
                        JOptionPane.showMessageDialog(null, "Intenta de nuevo. Únicamente se admiten números");                
                    }
                     	break;
        	

        	 case "Conversor de Temperatura":
        	   input = JOptionPane.showInputDialog(null, "Ingresa el valor de la temperatura que deseas convertir: ", "Temperatura", JOptionPane.QUESTION_MESSAGE);
             if(ValidarNumero(input) == true) {
                 double Minput = Double.parseDouble(input);
                 temperatura.ConvertirTemperatura(Minput);

                 int respuesta = 0;
                 respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
                 if((respuesta == 0) && (ValidarNumero(input) == true)) { 
                 } else {
                     JOptionPane.showMessageDialog(null, "¡Hasta la próxima!", "¡Adiós!", JOptionPane.QUESTION_MESSAGE); 
                     System.exit(1);
                 }

             } else {
                 JOptionPane.showMessageDialog(null, "Intenta de nuevo. Únicamente se admiten números");                
             }
             break;
             
             
        }                
    }
               
  }
    public static boolean ValidarNumero(String input) {
        try {
            double x = Double.parseDouble(input);
            if(x >= 0 || x < 0);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
    }
}
        	
