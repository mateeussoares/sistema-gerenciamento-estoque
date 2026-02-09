package com.mateeussoares.gerenciamento_estoque.model;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "produto")
public class Produto {


    //Colunas da tabela produto
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150)
    private String nome;

    @Column(nullable = false)
    private Integer quantidade;

    @Column(name = "estoque_minimo", nullable = false)
    private Integer estoqueMinimo;

    @Column(nullable = false)
    private LocalDateTime dataCadastro;

    @Column(length = 255)
    private String descricao;

    //Relação entre a tabela categoria e produto

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

}
