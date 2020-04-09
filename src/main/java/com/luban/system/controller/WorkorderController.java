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

import com.luban.system.domain.WorkorderDO;
import com.luban.system.service.WorkorderService;
import com.luban.common.utils.PageUtils;
import com.luban.common.utils.Query;
import com.luban.common.utils.R;

/**
 * 修理厂工单
 * 
 * @author chenyang
 * @email 1992lcg@163.com
 * @date 2020-04-09 23:31:42
 */
 
@Controller
@RequestMapping("/system/workorder")
public class WorkorderController {
	@Autowired
	private WorkorderService workorderService;
	
	@GetMapping()
	@RequiresPermissions("system:workorder:workorder")
	String Workorder(){
	    return "system/workorder/workorder";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:workorder:workorder")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<WorkorderDO> workorderList = workorderService.list(query);
		int total = workorderService.count(query);
		PageUtils pageUtils = new PageUtils(workorderList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:workorder:add")
	String add(){
	    return "system/workorder/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:workorder:edit")
	String edit(@PathVariable("id") String id,Model model){
		WorkorderDO workorder = workorderService.get(id);
		model.addAttribute("workorder", workorder);
	    return "system/workorder/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:workorder:add")
	public R save( WorkorderDO workorder){
		if(workorderService.save(workorder)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:workorder:edit")
	public R update( WorkorderDO workorder){
		workorderService.update(workorder);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:workorder:remove")
	public R remove( String id){
		if(workorderService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:workorder:batchRemove")
	public R remove(@RequestParam("ids[]") String[] ids){
		workorderService.batchRemove(ids);
		return R.ok();
	}
	
}
