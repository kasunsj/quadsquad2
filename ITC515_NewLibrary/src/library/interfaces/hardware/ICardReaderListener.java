//package where ICardReaderListenre located
package library.interfaces.hardware;

//an interface ICardReaderListenenr has been created
public interface ICardReaderListener {
	
	//cardswipe method with no return type and integer parameter
	public void cardSwiped(int cardData);

}
