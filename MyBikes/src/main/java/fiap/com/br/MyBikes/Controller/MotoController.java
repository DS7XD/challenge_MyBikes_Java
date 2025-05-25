package fiap.com.br.MyBikes.Controller;

import fiap.com.br.MyBikes.dto.MotoDTO;
import fiap.com.br.MyBikes.Model.Moto;
import fiap.com.br.MyBikes.Repository.MotoRepository;
import fiap.com.br.MyBikes.Service.MotoService;
import jakarta.validation.Valid;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/motos")
public class MotoController {

    @Autowired
    MotoRepository repository;

    @Autowired
    MotoService service;

    @PostMapping
    public Moto salvar(@RequestBody @Valid Moto moto) {
        return repository.save(moto);
    }

    @GetMapping
    public Page<MotoDTO> listar(Pageable pageable) {
        return service.listar(pageable);
    }

    @GetMapping("/{id}")
    public Moto buscar(@PathVariable Long id) {
        return repository.findById(id).orElseThrow();
    }

    @PutMapping("/{id}")
    public Moto atualizar(@PathVariable Long id, @RequestBody @Valid Moto moto) {
        moto.setId(id);
        return repository.save(moto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @GetMapping("/busca")
    public List<Moto> buscarPorMarca(@RequestParam String marca) {
        return repository.findByMarcaIgnoreCase(marca);
    }
}
