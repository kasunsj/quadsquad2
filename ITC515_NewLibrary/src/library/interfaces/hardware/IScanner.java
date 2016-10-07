//packageIScanner.java is there
package library.interfaces.hardware;

//ISacnner interface created
public interface IScanner {
	
	//adding listener method wiTH IScannerListener parameter
	public void addListener(IScannerListener listener);
	
	//no return type method with boolean parameter
	public void setEnabled(boolean enabled);

}
