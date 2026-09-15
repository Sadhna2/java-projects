package jpaex;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class StudentQueries {

	@SuppressWarnings({ "unchecked" })
	public static void main(String[] args) {
		EntityManagerFactory emf =
				Persistence.createEntityManagerFactory("nexturn26_PU");
		EntityManager manager = emf.createEntityManager();
		Query qry=manager.createQuery("from Student");
		List<Student> stdList=qry.getResultList();
		stdList.forEach((std)->System.out.println(std));
		String hql="select std from Student std where std.regno>?1";
		String hqlBindParam="select std from Student std where std.regNo>:regno";
		Query qryParam=manager.createQuery(hqlBindParam);
		//qryParam.setParameter(1, 2000);
		qryParam.setParameter("regno",2000);
		stdList=qryParam.getResultList();
		stdList.forEach((std)->System.out.println(std));
		String hql2="select std from Student std where std.avg between ?1 and ?2";
		qryParam=manager.createQuery(hql2);
		qryParam.setParameter(1,50.00);
		qryParam.setParameter(2, 70.00);
		stdList=qryParam.getResultList();
		stdList.forEach((std)->System.out.println(std));

	}

}
