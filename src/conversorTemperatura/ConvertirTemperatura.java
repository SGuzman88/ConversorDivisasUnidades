package conversorTemperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {
	
	public double ConvertirCelsiusAFarenheit(double valor) {
		double farenheit = valor * 1.8 + 32;
    	farenheit = (double) Math.round(farenheit *100d)/100;
        JOptionPane.showMessageDialog(null, valor + " Grados Celsius son " + farenheit + " Grados Farenheit");
		return farenheit;
	}
	
	public void ConvertirCelsiusAKelvin(double valor){
		double kelvin = valor + 273.15;
        kelvin = (double) Math.round(kelvin *100d)/100;
        JOptionPane.showMessageDialog(null, valor + " Grados Celsius son " + kelvin + " Kelvin");
	}
	
	public void ConvertirFarenheitACelcius(double valor) {
		double celsius = (valor - 32) / 1.8;
        celsius = (double) Math.round(celsius *100d)/100;
        JOptionPane.showMessageDialog(null, valor + " Grados Farenheit son " + celsius + " Celsius");
	}
	
	public double ConvertirKelvinACelsius(double valor) {
		 double kelvinCelsius = valor - 273.15;
         kelvinCelsius = (double) Math.round(kelvinCelsius *100d)/100;
         JOptionPane.showMessageDialog(null, valor + " Kelvin son " + kelvinCelsius + " Celsius");
         return kelvinCelsius;
	}
	
	public void ConvertirKelvinAFarenheit(double valor) {
		double kelvinFarenheit = ConvertirKelvinACelsius(valor);
		kelvinFarenheit = ConvertirCelsiusAFarenheit(kelvinFarenheit);
		kelvinFarenheit	= (double) Math.round(kelvinFarenheit *100d)/100;
        JOptionPane.showMessageDialog(null, valor + " Kelvin son " + kelvinFarenheit + " Celsius");
	}

}
