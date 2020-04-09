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

import com.luban.system.domain.MaintenanceManDO;
import com.luban.system.service.MaintenanceManService;
import com.luban.common.utils.PageUtils;
import com.luban.common.utils.Query;
import com.luban.common.utils.R;

/**
 * 维修工
 * 
 * @author chenyang
 * @email 1992lcg@163.com
 * @date 2020-04-09 23:31:42
 */
 
@Controller
@RequestMapping("/system/maintenanceMan")
public class MaintenanceManController {
	@Autowired
	private MaintenanceManService maintenanceManService;
	
	@GetMapping()
	@RequiresPermissions("system:maintenanceMan:maintenanceMan")
	String MaintenanceMan(){
	    return "system/maintenanceMan/maintenanceMan";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:maintenanceMan:maintenanceMan")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<MaintenanceManDO> maintenanceManList = maintenanceManService.list(query);
		int total = maintenanceManService.count(query);
		PageUtils pageUtils = new PageUtils(maintenanceManList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:maintenanceMan:add")
	String add(){
	    return "system/maintenanceMan/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:maintenanceMan:edit")
	String edit(@PathVariable("id") String id,Model model){
		MaintenanceManDO maintenanceMan = maintenanceManService.get(id);
		model.addAttribute("maintenanceMan", maintenanceMan);
	    return "system/maintenanceMan/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:maintenanceMan:add")
	public R save( MaintenanceManDO maintenanceMan){
		if(maintenanceManService.save(maintenanceMan)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:maintenanceMan:edit")
	public R update( MaintenanceManDO maintenanceMan){
		maintenanceManService.update(maintenanceMan);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:maintenanceMan:remove")
	public R remove( String id){
		if(maintenanceManService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:maintenanceMan:batchRemove")
	public R remove(@RequestParam("ids[]") String[] ids){
		maintenanceManService.batchRemove(ids);
		return R.ok();
	}
	
}
