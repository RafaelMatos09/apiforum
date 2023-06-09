package forum.alura.apiforum.domain.topico;

import forum.alura.apiforum.domain.curso.Curso;
import forum.alura.apiforum.domain.resposta.Resposta;
import forum.alura.apiforum.domain.usuario.Usuario;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record DadosCadastroTopico(

        String titulo,

        String mensagem,

        StatusTopico status,

        Usuario autor,

        Curso curso,

        List<Resposta> respostas) {
}
