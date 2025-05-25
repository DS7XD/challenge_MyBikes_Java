package fiap.com.br.MyBikes.Repository;

import fiap.com.br.MyBikes.Model.Moto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MotoRepository extends JpaRepository<Moto, Long> {
    List<Moto> findByMarcaIgnoreCase(String marca);
}
