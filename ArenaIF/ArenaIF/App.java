import domain.*;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Campeonato campeonato = new Campeonato(1, "Copa IFTM de Free Fire", "Free Fire",
                LocalDate.of(2026, 10, 1), LocalDate.of(2026, 10, 15), 16,
                FormatoCompeticaoEnum.ELIMINATORIA_SIMPLES, SituacaoCampeonatoEnum.INSCRICOES_ABERTAS);

        Aluno aluno1 = new Aluno(1, "Rafael Nunes", "2023030");
        Aluno aluno2 = new Aluno(2, "Camila Torres", "2023031");
        Aluno aluno3 = new Aluno(3, "Gustavo Melo", "2023032");
        Aluno aluno4 = new Aluno(4, "Juliana Alves", "2023033");

        InscricaoCampeonato inscricao1 = new InscricaoCampeonato(1, campeonato, aluno1, null);
        InscricaoCampeonato inscricao2 = new InscricaoCampeonato(2, campeonato, aluno2, null);
        InscricaoCampeonato inscricao3 = new InscricaoCampeonato(3, campeonato, aluno3, null);
        InscricaoCampeonato inscricao4 = new InscricaoCampeonato(4, campeonato, aluno4, null);

        Partida partida = new Partida(1, campeonato, inscricao1, inscricao2,
                LocalDate.of(2026, 10, 2), 1, 0, 0, SituacaoPartidaEnum.AGENDADA);

        System.out.println(campeonato);
        System.out.println(inscricao1);
        System.out.println(inscricao2);
        System.out.println(inscricao3);
        System.out.println(inscricao4);
        System.out.println(partida);
    }
}
