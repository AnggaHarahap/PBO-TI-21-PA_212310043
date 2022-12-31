package praktikum05;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import java.util.Collections;
import java.util.Comparator;
public class latihan05 {
	
	static ArrayList<String> isian = new ArrayList<String>();
	 static ArrayList<ArrayList<String>> hasil = new ArrayList<ArrayList<String>>();
	 
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		  isian.add("Nama Lengkap");
	      isian.add("Alamat");
	      isian.add("No. Telp");
	      
	      for(int i = 0; i < isian.size(); i++) {
	          hasil.add(new ArrayList<String>());
	          for(int j = 0; j < isian.size(); j++) {
	              String values = JOptionPane.showInputDialog(null,
	                              "Masukkan " + isian.get(j) + ":",
	                              "Data input ke - " + i,
	                              JOptionPane.QUESTION_MESSAGE);
	              hasil.get(i).add(j, values);
	          }
	      }
	      Collections.sort(hasil, new Comparator<ArrayList<String>>() {
	            @Override
	            public int compare(ArrayList<String> o1, ArrayList<String> o2) {
	                return o1.get(0).compareTo(o2.get(0));
	            }
	        });
	      String print_hasil = Printisian(hasil);

	      JOptionPane.showMessageDialog(null, print_hasil, "Output", JOptionPane.INFORMATION_MESSAGE);
	  }

		private static String Printisian(ArrayList<ArrayList<String>> hasil2) {
			String output = "";
	        for(int i = 0; i < isian.size(); i++) {
	            for(int j = 0; j < isian.size(); j++) {
	                output += isian.get(j) + ": " + hasil2.get(i).get(j) + "\n";
		
		}
	            output += "\n";
		}
	    	return output;

	}

}
