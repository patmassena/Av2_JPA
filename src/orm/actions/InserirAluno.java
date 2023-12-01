package orm.actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import orm.modelo.Aluno;

public class InserirAluno {
	public static void main(String[] args) {

		Aluno aluno = new Aluno();
        aluno.setId("123");
        aluno.setNome("Jose da Silva");
        aluno.setEmail("jose@silva.com");
        aluno.setCPF("123.456.789-00");
        aluno.setNascimento("20/3/00");
        aluno.setNaturalidade("Rio de Janeiro");
        aluno.setEndereco("Rua Santa Luzia");
        
        
		Aluno aluno1 = new Aluno();
        aluno1.setId("345");
        aluno1.setNome("Mariana Josefa");
        aluno1.setEmail("mari@josefinha.com");
        aluno1.setCPF("111.222.333-44");
        aluno1.setNascimento("01/05/1999");
        aluno1.setNaturalidade("Rio de Janeiro");
        aluno1.setEndereco("Rua Um");
        
        Aluno aluno2 = new Aluno();
        aluno1.setId("456");
        aluno1.setNome("Maria Josefa");
        aluno1.setEmail("mari@josefinha.com");
        aluno1.setCPF("111.222.333-44");
        aluno1.setNascimento("01/05/1999");
        aluno1.setNaturalidade("Rio de Janeiro");
        aluno1.setEndereco("Rua Dois");

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("escolas");
        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();

        em.persist(aluno);
        em.persist(aluno1);
        em.persist(aluno2);

        em.getTransaction().commit();
        

        
        em.close();
        factory.close();

    }

}
	
	
