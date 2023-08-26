package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	
	public void ConvertirPesosADolares(double valor) {
		double monedaDolar = valor / 16.93;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, valor + " MXN equivalen a $ " + monedaDolar + " Dolares");
	}
	
	public void ConvertirPesosAEuros(double valor) {
		double monedaEuro = valor / 18.70;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, valor + " MXN equivalen a € " + monedaEuro + " Euros");
	}
	
	public void ConvertirPesosALibras(double valor) {
		double monedaLibra = valor / 28.81;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, valor + " MXN equivalen a " + monedaLibra + " Libras Esterlinas");
	}
	
	public void ConvertirPesosAYen(double valor) {
		double monedaYen = valor / 0.12;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, valor + " MXN equivalen a ¥ " + monedaYen + " Yenes");
	}
	
	public void ConvertirPesosAWon(double valor) {
		double monedaWon = valor / 0.0132;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, valor + " MXN equivalen a ₩ " + monedaWon + " Wons");
	}
}
