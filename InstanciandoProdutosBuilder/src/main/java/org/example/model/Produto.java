package org.example.model;

import java.time.LocalDate;

public class Produto {
    private long id;
    private String codigoEan;
    private String descricao;
    private String marca;
    private String modelo;
    private double preco;
    private static LocalDate dataCadastro;
    private static LocalDate dataUltimaAtualizacao;
    private int estoque;
    private String categoria;
    private String urlFoto;

    private Produto(ProdutoBuilder builder) {
        this.id = builder.id;
        this.codigoEan = builder.codigoEan;
        this.descricao = builder.descricao;
        this.marca = builder.marca;
        this.modelo = builder.modelo;
        this.preco = builder.preco;
        this.dataCadastro = LocalDate.now();
        this.dataUltimaAtualizacao = this.dataCadastro;
        this.estoque = builder.estoque >= 0 ? builder.estoque : 0;
        this.categoria = builder.categoria;
        this.urlFoto = builder.urlFoto;
    }

    public long getId() {
        return id;
    }

    public String getCodigoEan() {
        return codigoEan;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPreco() {
        return preco;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public LocalDate getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    public int getEstoque() {
        return estoque;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", codigoEan='" + codigoEan + '\'' +
                ", descricao='" + descricao + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", preco=" + preco +
                ", estoque=" + estoque +
                ", categoria='" + categoria + '\'' +
                ", urlFoto='" + urlFoto + '\'' +
                '}';
    }

    // Classe Builder
    public static class ProdutoBuilder {
        private long id;
        private String codigoEan;
        private String descricao;
        private String marca;
        private String modelo;
        private double preco;
        private int estoque;
        private String categoria;
        private String urlFoto;

        public ProdutoBuilder(long id, String codigoEan, String descricao) {
            this.id = id;
            this.codigoEan = codigoEan;
            this.descricao = descricao;
        }

        public ProdutoBuilder marca(String marca) {
            this.marca = marca;
            return this;
        }

        public ProdutoBuilder modelo(String modelo) {
            this.modelo = modelo;
            return this;
        }

        public ProdutoBuilder preco(double preco) {
            if (preco > 0) {
                this.preco = preco;
            } else {
                throw new IllegalArgumentException("O preço deve ser maior que zero.");
            }
            return this;
        }

        public ProdutoBuilder estoque(int estoque) {
            if (estoque >= 0) {
                this.estoque = estoque;
            } else {
                throw new IllegalArgumentException("O estoque não pode ser negativo.");
            }
            return this;
        }

        public ProdutoBuilder categoria(String categoria) {
            this.categoria = categoria;
            return this;
        }

        public ProdutoBuilder urlFoto(String urlFoto) {
            this.urlFoto = urlFoto;
            return this;
        }

        public Produto build() {
            if (marca != null && modelo == null) {
                throw new IllegalArgumentException("Não é possível definir um modelo sem uma marca.");
            }
            if (dataUltimaAtualizacao != null && dataUltimaAtualizacao.isBefore(dataCadastro)) {
                throw new IllegalArgumentException("A data de última atualização não pode ser anterior à data de cadastro.");
            }
            return new Produto(this);
        }
    }
}
