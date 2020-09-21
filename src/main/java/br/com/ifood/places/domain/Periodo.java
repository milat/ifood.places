package br.com.ifood.places.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Periodo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long restaurante;

    private String descricao;

    private String de;

    private String ate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Long restaurante) {
        this.restaurante = restaurante;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getAte() {
        return ate;
    }

    public void setAte(String ate) {
        this.ate = ate;
    }
}
