package service;

import model.Music;

public interface MusicService {
	void addMusic(Music m);
	void editMusic(Music m);
	void delMusic(String Mtitle);
	Music selectMusic(String Mtitle);
}
