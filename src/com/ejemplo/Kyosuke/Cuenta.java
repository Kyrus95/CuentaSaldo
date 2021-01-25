package com.ejemplo.Kyosuke;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Cuenta {
    //Definicion de variables que se utiliza la clase Cuenta
    private int ID;
    private double saldo;
    private double tasaInteresAnual;
    private Date fechaCreacion = new Date();

    //El constructor por defecto sin argumentos
    public Cuenta(){}

    //El constructor para cuando se dan los tres parametros
    public Cuenta(int ID, double saldo, double tasaInteresAnual){
        this.ID = ID;
        this.saldo = saldo;
        this.tasaInteresAnual = tasaInteresAnual;
    }

    //Scanner teclado, definido como publico para poder usar en todos los metodos que se crean a continuacion
    public Scanner teclado = new Scanner(System.in);

    //Metodo para ingresar los datos de las variables ID, saldo y tasaInteresAnual
    //Usando los setters aplico cada variable a la cuenta1
    public void ingresarDatos(Cuenta cuenta1){
        System.out.println("Digite el ID: ");
        int ID = teclado.nextInt();
        cuenta1.setID(ID);
        System.out.println("Digite el saldo: ");
        double saldo = teclado.nextDouble();
        cuenta1.setSaldo(saldo);
        System.out.println("Digite la tasa de interes anual: ");
        double tasaInteresAnual = teclado.nextDouble();
        cuenta1.setTasaInteresAnual(tasaInteresAnual);
    }
    //Calcula la tasa de interes mensual dividiendo la tasa de interes anual sobre 12
    public double obtenerTasaInteresMensual(double tasaInteresAnual){
        return (tasaInteresAnual / 12);
    }
    //Calcula el interes mensual del saldo
    public double obtenerInteresMensual(double saldo, double tasaInteresMensual){
        return saldo * (tasaInteresMensual / 100);
    }
    //Se pide cuanto se va a retirar de la cuenta (restar del saldo)
    //Despues de realizar la operacion el saldo resultante se remplaza al saldo original usando el setter
    public void retiro(Cuenta cuenta1){
        System.out.println("--------------------------------------------------");
        double saldo = cuenta1.getSaldo();
        System.out.println("Digite la cantidad que va a retirar: ");
        double retirar = teclado.nextDouble();
        cuenta1.setSaldo(saldo - retirar);
        System.out.println("Tu saldo despues de retirar $"+retirar+": $"+cuenta1.getSaldo());
    }
    //Se pide cuanto se va a depositar a la cuenta (sumar al saldo)
    //Despues de realizar la operacion el saldo resultante se reemplaza al saldo original usando el setter
    public void deposito(Cuenta cuenta1){
        System.out.println("--------------------------------------------------");
        double saldo = cuenta1.getSaldo();
        System.out.println("Digite la cantidad que va a depositar: ");
        double depositar = teclado.nextDouble();
        cuenta1.setSaldo(saldo + depositar);
        System.out.println("Tu saldo despues de depositar $"+depositar+": $"+cuenta1.getSaldo());
    }
    //Se imprime toda la informacion sobre su cuenta usando el getter
    //Se imprime en el orden de ID, Saldo, Tasa de interes anual, tasa de interes mensual, el interes mensual y la fecha en que se creo la cuenta
    //En la parte de la tasa de interes mensual y el interes mensual se esta haciendo un llamado a otro metodo
    public void imprimirCuenta(Cuenta cuenta1){
        System.out.println("--------------------------------------------------");
        System.out.println("Informacion de tu cuenta:");
        System.out.println("ID: "+cuenta1.getID());
        System.out.println("Saldo: $"+cuenta1.getSaldo());
        System.out.println("Tasa de interes anual: "+cuenta1.getTasaInteresAnual()+"%");
        System.out.println("La tasa de interes mensual: "+obtenerTasaInteresMensual(cuenta1.getTasaInteresAnual()) + "%");
        System.out.println("El interes mensual: " +obtenerInteresMensual(cuenta1.getSaldo(), obtenerTasaInteresMensual(cuenta1.getTasaInteresAnual())));
        System.out.println("La fecha de creacion de cuenta: "+cuenta1.getFechaCreacion());
    }

    //De aqui para abajo se ubican los getters y setters para las variables ID, saldo, tasaInteresAnual y getter de fechaCreacion
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTasaInteresAnual() {
        return tasaInteresAnual;
    }

    public void setTasaInteresAnual(double tasaInteresAnual) {
        this.tasaInteresAnual = tasaInteresAnual;
    }

    //Este getter modifica el formato de fecha a dd/MM/yyyy HH:mm:ss usando el SimpleDateFormat y retorna como fechaCreacion
    public String getFechaCreacion() {
        SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return formateador.format(fechaCreacion);
    }
}
