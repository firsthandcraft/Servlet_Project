package service;

import java.util.ArrayList;

import model.Music;

public interface MusicService {
	void addMusic(Music m);
	void editMusic(Music m);
	void delMusic(String Mtitle);
	Music findMusic(String Mtitle);
	ArrayList<Music> findAllBySeller(String s_email);
	ArrayList<Music> findAll();
	
}
