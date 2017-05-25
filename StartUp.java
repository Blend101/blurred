import javax.swing.JOptionPane;

public class StartUp {
	public StartUp(){
		JOptionPane.showMessageDialog(null, "WELCOME TO THE GAME! \n \n There are 3 rows that enemies will attack from. \n You will lose health whenever an enemy"
				+ "reaches the end of a row. \n \n Use W and S to move up and down between rows. \n Use I for light attack and O for heavy. \n Use P for your ultimate, which takes time to recharge. \n \n CLICK OK TO BEGIN!");
	}
}
