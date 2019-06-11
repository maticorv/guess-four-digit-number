package adivinaminumero;

import java.util.Scanner;


public class AdivinaMiNumero2 {
    String i ="0000";
    String a="";
    String numero="1234";
    String respuesta="";
    int good=0;
    int regular=0;
    
    public void jugar(){
        System.out.println("Estoy pensando un numero entre 0 y 9999");
        System.out.println("Podes adivinarlo??");
        this.i= solicitarNumero();
        Distancia(i);
    }
    
    public String solicitarNumero(){
        System.out.println("Ingresa el numero:");
        try{
            Scanner scan = new Scanner(System.in);
             respuesta = scan.next();
        }catch(Exception e){
            solicitarNumero();
        }
        return i;
    }
    public void Distancia(String i){
        int R=0;
        int G=0;
        for(int var=0;var<4;var++){
            char caracter = this.i.charAt(var);
            if(caracter==this.numero.charAt(var)){
                G++;
            } else {
                if(caracter==this.numero.charAt(var)+1 || caracter==this.numero.charAt(var)-1){
                    G++;
                }
            }
        }
        this.regular=R;
        this.good=G;
    }
    
}
