package adivinaminumero;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        String i = "";
        System.out.println("Bienvenido al juego adivina tu numero!!");
        do{
            System.out.println("Escribi 'yo', si queres adivinar un numero.\nEscribi 'vos' si yo tengo que adivinar tu numero.\nSi queres salir escribi 'exit'");
            Scanner scan = new Scanner(System.in);
            i = scan.next();
            if("yo".equals(i)){
            new AdivinaMiNumero().jugar();
            }if("vos".equals(i)){
                new AdivinaMiNumero1().jugar();
            }
        }while(!("exit".equals(i)));
    }
}
