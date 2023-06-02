package forum.alura.apiforum.controller;

import forum.alura.apiforum.domain.topico.DadosCadastroTopico;
import forum.alura.apiforum.domain.topico.DadosDetalhamentoTopico;
import forum.alura.apiforum.domain.topico.Topico;
import forum.alura.apiforum.domain.topico.TopicoRepository;
import forum.alura.apiforum.domain.usuario.DadosCadastroUsuario;
import forum.alura.apiforum.domain.usuario.DadosDetalhamentoUsuario;
import forum.alura.apiforum.domain.usuario.Usuario;
import forum.alura.apiforum.domain.usuario.UsuarioRepository;
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
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;
    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroUsuario dados, UriComponentsBuilder uriBuilder){
        var usuario = new Usuario(dados);

        repository.save(new Usuario(dados));

        var uri = uriBuilder.path("/usuarios/{id}").buildAndExpand(usuario.getId()).toUri();
        return ResponseEntity.created(uri).body(new DadosDetalhamentoUsuario(usuario));
    }


}
