package com.luban.system.controller;

import java.util.List;
import java.util.Map;

import com.luban.common.utils.StringUtils;
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

import com.luban.system.domain.RepairShopDO;
import com.luban.system.service.RepairShopService;
import com.luban.common.utils.PageUtils;
import com.luban.common.utils.Query;
import com.luban.common.utils.R;

import static com.luban.common.utils.StringUtils.generateUUid;

/**
 * 修理厂商户信息
 * 
 * @author chenyang
 * @email 1992lcg@163.com
 * @date 2020-04-09 23:31:41
 */
 
@Controller
@RequestMapping("/system/repairShop")
public class RepairShopController {
	@Autowired
	private RepairShopService repairShopService;
	
	@GetMapping()
	@RequiresPermissions("system:repairShop:repairShop")
	String RepairShop(){
	    return "system/repairShop/repairShop";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:repairShop:repairShop")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<RepairShopDO> repairShopList = repairShopService.list(query);
		int total = repairShopService.count(query);
		PageUtils pageUtils = new PageUtils(repairShopList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:repairShop:add")
	String add(){
	    return "system/repairShop/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:repairShop:edit")
	String edit(@PathVariable("id") String id,Model model){
		RepairShopDO repairShop = repairShopService.get(id);
		model.addAttribute("repairShop", repairShop);
	    return "system/repairShop/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:repairShop:add")
	public R save( RepairShopDO repairShop){
		repairShop.setId(generateUUid());
		if(repairShopService.save(repairShop)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:repairShop:edit")
	public R update( RepairShopDO repairShop){
		repairShopService.update(repairShop);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:repairShop:remove")
	public R remove( String id){
		if(repairShopService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:repairShop:batchRemove")
	public R remove(@RequestParam("ids[]") String[] ids){
		repairShopService.batchRemove(ids);
		return R.ok();
	}
	
}
