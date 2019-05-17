package com.movieplus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.movieplus.dao.VodDao;
import com.movieplus.entity.Vod;
import com.movieplus.mapper.DemoMapper;

@RestController
public class DemoController {
	
	/*
	 * @Autowired private DemoMapper demomapper;
	 */
	
	@Autowired
	private VodDao vodDao;

	@ResponseBody
	@RequestMapping("/")
	public List<Vod> index() {
		
		return vodDao.findVodList();
	}
	
	/**
	 * 主页跳转
	 * @return
	 */
	
	@ResponseBody
	@RequestMapping("/index")
	public ModelAndView indexMain() {
	    ModelAndView mv = new ModelAndView();
	    List<Vod> vodList = vodDao.findVodList(); 
	    mv.addObject("vodList", vodList);
	    mv.setViewName("index");
		return mv;
	}
	/**
	 * 播放跳转
	 * @param player_url
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/players")
	public ModelAndView playerMian(@RequestParam(value = "player_url") String player_url) {
		ModelAndView mv = new ModelAndView();
		String [] strs = player_url.split("[$]");
		mv.addObject("player_url", strs[strs.length-1]);
		mv.setViewName("player");
		return mv;
	}
	
	/**
	 * 详情
	 * @param player_url
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/infoMovie")
	public ModelAndView infoMain(@RequestParam(value = "vod_id") Integer vod_id) {
		ModelAndView mv = new ModelAndView();
		/*
		 * Vod vods = demomapper.findVods(vod_id); mv.addObject("vods", vods);
		 * mv.setViewName("info");
		 */
		return mv;
	}
	
}
