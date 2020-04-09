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

import com.luban.system.domain.FinanceDO;
import com.luban.system.service.FinanceService;
import com.luban.common.utils.PageUtils;
import com.luban.common.utils.Query;
import com.luban.common.utils.R;

/**
 * 财务明细
 * 
 * @author chenyang
 * @email 1992lcg@163.com
 * @date 2020-04-09 23:31:42
 */
 
@Controller
@RequestMapping("/system/finance")
public class FinanceController {
	@Autowired
	private FinanceService financeService;
	
	@GetMapping()
	@RequiresPermissions("system:finance:finance")
	String Finance(){
	    return "system/finance/finance";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:finance:finance")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<FinanceDO> financeList = financeService.list(query);
		int total = financeService.count(query);
		PageUtils pageUtils = new PageUtils(financeList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:finance:add")
	String add(){
	    return "system/finance/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:finance:edit")
	String edit(@PathVariable("id") String id,Model model){
		FinanceDO finance = financeService.get(id);
		model.addAttribute("finance", finance);
	    return "system/finance/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:finance:add")
	public R save( FinanceDO finance){
		if(financeService.save(finance)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:finance:edit")
	public R update( FinanceDO finance){
		financeService.update(finance);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:finance:remove")
	public R remove( String id){
		if(financeService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:finance:batchRemove")
	public R remove(@RequestParam("ids[]") String[] ids){
		financeService.batchRemove(ids);
		return R.ok();
	}
	
}
