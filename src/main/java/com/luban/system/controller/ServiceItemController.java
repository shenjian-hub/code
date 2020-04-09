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

import com.luban.system.domain.ServiceItemDO;
import com.luban.system.service.ServiceItemService;
import com.luban.common.utils.PageUtils;
import com.luban.common.utils.Query;
import com.luban.common.utils.R;

/**
 * 维修项目（小类目）
 * 
 * @author chenyang
 * @email 1992lcg@163.com
 * @date 2020-04-09 23:31:42
 */
 
@Controller
@RequestMapping("/system/serviceItem")
public class ServiceItemController {
	@Autowired
	private ServiceItemService serviceItemService;
	
	@GetMapping()
	@RequiresPermissions("system:serviceItem:serviceItem")
	String ServiceItem(){
	    return "system/serviceItem/serviceItem";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:serviceItem:serviceItem")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ServiceItemDO> serviceItemList = serviceItemService.list(query);
		int total = serviceItemService.count(query);
		PageUtils pageUtils = new PageUtils(serviceItemList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:serviceItem:add")
	String add(){
	    return "system/serviceItem/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:serviceItem:edit")
	String edit(@PathVariable("id") String id,Model model){
		ServiceItemDO serviceItem = serviceItemService.get(id);
		model.addAttribute("serviceItem", serviceItem);
	    return "system/serviceItem/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:serviceItem:add")
	public R save( ServiceItemDO serviceItem){
		if(serviceItemService.save(serviceItem)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:serviceItem:edit")
	public R update( ServiceItemDO serviceItem){
		serviceItemService.update(serviceItem);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:serviceItem:remove")
	public R remove( String id){
		if(serviceItemService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:serviceItem:batchRemove")
	public R remove(@RequestParam("ids[]") String[] ids){
		serviceItemService.batchRemove(ids);
		return R.ok();
	}
	
}
