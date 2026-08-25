package domain;
import java.time.LocalDateTime;
import java.util.List;
public class Atividade {
    private Integer id;
    private String titulo;
    private LocalDateTime dataHoraInicio;
    private LocalDateTime dataHoraFim;
    private Double cargaHoraria;
    private Integer quantidadeVagas;
    private Evento evento;
    private Local local;
    private List<AreaDaAtividade> areas;
    private List<Inscricao> inscritos;
    private List<AtividadeMinistrante> ministrantes;
}