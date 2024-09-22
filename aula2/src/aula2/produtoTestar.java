/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula2;

/**
 *
 * @author elvis
 */
public class produtoTestar {
    
    public static void main(String [] args){
        
        //construtor padrão
       produto p1 = new produto(); 
        p1.nome = "caneta petra";
        p1.marca = "faber";
        p1.valor = 1.50f;
        
        //construtor com 2 parametros
       produto p2 = new produto("caneta azul", "faber"); 
       p2.valor = 1.30f;
       
        //construtor com 3 parametros
       produto p3 = new produto("borracha azul", "mercur", 1.80f); 

       
        //objeto 1
        System.out.println("Nome: " + p1.nome + " Marca: " + p1.marca + " Valor: " + p1.valor);
       
           //objeto 2
        System.out.println("Nome: " + p2.nome + " Marca: " + p2.marca + " Valor: " + p2.valor);
        
           //objeto 3
        System.out.println("Nome: " + p3.nome + " Marca: " + p3.marca + " Valor: " + p3.valor);
    }
    
}
