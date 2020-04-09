package com.luban.system.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.luban.system.domain.StationDO;
import com.luban.system.service.StationService;
import com.luban.common.utils.PageUtils;
import com.luban.common.utils.Query;
import com.luban.common.utils.R;

/**
 * 机动车检测站
 * 
 * @author chenyang
 * @email 1992lcg@163.com
 * @date 2020-04-09 23:31:41
 */
 
@Controller
@RequestMapping("/system/station")
public class StationController {
	@Autowired
	private StationService stationService;
	
	@GetMapping()
	@RequiresPermissions("system:station:station")
	String Station(){
	    return "system/station/station";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:station:station")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<StationDO> stationList = stationService.list(query);
		int total = stationService.count(query);
		PageUtils pageUtils = new PageUtils(stationList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:station:add")
	String add(){
	    return "system/station/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:station:edit")
	String edit(@PathVariable("id") String id,Model model){
		StationDO station = stationService.get(id);
		model.addAttribute("station", station);
	    return "system/station/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:station:add")
	public R save( StationDO station){
		if(stationService.save(station)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:station:edit")
	public R update( StationDO station){
		stationService.update(station);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:station:remove")
	public R remove( String id){
		if(stationService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:station:batchRemove")
	public R remove(@RequestParam("ids[]") String[] ids){
		stationService.batchRemove(ids);
		return R.ok();
	}
	
}
