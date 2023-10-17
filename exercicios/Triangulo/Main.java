package Triangulo;
import java.util.Scanner;
public class Main {
    public static void main (String arg[]){
        Scanner scn = new Scanner (System.in);
        Triangulo triangulo = new Triangulo();
        System.out.println("Digite o lado 1 do triangulo");
        int l1 = scn.nextInt();
        System.out.println("Digite o lado 2 do triangulo");
        int l2 = scn.nextInt();
        System.out.println("Digite a base do triangulo");
        int b = scn.nextInt();
        System.out.println("Digite a altura do triangulo");
        int a = scn.nextInt();
        scn.close();
        System.out.println(triangulo.ChecarTipo(l1, l2, b));
        System.out.println("A area do triangulo é "+ triangulo.AreaTriangulo(b, a));
        System.out.println("O perimetro do triangulo é "+ triangulo.PerimetroTriangulo(l1, l2, b));
    }
}
