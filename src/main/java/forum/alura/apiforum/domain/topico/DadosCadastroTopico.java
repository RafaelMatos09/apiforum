package forum.alura.apiforum.domain.topico;

import forum.alura.apiforum.domain.curso.Curso;
import forum.alura.apiforum.domain.resposta.Resposta;
import forum.alura.apiforum.domain.usuario.Usuario;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record DadosCadastroTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensagem,
        @NotNull
        @Valid
        StatusTopico status,
        @NotNull
        @Valid
        Usuario autor,
        @NotNull
        @Valid
        Curso curso,
        @NotNull
        @Valid
        List<Resposta> respostas) {
}
