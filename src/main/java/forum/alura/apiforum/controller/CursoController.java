package forum.alura.apiforum.controller;

import forum.alura.apiforum.domain.curso.Curso;
import forum.alura.apiforum.domain.curso.CursoRepository;
import forum.alura.apiforum.domain.curso.DadosCadastroCurso;
import forum.alura.apiforum.domain.curso.DadosDetalhamentoCurso;
import forum.alura.apiforum.domain.resposta.DadosCadastroResposta;
import forum.alura.apiforum.domain.resposta.DadosDetalhamentoResposta;
import forum.alura.apiforum.domain.resposta.Resposta;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroCurso dados, UriComponentsBuilder uriBuilder) {
        var curso = new Curso(dados);

        repository.save(new Curso(dados));

        var uri = uriBuilder.path("/cursos/{id}").buildAndExpand(curso.getId()).toUri();
        return ResponseEntity.created(uri).body(new DadosDetalhamentoCurso(curso));
    }
}
