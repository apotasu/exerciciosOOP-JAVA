import java.util.Scanner;
public class Main{
    public static void main (String arg[]){
       Scanner scn = new Scanner(System.in);
       Retangulo retangulo = new Retangulo();
        System.out.println("Digite a altura do retangulo");
        int a = scn.nextInt();
        System.out.println("Digite a largura do retangulo");
        int l = scn.nextInt();
        scn.close();
        System.out.println("A area do retangulo é " + retangulo.area(l, a));
        System.out.println("O perimetro do retangulo é " + retangulo.perimetro(l, a));
        System.out.println("A diagonal do retangulo é " + retangulo.diagonal(l, a));
    }
}