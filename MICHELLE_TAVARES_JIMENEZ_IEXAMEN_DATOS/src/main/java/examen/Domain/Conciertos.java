package examen.Domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "conciertos")
@Data
public class Conciertos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConcierto;

    private String nombreArtista;

    private int costoEntrada;

    private String fechaConcierto;

    private String lugar;

}
