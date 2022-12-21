package memberDao;

import model.Member;

public interface MemberDao {
	void insert (Member m);
	void update (Member m);
	void updateMemberShipPlan (Member m);
	void delete (String email);
	Member select(String email);
	void pwdUpdate (Member m);
}
