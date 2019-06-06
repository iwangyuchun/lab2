package cn.edu.ujn.lab2.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import cn.edu.ujn.lab2.db.HibernateSessionFactory;
import cn.edu.ujn.lab2.model.Dlb;

public class DlbDaoImpl implements IDlbDao {
	
	/* (non-Javadoc)
	 * @see cn.edu.ujn.lab2.dao.IDlbDao#validate(cn.edu.ujn.lab2.model.Dlb)
	 */
	@Override
	public Dlb validate(Dlb dl) {
		Session session = HibernateSessionFactory.getSession();
		Transaction bTransaction = session.beginTransaction();
		//String sql="select * from dlb where xh=? and kl=?";
		Query<Dlb> query = session.createQuery("from Dlb as dlb where dlb.xh=?1 and dlb.kl=?2");
		query.setParameter(1, dl.getXh());
		query.setParameter(2, dl.getKl());
		query.setMaxResults(1);
		Dlb dlb = (Dlb)query.uniqueResult();
		return dlb;
	}

}
