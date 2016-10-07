//the package where ICardReader.ajva exists
package library.interfaces.hardware;

//an interface which public ICardReader has been created
public interface ICardReader {
	
	//no return type method
	//Listener method with ICardReaderListemner has been created
	public void addListener(ICardReaderListener listener);

	//no return type method with boolean parameter has been created
	public void setEnabled(boolean enabled);

}
