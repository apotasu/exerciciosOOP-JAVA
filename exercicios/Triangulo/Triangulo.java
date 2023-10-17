package Triangulo;
public class Triangulo {
    public String ChecarTipo (int l1, int l2, int b){
        if (l1 != l2){
            return"O triangulo é escaleno";
        } if (l1 == l2 && l1 == b){
            return "O triangulo é equilatero";
        } if (l1 == l2 && l1 != b){
            return "O triangulo é isosceles";
        } else {
            return null;
        }
    }
    public int AreaTriangulo (int b, int a){
        return (b*a)/2;
    }
    public int PerimetroTriangulo (int l1, int l2, int b){
        return l1+l2+b;
    }
}
