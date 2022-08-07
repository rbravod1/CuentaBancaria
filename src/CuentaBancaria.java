/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 *Esta clase es creada para el control de la cuenta bancaria, registra operaciones
 * 
 */
public class CuentaBancaria {
    
    private double saldo; //variable que almacena el saldo de lacuenta
    
    public CuentaBancaria(double saldoInicial){
        
        if (saldoInicial > 0.0)
            saldo = saldoInicial;
               
    } //fin del constructor de cuenta
    
    //abono a la cuenta
    
    public void abonar(double monto){
        saldo = saldo + monto;
    }
    //obtener el saldo de la cuenta.
    public double obtenerSaldo(){
        return saldo;
    }
}
