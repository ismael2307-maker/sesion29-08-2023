import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);
        int num1,num2;
        int resultado;
        int ING=0;
        double cociente=0.0;

         while(ING==0){
            System.out.println("   ");
        System.out.println("Menu de opciones");
        
        System.out.println("Digite su opcion: 1.-Sumar 2.-Restar 3.-Multiplicar 4-Dividir 5.-Potenciacion 6:-Raiz 7.-Salir");
        byte operacion=x.nextByte();

        switch(operacion){
            case 1:{
                System.out.println("Digite el valor del numero 1: ");
                num1=x.nextInt();

                System.out.println("Digite el valor del numero 2: ");
                num2=x.nextInt();
                //Operacion
                resultado=num1+num2;
                System.out.println("   ");
                System.out.println("El resultado de la suma es: "+resultado);
                break;
            }

             case 2:{
                System.out.println("Digite el valor del numero 1: ");
                num1=x.nextInt();

                System.out.println("Digite el valor del numero 2: ");
                num2=x.nextInt();
                //Operacion
                resultado=num1-num2;
                System.out.println("   ");
                System.out.println("El resultado de la resta es: "+resultado);
                break;
            }
             case 3:{
                System.out.println("Digite el valor del numero 1: ");
                num1=x.nextInt();

                System.out.println("Digite el valor del numero 2: ");
                num2=x.nextInt();
                //Operacion
                resultado=num1*num2;
                System.out.println("   ");
                System.out.println("El resultado de la multiplicacion es: "+resultado);
                break;
            }
              case 4:{
                System.out.println("Digite el valor del numero 1: ");
                num1=x.nextInt();

                System.out.println("Digite el valor del numero 2: ");
                num2=x.nextInt();
                //Operacion
                if(num2!=0){
                cociente=(double) num1/num2;
                System.out.println("   ");
                System.out.println("El resultado de la division es : "+cociente);
                }else{
                    System.out.println("No se puede dividir entre cero");
                }
                break;
            }
            case 5:{
                 System.out.println("Digite la base del numero 1: ");
                num1=x.nextInt();

                System.out.println("Digite el exponente del numero 2: ");
                num2=x.nextInt();
                //Operacion
                double potencia =Math.pow(num1,num2);
                System.out.println("   ");
                System.out.println("El resultado de la potencia es: "+potencia);
            }
            case 6:{         
                System.out.println("Digite el valor del numero : ");
                num1=x.nextInt();
                //Operacion
                if(num1<0){
                     System.out.println("Las raices no pueden ser negativas");
                }else{      
                double res=Math.sqrt(num1);
                System.out.println("   ");
                System.out.println("El resultado de la raiz es : "+res);
                }
               
                break;
            }
            case 7:{
                 System.out.println("Ha salido del programa");
             break;
            }
            default:
               System.out.println("No ha digitado ninguna de las opciones proporcionadas");


        }
         }
        x.close();
     
    }
}
