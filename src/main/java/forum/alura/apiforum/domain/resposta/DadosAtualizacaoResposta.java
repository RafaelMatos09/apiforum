package forum.alura.apiforum.domain.resposta;

import forum.alura.apiforum.domain.topico.Topico;
import forum.alura.apiforum.domain.usuario.Usuario;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoResposta(
        @NotNull
        Long id,
        String mensagem,
        Topico topico,
        Usuario autor,
        Boolean solucao
) {
}
