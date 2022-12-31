package praktikum05;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
public class Latihan02 {

		public static void main(String[] args) {
			ArrayList<ArrayList<Integer> > matriksA =
			new ArrayList<ArrayList<Integer> >();
			ArrayList<ArrayList<Integer> > matriksB =
			new ArrayList<ArrayList<Integer> >();
			
			int ordo = 2;
			String value = "";
			
			String outputA = "MatriksA: \n";
			String outputB = "MatriksB: \n";
			
			for(int i =0; i<ordo; i++) {
				for(int j=0; j<ordo; j++) {
				matriksA.add(new ArrayList<Integer>());
				value = JOptionPane.showInputDialog(null,"Masukkan angka: ","Matriks A ke-["+i+"]"+"["+j+"]",JOptionPane.QUESTION_MESSAGE);
				matriksA.get(i).add(j, Integer.parseInt(value));
			}
				}
			
			for(int i =0; i<ordo; i++) {
				for(int j=0; j<ordo; j++) {
				outputA += matriksA.get(i).get(j) + " ";
			}
				outputA += "\n";
				}
			for(int i =0; i<ordo; i++) {
				for(int j=0; j<ordo; j++) {
				matriksB.add(new ArrayList<Integer>());
				value = JOptionPane.showInputDialog(null,"Masukkan angka: ","Matriks B ke-["+i+"]"+"["+j+"]",JOptionPane.QUESTION_MESSAGE);
				matriksB.get(i).add(j, Integer.parseInt(value));
				
				}
			}
				
				for(int i =0; i<ordo; i++) {
					for(int j=0; j<ordo; j++) {
					outputB += matriksB.get(i).get(j) + " ";
				}
					outputB+= "\n";
			}
			JOptionPane.showMessageDialog(null, outputA+outputB);
	}
}


