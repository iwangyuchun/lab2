package cn.edu.ujn.lab2.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.edu.ujn.lab2.dao.DlbDaoImpl;
import cn.edu.ujn.lab2.dao.IDlbDao;
import cn.edu.ujn.lab2.model.Dlb;

public class DlbAction extends ActionSupport{
	
	private Dlb dlb;

	public Dlb getDlb() {
		return dlb;
	}

	public void setDlb(Dlb dlb) {
		this.dlb = dlb;
	}
	
	public String login() {
		IDlbDao dlbdao = new DlbDaoImpl();
		Dlb dl = dlbdao.validate(dlb);
		if (dl!=null) {
			Map<String, Object> session = ActionContext.getContext().getSession();
			session.put("user", dl);
			return "ok";
		}else {
			return "error";	
		}
	}
	

}
