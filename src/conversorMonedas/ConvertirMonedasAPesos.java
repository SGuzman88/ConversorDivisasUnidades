package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedasAPesos {
	
	public void ConvertirDolaresAPesos(double valor) {
		double monedaDolar = valor * 16.93;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, valor + " USD equivalen a $ " + monedaDolar + " Pesos Mexicanos");
	}
	
	public void ConvertirEurosAPesos(double valor) {
		double monedaEuro = valor * 18.70;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, valor + " EUR equivalen a $ " + monedaEuro + " Pesos Mexicanos");
	}
	
	public void ConvertirLibrasAPesos(double valor) {
		double monedaLibra = valor * 28.81;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, valor + " GBP equivalen a $ " + monedaLibra + " Pesos Mexicanos");
	}
	
	public void ConvertirYenAPesos(double valor) {
		double monedaYen = valor * 0.12;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, valor + " JPY equivalen a $ " + monedaYen + " Pesos Mexicanos");
	}
	
	public void ConvertirWonAPesos(double valor) {
		double monedaWon = valor * 0.0132;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, valor + " KRW equivalen a $ " + monedaWon + " Pesos Mexicanos");
	}
}
