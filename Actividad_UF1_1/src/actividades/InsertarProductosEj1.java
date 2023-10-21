package actividades;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class InsertarProductosEj1 implements Serializable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ProductosEj1[] lista = new ProductosEj1[10];
        Scanner in = new Scanner(System.in);

//        for (int i = 0; i < lista.length; i++) {
//            System.out.println("Introduce producto " + (i + 1) + ": id, nombre, medidas, precio");
//
//            int id = in.nextInt();
//            String nombre = in.next();
//            String medidas = in.next();
//            float precio = in.nextFloat();
//
//            lista[i] = new ProductosEj1(id, nombre, medidas, precio);
//        }
        lista[0] = new ProductosEj1(1, "Laptop", "15-inch", 999.99f);
        lista[1] = new ProductosEj1(2, "Smartphone", "6-inch", 599.99f);
        lista[2] = new ProductosEj1(3, "Coffee Maker", "12-cup", 49.99f);
        lista[3] = new ProductosEj1(4, "Running Shoes", "Size 10", 79.99f);
        lista[4] = new ProductosEj1(5, "Backpack", "Large", 39.99f);
        lista[5] = new ProductosEj1(6, "Digital Camera", "24MP", 349.99f);
        lista[6] = new ProductosEj1(7, "Desk Chair", "Ergonomic", 149.99f);
        lista[7] = new ProductosEj1(8, "Blender", "500W", 29.99f);
        lista[8] = new ProductosEj1(9, "T-shirt", "XL", 14.99f);
        lista[9] = new ProductosEj1(10, "Headphones", "Wireless", 79.99f);

        
        FileOutputStream fos = new FileOutputStream("productos.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for (ProductosEj1 producto : lista) {
            oos.writeObject(producto);
        }
        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("productos.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        for (int i = 0; i < lista.length; i++) {
            ProductosEj1 producto = (ProductosEj1) ois.readObject();
            System.out.println("Producto " + (i + 1) + ": " + producto.getId() + ", " + producto.getNombre() + ", " + producto.getMedidas() + ", " + producto.getPrecio());
        }

        ois.close();
        fis.close();
        in.close();
    }
}
