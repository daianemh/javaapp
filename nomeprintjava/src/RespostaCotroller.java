package com.seuprojeto.controller;

import com.seuprojeto.model.Resposta;
import com.seuprojeto.repository.RespostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/respostas")
public class RespostaController {

    @Autowired
    private RespostaRepository respostaRepository;

    @PostMapping
    public ResponseEntity<Resposta> criarResposta(@RequestBody Resposta resposta) {
        return ResponseEntity.ok(respostaRepository.save(resposta));
    }

    @GetMapping
    public ResponseEntity<List<Resposta>> listarRespostas() {
        return ResponseEntity.ok(respostaRepository.findAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Resposta> atualizarResposta(@PathVariable Long id, @RequestBody Resposta dados) {
        Resposta resposta = respostaRepository.findById(id).orElseThrow(() -> new RuntimeException("Resposta não encontrada"));
        resposta.setConteudo(dados.getConteudo());
        return ResponseEntity.ok(respostaRepository.save(resposta));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarResposta(@PathVariable Long id) {
        respostaRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
