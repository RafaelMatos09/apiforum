package forum.alura.apiforum.domain.Curso;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Curso {
    @Column(name = "nome_curso")
    private String nome;
    @Column(name = "categoria_curso")
    private String categoria;
}
