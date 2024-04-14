package com.springmvc.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.springmvc.model.Employee;
@Repository
public class EmployeeDaoImp implements EmployeeDao{
	SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	@Override
	public void addEmployee(Employee r) {
		Session session = this.sessionFactory.openSession();
		session.persist(r);
		session.beginTransaction().commit();
		System.out.println("saved successfully");
		
		
	}

//	@Override
//	public void updateEmployee(Employee r) {
//		Session session = this.sessionFactory.openSession();
//		session.update(r);
//		session.beginTransaction().commit();
////		Session session = this.sessionFactory.openSession().createQuery("");
//		System.out.println("update successfully");
//	
//	}
	public void updateEmployee(Employee r, int myID) {
	    
		String hql = "update Employee set age=:age, gender=:gender, name=:name, salary=:salary where id=:id";
	    Query q = sessionFactory.openSession().createQuery(hql);
	    q.setParameter("age", r.getAge());
	    q.setParameter("gender", r.getGender());
	    q.setParameter("name", r.getName());
	    q.setParameter("salary", r.getSalary());
	    q.setParameter("id", myID);

	    q.executeUpdate();
	        
	        
	}

	@Override
	public List<Employee> listEmployees() {
		return sessionFactory.openSession().createQuery("from Employee").list();
	}

	@Override
	public Employee getEmployeeById(int id) {
		
		return (Employee)sessionFactory.openSession().get(Employee.class,id);
	}

	@Override
	public void removeEmployee(int id) {
		String sql= "delete from Employee where id=:id";
		Query q = sessionFactory.openSession().createQuery(sql);
		q.setParameter("id", id);
		q.executeUpdate();
		System.out.println("Deleted id ="+id);
		
	}
	
}
