// Conjetura de Collatz Recursiva, Factorial Recursivo, Fibonacci 
import java.util.Scanner;
public class Practica1_2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("Introduce una opcion de las siguientes!");
            System.out.println("[1]-> Conjetura de Collatz\n[2]-> Factorial\n[3]-> Fibonacci\n[4]-> Salir");
            opcion = scan.nextInt();

            System.out.println("Introduce el número del que deseas Calcular el dato");
            int num =scan.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Has escogido la Conjetura de Collatz");
                    Collatz(num, 0);

                break;

                case 2:
                    System.out.println("Has escogido el cálculo de un número factorial");
                break;

                case 3:
                    System.out.println("Has escogido la sucesión de Fibonacci");
                break;

                case 4:

                return;
                default:
                    System.out.println("Opcion Invalida, intentalo nuevamente");
                continue;
            }
        } while (opcion != 4);

    }
    static int Collatz(int num, int cont){
        if (num == 1){
            System.out.println("El numero ha alcanzado el valor de 1 después de " + cont + " llamadas recursivas!");
            return cont;
        }
        if (num % 2 == 0){
            Collatz(num/2, cont+1);
        }else{
            Collatz(3*num+1, cont+1);
        }
        return num;
    }
    static int Factorial(int num, int total){
        if(num <= 1){
            System.out.println("El factorial del numero es "+ total);
            return total;
        }
        int total= num*factorial(num-1);
        return;
    }
}