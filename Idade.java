
package aula1;
// importação da classe scanner para interagir via teclado
import java.util.Scanner;

public class Idade {
   //criando atributos da classe 
    // string para palavras e int para numeros
    //(String sempre em letra maiuscula)
    
    String nome;
    int anoNascto;
    int anoAtual;
    int idade;
    
    // criação objetos para utilizar a classe scanner
    Scanner entrada = new Scanner(System.in);
    
    //declaração dos metodos de processamento
    public void recebe() {
        
        //comando de saida na tela
        System.out.println ("== PROGRAMA MOSTRA IDADE ==");
        
         System.out.print (" Digite o seu nome: ");
         nome = entrada.nextLine();
         
     
        System.out.print (" Digite o seu ano de nascimento: ");
        anoNascto = entrada.nextInt();
        
         System.out.print (" Digite o ano atual: ");
        anoAtual = entrada.nextInt();
        
        
    }
    
    public void calcula(){
        idade = anoAtual - anoNascto;
    }
    
    public void mostra () {
        System.out.println("Seja bem vindo, "+nome+"\n"
        +"Este ano voce completou ou completara: "+idade);
    }
}
