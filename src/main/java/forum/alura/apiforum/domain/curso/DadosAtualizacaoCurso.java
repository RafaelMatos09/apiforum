package forum.alura.apiforum.domain.curso;

public record DadosAtualizacaoCurso(
        Long id,
        Boolean ativo,
        String nome,
        String categoria
) {
}
