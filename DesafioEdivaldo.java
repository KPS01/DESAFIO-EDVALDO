package desafio;

import javax.swing.JOptionPane;


class Notas {
	
	double n1D;
	double n2D;
	double n3D;
	double n4D;
	
	String n1S;
	String n2S;
	String n3S;
	String n4S;
}

public class DesafioEdivaldo {

	public static void main(String args[]) {
		
		double media = 0;
		double soma;
		double total;
		String continuar;
		int escolha;
		escolha = 1;
		
		String nome;
		
		while(escolha != 0) {
			
		Notas mC;
		mC = new Notas();
		
		nome = JOptionPane.showInputDialog(null, "Informe seu nome: ", "NOME", JOptionPane.PLAIN_MESSAGE);	
		mC.n1S = JOptionPane.showInputDialog(null, "Informe a primeira nota: ", "PRIMEIRA NOTA", JOptionPane.INFORMATION_MESSAGE);
		mC.n1D = Double.parseDouble(mC.n1S);
		if (mC.n1D >= 0 & mC.n1D <= 10) {
			JOptionPane.showMessageDialog(null, "NOTA REGISTRADA", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);	
		} else {
			JOptionPane.showMessageDialog(null, "NOTA INVÁLIDA", "ERRO", JOptionPane.ERROR_MESSAGE);
			break;
		}

		mC.n2S = JOptionPane.showInputDialog(null, "Informe a segunda nota: ", "SEGUNDA NOTA", JOptionPane.INFORMATION_MESSAGE);
		mC.n2D= Double.parseDouble(mC.n2S);
		if (mC.n2D >= 0 & mC.n2D <= 10) {
			JOptionPane.showMessageDialog(null, "NOTA REGISTRADA", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "NOTA INVÁLIDA", "ERRO", JOptionPane.ERROR_MESSAGE);
			break;
		} 
		
		mC.n3S = JOptionPane.showInputDialog(null, "Informe a terceira nota: ", "TERCEIRA NOTA", JOptionPane.INFORMATION_MESSAGE);
		mC.n3D = Double.parseDouble(mC.n3S);
		if (mC.n3D >= 0 & mC.n3D <= 10) {
			JOptionPane.showMessageDialog(null, "NOTA REGISTRADA", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "NOTA INVÁLIDA", "ERRO", JOptionPane.ERROR_MESSAGE);
			break;
		} 
	
		mC.n4S = JOptionPane.showInputDialog(null, "Informe a quarta nota: ", "QUARTA NOTA", JOptionPane.INFORMATION_MESSAGE);
		mC.n4D = Double.parseDouble(mC.n4S);		
		if (mC.n4D >= 0 & mC.n4D <= 10) {
			JOptionPane.showMessageDialog(null, "NOTA REGISTRADA", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "NOTA INVÁLIDA", "ERRO", JOptionPane.ERROR_MESSAGE);
			break;
		}

		soma = mC.n1D + mC.n2D + mC.n3D + mC.n4D; 
		if (soma == 0) {
			JOptionPane.showMessageDialog(null, "REPROVADO", "REPROVADO",JOptionPane.ERROR_MESSAGE);
		} else {
			media = soma / 4;
		}
		
		total = media;
		
		if (total >= 4 & total < 6) {
			JOptionPane.showMessageDialog(null, mC.n1D + "|" + mC.n2D + "|" + mC.n3D + "|" + mC.n4D + "| -> " + total + " -> RECUPERÇÃO!", "RESULTADO", JOptionPane.WARNING_MESSAGE);	
		}
		if (total < 3.9) {
			JOptionPane.showMessageDialog(null, mC.n1D + "|" + mC.n2D + "|" + mC.n3D + "|" + mC.n4D + "| -> " + total + " -> REPROVADO!", "RESULTADO", JOptionPane.ERROR_MESSAGE );
		}
	    if (total > 6) {
	    	JOptionPane.showMessageDialog(null, mC.n1D + "|" + mC.n2D + "|" + mC.n3D + "|" + mC.n4D + "| -> " + total + " -> PARABÉNS, APROVADO!", "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
	    }
	    
	    continuar = JOptionPane.showInputDialog(null,"Desejar fazer uma nova somatória? <1 = Sim / 0 = Não>", "Novo processo?", JOptionPane.QUESTION_MESSAGE);
	    escolha = Integer.parseInt(continuar);
	    JOptionPane.showMessageDialog(null, "Obrigado pela preferência, " + nome + "!", " DESAFIO EDVALDO ",JOptionPane.CLOSED_OPTION); 	  
}
		System.exit(0);
}
}

