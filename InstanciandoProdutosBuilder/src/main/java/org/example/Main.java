package org.example;

import org.example.model.Produto;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto.ProdutoBuilder(1, "1234567890", "Descrição do produto")
                .marca("Marca do produto")
                .modelo("Modelo do produto")
                .preco(99.99)
                .estoque(10)
                .categoria("Categoria do produto")
                .urlFoto("https://example.com/foto.jpg")
                .build();
        System.out.println(produto);
    }
}