
package projectyoutube;

/**
 *
 * @author Alexssandro
 */
public class Gafanhoto extends Pessoa {
    
    private String login;
    private int  totAssistido;

    public Gafanhoto(String name, int idade, String sexo, String login) {
        super(name, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
        
    }

  


    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() +
                "\n login=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
    
    
}
