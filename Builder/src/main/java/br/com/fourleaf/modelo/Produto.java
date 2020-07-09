package br.com.fourleaf.modelo;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Produto {

    private String nome;
    private int quantidade;
    private BigDecimal valor;

}
