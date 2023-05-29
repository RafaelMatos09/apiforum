package forum.alura.apiforum.domain.topico;

import forum.alura.apiforum.domain.topico.Topico;
import forum.alura.apiforum.domain.usuario.Usuario;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Resposta {

    private String mensagem;
    private Topico topico;
    private LocalDateTime dataCriacao = LocalDateTime.now();
    private Usuario autor;
    private Boolean solucao = false;
}
