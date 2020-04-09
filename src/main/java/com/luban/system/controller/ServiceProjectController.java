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

import com.luban.system.domain.ServiceProjectDO;
import com.luban.system.service.ServiceProjectService;
import com.luban.common.utils.PageUtils;
import com.luban.common.utils.Query;
import com.luban.common.utils.R;

/**
 * 维修项目
 * 
 * @author chenyang
 * @email 1992lcg@163.com
 * @date 2020-04-09 23:31:42
 */
 
@Controller
@RequestMapping("/system/serviceProject")
public class ServiceProjectController {
	@Autowired
	private ServiceProjectService serviceProjectService;
	
	@GetMapping()
	@RequiresPermissions("system:serviceProject:serviceProject")
	String ServiceProject(){
	    return "system/serviceProject/serviceProject";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:serviceProject:serviceProject")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ServiceProjectDO> serviceProjectList = serviceProjectService.list(query);
		int total = serviceProjectService.count(query);
		PageUtils pageUtils = new PageUtils(serviceProjectList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:serviceProject:add")
	String add(){
	    return "system/serviceProject/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:serviceProject:edit")
	String edit(@PathVariable("id") String id,Model model){
		ServiceProjectDO serviceProject = serviceProjectService.get(id);
		model.addAttribute("serviceProject", serviceProject);
	    return "system/serviceProject/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:serviceProject:add")
	public R save( ServiceProjectDO serviceProject){
		if(serviceProjectService.save(serviceProject)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:serviceProject:edit")
	public R update( ServiceProjectDO serviceProject){
		serviceProjectService.update(serviceProject);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:serviceProject:remove")
	public R remove( String id){
		if(serviceProjectService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:serviceProject:batchRemove")
	public R remove(@RequestParam("ids[]") String[] ids){
		serviceProjectService.batchRemove(ids);
		return R.ok();
	}
	
}
