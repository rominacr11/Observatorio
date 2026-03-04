package Observatorio;
import java.util.List;
import java.util.ArrayList;
public class CuerpoCeleste {

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
}
