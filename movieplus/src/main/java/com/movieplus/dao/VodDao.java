package com.movieplus.dao;

import java.util.List;

import com.movieplus.entity.Vod;

public interface VodDao {
     
	List<Vod> findVodList();
	
}
