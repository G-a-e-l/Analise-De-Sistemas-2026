import domain.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class App {
    public static void main(String[] args) {

        Aluno motorista = new Aluno(1, "João Pedro", "2023001");
        Veiculo veiculo = new Veiculo(1, "ABC1D23", "Onix", "Prata", 4);

        Carona carona = new Carona(1, motorista, veiculo,
                "Campus Uberlândia Centro", "Shopping Uberlândia",
                LocalDate.of(2026, 9, 15), LocalTime.of(18, 0), 3,
                SituacaoCaronaEnum.ABERTA);

        Aluno passageiro1 = new Aluno(2, "Maria Silva", "2023002");
        Aluno passageiro2 = new Aluno(3, "Pedro Souza", "2023003");
        Aluno passageiro3 = new Aluno(4, "Ana Costa", "2023004");

        Solicitacao solicitacao1 = new Solicitacao(1, carona, passageiro1,
                LocalDate.of(2026, 9, 10), SituacaoSolicitacaoEnum.ACEITA);
        Solicitacao solicitacao2 = new Solicitacao(2, carona, passageiro2,
                LocalDate.of(2026, 9, 11), SituacaoSolicitacaoEnum.PENDENTE);
        Solicitacao solicitacao3 = new Solicitacao(3, carona, passageiro3,
                LocalDate.of(2026, 9, 12), SituacaoSolicitacaoEnum.RECUSADA);

        carona.getSolicitacoes().add(solicitacao1);
        carona.getSolicitacoes().add(solicitacao2);
        carona.getSolicitacoes().add(solicitacao3);

        System.out.println(carona);
        System.out.println(solicitacao1);
        System.out.println(solicitacao2);
        System.out.println(solicitacao3);
    }
}
