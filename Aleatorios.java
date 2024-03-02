package aleatorios;
import javax.swing.JOptionPane;

public class Aleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int elementos = Integer.parseInt(JOptionPane.showInputDialog("Teclea un numero + de uno=>"));
		int num_aleat[]=new int[elementos];
		for (int i = 0; i < num_aleat.length; i ++) {
			num_aleat[i] = (int)(Math.random()*100);//el paréntesis es necesario para que primero se multiplique el número aleatorio y luego se guarde como entero
		}
		for (int elem: num_aleat) {
			System.out.println(elem);
		}
	}
}