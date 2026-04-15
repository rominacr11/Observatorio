package Observatorio;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class CuerpoCeleste implements Comparable<CuerpoCeleste> {

    private String nombre;
    private String composicion;
    private Double distanciaDeLaTierra;
    private String unidadDeLaDistancia;
    private List<Observacion> observaciones;


    public CuerpoCeleste(String nombre, String composicion, Double DistanciaDeLaTierra, String UnidadDeLaDistancia) {
        this.nombre = nombre;
        this.composicion = composicion;
        this.distanciaDeLaTierra = DistanciaDeLaTierra;
        this.unidadDeLaDistancia = UnidadDeLaDistancia;
        this.observaciones = new ArrayList<Observacion>();
    }
    public void agregarObservacion(Observacion observacion) {
        observaciones.add(observacion);
    }


    public Double getDistanciaDeLaTierra() {
        return distanciaDeLaTierra;
    }

    public String getUnidadDeLaDistancia() {
        return unidadDeLaDistancia;
    }


    public List<Observacion> obtenerObservaciones() {
        return observaciones;
    }
    @Override

    public String toString() {
        return "CuerpoCeleste{" +
                "nombre= " + nombre +
        ", composición= " + composicion +
                ", distancia: " + distanciaDeLaTierra + " " + unidadDeLaDistancia +
                "}";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) return false;
        CuerpoCeleste that = (CuerpoCeleste) o;
        return Objects.equals(nombre, that.nombre) &&
                Objects.equals(composicion, that.composicion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, composicion);
    }


    @Override
    public int compareTo(CuerpoCeleste otro) {
        if (this.distanciaDeLaTierra == null && otro.distanciaDeLaTierra == null) return 0;// no hay distancias
        if (this.distanciaDeLaTierra == null) return 1;  // un objeto no tiene distancia pero el que sigue si, y va al final
        if (otro.distanciaDeLaTierra == null) return -1;// va el objeto con distancia al principio
        return this.distanciaDeLaTierra.compareTo(otro.distanciaDeLaTierra);//misma distancia

    }


    public static Comparator<CuerpoCeleste> comparadorPorNombre = new Comparator<CuerpoCeleste>() {
        @Override
        public int compare(CuerpoCeleste c1, CuerpoCeleste c2) {
            return c1.nombre.compareTo(c2.nombre);
        }
    };

}

