import domain.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class App {
    public static void main(String[] args) {

        Quadra quadraFutsal = new Quadra(1, "Quadra Poliesportiva 1", "Bloco A", TipoPisoEnum.EMBORRACHADO);
        quadraFutsal.getModalidadesPermitidas().add(ModalidadeEnum.FUTSAL);
        quadraFutsal.getModalidadesPermitidas().add(ModalidadeEnum.HANDEBOL);

        Quadra quadraVolei = new Quadra(2, "Quadra de Areia", "Bloco B", TipoPisoEnum.GRAMA_SINTETICA);
        quadraVolei.getModalidadesPermitidas().add(ModalidadeEnum.VOLEI);
        quadraVolei.getModalidadesPermitidas().add(ModalidadeEnum.PETECA);

        Aluno aluno1 = new Aluno(1, "Lucas Andrade", "2023010");
        Aluno aluno2 = new Aluno(2, "Beatriz Lima", "2023011");

        Agendamento agendamento1 = new Agendamento(1, quadraFutsal, ModalidadeEnum.FUTSAL,
                LocalDate.of(2026, 9, 20), LocalTime.of(14, 0), LocalTime.of(15, 0),
                SituacaoAgendamentoEnum.CONFIRMADO);
        agendamento1.getParticipantes().add(aluno1);
        agendamento1.getParticipantes().add(aluno2);

        Agendamento agendamento2 = new Agendamento(2, quadraVolei, ModalidadeEnum.VOLEI,
                LocalDate.of(2026, 9, 21), LocalTime.of(16, 0), LocalTime.of(17, 0),
                SituacaoAgendamentoEnum.SOLICITADO);
        agendamento2.getParticipantes().add(aluno1);

        System.out.println(quadraFutsal);
        System.out.println(quadraVolei);
        System.out.println(agendamento1);
        System.out.println(agendamento2);
    }
}
