package cn.e3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.e3.pojo.TbItem;
import cn.e3.service.ItemService;

@RestController
public class controller {

	@Autowired
	private ItemService itemSercice;
	
	@RequestMapping("/item/{itemId}")
	public TbItem findItemById(@PathVariable Long itemId) {
		TbItem item = itemSercice.findItenById(itemId);
		return item;
	}
}
