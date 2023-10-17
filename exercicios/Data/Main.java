import java.util.Scanner;

public class Main{
    public static void main (String arg[]){
        Data data = new Data();
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o dia atual");
        int dia = scn.nextInt();
        System.out.println("Digite o mes atual");
        int mes = scn.nextInt();
        System.out.println("Digite o ano atual");
        int ano = scn.nextInt();
        System.out.println("O mes é " + data.mesEmExtenso(mes));
        System.out.println(data.AnoBissexto(ano));
        System.out.println(data.ChecarDia(dia, mes, ano));
        System.out.println(data.DiaDosFinados(dia, mes, ano));
    }
}