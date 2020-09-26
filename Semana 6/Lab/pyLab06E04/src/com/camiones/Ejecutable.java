package com.camiones;

/**
 *
 * @author Franco J. Mulé <franjmule@gmail.com>
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Una empresa de transporte de cargas necesita un software que la ayude
        a organizarse con la carga de los camiones que maneja. La empresa puede
        recibir packings, cajas sueltas y bidones que transportan líquido.
        
            - un packing es una estructura de madera que arriba tiene un montón
                de cajas, se envuelve con plástico. Todas las cajas tienen el 
                mismo peso. El peso del packing es (peso caja * cant cajas 
                + peso estructura). Para cada packing se informa qué llevan las
                cajas (ej: material construcción).
            - de cada CAJA suelta se informa el peso individualmente
            - el peso de un BIDON es su capacidad en litros por la densidad del
                líquido cargado. Los bidones siempre van llenos
            - cada camión puede llevar hasta una carga máxima medida en kg.
            - cada camión tiene un estado
                - disponible (vacio o con algo de carga)
                - reparación
                - viaje
        
        Algunos requerimientos:
            - subir una carga al camión, puede ser un packing, caja suelta o
                bidon. No puede cargarse más allá de su maximo
            - bajar una carga del camión, siempre que se encuentre disponible
                con cargas y estas se encuentren dentro del mismo
            - conocer el total de cargas de un camión en todo momento
            - permitir modificar el estado de un camión, sea porque entró en
                reparación, salió de esta, está en viaje o de regreso
            - obtener el listado de cargas contenidas ordenado por peso
            - saber si un camión está listo para partir: si está disponible para
                una carga y el peso total es de al menos 75% de su carga
        */
    }   
}
