import javax.swing.JOptionPane;
public class FirstEqn2Var {

	public static void main(String[] args) {
		String stra1, strb1, strc1, stra2, strb2, strc2;
		stra1 = JOptionPane.showInputDialog(null,"Please enter a1 = ",JOptionPane.INFORMATION_MESSAGE);
		strb1 = JOptionPane.showInputDialog(null,"Please enter b1 = ",JOptionPane.INFORMATION_MESSAGE);
		strc1 = JOptionPane.showInputDialog(null,"Please enter c1 = ",JOptionPane.INFORMATION_MESSAGE);
		stra2 = JOptionPane.showInputDialog(null,"Please enter a2 = ",JOptionPane.INFORMATION_MESSAGE);
		strb2 = JOptionPane.showInputDialog(null,"Please enter b2 = ",JOptionPane.INFORMATION_MESSAGE);
		strc2 = JOptionPane.showInputDialog(null,"Please enter c2 = ",JOptionPane.INFORMATION_MESSAGE);
		double a1 = Double.parseDouble(stra1);
		double b1 = Double.parseDouble(strb1);
		double c1 = Double.parseDouble(strc1);
		double a2 = Double.parseDouble(stra2);
		double b2 = Double.parseDouble(strb2);
		double c2 = Double.parseDouble(strc2);
		Double D = a1*b2 - a2*b1;
		Double D1 = c1*b2 - c2*b1;
		Double D2 = a1*c2 - a2*c1;
		if(D==0) {
			if(D1==0 && D2 == 0) {
				JOptionPane.showMessageDialog(null,"The system has infinite solution");
			}else {
				JOptionPane.showMessageDialog(null,"The system has no soltion");
			}
		}else {
			double x = D1/D;
			double y = D2/D;
			JOptionPane.showMessageDialog(null,"The system has solution x = "+x+" ,y = "+y);
		}

	}

}
