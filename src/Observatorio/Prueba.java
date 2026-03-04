package Observatorio;
class Main{
        public static void main(String[] args){
CuerpoCeleste estrella= new CuerpoCeleste("Estrella X",
        "Gaseosa",
        5.5,
        "Años luz"
);
Observacion obs1= new Observacion(27.5, "Sur", 45.2, "Este");
            Observacion obs2 = new Observacion(22.0, "Norte", 47.0, "Oeste");


            estrella.agregarObservacion(obs1);
            estrella.agregarObservacion(obs2);


            System.out.println("=== Datos del cuerpo celeste ===");
            System.out.println(estrella);

            System.out.println("\n=== Observaciones ===");
            for (Observacion o : estrella.obtenerObservaciones()) {
                System.out.println(o);


            System.out.println("\n=== Cálculos ===");
            System.out.println("Posición de la primera observación: " + obs1.obtenerPosicion());
            System.out.println("Desplazamiento entre observaciones: " + obs1.calculardesplazamiento(obs2));


        }
    }
}
