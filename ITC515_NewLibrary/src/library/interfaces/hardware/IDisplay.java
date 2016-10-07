//package where the IDisplay.java exists has been shown
package library.interfaces.hardware;

//importing javax's swing package
import javax.swing.JPanel;

//interface IDisplay has created
public interface IDisplay {
	
	//accessing Jpanel program's method getDisplay()
	public JPanel getDisplay();
	
	//no return type display method with Jpanle and a indentifier parameters
	public void setDisplay(JPanel panel, String identifier);
	
}
