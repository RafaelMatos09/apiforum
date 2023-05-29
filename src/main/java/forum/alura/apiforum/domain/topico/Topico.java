package forum.alura.apiforum.domain.topico;

import forum.alura.apiforum.domain.resposta.Resposta;
import forum.alura.apiforum.domain.usuario.Usuario;
import forum.alura.apiforum.domain.curso.Curso;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Topico {
    private Long id;
    private String mensagem;
    private LocalDateTime dataCriação = LocalDateTime.now();
    private StatusTopico status = StatusTopico.NAO_RESPONDIDO;
    private Usuario autor;
    private Curso curso;
    private List<Resposta> respostas = new ArrayList<>();
}
