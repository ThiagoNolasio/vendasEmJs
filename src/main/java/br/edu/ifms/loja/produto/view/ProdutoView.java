/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.produto.view;

import javax.swing.JDialog;
import javax.swing.JPanel;
import maruyama.components.mvc.GenericCRUDView;

/**
 *
 * @author Thiago
 */
public class ProdutoView extends GenericCRUDView{

    private JDialog janela;
    
    
    
    public ProdutoView(JPanel formulario) {
        super(formulario);
        
        janela = new JDialog();
        janela.add(this);
        janela.setModal(true);
        janela.setTitle("Produto");
        janela.setSize(800,700);
        
    }
    
    @Override
    public String[] configurarCamposDeBusca() {
    return new String[0];
    }
    
    public void setVisible(boolean b) {
        janela.setVisible(b);
    }
    
}
