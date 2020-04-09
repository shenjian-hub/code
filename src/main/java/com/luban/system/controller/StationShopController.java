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

import com.luban.system.domain.StationShopDO;
import com.luban.system.service.StationShopService;
import com.luban.common.utils.PageUtils;
import com.luban.common.utils.Query;
import com.luban.common.utils.R;

/**
 * 商户预约检测站关联
 * 
 * @author chenyang
 * @email 1992lcg@163.com
 * @date 2020-04-09 23:31:41
 */
 
@Controller
@RequestMapping("/system/stationShop")
public class StationShopController {
	@Autowired
	private StationShopService stationShopService;
	
	@GetMapping()
	@RequiresPermissions("system:stationShop:stationShop")
	String StationShop(){
	    return "system/stationShop/stationShop";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:stationShop:stationShop")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<StationShopDO> stationShopList = stationShopService.list(query);
		int total = stationShopService.count(query);
		PageUtils pageUtils = new PageUtils(stationShopList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:stationShop:add")
	String add(){
	    return "system/stationShop/add";
	}

	@GetMapping("/edit/{fkShopId}")
	@RequiresPermissions("system:stationShop:edit")
	String edit(@PathVariable("fkShopId") String fkShopId,Model model){
		StationShopDO stationShop = stationShopService.get(fkShopId);
		model.addAttribute("stationShop", stationShop);
	    return "system/stationShop/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:stationShop:add")
	public R save( StationShopDO stationShop){
		if(stationShopService.save(stationShop)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:stationShop:edit")
	public R update( StationShopDO stationShop){
		stationShopService.update(stationShop);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:stationShop:remove")
	public R remove( String fkShopId){
		if(stationShopService.remove(fkShopId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:stationShop:batchRemove")
	public R remove(@RequestParam("ids[]") String[] fkShopIds){
		stationShopService.batchRemove(fkShopIds);
		return R.ok();
	}
	
}
