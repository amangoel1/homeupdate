//package com.cts.grizzly.dao;
//
//import java.util.List;
//
//import javax.persistence.TypedQuery;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.query.Query;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.cts.grizzly.bean.Category;
//import com.cts.grizzly.bean.Product;
//import com.cts.grizzly.bean.Profile;
//
//@Repository
//@Transactional
//public class ProductDAOImpl implements ProductDAO{
//
//	 @Autowired
//	 private SessionFactory sessionFactory;
//	public String addProduct(Product product) {
//		// TODO Auto-generated method stub
//		sessionFactory.getCurrentSession().save(product);
//		return "success";
//	}
//
//	public List<Product> getAllProducts() {
//		// TODO Auto-generated method stub
//TypedQuery<Product> query = sessionFactory.getCurrentSession().createQuery("from Product");
//		
//		return query.getResultList();
//	}
//
//	public Product findProduct(String id) {
//		// TODO Auto-generated method stub
//		try{
////			String userName = profile.getUserName();
////			String password = profile.getPassword();
//			Session session = sessionFactory.getCurrentSession();
//			String query = "from product where productId = ?";
//			Query<Product> query2 = null;
//			
//			query2=session.createQuery(query);
//			
//			query2.setParameter(0,id);  
////			query2.setParameter(1,password);  
//			Product user= query2.getSingleResult();
//			
//			if(user!=null)
//			{
//				
//			return user;
//			}
//			else
//			{
//				
//				return null;
//				}
//			}
//			catch(Exception e)
//			{
//				e.printStackTrace();
//			}
//		return null;
//	}
//
//	public String deleteProduct(String productId) {
//		// TODO Auto-generated method stub
//		Product product = sessionFactory.getCurrentSession().load(Product.class, productId);
//		sessionFactory.getCurrentSession().delete(product);
//		
//		return null;
//	}
//
//	public List<Product> filterProducts(String query) {
//		// TODO Auto-generated method stub
//		Session session = sessionFactory.getCurrentSession();
//		String query1 = "from Product order by rating";
//		if("HighToLow".equals(query))
//			query1 = "from Product order by rating desc";
//		Query<Product> query2 = session.createQuery(query1);
//		
//		List<Product> pro = query2.getResultList();
//		
//		
//		return pro;
//	}
//	
//
//}
