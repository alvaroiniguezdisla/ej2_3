package dominio;

public class ej2_3 {



    public static int  potencia(int  base,int exponente) {

        if( exponente==0) {
            return 1;

        }else {
            return (base)*potencia(base,exponente-1);

        }
    }

}
