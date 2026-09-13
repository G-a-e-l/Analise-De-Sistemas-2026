import domain.*;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Estudante estudante = new Estudante(1, "Fernanda Rocha", "123.456.789-00",
                "2023020", "Desenvolvimento de Sistemas", "Rua das Flores, 100", TurnoEnum.NOTURNO);

        LinhaOnibus linha = new LinhaOnibus(1, "205", "Centro/Campus", "Viação Uberlândia",
                "Terminal Central", "Campus IFTM");

        SolicitacaoPasse solicitacao = new SolicitacaoPasse(1, estudante, linha,
                SituacaoSolicitacaoPasseEnum.EM_ANALISE);

        Documento documento = new Documento(1, "Comprovante de Matrícula",
                LocalDate.of(2026, 9, 1), SituacaoDocumentoEnum.APROVADO);
        solicitacao.getDocumentos().add(documento);

        System.out.println(estudante);
        System.out.println(linha);
        System.out.println(solicitacao);
    }
}
