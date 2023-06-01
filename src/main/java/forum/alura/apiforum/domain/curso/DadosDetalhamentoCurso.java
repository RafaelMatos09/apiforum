package forum.alura.apiforum.domain.curso;

import forum.alura.apiforum.domain.resposta.Resposta;
import forum.alura.apiforum.domain.topico.Topico;
import forum.alura.apiforum.domain.usuario.Usuario;

import java.time.LocalDateTime;

public record DadosDetalhamentoCurso(String curso, String categoria) {

    public DadosDetalhamentoCurso(Curso curso) {
        this(curso.getNome(), curso.getCategoria());
    }
}
