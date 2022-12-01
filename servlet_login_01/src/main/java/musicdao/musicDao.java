package musicdao;

import java.util.ArrayList;

import model.Music;

public interface musicDao {
	
	void insert(Music m);
	void update(Music m);
	void delete(String title);
	ArrayList<Music> selectAllBySeller(String seller);
	Music select(String Mtitle);
	ArrayList<Music> selectAll();
	
	//void updateQuantity(int q, int num);
}
 