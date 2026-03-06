import java.util.Scanner;
public class Parcial1LeidyAlzate {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Ingrese la dimension de la matriz");
        n = sc.nextInt();
        MetInventario m = new MetInventario();
        ObjProducto[][] matriz = new ObjProducto[n][n];
        matriz = m.LlenarMatriz(matriz);
        int suma = m.SumarCantidades(matriz);
        System.out.println("Total de las cantidades es: " + suma);   

    }
}
