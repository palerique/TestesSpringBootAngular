package br.com.sitedoph.spring_boot_angular.dominio.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by paler on 28/04/2016.
 */
@Entity
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String descricao;
    private boolean arquivada;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isArquivada() {
        return arquivada;
    }

    public void setArquivada(boolean arquivada) {
        this.arquivada = arquivada;
    }
}
