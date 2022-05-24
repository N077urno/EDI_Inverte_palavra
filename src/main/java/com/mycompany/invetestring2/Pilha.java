/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.invetestring2;

import javax.swing.JOptionPane;

/**
 *
 * @author nando
 */
class Pilha {
    char pilha[] = new char[100];
    int topopilha = -1;
    
    int tamanho(){
        return(this.topopilha+1);
    }
    
    int push(int topo, char s){
        this.topopilha = topo;
        this.topopilha++;
        
        if(this.topopilha<0){
            this.topopilha = 0;
        }
        
        if(this.topopilha > 99){
            JOptionPane.showMessageDialog(null,"Estouro de pilha, Erro: -999");
            return(this.topopilha--);
        }else{
            this.pilha[this.topopilha]=s;
            System.out.println("Inserindo o elemento..: "+s);
            return(this.topopilha);
        }
    }
    
    char pop(int topo){
        this.topopilha = topo;
        this.topopilha--;
        
        if(this.topopilha<-1){
           JOptionPane.showMessageDialog(null,"Pilha vazia!!! Erro..: -997");
           return('9');
        }else{
            System.out.println("Retirando o valor ..: "+this.pilha[this.topopilha+1]);
            return(this.pilha[this.topopilha+1]);
        }
    }
    
}
