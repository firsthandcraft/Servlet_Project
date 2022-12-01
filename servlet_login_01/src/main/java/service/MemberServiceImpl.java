package service;

import logindao.loginDao;
import logindao.loginDaoImpl;
import model.Member;

public class MemberServiceImpl implements MemberService {

	private loginDao dao;
	public MemberServiceImpl() {
		this.dao=new loginDaoImpl();
	}
	@Override
	public void joinMember(Member m) {
		// TODO Auto-generated method stub
		dao.insert(m);
	}

	@Override
	public void editMember(Member m) {
		// TODO Auto-generated method stub
		dao.update(m);
	}

	@Override
	public void deleteMember(String email) {
		// TODO Auto-generated method stub
		dao.delete(email);
	}

	@Override
	public Member findMember(String email) {
		// TODO Auto-generated method stub
		return dao.select(email);
	}

	@Override
	public boolean login(String email, String pwd) {
		// TODO Auto-generated method stub
		Member m = dao.select(email);
		if(m!=null || !m.getPwd().equals(pwd)) {
			return true;
		}
		return false;
	}

}
