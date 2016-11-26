package com.resume.daoImpl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import com.resume.dao.UserDAO;
import com.resume.model.RegistrationModel;
import com.resume.model.ResumeModel;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO {
	@Resource(name = "sessionFactory")
	protected SessionFactory sessionFactory;
	private Integer userID = null;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session getSession() {
		return sessionFactory.openSession();
	}

	@Override
	public boolean validateUser(String username, String password) {
		Session session = sessionFactory.openSession();
		boolean userFound = false;
		// Query using Hibernate Query Language
		String SQL_QUERY = " from LoginModel as o where o.username=? and o.password=?";
		Query query = session.createQuery(SQL_QUERY);
		query.setParameter(0, username);
		query.setParameter(1, password);
		@SuppressWarnings("rawtypes")
		List list = query.list();

		if ((list != null) && (list.size() > 0)) {
			userFound = true;
		}

		session.close();
		return userFound;
	}

	@Override
	public boolean register(RegistrationModel registrationModel) {
		Session session = sessionFactory.openSession();
		userID = (Integer) session.save(registrationModel);
		session.close();
		RequestAttributes requestAttributes=RequestContextHolder.getRequestAttributes();
		requestAttributes.setAttribute("userID", userID, RequestAttributes.SCOPE_REQUEST);
		if (userID != null)
			return true;
		else
			return false;
	}

	@Override
	public boolean setResumeDetails(ResumeModel resumeModel) {
		Session session=sessionFactory.openSession();
		//Need to learn
		/*RequestAttributes reqAttribute=RequestContextHolder.getRequestAttributes();
		int userID=(int) reqAttribute.getAttribute("userID",RequestAttributes.SCOPE_REQUEST);*/
		resumeModel.setUserID(userID);
		Integer resumeID=(Integer) session.save(resumeModel);
		session.close();
		if (resumeID != null)
			return true;
		else
			return false;
	}

}
