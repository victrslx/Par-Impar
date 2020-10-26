package par_impar;

import java.util.Scanner;

public class Par_Impar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float n1;
        System.out.print("Digite um numero: ");
        n1 = entrada.nextFloat();
        if(n1 % 2 == 0){
        System.out.print(n1+" é um numero par");
        }
        else{
        System.out.println(n1+" é um numero impar");
        }
    }
    
}
