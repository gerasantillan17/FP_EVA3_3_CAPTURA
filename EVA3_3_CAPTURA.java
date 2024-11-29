/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_captura;

import java.util.Scanner;

/**
 *
 * @author gerar
 */
public class EVA3_3_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = capturarTexto("Introduce tu nombre:");
        String apellido = capturarTexto("Introduce tu apellido");
        int edad = capturarEntero("Introduce tu edad:");
        double salario = capturarDouble("Introduce tu salario:");
        System.out.println("Nombre" + nombre);
        System.out.println("Apellido:" + apellido);
        System.out.println("Introduce tu edad" + edad);
        System.out.println("Introduce el salario:" + salario);
        
    }
    public static String capturarTexto(String mensaje){
        Scanner captu = new Scanner(System.in);
        String texto;
        System.out.println(mensaje);
        texto = captu.nextLine();
        return texto;
    }
    public static int capturarEntero(String mensaje){
        Scanner captu = new Scanner(System.in);
        int num;
        System.out.println(mensaje);
        num = captu.nextInt();
        return num;
}
    public static double capturarDouble(String mensaje){
        Scanner captu = new Scanner(System.in);
        double num;
        System.out.println(mensaje);
        num = captu.nextInt();
        return num;
    }
}
