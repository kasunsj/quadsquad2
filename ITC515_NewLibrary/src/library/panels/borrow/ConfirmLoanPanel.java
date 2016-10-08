package library.panels.borrow;

//importing javax swing package
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import library.interfaces.IBorrowUIListener;

import java.awt.Font;

public class ConfirmLoanPanel extends ABorrowPanel {

	//private static final long variable
	private static final long serialVersionUID = 1L;
	private JTextArea loanListTA;

	/**
	 * Create the panel.
	 */
	//ocnstructor with a listener
	public ConfirmLoanPanel(IBorrowUIListener listener) {
		setLayout(null);
		setBorder(new TitledBorder(null, "Confirm Loans", TitledBorder.LEADING, TitledBorder.TOP, null, null));//setting horizontal alignment
		setBounds(12, 23, 460, 640);//setting bounds
		
		//definition and initialization of the JPanel,and its alignment border,layout 
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Current Loan List", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(12, 24, 415, 496);
		this.add(panel);
		panel.setLayout(null);
		
		//definition and initialization of the JScrollPane,and its alignment border,layout 
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 20, 395, 463);
		panel.add(scrollPane);
		
		//initiation of the JTextArea and also setting its edtitable feature  
		loanListTA = new JTextArea();
		loanListTA.setEditable(false);
		scrollPane.setViewportView(loanListTA);

		//definition and initialization of the JButton,and its alignment border,seeting font,layout 
		JButton btnReject = new JButton("Reject");
		btnReject.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnReject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				listener.loansRejected();
			}
		});
		btnReject.setBounds(173, 533, 115, 35);
		this.add(btnReject);
		
		//definition and initialization of the JButton,and its alignment border,layout and its alignment
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listener.loansConfirmed();
			}
		});
		btnConfirm.setBounds(30, 533, 115, 35);
		this.add(btnConfirm);
		
		//definition and initialization of the JButton and its listener
		JButton button = new JButton("Cancel");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				listener.cancelled();
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button.setBounds(312, 533, 115, 35);
		add(button);
	}


	@Override
	public void displayConfirmingLoan(String loanDetails) {
		loanListTA.setText(loanDetails);
		loanListTA.setCaretPosition(0);
	}


}