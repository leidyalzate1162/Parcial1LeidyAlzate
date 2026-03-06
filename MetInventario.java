import java.util.Scanner;

public class MetInventario {
  Scanner sc = new Scanner(System.in);
  public ObjProducto[][]LlenarMatriz(ObjProducto[][]m){
    for (int i = 0; i < m.length; i++) {
        for (int j = 0; j < m.length; j++) {
            ObjProducto o = new ObjProducto();
            System.out.println("Ingrese nombre: ");
            o.setNombre(sc.next());
            System.out.println("Ingrese cantidad: ");
            o.setCantidad(sc.nextInt());
            m [i][j] = o;
        }
    }
    return m;
  }
  public int SumarCantidades(ObjProducto[][]m){
    int suma = 0;
    for (int i = 0; i < m.length; i++) {
        for (int j = 0; j < m.length; j++) {
            suma = suma + m[i][j].getCantidad();
        }        
    }
    return suma;
  }
}
