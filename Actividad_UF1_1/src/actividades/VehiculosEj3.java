package actividades;
import java.io.*;


public class VehiculosEj3 {
    private String modelo;
    private int anno;
    private double precio;
    public VehiculosEj3(String modelo, int anno, double precio) {
//        this.modelo = modelo.substring(0,20);
        if (modelo.length() > 20) {
            this.modelo = modelo.substring(0, 20);
        } else {
            // Rellena con espacios si el modelo tiene menos de 20 caracteres
            this.modelo = modelo;
        }
    	this.anno = anno;
        this.precio = precio;
    }

    public static void main(String[] args) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("vehiculos.dat"));
            VehiculosEj3[] vehiculos = new VehiculosEj3[10];
            vehiculos[0] = new VehiculosEj3("Toyota Corolla", 2022, 25000.0);
            vehiculos[1] = new VehiculosEj3("Ford F-150", 2023, 35000.0);
            vehiculos[2] = new VehiculosEj3("Honda Civic", 2021, 22500.0);
            vehiculos[3] = new VehiculosEj3("Chevrolet Silverado", 2022, 28000.0);
            vehiculos[4] = new VehiculosEj3("Volkswagen Golf", 2020, 20000.0);
            vehiculos[5] = new VehiculosEj3("BMW X5", 2022, 55000.0);
            vehiculos[6] = new VehiculosEj3("Nissan Altima", 2021, 24000.0);
            vehiculos[7] = new VehiculosEj3("Jeep Wrangler", 2023, 32000.0);
            vehiculos[8] = new VehiculosEj3("Hyundai Elantra", 2022, 23500.0);
            vehiculos[9] = new VehiculosEj3("Mercedes-Benz C-Class", 2023, 50000.0);

            // Escritura
            for (int i = 0; i < vehiculos.length; i++) {
                dataOutputStream.writeUTF(vehiculos[i].getModelo());
                dataOutputStream.writeInt(vehiculos[i].getAnno());
                dataOutputStream.writeDouble(vehiculos[i].getPrecio());
            }

            dataOutputStream.close();

            // Lectura
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream("vehiculos.dat"));
            for (int i = 0; i < vehiculos.length; i++) {
                String modelo = dataInputStream.readUTF();
                int anno = dataInputStream.readInt();
                double precio = dataInputStream.readDouble();
                System.out.println("Modelo: " + modelo);
                System.out.println("Año de Fabricación: " + anno);
                System.out.println("Precio: " + precio);
                System.out.println();
            }

            dataInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnno() {
        return anno;
    }

    public double getPrecio() {
        return precio;
    }
}
