Algoritmo lab_01_e_04
	Definir  km, kmL Como entero
	Definir pr, lts, gasto Como Real
	
	Mostrar "Indicar km recorridos"
	Leer km
	Mostrar  "Indicar precio de combustible por litro"
	Leer pr
	Mostrar "Indicar eficiencia del vehiculo (km/L)"
	leer kmL
	
	lts = km / kmL
	gasto = lts * pr
	
	Mostrar "Litros consumidos:", lts
	Mostrar "Gasto en combustible: $ ", gasto
FinAlgoritmo
