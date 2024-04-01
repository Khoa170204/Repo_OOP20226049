import javax.swing.JOptionPane;
public class Ex225 {

	public static void main(String[] args) {
		String strNum1, strNum2;
		strNum1 = JOptionPane.showInputDialog(null,"Please input the first number: ",JOptionPane.INFORMATION_MESSAGE);
		strNum2 = JOptionPane.showInputDialog(null,"Please input the second number: ",JOptionPane.INFORMATION_MESSAGE);
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
		double sum = num1 + num2;
		JOptionPane.showMessageDialog(null,"The sum off the first number and the second number is: "+sum);
		double different = num1 - num2;
		JOptionPane.showMessageDialog(null,"The different off the first number and the second number is: "+different);
		double product = num1 * num2;
		JOptionPane.showMessageDialog(null,"The product off the first number and the second number is: "+product);
		if(num2!=0) {
			double quotient = num1 / num2;
			JOptionPane.showMessageDialog(null,"The quotient off the first number and the second number is: "+quotient);
		}else {
			JOptionPane.showMessageDialog(null,"There are no quotient between the first number and the second number");
		}
	}

}
