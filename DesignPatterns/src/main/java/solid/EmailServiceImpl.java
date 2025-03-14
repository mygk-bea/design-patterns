package solid;

/*
* Código completo RESPEITANDO os princípios SOLID
*/

public class EmailServiceImpl implements EmailService{
    @Override
    public void enviaEmail(String cliente) {
        System.out.println("Enviando e-mail para " + cliente + "...");
    }
    
}
