package reserva; /********************************************************************************
 ** Form generated from reading ui file 'ModalReserva.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.7
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

import java.time.LocalDate;
import java.util.Arrays;

public class ModalReserva implements com.trolltech.qt.QUiForm<QMainWindow> {
	public QWidget centralwidget;
	public QGroupBox datoPersonalesGroup;
	public QLabel nombre;
	public QLabel telefono;
	public QLineEdit nombreField;
	public QLineEdit telefonoField;
	public QGroupBox datosReservaGroup;
	public QRadioButton banqueteBoton;
	public QRadioButton congresoBoton;
	public QRadioButton jornadaBoton;
	public QGroupBox DatosEventoGroup;
	public QComboBox tipoCocinaComboBox;
	public QLabel fechaEventoLabel;
	public QDateTimeEdit fechaEventoSpinner;
	public QLabel tipoCocinaLabel;
	public QLabel numeroPersonasLabel;
	public QSpinBox numeroPersonasSpinner;

	public QLabel tipoBanqueteLabel;
	public QGroupBox datosEscondidosGroup;
	public QSpinBox numeroJornadasSpinner;
	public QLabel numeroJornadas;
	public QLabel requiereHabitaciones;
	public QRadioButton botonRadioEscondidoArriba;
	public QRadioButton botonRadioEscondidoAbajo;
	public QPushButton reservarBoton;
	public QStatusBar statusbar;

	public ModalReserva() {
		super();
	}

	public void setupUi(QMainWindow MainWindow) {
		MainWindow.setObjectName("MainWindow");
		MainWindow.setWindowModality(Qt.WindowModality.WindowModal);
		MainWindow.resize(new QSize(478, 366).expandedTo(MainWindow.minimumSizeHint()));
		centralwidget = new QWidget(MainWindow);
		centralwidget.setObjectName("centralwidget");
		QPalette palette = new QPalette();
		palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Base, new QColor(255, 255, 255));
		palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Window, new QColor(255, 255, 255));
		palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Base, new QColor(255, 255, 255));
		palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Window, new QColor(255, 255, 255));
		palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Base, new QColor(255, 255, 255));
		palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Window, new QColor(255, 255, 255));
		centralwidget.setPalette(palette);
		centralwidget.setAutoFillBackground(true);

		datoPersonalesGroup = new QGroupBox(centralwidget);
		datoPersonalesGroup.setObjectName("datoPersonalesGroup");
		datoPersonalesGroup.setGeometry(new QRect(30, 20, 421, 80));
		nombre = new QLabel(datoPersonalesGroup);
		nombre.setObjectName("nombreLabel");
		nombre.setGeometry(new QRect(20, 20, 47, 13));
		telefono = new QLabel(datoPersonalesGroup);
		telefono.setObjectName("telefono");
		telefono.setGeometry(new QRect(20, 50, 47, 13));
		nombreField = new QLineEdit(datoPersonalesGroup);
		nombreField.setObjectName("nombreField");
		nombreField.setGeometry(new QRect(80, 20, 331, 20));
		telefonoField = new QLineEdit(datoPersonalesGroup);
		telefonoField.setObjectName("telefonoField");
		telefonoField.setGeometry(new QRect(80, 50, 331, 20));
		datosReservaGroup = new QGroupBox(centralwidget);
		datosReservaGroup.setObjectName("datosReservaGroup");
		datosReservaGroup.setGeometry(new QRect(30, 110, 421, 121));
		banqueteBoton = new QRadioButton(datosReservaGroup);
		banqueteBoton.setObjectName("banqueteBoton");
		banqueteBoton.setGeometry(new QRect(120, 20, 82, 17));
		congresoBoton = new QRadioButton(datosReservaGroup);
		congresoBoton.setObjectName("congresoBoton");
		congresoBoton.setGeometry(new QRect(230, 20, 71, 17));
		jornadaBoton = new QRadioButton(datosReservaGroup);
		//Dejamos pulsado el botón jornada por defecto para que no muestre los campos ocultos
		jornadaBoton.click();
		jornadaBoton.setObjectName("jornadaBoton");
		jornadaBoton.setGeometry(new QRect(330, 20, 82, 17));
		DatosEventoGroup = new QGroupBox(datosReservaGroup);
		DatosEventoGroup.setObjectName("DatosEventoGroup");
		DatosEventoGroup.setGeometry(new QRect(10, 40, 401, 71));
		tipoCocinaComboBox = new QComboBox(DatosEventoGroup);
		tipoCocinaComboBox.addItems(Arrays.asList("Buffet", "Carta",
												  "Cita con el chef", "No precisa"));
		tipoCocinaComboBox.setObjectName("tipoCocinaComboBox");
		tipoCocinaComboBox.setGeometry(new QRect(110, 40, 90, 22));
		fechaEventoLabel = new QLabel(DatosEventoGroup);
		fechaEventoLabel.setObjectName("fechaEventoLabel");
		fechaEventoLabel.setGeometry(new QRect(10, 10, 101, 20));
		fechaEventoSpinner = new QDateTimeEdit(DatosEventoGroup);
		fechaEventoSpinner.setObjectName("fechaEventoSpinner");
		fechaEventoSpinner.setGeometry(new QRect(110, 10, 281, 22));
		fechaEventoSpinner.setCalendarPopup(true);
		LocalDate hoy = LocalDate.now();
		fechaEventoSpinner.setMinimumDate(new QDate(hoy.getYear(),
													hoy.getMonthValue(),
													hoy.getDayOfMonth()));
		fechaEventoSpinner.setMaximumDate(new QDate(2030, 12, 31));
		tipoCocinaLabel = new QLabel(DatosEventoGroup);
		tipoCocinaLabel.setObjectName("tipoCocinaLabel");
		tipoCocinaLabel.setGeometry(new QRect(10, 40, 81, 20));
		numeroPersonasLabel = new QLabel(DatosEventoGroup);
		numeroPersonasLabel.setObjectName("numeroPersonasLabel");
		numeroPersonasLabel.setGeometry(new QRect(230, 40, 91, 16));
		numeroPersonasSpinner = new QSpinBox(DatosEventoGroup);
		numeroPersonasSpinner.setObjectName("numeroPersonasSpinner");
		numeroPersonasSpinner.setGeometry(new QRect(341, 40, 51, 22));
		numeroPersonasSpinner.setMinimum(1);
		tipoBanqueteLabel = new QLabel(datosReservaGroup);
		tipoBanqueteLabel.setObjectName("tipoBanqueteLabel");
		tipoBanqueteLabel.setGeometry(new QRect(20, 20, 81, 16));

		datosEscondidosGroup = new QGroupBox(centralwidget);
		datosEscondidosGroup.setObjectName("datosEscondidosGroup");
		datosEscondidosGroup.setGeometry(new QRect(30, 239, 421, 51));
		numeroJornadasSpinner = new QSpinBox(datosEscondidosGroup);
		numeroJornadasSpinner.setObjectName("numeroJornadasSpinner");
		numeroJornadasSpinner.setGeometry(new QRect(120, 10, 42, 22));
		numeroJornadas = new QLabel(datosEscondidosGroup);
		numeroJornadas.setObjectName("numeroJornadas");
		numeroJornadas.setGeometry(new QRect(20, 10, 120, 30));
		requiereHabitaciones = new QLabel(datosEscondidosGroup);
		requiereHabitaciones.setObjectName("requiereHabitaciones");
		requiereHabitaciones.setGeometry(new QRect(220, 10, 111, 20));
		botonRadioEscondidoArriba = new QRadioButton(datosEscondidosGroup);
		botonRadioEscondidoArriba.setObjectName("botonRadioEscondidoArriba");
		botonRadioEscondidoArriba.setGeometry(new QRect(340, 5, 100, 17));
		botonRadioEscondidoAbajo = new QRadioButton(datosEscondidosGroup);
		botonRadioEscondidoAbajo.setObjectName("botonRadiEscondidoArriba");
		botonRadioEscondidoAbajo.setGeometry(new QRect(340, 30, 100, 17));

		reservarBoton = new QPushButton(centralwidget);
		//todo: elena logica al pulsar boton
		reservarBoton.setObjectName("reservarBoton");
		reservarBoton.setGeometry(new QRect(330, 300, 121, 41));

		QFont font = new QFont();
		font.setFamily("Segoe UI Semibold");
		font.setPointSize(12);
		font.setBold(true);
		font.setWeight(75);
		reservarBoton.setFont(font);
		MainWindow.setCentralWidget(centralwidget);
		statusbar = new QStatusBar(MainWindow);
		statusbar.setObjectName("statusbar");
		MainWindow.setStatusBar(statusbar);
		retranslateUi(MainWindow);

		//Escondemos los campos para que aparezcan al pulsar determinado boton
		ocultarOpcionesEspeciales();

		nombreField.textEdited.connect(this, "comprobarNombre()");
		nombreField.textChanged.connect(this, "comprobarNombre()");
		telefonoField.editingFinished.connect(this, "comprobarTelefono()");
		banqueteBoton.clicked.connect(this, "mostrarOpcionesBanquete()");
		banqueteBoton.released.connect(this, "ocultarOpcionesEspeciales()");
		congresoBoton.pressed.connect(this, "mostrarOpcionesCongreso()");
		jornadaBoton.pressed.connect(this, "ocultarOpcionesEspeciales()");
		reservarBoton.clicked.connect(this, "comprobacionesAlReservar()");
		MainWindow.connectSlotsByName();
	} // setupUi

	void ocultarOpcionesEspeciales() {
		//Fijamos el mínimo del spinner oculto en 1
		numeroJornadasSpinner.setMinimum(1);
		//por defecto hacemos click en el botón de abajo
		botonRadioEscondidoAbajo.click();
		datosEscondidosGroup.hide();
	}

	void mostrarOpcionesBanquete() {
		numeroJornadas.setText("Comensales\n por mesa");
		requiereHabitaciones.setText("Tipo de mesa: ");
		botonRadioEscondidoArriba.setText("Rectangular");
		botonRadioEscondidoAbajo.setText("Redonda");
		datosEscondidosGroup.show();
	}

	void mostrarOpcionesCongreso() {
		numeroJornadas.setText("Número \n jornadas");
		requiereHabitaciones.setText("Requiere habitaciones ");
		botonRadioEscondidoArriba.setText("Sí");
		botonRadioEscondidoAbajo.setText("No");
		datosEscondidosGroup.show();
	}

	void comprobarNombre() {
		String nombreIntroducido = nombreField.text();
		if (nombreIntroducido == null || nombreIntroducido.isEmpty()) {
			crearModalInformativo("Error", "El campo nombre es obligatorio");
			return;
		}
		if (nombreIntroducido.contains("\\d{1,}")) {
			crearModalInformativo("Error", "El nombre no puede contener números");

		}

	}

	void comprobarTelefono() {
		if (!telefonoField.text().trim()
						  .matches("(\\+34|0034|34)?[ -]*(6|7)[ -]*([0-9][ -]*){8}")) {
			crearModalInformativo("Error:", "El teléfono introducido no es válido");
		}
	}

	private void crearModalInformativo(String etiqueta, String mensajeError) {
		ModalInformativo mainWindow = new ModalInformativo();
		QMainWindow dialog = new QMainWindow();
		mainWindow.setupUi(dialog);
		mainWindow.escribirMensaje(etiqueta, mensajeError);
		dialog.show();
	}

	void comprobacionesAlReservar() {
		if (nombreField.text().trim().isEmpty()) {
			comprobarNombre();
			return;
		} else if (telefonoField.text().trim().isEmpty()) {
			comprobarTelefono();
			return;
		}
		crearModalInformativo("¡Enhorabuena!", "Se ha reservado la habitación correctamente");

	}

	private void ventanaError() {
		ModalInformativo Havana = new ModalInformativo();
		QMainWindow dialog = new QMainWindow();
		Havana.setupUi(dialog);
		dialog.show();
	}

	void retranslateUi(QMainWindow MainWindow) {
		MainWindow.setWindowTitle(QCoreApplication.translate("MainWindow", "MainWindow", null));
		datoPersonalesGroup.setTitle(QCoreApplication.translate("MainWindow", "Datos Personales", null));
		nombre.setText(QCoreApplication.translate("MainWindow", "Nombre:", null));
		telefono.setText(QCoreApplication.translate("MainWindow", "Tel\u00e9fono:", null));
		datosReservaGroup.setTitle(QCoreApplication.translate("MainWindow", "Datos Reserva", null));
		banqueteBoton.setText(QCoreApplication.translate("MainWindow", "Banquete", null));
		DatosEventoGroup.setTitle("");
		fechaEventoLabel.setText(QCoreApplication.translate("MainWindow", "Fecha del evento:", null));
		tipoCocinaLabel.setText(QCoreApplication.translate("MainWindow", "Tipo de cocina:", null));
		numeroPersonasLabel.setText(QCoreApplication.translate("MainWindow", "Numero Personas:", null));
		congresoBoton.setText(QCoreApplication.translate("MainWindow", "Congreso", null));
		jornadaBoton.setText(QCoreApplication.translate("MainWindow", "Jornada", null));
		tipoBanqueteLabel.setText(QCoreApplication.translate("MainWindow", "Tipo evento:", null));
		datosEscondidosGroup.setTitle("");
		numeroJornadas.setText(QCoreApplication.translate("MainWindow", "N\u00ba Jornadas:", null));
		requiereHabitaciones.setText(QCoreApplication.translate("MainWindow", "Requiere habitaciones:", null));
		botonRadioEscondidoArriba.setText(QCoreApplication.translate("MainWindow", "S\u00ed", null));
		botonRadioEscondidoAbajo.setText(QCoreApplication.translate("MainWindow", "No", null));
		reservarBoton.setText(QCoreApplication.translate("MainWindow", "Reservar", null));
	} // retranslateUi

}

