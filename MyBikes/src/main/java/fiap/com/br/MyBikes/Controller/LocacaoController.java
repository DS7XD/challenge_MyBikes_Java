package fiap.com.br.MyBikes.Controller;

import fiap.com.br.MyBikes.Model.Locacao;
import fiap.com.br.MyBikes.Model.Moto;
import fiap.com.br.MyBikes.Repository.LocacaoRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

@RestController
@RequestMapping("/locacoes")
public class LocacaoController {

    private final LocacaoRepository repository;

    public LocacaoController(LocacaoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Page<Moto> listar(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @GetMapping("/{id}")
    public Locacao findById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PostMapping
    public Locacao save(@RequestBody Locacao locacao) {
        return repository.save(locacao);
    }

    @PutMapping("/{id}")
    public Locacao update(@PathVariable Long id, @RequestBody Locacao locacao) {
        locacao.setId(id);
        return repository.save(locacao);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
