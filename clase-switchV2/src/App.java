import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner x=new Scanner(System.in);
        
        double num1,num2,resultado;
        char operador;

        System.out.println("Digite el primer numero");
        num1=x.nextDouble();

        System.out.println("Digite el segundo numero");
        num2=x.nextDouble();

        System.out.println("Digite si opcion a-Suma b.-Resta c.-Multiplicacioon d.-Division e.-Potenciacion f.-Salr");
        operador=x.next().charAt(0);
        
        switch(operador){

           case 'a':{
                  resultado=num1+num2;
                  System.out.println("LA SUMA DE LOS DOS NUMEROS ES: "+resultado);

             break;
            }

            case 'b':{
                  resultado=num1-num2;
                  System.out.println("LA RESTA DE LOS DOS NUMEROS ES: "+resultado);

             break;
            }

           case 'c':{
                  resultado=num1*num2;
                  System.out.println("lA MULTIPLICACION DE LOS DOS NUMEROS ES: "+resultado);

             break;
            }

            case 'd':{
                 if(num2 !=0){
                  resultado=(double)num1/num2;
                  System.out.println("lA DIVISION DE LOS DOS NUMEROS ES: "+resultado);
                 }else{
                   System.out.println("La division entre cero no existe");

                 }
             break;
            }
            case 'e':{
                  System.out.println("Ha salido del programa");
             break;
            }
            default:
                System.out.println("No se eligio ninguna de las opciones anteriores");

        }

       x.close();
    }
}
