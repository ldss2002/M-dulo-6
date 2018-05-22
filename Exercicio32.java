package exercicio32;
import java.util.Scanner;
import java.util.LinkedList;
import javax.swing.JOptionPane;
public class Exercicio32 {
    private static LinkedList<String> recados;
    public static void main(String[] args) {
    recados = new LinkedList <String>();
    Scanner dados = new Scanner(System.in);
    int menu;
    String inserir;
    String escolha;
    do{
        System.out.println("..;Bloco de Notas;.."
        +"\n(1) Adicionar Recado \n"
                +"(2) Adicionar Recado \n"
                +"(3) Adicionar Recado \n"
                +"(4) Adicionar Recado \n"
                +"(0) Sair do Programa \n"
                +"\n Insira a opção:");
        menu = dados.nextInt();
        switch(menu){
            case 1:
                System.out.println();
                inserir = JOptionPane.showInputDialog("Inserir linha");
                recados.add(inserir);
                System.out.println(recados);
                System.out.println();
                break;
            case 2:
                System.out.println();
                System.out.println(recados);
                System.out.println();
                break;
            case 3:
                System.out.println();
                System.out.println("Têm a certeza que quer remover a primeira linha? (Sim/Não)");
                escolha = dados.next();
                if(escolha.equals("Sim")){
                    System.out.println();
                    System.out.println("A primeira linha foi removida");
                    recados.removeFirst();
                    System.out.println();
                } else {
                    System.out.println();
                    System.out.println("Voltou ao menu");
                    System.out.println();
                }
                break;
            case 0:
                System.out.println();
                System.out.print("Adeus");
                System.exit(0);
        }
                
                }while (true);
    }}
             
                
        
        
    


    
    

