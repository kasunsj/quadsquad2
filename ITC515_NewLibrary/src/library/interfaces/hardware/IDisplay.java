//package where the IDisplay.java exists has been shown
package library.interfaces.hardware;

//importing javax's swing package
import javax.swing.JPanel;

public interface IDisplay {
	
	public JPanel getDisplay();
	public void setDisplay(JPanel panel, String identifier);
	
}
