package projectyoutube;

/**
 *
 * @author Alexssandro
 */
public class ProjectYoutube {

   
    public static void main(String[] args) {
        Video v[]= new Video [3];
        
        v[0]=new Video(" Aula 1 de POO ");
        v[1]=new Video(" Aula de JAVA ");
        v[2]=new Video(" Aula de Algorithm ");
        
        //Pessoa p = new Pessoa("Alexssandro", 20, "Masculino");
        
        Gafanhoto g[] = new Gafanhoto [3]; 
        g[0] = new Gafanhoto ("Alexssandro", 20, "Masculino", "aleeK");
        g[1] = new Gafanhoto ("shipH", 20, "Masculino", "spH");
        g[2] = new Gafanhoto ("xsPhed", 20, "Masculino", "xPd");
        
        Visualizacao vis[]= new Visualizacao[5]; 
        
        vis [0]=new Visualizacao (g[0], v[0]);
        vis[0].avaliar();
        System.out.println("\n"+vis[0].toString());
         
        
        
        
        vis [1]=new Visualizacao (g[0], v[1]);
        vis[1].avaliar(35.5f);
        System.out.println("\n"+ vis[1].toString());
        
        
        
        vis [2]=new Visualizacao (g[0], v[2]);
        vis[2].avaliar(10);
        System.out.println("\n"+vis[2].toString());
        
        
         
        
        
        
        System.out.println("Vídeos\n ---------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\n Gafanhotos \n ---------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
        System.out.println(g[2].toString());
    }
    
}
