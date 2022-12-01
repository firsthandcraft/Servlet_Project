package logindao;

import model.Member;

public interface loginDao {
	void insert (Member m);
	void update (Member m);
	void delete (String email);
	Member select(String email);
}
