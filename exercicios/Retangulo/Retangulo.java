public class Retangulo {
    public int perimetro (int l, int a){
        return 2*(l+a);
    }  
    public int area (int l, int a){
        return l*a;
    }
    public double diagonal (int l, int a){
        return Math.sqrt((l*l)+(a*a));
    }
}
