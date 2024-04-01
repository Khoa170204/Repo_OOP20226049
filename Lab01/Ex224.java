import javax.swing.JOptionPane;
public class Ex224 {

	public static void main(String[] args) {
		String strNum1, strNum2;
		String Noti = "You have just entered: ";
		strNum1 = JOptionPane.showInputDialog(null,"Please input the first number: ",JOptionPane.INFORMATION_MESSAGE);
		Noti += strNum1 + " and ";
		strNum2 = JOptionPane.showInputDialog(null,"Please input the second number: ",JOptionPane.INFORMATION_MESSAGE);
		Noti += strNum2;
		JOptionPane.showMessageDialog(null,Noti,"Show two number",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

}
