package com.ejemplo.Kyosuke;

public class Main {
    public static void main(String[] args) {
        int opcion = 0, desicion = 1; //Declaracion de variables que se van a utilizar para las condiciones de do-while y de switch
        Cuenta cuenta1 = new Cuenta(); //Inicializacion de cuenta de tipo clase Cuenta
        cuenta1.ingresarDatos(cuenta1); //Se hace el llamado al metodo ingresarDatos
        do { //Un ciclo do-while que contiene un switch que permite al usuario elegir si va a hacer un retiro, un deposito o imprimir la informacion de la cuenta
            System.out.println("¿Que se desea hacer con su cuenta?: [1.Hacer un retiro] [2.Hacer un deposito] [3.Imprimir la informacion de la cuenta]");
            opcion = cuenta1.teclado.nextInt(); //El usuario ingresa la opcion que se desea realizar
            switch(opcion){
                case 1:
                    cuenta1.retiro(cuenta1); //Si el usuario digita 1 llama al metodo de retiro
                    break;
                case 2:
                    cuenta1.deposito(cuenta1); //Si el usuario digita 2 llama al metodo de deposito
                    break;
                case 3:
                    cuenta1.imprimirCuenta(cuenta1); //Si el usuario digita 3 llama al metodo de imprimir la informacion de la cuenta
                    break;
                default:
                    System.out.println("Opcion invalida"); //Si el usuario ingresa otro valor diferente se muestra este mensaje de error
                    break;
            }
            System.out.println("¿Desea continuar?: [1.Si] [2.No]"); //Se pregunta al usuario si se quiere realizar mas operaciones con la cuenta
            desicion = cuenta1.teclado.nextInt(); //Se define el valor de desicion que es la condicion para el ciclo do-while
        }while(desicion == 1); //Si el usuario digita 1 se continua el ciclo
    }
    //El do-while y el switch son implementados para que el usuario pueda elegir que hacer con su cuenta, y no es parte del ejercicio dado
    //El programa se puede llegar a reducir a 6-7 lineas de codigo si no se implementa el do-while y el switch. En ese caso, el programa seria como se muestra a continuacion:
    /*public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta();
        cuenta1.ingresarDatos(cuenta1);
        cuenta1.retiro(cuenta1);
        cuenta1.deposito(cuenta1);
        cuenta1.imprimirCuenta(cuenta1);
    }*/
}