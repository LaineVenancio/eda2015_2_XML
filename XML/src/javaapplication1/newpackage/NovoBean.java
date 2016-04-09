/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.newpackage;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author Aluno
 */
public class NovoBean implements Serializable {
    
    public static final String NOME_PROPERTY = "nome";
    public static final String DESCRICAO_PROPERTY = "descricao";
    
    private String nome;
    private String descricao;
    
    private PropertyChangeSupport propertySupport;
    
    public NovoBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        String oldValue = this.nome;
        this.nome = nome;
        propertySupport.firePropertyChange(NOME_PROPERTY, oldValue, this.nome);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        String oldValue = this.descricao;
        this.descricao = descricao;
        propertySupport.firePropertyChange(DESCRICAO_PROPERTY, oldValue, this.descricao);
        
    }
    
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
