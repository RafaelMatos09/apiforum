package forum.alura.apiforum.domain.resposta;

import forum.alura.apiforum.domain.topico.Topico;
import forum.alura.apiforum.domain.usuario.Usuario;

import java.time.LocalDateTime;

public record DadosCadastroResposta(String mensagem, Topico topico, LocalDateTime dataCriacao, Usuario autor, Boolean solucao) {
}
