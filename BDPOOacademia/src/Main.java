import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
public static void main(String[] args) {
	EntityManagerFactory factory= Persistence.createEntityManagerFactory("Academia"); 
	EntityManager em = factory.createEntityManager();
	em.getTransaction().begin();
	Aluno a= new Aluno();
	a.setId(1);
	a.setNome("Matheus");
	em.persist(a);
	em.getTransaction().commit();
	em.close();
	factory.close();
	
	
}
	
}
