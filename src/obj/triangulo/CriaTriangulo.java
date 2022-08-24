package obj.triangulo;

import obj.triangulo.entidades.Triangulo;

import java.util.Scanner;

public class CriaTriangulo {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);


        Triangulo x = new Triangulo();

        System.out.println("Informe o A do obj.triangulo X: ");
        x.setA(leia.nextDouble());

        System.out.println("Informe o B do obj.triangulo X: ");
        x.setB(leia.nextDouble());

        System.out.println("Informe o C do obj.triangulo X: ");
        x.setC(leia.nextDouble());

        Triangulo y = new Triangulo();

        System.out.println("Informe o A do obj.triangulo Y: ");
        y.setA(leia.nextDouble());

        System.out.println("Informe o B do obj.triangulo Y: ");
        y.setB(leia.nextDouble());

        System.out.println("Informe o C do obj.triangulo Y: ");
        y.setC(leia.nextDouble());



        System.out.println("Area de x: "+ x.retornaAreaTriangulo());
        System.out.println("Area de y: "+y.retornaAreaTriangulo());
    }
}
