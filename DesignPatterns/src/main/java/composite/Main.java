package composite;

public class Main {
    public static void main(String[] args) {
        C_Biblioteca biblioteca = new C_Biblioteca("Biblioteca Central");

        C_Secao ficcao = new C_Secao("Ficcao Cientifica");
        C_Secao fantasia = new C_Secao("Fantasia");

        C_Estante estante1 = new C_Estante("Estante A1");
        C_Estante estante2 = new C_Estante("Estante A2");
        
        estante1.adicionar(new Livro("1984", "George Orwell"));
        estante1.adicionar(new Livro("Duna", "Frank Herbert"));
        estante2.adicionar(new Livro("O Senhor dos Aneis", "J.R.R. Tolkien"));
        estante2.adicionar(new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling"));
        /* ERRADO:
        estante1.adicionarLivro(...);
        estante2.adicionarLivro(...);*/

        ficcao.adicionar(estante1);
        fantasia.adicionar(estante2);
        biblioteca.adicionar(ficcao);
        biblioteca.adicionar(fantasia);
        /* ERRADO:
        ficcao.adicionarEstante(estante1);
        fantasia.adicionarEstante(estante2);
        biblioteca.adicionarSecao(ficcao);
        biblioteca.adicionarSecao(fantasia);*/

        biblioteca.exibirInformacoes("");
        System.out.println("\nTotal de livros: " + biblioteca.contarItens());
        // ERRADO: System.out.println("\nTotal de livros: " + biblioteca.contarLivros());
    }
}
