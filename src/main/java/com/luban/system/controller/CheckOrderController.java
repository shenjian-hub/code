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

import com.luban.system.domain.CheckOrderDO;
import com.luban.system.service.CheckOrderService;
import com.luban.common.utils.PageUtils;
import com.luban.common.utils.Query;
import com.luban.common.utils.R;

/**
 * 年检预约订单
 * 
 * @author chenyang
 * @email 1992lcg@163.com
 * @date 2020-04-09 23:31:41
 */
 
@Controller
@RequestMapping("/system/checkOrder")
public class CheckOrderController {
	@Autowired
	private CheckOrderService checkOrderService;
	
	@GetMapping()
	@RequiresPermissions("system:checkOrder:checkOrder")
	String CheckOrder(){
	    return "system/checkOrder/checkOrder";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:checkOrder:checkOrder")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<CheckOrderDO> checkOrderList = checkOrderService.list(query);
		int total = checkOrderService.count(query);
		PageUtils pageUtils = new PageUtils(checkOrderList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:checkOrder:add")
	String add(){
	    return "system/checkOrder/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:checkOrder:edit")
	String edit(@PathVariable("id") String id,Model model){
		CheckOrderDO checkOrder = checkOrderService.get(id);
		model.addAttribute("checkOrder", checkOrder);
	    return "system/checkOrder/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:checkOrder:add")
	public R save( CheckOrderDO checkOrder){
		if(checkOrderService.save(checkOrder)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:checkOrder:edit")
	public R update( CheckOrderDO checkOrder){
		checkOrderService.update(checkOrder);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:checkOrder:remove")
	public R remove( String id){
		if(checkOrderService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:checkOrder:batchRemove")
	public R remove(@RequestParam("ids[]") String[] ids){
		checkOrderService.batchRemove(ids);
		return R.ok();
	}
	
}
