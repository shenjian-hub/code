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

import com.luban.system.domain.StationUserDO;
import com.luban.system.service.StationUserService;
import com.luban.common.utils.PageUtils;
import com.luban.common.utils.Query;
import com.luban.common.utils.R;

/**
 * 检测站用户
 * 
 * @author chenyang
 * @email 1992lcg@163.com
 * @date 2020-04-09 23:31:41
 */
 
@Controller
@RequestMapping("/system/stationUser")
public class StationUserController {
	@Autowired
	private StationUserService stationUserService;
	
	@GetMapping()
	@RequiresPermissions("system:stationUser:stationUser")
	String StationUser(){
	    return "system/stationUser/stationUser";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:stationUser:stationUser")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<StationUserDO> stationUserList = stationUserService.list(query);
		int total = stationUserService.count(query);
		PageUtils pageUtils = new PageUtils(stationUserList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:stationUser:add")
	String add(){
	    return "system/stationUser/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:stationUser:edit")
	String edit(@PathVariable("id") String id,Model model){
		StationUserDO stationUser = stationUserService.get(id);
		model.addAttribute("stationUser", stationUser);
	    return "system/stationUser/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:stationUser:add")
	public R save( StationUserDO stationUser){
		if(stationUserService.save(stationUser)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:stationUser:edit")
	public R update( StationUserDO stationUser){
		stationUserService.update(stationUser);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:stationUser:remove")
	public R remove( String id){
		if(stationUserService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:stationUser:batchRemove")
	public R remove(@RequestParam("ids[]") String[] ids){
		stationUserService.batchRemove(ids);
		return R.ok();
	}
	
}
