package aplicacion;
import java.util.Scanner;
import dominio.ej2_3;
public class Principal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base;
        int exponente;
        System.out.println("Introduce una base");
        base=sc.nextInt();
        System.out.println("Introduce un exponente");
        exponente=sc.nextInt();
        System.out.println("La potencia de "+base+" elevado a "+exponente+ " es " +ej2_3.potencia(base,exponente));
    }
}
