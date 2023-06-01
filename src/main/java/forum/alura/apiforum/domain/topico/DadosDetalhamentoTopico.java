package forum.alura.apiforum.domain.topico;

import forum.alura.apiforum.domain.curso.Curso;
import forum.alura.apiforum.domain.resposta.Resposta;
import forum.alura.apiforum.domain.usuario.Usuario;

import java.time.LocalDateTime;
import java.util.List;

public record DadosDetalhamentoTopico(Long id, String titulo, String mensagem, LocalDateTime dataCriacao, StatusTopico status,Usuario autor, Curso curso, List<Resposta> respostas) {

    public DadosDetalhamentoTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(),topico.getMensagem(), topico.getDataCriacao(), topico.getStatus(), topico.getAutor(), topico.getCurso(), topico.getRespostas());
    }
}
