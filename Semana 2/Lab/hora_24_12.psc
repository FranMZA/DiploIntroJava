Algoritmo sin_titulo
	Definir hora Como Entero
	Definir minuto Como Entero
	Definir am_pm Como Caracter
	// Entrada
	Escribir "Ingrese hora"
	Leer hora
	Escribir "Ingrese minutos"
	Leer minuto
	// Proceso
	Si (hora < 0) O (hora > 24) Entonces
		Escribir "Valor incorrecto de hora"
	SiNo
		Si (minuto < 0) O (minuto > 59) Entonces
			Escribir "Valor incorrecto de minuto"
		SiNo
			Si hora > 12 Entonces
				hora <- hora - 12
				am_pm <- "PM"
			SiNo
				am_pm <- "AM"
			FinSi
			Escribir "La hora es ", hora, ":", minuto, " ", am_pm
		FinSi
	FinSi
FinAlgoritmo
