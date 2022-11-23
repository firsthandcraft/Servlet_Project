package dao;

import model.Member;

public interface Dao {
	void insert (Member m);
	void update (Member m);
	void delete (Member m);
	Member select(String email);
}
