package reserva;

import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QMainWindow;

public class Main {

	public static void main(String[] args) {
		QApplication.initialize(args);
		QMainWindow mw = new QMainWindow();
//		VentanaPrincipal principal = new VentanaPrincipal();
//		principal.setupUi(mw);
        //TODO: elena descomentar
		ModalReserva modalReserva = new ModalReserva();
		ModalInformativo modalInformativo = new ModalInformativo();
//		modalInformativo.setupUi(mw);
        modalReserva.setupUi(mw);
        mw.show();
        QApplication.execStatic();
	}
}
