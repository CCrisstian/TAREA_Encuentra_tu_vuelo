import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

public class Vuelo implements Comparable<Vuelo>{
/*----------ATRIBUTOS----------*/
    private String nombre;
    private String origen;
    private String destino;
    private Date fecha_de_llegada;
    private Integer cantidad_pasajeros;
/*----------ATRIBUTOS----------*/

/*----------GETTER-SETTER----------*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFecha_de_llegada() {
        return fecha_de_llegada;
    }

    public void setFecha_de_llegada(Date fecha_de_llegada) {
        this.fecha_de_llegada = fecha_de_llegada;
    }

    public Integer getCantidad_pasajeros() {
        return cantidad_pasajeros;
    }

    public void setCantidad_pasajeros(Integer cantidad_pasajeros) {
        this.cantidad_pasajeros = cantidad_pasajeros;
    }
/*----------GETTER-SETTER----------*/

/*----------CONSTRUCTOR----------*/

    public Vuelo(String nombre, String origen, String destino, Date fecha_de_llegada, Integer cantidad_pasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fecha_de_llegada = fecha_de_llegada;
        this.cantidad_pasajeros = cantidad_pasajeros;
    }
/*----------CONSTRUCTOR----------*/


/*----------MÉTODO----------*/
    @Override
    public String toString() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("EEE, dd MMMM yyyy HH:mm", new Locale("es", "ES"));
        String fechaFormateada = formatoFecha.format(this.fecha_de_llegada);
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("       __|__");
        sb.append("\n");
        sb.append("--o--o--(_)--o--o--");
        sb.append("\n");

        return  sb.toString()+
                "\n"+
                "Nombre: " + nombre + '\n' +
                "Origen: " + origen + '\n' +
                "Destino: " + destino + '\n' +
                "Fecha_de_llegada: " + fechaFormateada + "\n" +
                "Cantidad_pasajeros: " + cantidad_pasajeros +"\n";
    }

    @Override
    public int compareTo(Vuelo v) {
        if (this.fecha_de_llegada == null){
            return 0;
        }
        return this.fecha_de_llegada.compareTo(v.fecha_de_llegada);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; /*Compara por INSTANCIA*/
        if (o == null || getClass() != o.getClass()) return false;
        Vuelo vuelo = (Vuelo) o;    /*Compara por ATRIBUTOS*/
        return Objects.equals(fecha_de_llegada, vuelo.fecha_de_llegada);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fecha_de_llegada);
    }

/*----------MÉTODO----------*/


}
