import domain.*;

public class App {
    public static void main(String[] args) throws Exception {

        Area area = new Area(1, "Computação");

        Local local = new Local(1,
                "Auditorio IFTM",
                "Rua Blanche",
                2033,
                "Morada da Colina",
                "Uberlândia",
                "123456789",
                10,
                "No campus");

        Pessoa pessoa = new Pessoa(1,
                "Carlos Eduardo",
                "/home/cadu.jpg",
                "Profe de analises",
                "cadu@iftm.edu.br");

        Usuario usuario = new Usuario(1,
                "senha",
                TipoUsuarioEnum.SERVIDOR,
                pessoa);

        System.out.println(area);
        System.out.println(local);
        System.out.println(pessoa);
        System.out.println(usuario);
    }
}
