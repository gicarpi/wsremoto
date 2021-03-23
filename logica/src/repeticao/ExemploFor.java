package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {
	short tabuada = 0;
	short contador = 0;
	
	short tabuada = Short.parseShort(JOptionPane.showInputDialog("Tabuada"));
	for (int contador=1; contador<11; contador+=1) {
		System.out.println(tabuada+ "x" + contador + " = " +(tabuada*contador);
		
	}

}
