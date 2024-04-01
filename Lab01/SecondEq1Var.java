import javax.swing.JOptionPane;
import java.lang.Math;
public class SecondEq1Var {

	public static void main(String[] args) {
		String stra, strb, strc;
		stra = JOptionPane.showInputDialog(null,"Please enter a = ",JOptionPane.INFORMATION_MESSAGE);
		strb = JOptionPane.showInputDialog(null,"Please enter b = ",JOptionPane.INFORMATION_MESSAGE);
		strc = JOptionPane.showInputDialog(null,"Please enter c = ",JOptionPane.INFORMATION_MESSAGE);
		double a = Double.parseDouble(stra);
		double b = Double.parseDouble(strb);
		double c = Double.parseDouble(strc);
		double delta = b*b - 4*a*c;
		if(a == 0) {
			if(b == 0) {
				if(c == 0) {
					JOptionPane.showMessageDialog(null,"Infinite solution");
				}else {
					JOptionPane.showMessageDialog(null,"No solution");
				}
			}else {
				double X = -c/b;
				JOptionPane.showMessageDialog(null,"There is one solution x = "+X);
			}
		}else {
			if(delta <0) {
				JOptionPane.showMessageDialog(null,"No solution");
			}else if(delta == 0) {
				double x = -b/(2*a);
				JOptionPane.showMessageDialog(null,"There are one solutions x = "+ x);
			}else {
				double x1 = (-b + Math.sqrt(delta))/(2*a);
				double x2 = (-b - Math.sqrt(delta))/(2*a);
				JOptionPane.showMessageDialog(null,"There are two solutions x1 = "+ x1 + " ,x2 = "+x2);
			}
		}
		System.exit(0);

	}

}
