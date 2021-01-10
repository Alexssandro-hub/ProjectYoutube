package projectyoutube;

/**
 *
 * @author Alexssandro
 */
public abstract class Pessoa {
    
    protected String name;
    protected int idade;
    protected String sexo;
    protected float experiencia;

    public Pessoa(String name, int idade, String sexo) {
        this.name = name;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }

    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "name=" + name + ", idade=" + idade + ", sexo=" + sexo + ", experiencia=" + experiencia + '}';
    }




    
    
    
}
