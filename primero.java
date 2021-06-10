import java.util.Scanner;

public class primero{
    public static void main(String[] args) {
        int numero,iter=0,aleat;
        Scanner ent = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        numero=ent.nextInt();
        while(iter<numero){
            iter++;
            aleat=(int)(Math.random()*100);
            System.out.println((iter)+" Numero aleatorio:  "+aleat);
        }
    } 
}