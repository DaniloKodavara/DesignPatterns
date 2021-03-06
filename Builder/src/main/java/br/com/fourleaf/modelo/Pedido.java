package br.com.fourleaf.modelo;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class Pedido {

    private String numeroPedido;
    private List<Produto> produtos;
    private Cliente cliente;
    private Vendedor vendedor;

    private BigDecimal getValorTotal(){
        BigDecimal total = BigDecimal.ZERO;

        for (Produto produto: produtos) {
            total = total.add(produto.getValor().multiply(new BigDecimal(produto.getQuantidade())));
        }

        return total;
    }

    public int getTotalProdutos(){
        int total = 0;
        for(Produto produto : produtos){
            total += produto.getQuantidade();
        }
    }
}
