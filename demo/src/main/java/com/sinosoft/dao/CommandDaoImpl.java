package com.sinosoft.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sinosoft.model.Command;

@Repository
public class CommandDaoImpl implements CommandDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Command findByCommandName(String commandName) {
		List<Command> commands = 
				jdbcTemplate.query("select folderName,workflowName,workletName,commandName from command where commandName = ?", new Object[]{commandName}, new BeanPropertyRowMapper<>(Command.class));
		Command retCommand = null;
		if(commands!=null && commands.size()>0) {
			retCommand = commands.get(0);
		}
		return retCommand;
	}

}
