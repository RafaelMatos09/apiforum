package forum.alura.apiforum.domain.resposta;

import forum.alura.apiforum.domain.topico.Topico;
import forum.alura.apiforum.domain.usuario.Usuario;

import java.time.LocalDateTime;

public record DadosDetalhamentoResposta(Long id, String mensagem, Topico topico, LocalDateTime dataCriacao, Usuario autor, Boolean solucao) {

    public DadosDetalhamentoResposta(Resposta resposta) {
        this(resposta.getId(), resposta.getMensagem(), resposta.getTopico(), resposta.getDataCriacao(), resposta.getAutor(), resposta.getSolucao());
    }
}
