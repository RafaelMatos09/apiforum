package forum.alura.apiforum.domain.resposta;

import forum.alura.apiforum.domain.topico.Topico;
import forum.alura.apiforum.domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Table(name = "respostas")
@Entity(name = "Resposta")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Resposta {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mensagem;
    @ManyToMany
    private Topico topico;
    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao = LocalDateTime.now();
    @OneToMany
    private Usuario autor;
    private Boolean solucao = false;

    public Resposta(DadosCadastroResposta dados) {
        this.mensagem = dados.mensagem();
        this.topico = dados.topico();
        this.dataCriacao = dados.dataCriacao();
        this.autor = dados.autor();
        this.solucao = dados.solucao();
    }
}
