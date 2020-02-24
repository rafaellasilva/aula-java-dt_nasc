/*
 * 21/02/20 - programa idade
Receber o nome e ano de nascimento, ano atual e calcular a idade,
mostrando no final o nome digitado e a idade calculada.

 */
package aula1;


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // define a execução do programa
        
        // criar um objeto para comunicar as duas classes
        Idade obj = new Idade();
        obj.recebe();
        obj.calcula();
        obj.mostra();
    }
    
}
