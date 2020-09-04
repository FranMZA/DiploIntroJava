package com.libros.dominio;

/**
 *
 * @author Franco J. Mulé <franjmule@gmail.com>
 */
public class Biblioteca {

    /*
    implementar
    - buscarPublicacion(String titulo): dado un titulo buscar una publicacion. 
        Si existe, mostrar sus datos, sino informar con un mensaje
    - contarLibros(int nPag): permite conocer la cantidad de libros en la 
        biblioteca con más de nPag
     */
    // Atributos
    private Publicacion[] estanteria;
    private int ultimo;

    // Constructores
    /**
     * Constructor por defecto de instancias de la clase biblioteca. Por defecto
     * genera una estantería vacía con 20 espacios.
     */
    public Biblioteca() {
        estanteria = new Publicacion[20];
        ultimo = 0;
    }

    /**
     * Constructor de instancias de la clase biblioteca. Genera una estantería
     * vacía.
     *
     * @param cantPub int, cantidad de lugares para guardar publicaciones
     */
    public Biblioteca(int cantPub) {
        estanteria = new Publicacion[cantPub];
        ultimo = 0;
    }

    // getters y setters
    public Publicacion[] getEstanteria() {
        return estanteria;
    }

    // Métodos públicos
    /**
     * Agrega una publicación a la estantería si hay lugar disponible
     *
     * @param pub Publicacion, la publicación que se desea cargar
     * @return boolean, devuelve 'true' si lo cargó con exito y 'false' si no
     * pudo cargarlo
     */
    public boolean agregarPublicacion(Publicacion pub) {
        boolean aux = false;
        /*
        // Recorre toda la lista hasta encontrar un lugar vacío
        for (int i = 0; i < estanteria.length; i++) {
            if (estanteria[i] == null) {
                estanteria[i] = pub;
                aux = true;
                break;
            }
        }
         */
        if (ultimo < estanteria.length) {
            estanteria[ultimo] = pub;
            aux = true;
            ultimo++;
        }

        return aux;
    }

    /**
     * Vuelve a crear la estantería de la biclioteca. Sirve para crear una
     * estantería de diferente tamaño manteniendo o no los libros que se tenían
     * anteriormente. Si la nueva estantería tiene menos lugares que libros en
     * la anterior, se mantendrán los que puedan entrar en orden de aparición en
     * la lista original.
     *
     * @param nuevoTamaño int, tamaño de la nueva estantería
     * @param conservarEstanteria boolean, 'true' si se desea conservar y
     * 'false' si se desea crear una estantería limpia
     * @return boolean, devuelve 'true' si se creó con éxito
     */
    public boolean nuevaEstanteria(int nuevoTamaño, boolean conservarEstanteria) {
        boolean flag = false;
        Publicacion nuevaEstanteria[] = new Publicacion[nuevoTamaño];
        if (conservarEstanteria) {
            boolean aux = true;
            for (int i = 0; i < nuevaEstanteria.length && aux; i++) {
                aux = estanteria[i] != null;
                nuevaEstanteria[i] = estanteria[i];
            }
        }
        estanteria = nuevaEstanteria;
        return flag;
    }

    /**
     * Busca un título dentro de los libros disponibles en la estantería.
     * @param tituloBuscado String, título de la publicación. Debe coincidir 
     * exactamente
     * @return String, devuelve los datos de la publicación si se encontró
     * o informa que no se encontró esa publicación.
     */
    public String buscarPublicacion(String tituloBuscado) {
        for (int i = 0; i < ultimo; i++) {
            if (estanteria[i].getTitulo().equals(tituloBuscado)) {
                return estanteria[i].toString();
            }
        }
        return "No se encontró publicación con ese título.";
    }
    
    public int contarLibros(int minPaginas){
        int aux = 0;
        for (int i = 0; i < ultimo; i++) {
            if (estanteria[i] instanceof Libro) {
                if (estanteria[i].getNumPag() > minPaginas) {
                    aux++;
                }
            }
        }
        
        // 
        
        return aux;
    }

    @Override
    public String toString() {
        String aux = "Estantería:\n";
        for (int i = 0; i < estanteria.length; i++) {
            if (estanteria[i] != null) {
                aux += estanteria[i].toString();
            } else {
                aux += "Lugar vacio";
            }
            if (i < (estanteria.length - 1)) {
                aux += "\n";
            }
        }
        return aux;
    }
}
