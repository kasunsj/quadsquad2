package library.panels.borrow;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import library.interfaces.IBorrowUIListener;


public class SwipeCardPanel extends ABorrowPanel {

	private static final long serialVersionUID = 1L;
	private JLabel lblErrMesg;

	/**
	 * Create the panel.
	 */
	public SwipeCardPanel(final IBorrowUIListener listener) {
		setLayout(null);
		setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Borrow Book - Initialized", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		setBounds(12, 23, 460, 640);
		//setBounds(12, 23, 614, 451);
		
		JLabel lblSwipeCard = new JLabel("Swipe Card Please");
		lblSwipeCard.setHorizontalAlignment(SwingConstants.CENTER);
		lblSwipeCard.setFont(new Font("Tahoma", Font.PLAIN, 42));
		lblSwipeCard.setBounds(12, 181, 436, 78);
		add(lblSwipeCard);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                          
				listener.cancelled();
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCancel.setBounds(170, 320, 127, 35);
		add(btnCancel);
		
		lblErrMesg = new JLabel();
		lblErrMesg.setForeground(Color.RED);
		lblErrMesg.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblErrMesg.setBounds(12, 592, 434, 29);
		this.add(lblErrMesg);

	}

	@Override
	public void displayErrorMessage(String errorMesg) {
		lblErrMesg.setText(errorMesg);		
	}

	
}
