package gui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;

public class MyFirstWindow {

	protected Shell shlFrWindow;
	private Text Vorname;
	private Text Nachname;
	private Label lblPlz;
	private Label lblOrt;
	private Label lblStrae;
	private Label lblHausnummer;
	private Text Straße;
	private Text Hausnummer;
	private Text Ort;
	private Text PLZ;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MyFirstWindow window = new MyFirstWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlFrWindow.open();
		shlFrWindow.layout();
		while (!shlFrWindow.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlFrWindow = new Shell();
		shlFrWindow.setSize(450, 300);
		shlFrWindow.setText("FR Window");
		
		Button button1 = new Button(shlFrWindow, SWT.NONE);
		button1.addMouseMoveListener(new MouseMoveListener() {
			public void mouseMove(MouseEvent me) {
				System.out.println("Maus über Knoppe bewegt");
				//
				System.out.println("Maus auf: " + me.x + " / " + me.y);
				
			}
		});
		button1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("Knoppe gedrückt");
				//
				System.out.println(Vorname.getText());
				System.out.println(Nachname.getText());
				System.out.println(PLZ.getText());
				System.out.println(Ort.getText());
				System.out.println(Straße.getText());
				System.out.println(Hausnummer.getText());
				
			}
		});
		button1.setBounds(20, 10, 95, 39);
		button1.setText("Mein 1. Knopf");
		
		Vorname = new Text(shlFrWindow, SWT.BORDER);
		Vorname.setBounds(122, 67, 76, 21);
		
		Label lblVorname = new Label(shlFrWindow, SWT.NONE);
		lblVorname.setBounds(35, 70, 54, 15);
		lblVorname.setText("Vorname");
		
		Label lblNachname = new Label(shlFrWindow, SWT.NONE);
		lblNachname.setBounds(35, 109, 78, 15);
		lblNachname.setText("Nachname");
		
		Nachname = new Text(shlFrWindow, SWT.BORDER);
		Nachname.setBounds(122, 106, 76, 21);
		
		lblPlz = new Label(shlFrWindow, SWT.NONE);
		lblPlz.setBounds(35, 130, 55, 15);
		lblPlz.setText("PLZ");
		
		lblOrt = new Label(shlFrWindow, SWT.NONE);
		lblOrt.setBounds(35, 166, 55, 15);
		lblOrt.setText("Ort");
		
		lblStrae = new Label(shlFrWindow, SWT.NONE);
		lblStrae.setBounds(35, 187, 55, 15);
		lblStrae.setText("Stra\u00DFe");
		
		lblHausnummer = new Label(shlFrWindow, SWT.NONE);
		lblHausnummer.setBounds(35, 217, 80, 15);
		lblHausnummer.setText("Hausnummer");
		
		Straße = new Text(shlFrWindow, SWT.BORDER);
		Straße.setBounds(122, 184, 76, 21);
		
		Hausnummer = new Text(shlFrWindow, SWT.BORDER);
		Hausnummer.setBounds(122, 214, 76, 21);
		
		Ort = new Text(shlFrWindow, SWT.BORDER);
		Ort.setBounds(122, 160, 76, 21);
		
		PLZ = new Text(shlFrWindow, SWT.BORDER);
		PLZ.setBounds(122, 130, 76, 21);

	}
}
