package gui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;

import java.io.File;
import java.io.FileWriter;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Text;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import data.Person;

import org.eclipse.swt.widgets.Label;

public class MyFirstWindow {

	protected Shell shlFrWindow;
	private Text VornameTF;
	private Text NachnameTF;
	private Label lblPlz;
	private Label lblOrt;
	private Label lblStrae;
	private Label lblHausnummer;
	private Text StraﬂeTF;
	private Text HausnummerTF;
	private Text OrtTF;
	private Text PLZTF;
	private Label vornameOut;
	private Label nachnameOut;
	private Label PLZOut;
	private Label OrtOut;
	private Label StraﬂeOut;
	private Label HausnummerOut;

	/**
	 * Launch the application.
	 * 
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
	//			System.out.println("Maus ¸ber Knoppe bewegt");
	//			//
	//			System.out.println("Maus auf: " + me.x + " / " + me.y);
				
			}
		});
		button1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("Knoppe gedr¸ckt");
				//
				System.out.println(VornameTF.getText());
				System.out.println(NachnameTF.getText());
				System.out.println(PLZTF.getText());
				System.out.println(OrtTF.getText());
				System.out.println(StraﬂeTF.getText());
				System.out.println(HausnummerTF.getText());
				//
				getVornameOut().setText(getVornameTF().getText());
				getNachnameOut().setText(getNachnameTF().getText());
				getPLZOut().setText(getPLZTF().getText());
				getOrtOut().setText(getOrtTF().getText());
				getStraﬂeOut().setText(getStraﬂeTF().getText());
				getHausnummerOut().setText(getHausnummerTF().getText());

			}
		});
		button1.setBounds(20, 10, 95, 39);
		button1.setText("Mein 1. Knopf");
		
		VornameTF = new Text(shlFrWindow, SWT.BORDER);
		VornameTF.setBounds(122, 67, 95, 21);
		
		Label lblVorname = new Label(shlFrWindow, SWT.NONE);
		lblVorname.setBounds(35, 70, 54, 15);
		lblVorname.setText("Vorname");
		
		Label lblNachname = new Label(shlFrWindow, SWT.NONE);
		lblNachname.setBounds(35, 109, 78, 15);
		lblNachname.setText("Nachname");
		
		NachnameTF = new Text(shlFrWindow, SWT.BORDER);
		NachnameTF.setBounds(122, 106, 95, 21);
		
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
		
		PLZTF = new Text(shlFrWindow, SWT.BORDER);
		PLZTF.setBounds(122, 130, 95, 21);
		
		OrtTF = new Text(shlFrWindow, SWT.BORDER);
		OrtTF.setBounds(122, 160, 95, 21);
		
		StraﬂeTF = new Text(shlFrWindow, SWT.BORDER);
		StraﬂeTF.setBounds(122, 184, 95, 21);
		
		HausnummerTF = new Text(shlFrWindow, SWT.BORDER);
		HausnummerTF.setBounds(122, 214, 95, 21);
		
		vornameOut = new Label(shlFrWindow, SWT.NONE);
		vornameOut.setBounds(241, 70, 66, 18);
		
		nachnameOut = new Label(shlFrWindow, SWT.NONE);
		nachnameOut.setBounds(241, 109, 55, 21);
		
		PLZOut = new Label(shlFrWindow, SWT.NONE);
		PLZOut.setBounds(241, 133, 55, 15);
		
		OrtOut = new Label(shlFrWindow, SWT.NONE);
		OrtOut.setBounds(241, 166, 55, 15);
		
		StraﬂeOut = new Label(shlFrWindow, SWT.NONE);
		StraﬂeOut.setBounds(241, 187, 122, 15);
		
		HausnummerOut = new Label(shlFrWindow, SWT.NONE);
		HausnummerOut.setBounds(241, 217, 55, 15);
		
		Button btnSafeClean = new Button(shlFrWindow, SWT.NONE);
		btnSafeClean.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Person p; // Variablen-Definition
				p = new Person(); // Variablen-Instanz
				//
				p.setVorname(getVornameTF().getText());
				p.setNachname(getNachnameTF().getText());
				p.setPLZ(getPLZTF().getText());
				p.setOrt(getOrtTF().getText());
				p.setStraﬂe(getStraﬂeTF().getText());
				p.setHausnummer(getHausnummerTF().getText());
				//
				System.out.println("--------");
				System.out.println("Objekt");
				System.out.println(p);
				//
				Person.getPersonenListe().add(p);
				System.out.println("--------");
				System.out.println("Liste:");
				System.out.println(Person.getPersonenListe());
				//
				// finally clean fields
				getVornameTF().setText("");
				getNachnameTF().setText("");
				getPLZTF().setText("");
				getOrtTF().setText("");
				getStraﬂeTF().setText("");
				getHausnummerTF().setText("");
				
			}
		});
		btnSafeClean.setBounds(158, 10, 95, 39);
		btnSafeClean.setText("Safe & Clean");
		
		Button btnNewButton = new Button(shlFrWindow, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Gson gson = new GsonBuilder().setPrettyPrinting().create();
				gson.serializeNulls();
				String jsonString = gson.toJson(Person.getPersonenListe());
				System.out.println(jsonString);
				//
				// im explorer %TEMP%
				//
				try {
				FileWriter fw = new FileWriter(File.createTempFile("wpfjson",".json"));
				//
						gson.toJson(Person.getPersonenListe(),fw);
						//
						fw.flush();
						fw.close();
				} catch (Exception ex) {
			}
			}
		});
		btnNewButton.setBounds(309, 10, 78, 39);
		btnNewButton.setText("2Json");

	}

	public Label getVornameOut() {
		return vornameOut;
	}

	public Label getNachnameOut() {
		return nachnameOut;
	}

	public Label getPLZOut() {
		return PLZOut;
	}

	public Label getOrtOut() {
		return OrtOut;
	}

	public Label getStraﬂeOut() {
		return StraﬂeOut;
	}

	public Label getHausnummerOut() {
		return HausnummerOut;
	}

	public Text getVornameTF() {
		return VornameTF;
	}

	public Text getNachnameTF() {
		return NachnameTF;
	}

	public Text getPLZTF() {
		return PLZTF;
	}

	public Text getOrtTF() {
		return OrtTF;
	}

	public Text getStraﬂeTF() {
		return StraﬂeTF;
	}

	public Text getHausnummerTF() {
		return HausnummerTF;
	}
}
