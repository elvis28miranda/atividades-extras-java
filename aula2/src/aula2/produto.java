/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula2;

/**
 *
 * @author elvis
 */
public class produto {

    //ATRIBUTOS
    String nome;
    String marca;
    float valor;
    
    //CONSTRUTORES
    produto(){
        
    }
    
    produto(String nome){
        this.nome = nome;
    }
    
    produto(String nome, String marca){
        this.nome = nome;
        this.marca = marca;
    }
    
    produto(String nome, String marca, float valor){
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;
    }
}
