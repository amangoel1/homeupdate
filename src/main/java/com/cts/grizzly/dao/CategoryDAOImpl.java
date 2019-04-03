//package com.cts.grizzly.dao;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.persistence.TypedQuery;
//
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.cts.grizzly.bean.Category;
////import com.cts.grizzly.util.DBUtils;
//
//@Repository
//@Transactional
//public class CategoryDAOImpl implements CategoryDAO {
//	//private Connection connection=null;
//@Autowired
//	private SessionFactory sessionFactory=null;
//
//
//	@Override
//	public List<Category> getCategory() {
//
//		TypedQuery<Category> query = sessionFactory.getCurrentSession().createQuery("from Category");
//		
//		return query.getResultList();
//	}
//
//}
