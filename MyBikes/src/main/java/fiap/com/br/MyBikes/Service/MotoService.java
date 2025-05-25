package fiap.com.br.MyBikes.Service;

import fiap.com.br.MyBikes.dto.MotoDTO;
import fiap.com.br.MyBikes.Model.Moto;
import fiap.com.br.MyBikes.Repository.MotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class MotoService {

    @Autowired
    private MotoRepository repository;

    public Page<MotoDTO> listar(Pageable pageable) {
        return repository.findAll(pageable).map(this::toDTO);
    }

    private MotoDTO toDTO(Moto moto) {
        return new MotoDTO(moto.getId(), moto.getMarca(), moto.getModelo(), moto.getPlaca(), moto.isDisponivel());
    }
}
