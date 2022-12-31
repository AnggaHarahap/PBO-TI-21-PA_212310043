package praktikum05;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
public class Latihan03 {

	public static void main(String[] args) {
					ArrayList<ArrayList<Integer> > matriksA =
					new ArrayList<ArrayList<Integer> >();
					ArrayList<ArrayList<Integer> > matriksB =
					new ArrayList<ArrayList<Integer> >();
					ArrayList<ArrayList<Integer> > total =
					new ArrayList<ArrayList<Integer> >();
					
					int ordo = 2;
					String value = "";
					
					String outputA = "MatriksA: \n";
					String outputB = "MatriksB: \n";
					String outputC = "MatriksC: \n";
					
					
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
					int matriksC = 0;
					for(int i =0; i<ordo; i++) {
						total.add(new ArrayList<Integer>());
						for(int j=0; j<ordo; j++) {
							for(int k=0; k<ordo; k++) {
						
						matriksC = matriksC + matriksA.get(i).get(k) * matriksB.get(k).get(j);
						}
						  total.get(i).add(j, matriksC);
			               matriksC = 0;
					}
					}	
						for(int i =0; i<ordo; i++) {
							for(int j=0; j<ordo; j++) {
							outputB += matriksB.get(i).get(j) + " ";
						}
							outputB+= "\n";
					}
					
					JOptionPane.showMessageDialog(null, outputA+outputB+total);
			}
	}


