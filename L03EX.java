packege teste;

import java.util.Scanner;

public class L03EX {

   
    public static void main(String[] args) {
       Integer idade = 0;
       Scanner in = new Scanner(System.in);
        System.out.println("Qual e sua idade? ");
        idade = in.nextInt();
        if (idade >=18){
            System.out.println("Pode Entrar");
        }else{
            System.out.println("some daqui");
        
        }
       
               
    }
    
}