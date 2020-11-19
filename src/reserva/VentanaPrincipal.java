package reserva; /********************************************************************************
 ** Form generated from reading ui file 'VentanaPrincipal.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.7
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/

import com.trolltech.qt.core.QCoreApplication;
import com.trolltech.qt.core.QRect;
import com.trolltech.qt.core.QSize;
import com.trolltech.qt.core.Qt;
import com.trolltech.qt.gui.*;

public class VentanaPrincipal implements com.trolltech.qt.QUiForm<QMainWindow> {
	public QAction nuevaReservaMenu;
	public QWidget ventana;
	public QPushButton nuevaReservaBoton;
	public QGraphicsView fondo;
	public QMenuBar barraMenu;
	public QMenu menuArchivo;
	public QLabel logo;

	public VentanaPrincipal() {
		super();
	}

	private void modalReserva() {
		ModalReserva Havana = new ModalReserva();
		QMainWindow dialog = new QMainWindow();
		Havana.setupUi(dialog);
		dialog.show();
	}

	public void setupUi(QMainWindow MainWindow) {
		MainWindow.setObjectName("MainWindow");
		MainWindow.resize(new QSize(360, 336).expandedTo(MainWindow.minimumSizeHint()));
		nuevaReservaMenu = new QAction(MainWindow);
		nuevaReservaMenu.setObjectName("nuevaReservaMenu");
		ventana = new QWidget(MainWindow);
		ventana.setObjectName("ventana");
		ventana.setAutoFillBackground(true);
		ventana.setBackgroundRole(QPalette.ColorRole.Light);
		nuevaReservaBoton = new QPushButton(ventana);
		nuevaReservaBoton.setObjectName("nuevaReservaBoton");
		nuevaReservaBoton.setGeometry(new QRect(100, 220, 151, 61));
		QFont font = new QFont();
		font.setFamily("Segoe UI Semibold");
		font.setPointSize(12);
		font.setBold(true);
		font.setWeight(75);
		nuevaReservaBoton.setFont(font);
		nuevaReservaBoton.setCursor(new QCursor(Qt.CursorShape.ArrowCursor));
		MainWindow.setCentralWidget(ventana);
		barraMenu = new QMenuBar(MainWindow);
		barraMenu.setObjectName("barraMenu");
		barraMenu.setGeometry(new QRect(0, 0, 350, 21));
		//TODO: ver como se pone una ventana
		logo = new QLabel(ventana);
		logo.setObjectName("imagen");
		logo.setGeometry(new QRect(-30, -10, 350, 194));
		logo.setPixmap(new QPixmap("classpath:/logo.png"));
		menuArchivo = new QMenu(barraMenu);
		menuArchivo.setObjectName("menuArchivo");
		MainWindow.setMenuBar(barraMenu);
        barraMenu.addAction(menuArchivo.menuAction());
        menuArchivo.addAction(nuevaReservaMenu);

        nuevaReservaMenu.triggered.connect(this, "modalReserva()");
		nuevaReservaBoton.clicked.connect(this, "modalReserva()");
		retranslateUi(MainWindow);

		MainWindow.connectSlotsByName();
	} // setupUi

	void retranslateUi(QMainWindow MainWindow) {
		MainWindow.setWindowTitle(QCoreApplication.translate("MainWindow", "MainWindow", null));
		nuevaReservaMenu.setText(QCoreApplication.translate("MainWindow", "Nueva reserva...", null));
		nuevaReservaBoton.setStatusTip(QCoreApplication.translate("MainWindow", "Haga click para reservar el sal\u00f3n Havana", null));
		nuevaReservaBoton.setText(QCoreApplication.translate("MainWindow", "Reservar Sal\u00f3n", null));
		menuArchivo.setTitle(QCoreApplication.translate("MainWindow", "Archivo", null));
	} // retranslateUi

}

