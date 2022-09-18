package calculadora.triangulo;
import java.util.Scanner;
public class CalculadoraTriangulo {
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in); // scanner
    
    // String's
    String f1 = "Olá, esse programa foi desenvolvido para descobrir se é possível formar um triângulo.";
    String f2 = "Digite abaixo a primeira medida em centímetros:";
    String f3 = "Digite abaixo a segunda medida em centímetros:";
    String f4 = "Digite abaixo a terceira medida em centímetros:";
    String f5 = "equilátero.";
    String f6 = "isósceles.";
    String f7 = "escaleno.";
    String f8 = "Não é possível formar um triângulo!";
    String f9 = "O triângulo formado será";
    String epc = " ";
    
    //Double 
    double med1 = 0;
    double med2 = 0;
    double med3 = 0;
     
    //Interação com o usuário:
    System.out.println(f1);
    System.out.println(f2);
    med1 = in.nextDouble();
    System.out.println(f3);
    med2 = in.nextDouble();
    System.out.println(f4);
    med3 = in.nextDouble();
    
    
    //Verifica se forma um triangulo ou não //Isóceles, escaleno, equilatero
    if (med1 < (med2 + med3) && med2 < (med1 + med3) && med3 < (med1 + med2)){ //Obrigatoriamente formará um triangulo
        if(med1 == med2 && med2 == med3){ // && = se todos forem verdades 
            System.out.println(f9 + epc + f5);
        }
        else if (med1 == med2 || med2 == med3 || med1 == med3){ // || = se alguma for verdade vai entrar no IF
            System.out.println(f9 + epc + f6);
        }
        else {
            System.out.println(f9 + epc + f7);
        }   

    //Se não forma um triangulo, não formará um triangulo
    } else {
        System.out.println(f8);
    }
}
}    

/*
Pedir 3 numeros ao usuário
Dizer se pode formar uma triangulo (quando forma um retângulo (quando dois lados forem maior que maior))
Se for um triangulo, qual o tipo de triangulo (equilatero, isóseles, escaleno)
Hipotenusa sempre será a maior
*/

/* 
Regra de condição de existência de um triângulo: 
uma dos lados tem que ser menos que a soma dos outros lados
a + b > c
a + c > b
b + c > a  

Tipos de triangulo:
Escaleno = medidas diferentes
Equilatero = medidas iguais
Isóceles = 2 medidas iguais e 1 diferente
*/