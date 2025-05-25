package fiap.com.br.MyBikes.Model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Locacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Moto moto;

    private String cliente;
    private LocalDate dataInicio;
    private LocalDate dataFim;
}