package forum.alura.apiforum.domain.usuario;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoUsuario(
        @NotNull
        Long id,
        Boolean ativo,
        String nome,
        String login
) {
}
