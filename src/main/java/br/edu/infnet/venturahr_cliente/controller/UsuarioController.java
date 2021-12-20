package br.edu.infnet.venturahr_cliente.controller;

import br.edu.infnet.venturahr_cliente.service.UsuarioService;
import br.edu.infnet.venturahr_cliente.service.dto.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(value = "/index")
    public String telaIndex(){
        return "index.jsp";
    }

    @GetMapping(value = "/cadastro")
    public String telaCadastro(){
        return "usuario/cadastro";
    }

    @PostMapping(value = "/login")
    public ModelAndView telaLogin(@Valid Usuario usuario, BindingResult br){

        ModelAndView retorno = new ModelAndView("usuario/erro");
        if(br.hasErrors()){
            retorno.addObject("erros",br.getFieldErrors());
        }else{

            Usuario usuario1 = usuarioService.inserirUsuario(usuario);
            String view = "";
            switch (usuario.getTipo().toUpperCase()){
                case "E":
                    view = "login";
                    break;
                case "C":
                    view = "login";
                    break;
            }
            retorno.setViewName(view);
            retorno.addObject("usuario",usuario);
        }

        return  retorno;
    }

    @PostMapping("/autenticar")
    public String autenticar(Model model, @RequestParam String email, String senha){
        Usuario usuario = usuarioService.obterPorEmail(email);
        String retorno = "";
        if (usuario !=null){
            if (usuario.getTipo().toUpperCase() == "E") {
                model.addAttribute("nome", usuario.getNome());
                retorno = "empresa/index";
            }else{
                model.addAttribute("nome",usuario.getNome());
                retorno =  "candidato/index";

            }

        }else {
            model.addAttribute("msg", "Login ou senha inválidos!");
            retorno = "redirect:/";
        }
        return retorno;
    }



}
