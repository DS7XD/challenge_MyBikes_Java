package fiap.com.br.MyBikes.Repository;

import fiap.com.br.MyBikes.Model.Locacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocacaoRepository extends JpaRepository<Locacao, Long> {
}
