package service;

import java.util.ArrayList;

import model.Music;
import musicdao.musicDao;
import musicdao.musicDaoImpl;

public class MusicServiceImpl implements MusicService{
	private musicDao dao;
	public MusicServiceImpl() {
		this.dao= new musicDaoImpl();
	}
	@Override
	public void addMusic(Music m) {
		// TODO Auto-generated method stub
		dao.insert(m);
	}

	@Override
	public void editMusic(Music m) {
		// TODO Auto-generated method stub
		dao.update(m);
	}

	@Override
	public void delMusic(String Mtitle) {
		// TODO Auto-generated method stub
		dao.delete(Mtitle);
	}

	@Override
	public Music findMusic(String Mtitle) {
		// TODO Auto-generated method stub
		return dao.select(Mtitle);
	}

	@Override
	public ArrayList<Music> findAllBySeller(String s_email) {
		// TODO Auto-generated method stub
		return dao.selectAllBySeller(s_email);
	}

	@Override
	public ArrayList<Music> findAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}



}
