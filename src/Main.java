import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {

        System.out.println("TAREA_Encuentra_tu_vuelo\t \tᕙ(`▽´)ᕗ");

        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        /*Date fechaEspecifica = formato.parse("01-03-2024 12:35");*/

        /*---------------------------------DATOS-VUELOS---------------------------------*/
        String[] nombre = {"AAL 933", "LAT 755","SKU 621","DAL 147","AVA 241","AMX 10","IBE 6833","LAT 2479","SKU 803","LAT 533","LAT 1447","CMP 111","LAT 705","AAL 957","ARG 5091","LAT 1283","LAT 579","AAL 945","LAT 501","LAT 405"};
        String[] origen = {"New York","Sao Paulo","Rio De Janeiro","Atlanta","Bogota","Mexico City","Londres","Frankfurt","Lima","Los Ángeles","Guayaquil","Panama City","Madrid","Miami","Buenos Aires","Cancún","Barcelona","Dallas-Fort Worth","París","Montevideo"};
        String destino = "Santiago";
        String[] fecha_de_llegada = {"29-08-2021 05:39","31-08-2021 04:45","30-08-2021 16:00","29-08-2021 13:32","31-08-2021 14:05","31-08-2021 05:20","30-08-2021 08:45","29-08-2021 07:41","30-08-2021 10:35","29-08-2021 09:14","31-08-2021 08:33","31-08-2021 15:15","30-08-2021 08:14","29-08-2021 22:53","31-08-2021 09:57","31-08-2021 04:00","29-08-2021 07:45","30-08-2021 07:12","29-08-2021 18:29","30-08-2021 15:45"};
        Integer[] cantidad_pasajeros = {62,47,52,59,25,29,55,51,48,59,31,29,47,60,32,35,61,58,49,39};
        /*---------------------------------DATOS-VUELOS---------------------------------*/

        List<Vuelo> lista_Vuelos = new ArrayList<>();

        for (int i = 0; i < 20; i++){
            lista_Vuelos.add(new Vuelo(nombre[i],origen[i],destino,formato.parse(fecha_de_llegada[i]),cantidad_pasajeros[i]));
        }

        System.out.println("\n-------Ordenando de forma ASCENDENTE por 'fecha_de_llegada'-------------");
        /*Ordenamiento especificado dentro de la clase 'Vuelo', por 'fecha_de_llegada'*/
        Collections.sort(lista_Vuelos);
        System.out.println(lista_Vuelos);

        System.out.println("\n-------ÚLTIMO vuelo en llegar-------------");
        System.out.println(lista_Vuelos.getLast());

        System.out.println("\n-------Vuelo con MENOR número de pasajeros-------------");
        lista_Vuelos.sort(Comparator.comparing(Vuelo::getCantidad_pasajeros));
        System.out.println(lista_Vuelos.getFirst());



    }
}