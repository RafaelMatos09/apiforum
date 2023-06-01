package forum.alura.apiforum.domain.resposta;

import forum.alura.apiforum.domain.topico.Topico;
import forum.alura.apiforum.domain.usuario.Usuario;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosCadastroResposta(
        @NotBlank
        String mensagem,
        @NotNull
        @Valid
        Topico topico,
        @NotBlank
        LocalDateTime dataCriacao,
        @NotNull
        @Valid
        Usuario autor,
        @NotBlank
        Boolean solucao) {
}
