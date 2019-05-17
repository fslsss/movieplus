package com.movieplus.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.movieplus.entity.Vod;

@Mapper
public interface DemoMapper {
     
	@Select("select * from ff_vod limit 1,10")
	List<Vod> findVod();
	
	@Select("select * from ff_vod where vod_id= #{vod_id}")
	Vod findVods(Integer vod_id);
}
