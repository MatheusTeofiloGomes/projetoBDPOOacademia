public class Main {
public static void main(String[] args) {
	Aluno a= new Aluno();
	a.setId(1);
	a.setNome("Matheus");
	DAO<Aluno> dao = new DAO<Aluno>();
	Aluno A = new Aluno();
	A.setId(123);
	A.setNome("HugoFF");
	dao.save(A);
	Aluno p2 = new Aluno();
	p2.setId(23);
	p2.setNome("Hugo");
	dao.save(p2);
	dao.save(a);
	Instrutor i = new Instrutor(1, "matheus" , 12345,12);
	i.setId(1234);
	A.setNome("HugoFF");
	dao.save(A);
	
	
	Aluno find = dao.find(Aluno.class, 23);
	System.out.println(find.getNome());
;
}
	
}
//Matheus<matheust101@gmail.com>