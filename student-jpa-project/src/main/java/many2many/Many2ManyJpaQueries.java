package many2many;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import jpaex.onetoone.PersistenceUtilities;

public class Many2ManyJpaQueries {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		EntityManager manager = PersistenceUtilities.getEntityManager();

		Query qry1 = manager.createQuery("from Bank");
		List<Bank> banks = qry1.getResultList();
		for (Bank b : banks) {
			System.out.print(b.getBankId() + b.getBranchName() + b.getSwiftCode() + "  ");
			Set<Customer> customers = b.getCustomers();
			for (Customer c : customers) {
				System.out.println(c.getCustomerId() + c.getName() + c.getMobile());
			}
		}
		// calling from customers
		Query qry2 = manager.createQuery("from Customer");
		List<Customer> custList = qry2.getResultList();
		for (Customer c : custList) {
			System.out.print(c.getCustomerId() + c.getName() + c.getMobile() + " :  ");
			Set<Bank> bankList = c.getBanks();
			for (Bank b : bankList)
				System.out.print(b.getBankId() + b.getBranchName() + b.getSwiftCode() + "  ");
		}
	}

}
