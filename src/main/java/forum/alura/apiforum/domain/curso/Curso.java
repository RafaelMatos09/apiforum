package forum.alura.apiforum.domain.curso;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "cursos")
@Entity(name = "Curso")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome_curso")
    private String nome;
    @Column(name = "categoria_curso")
    private String categoria;

    public Curso(DadosCadastroCurso dados) {
        this.nome = dados.nome();
        this.categoria = dados.categoria();
    }
}
