package br.edu.infnet.venturahr_cliente.service;

import br.edu.infnet.venturahr_cliente.service.dto.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient (url = "http://localhost:8081/usuario",name = "usuarioService")
public interface UsuarioService {

    @GetMapping("/email/{email}")
    Usuario obterPorEmail(@PathVariable String email);

    @PostMapping
    Usuario inserirUsuario (@RequestBody Usuario usuario);

    @PatchMapping
    Usuario atualizarUsuario (@RequestBody Usuario usuario);

    @DeleteMapping
    Usuario excluirUsuario (@PathVariable Integer id);

}
