package com.mateeussoares.gerenciamento_estoque.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

@Getter
@Setter

public class MovimentacaoEstoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 150)
    private String tipoMovimentacao;

    @Column(nullable = false)
    private Integer quantidade;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime dataMovimentacao;

    @ManyToOne
    @JoinColumn(name = "produto_id", nullable = false)
    private Produto produto;

}
