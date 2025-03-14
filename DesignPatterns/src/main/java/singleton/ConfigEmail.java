package singleton;

public class ConfigEmail {
  private static ConfigEmail instance;

  private String remetente;
  private String assunto;
  private String conteudo;
  private String corCabecalho;

  private ConfigEmail() {
    this.remetente = "administrador@empresa.com.br";
    this.assunto = "Bem-vindo(a)!";
    this.conteudo = "Olá, seja muito bem-vindo a nossa equipe...";
    this.corCabecalho = "green";
  }

  public static ConfigEmail getInstance() {
    if (instance == null) {
      instance = new ConfigEmail();
    }
    return instance;
  }

  public void setRemetente(String remetente) { this.remetente = remetente; }
  public String getRemetente() { return remetente; }

  public void setAssunto(String assunto) { this.assunto = assunto; }
  public String getAssunto() { return assunto; }

  public void setConteudo(String conteudo) { this.conteudo = conteudo; }
  public String getConteudo() { return conteudo; }

  public void setCorCabecalho(String corCabecalho) { this.corCabecalho = corCabecalho; }
  public String getCorCabecalho() { return corCabecalho; }

  public String getConfig() {
    return  "|- Configurações Atuais:\n" +
            "|- Remetente: " + remetente + "\n" +
            "|- Assunto: " + assunto + "\n" +
            "|- Conteudo: " + conteudo + "\n" +
            "|- Cor Cabecalho: " + corCabecalho;
  }
}
