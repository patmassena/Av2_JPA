package orm.testes;

import java.util.List;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import orm.modelo.Aluno;

public class ListaAlunos {
    public static void main(String[] args) {

            EntityManagerFactory factory = Persistence.createEntityManagerFactory("escolas");
            EntityManager em = factory.createEntityManager();

            Query query = em.createQuery("Select a from Aluno a");
            List<Aluno> lista = query.getResultList();
            System.out.println("Alunos encontrados:");
            for (Aluno a : lista) {
                System.out.println(a);
            }
            
            em.close();
            factory.close();
        }
    }