import javax.swing.JOptionPane;
public class FirstEqn1Var {

	public static void main(String[] args) {
		String stra, strb;
		stra = JOptionPane.showInputDialog(null,"Please enter a = ",JOptionPane.INFORMATION_MESSAGE);
		strb = JOptionPane.showInputDialog(null,"Please enter b = ",JOptionPane.INFORMATION_MESSAGE);
		double a = Double.parseDouble(stra);
		double b = Double.parseDouble(strb);
		if(a ==0 ) {
			if(b == 0) {
				JOptionPane.showMessageDialog(null,"Infinite solution!");
			}else {
				JOptionPane.showMessageDialog(null,"No solution!");
			}
		}else {
			double x = -b/a;
			JOptionPane.showMessageDialog(null,"There is 1 solution x = "+x);
		}
		System.exit(0);
	}

}
