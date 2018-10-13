package extra;

import javax.swing.JOptionPane;

public class AREyouhappy {
public static void main(String[] args) {
	int result=JOptionPane.showConfirmDialog(null, "are you happy?????? ");
	if(result==0) {// Yes
		JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing");
	}
	else if (result==1) { //No
		JOptionPane.showMessageDialog(null, "result =1");
	}
	else { //Cancel
		JOptionPane.showMessageDialog(null, "result = other");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
}
