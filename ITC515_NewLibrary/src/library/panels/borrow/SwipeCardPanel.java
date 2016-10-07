//package where swipecardpanel exists
package library.panels.borrow;

//importing javax swing package
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import library.interfaces.IBorrowUIListener;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Color;


public class SwipeCardPanel extends ABorrowPanel {

	//orivate static final long variable
	private static final long serialVersionUID = 1L;
	private JLabel lblErrMesg;

	/**
	 * Create the panel.
	 */
	//constructor with listener parameter
	public SwipeCardPanel(IBorrowUIListener listener) {
		setLayout(null);
		setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Borrow Book - Initialized", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setBounds(12, 23, 460, 640);
		//setBounds(12, 23, 614, 451);
		
		//definition and initiation of the JLabel 
		JLabel lblSwipeCard = new JLabel("Swipe Card Please");
		lblSwipeCard.setHorizontalAlignment(SwingConstants.CENTER);
		lblSwipeCard.setFont(new Font("Tahoma", Font.PLAIN, 42));
		lblSwipeCard.setBounds(12, 181, 436, 78);
		add(lblSwipeCard);
		
		//initiation and definiton of jbutton
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				listener.cancelled();
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCancel.setBounds(170, 320, 127, 35);
		add(btnCancel);
		
		lblErrMesg = new JLabel();  //initiation of label error message
		lblErrMesg.setForeground(Color.RED); //font style 
		lblErrMesg.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblErrMesg.setBounds(12, 592, 434, 29);
		this.add(lblErrMesg);

	}

	@Override
	public void displayErrorMessage(String errorMesg) {
		lblErrMesg.setText(errorMesg);		
	}

	
}
