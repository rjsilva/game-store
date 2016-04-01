package br.com.gamestore.controller;

import br.com.gamestore.dao.AcessorioDao;
import br.com.gamestore.model.Acessorio;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Enoque Felipe
 */
@ManagedBean
@SessionScoped
public class AcessoriosBean {
    
    private Acessorio acessorio;
    
    public String preparaNovoAcessorio() { // Método responsável por inicialziar o Objeto Acessório, para que possamos setar os atributos.
        acessorio = new Acessorio();
        return "cadastroAcessorio";
    }
    
    public void adicionaAcessorio() {
        AcessorioDao dao = new AcessorioDao();
        dao.cadastrar(acessorio);
        FacesMessage msg = new FacesMessage("Registro salvo com sucesso!");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        limpar();
    }
    
    public void limpar() { // Método responsavel por limpar o Objeto.
        acessorio.getId();
        acessorio.setMarca("");
        acessorio.setNome("");
        acessorio.setQuantidade(0);
        acessorio.setStatus(0);
    }

    // Getters and Setters
    public Acessorio getAcessorio() {
        return acessorio;
    }
    
    public void setAcessorio(Acessorio acessorio) {
        this.acessorio = acessorio;
    }
    
}
