package com.sinosoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sinosoft.dao.CommandDao;
import com.sinosoft.model.Command;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/command")
public class CommandController {

	@Autowired
	private CommandDao commandDao;
	
	@ApiOperation("根据command名称获取command数据")
	@GetMapping(value="{commandName}")
	public Command findByCommandName(@PathVariable("commandName") String commandName) {
		
		return commandDao.findByCommandName(commandName);
	}
}
