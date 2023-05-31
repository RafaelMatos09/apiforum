package forum.alura.apiforum.domain.topico;

import forum.alura.apiforum.domain.Curso.Curso;
import forum.alura.apiforum.domain.resposta.Resposta;
import forum.alura.apiforum.domain.usuario.Usuario;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;
import java.util.List;

public record DadosCadastroTopico(

        String titulo,
        String mensagem,
        LocalDateTime dataCriacao,
        StatusTopico status,
        Usuario autor,
        Curso curso,
        List<Resposta> respostas) {
}
