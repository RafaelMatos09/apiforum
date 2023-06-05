package forum.alura.apiforum.domain.usuario;

public record DadosDetalhamentoUsuario(Long id, Boolean ativo, String nome, String email) {

    public DadosDetalhamentoUsuario(Usuario usuario) {
        this(usuario.getId(), usuario.getAtivo(), usuario.getNome(), usuario.getLogin());
    }
}
