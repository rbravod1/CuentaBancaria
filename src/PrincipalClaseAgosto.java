/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class PrincipalClaseAgosto {
    
    public static void main(String [] args){
        
        double montoDeposito; 
        //System.out.println("Bienvenidos a la programación con JAVA");
       
        CuentaBancaria cuenta1 = new CuentaBancaria(100.00);
        CuentaBancaria cuenta2 = new CuentaBancaria(75.00);
        CuentaBancaria cuenta3 = new CuentaBancaria(-75.00);
        System.out.printf("Saldo de la Cuenta 1: Q  %.2f\n",
                cuenta1.obtenerSaldo());
        System.out.printf("Saldo de la Cuenta 2: Q  %.2f\n",
                cuenta2.obtenerSaldo());
        System.out.printf("Saldo de la Cuenta 3: Q  %.2f\n",
                cuenta3.obtenerSaldo());
        
        Scanner entrada = new Scanner(System.in);
       
        
        System.out.println("Escriba el monto del deposito para la cuenta 1: ");
        montoDeposito = entrada.nextDouble();
        System.out.printf("\nSe agrego la cantidad de Q %.2f a la cuenta 1\n ",
                montoDeposito);
        cuenta1.abonar(montoDeposito);
        
        //mostrar el nuevo saldo de la cuenta
        System.out.printf("Saldo de la Cuenta 1: Q %.2f\n",
        cuenta1.obtenerSaldo());
        
    }
    
}
