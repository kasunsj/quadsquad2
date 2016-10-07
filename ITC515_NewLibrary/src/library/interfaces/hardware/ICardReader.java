//the package where ICardReader.ajva exists
package library.interfaces.hardware;

//an interface ICardReader has been created
public interface ICardReader {
	
	//no return type method
	
	public void addListener(ICardReaderListener listener);

	public void setEnabled(boolean enabled);

}
