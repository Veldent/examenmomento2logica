import java.util.Scanner;

public class AnalizadorConsumo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double lunes, martes, miercoles, jueves, viernes;
        double promedio;
        double promedioAnterior;
        double variacion;
        String nivel;
        String resultado;

        System.out.print("Consumo lunes: ");
        lunes = sc.nextDouble();

        System.out.print("Consumo martes: ");
        martes = sc.nextDouble();

        System.out.print("Consumo miércoles: ");
        miercoles = sc.nextDouble();

        System.out.print("Consumo jueves: ");
        jueves = sc.nextDouble();

        System.out.print("Consumo viernes: ");
        viernes = sc.nextDouble();

        promedio = (lunes + martes + miercoles + jueves + viernes) / 5;

        if (promedio < 8) {
            nivel = "CONSUMO BAJO";
        } else if (promedio <= 12) {
            nivel = "CONSUMO NORMAL";
        } else if (promedio <= 16) {
            nivel = "CONSUMO ALTO";
        } else {
            nivel = "CONSUMO CRITICO";
        }

        System.out.print("Promedio anterior: ");
        promedioAnterior = sc.nextDouble();

        variacion = ((promedio - promedioAnterior)
                / promedioAnterior) * 100;

        if (variacion < 0) {
            resultado = "El consumo disminuyó";
        } else if (variacion <= 10) {
            resultado = "El consumo aumentó ligeramente";
        } else if (variacion <= 25) {
            resultado = "El consumo aumentó considerablemente";
        } else {
            resultado = "ALERTA: aumento elevado del consumo";
        }

        System.out.println("\n==============================");
        System.out.println("ANALIZADOR DE CONSUMO");
        System.out.println("==============================");
        System.out.println("Promedio: " + promedio);
        System.out.println("Nivel: " + nivel);
        System.out.println("Variación: " + variacion + "%");
        System.out.println("Resultado: " + resultado);

        sc.close();
    }
}