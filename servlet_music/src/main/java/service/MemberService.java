package service;

import model.Member;

public interface MemberService {
	void joinMember(Member m);
	void editMember(Member m);
	void editMemberShipPlan(Member m);
	void deleteMember(String email);
	Member findMember(String email);
	boolean login(String email,String pwd);
	void pwdEditMember(Member m);
}
