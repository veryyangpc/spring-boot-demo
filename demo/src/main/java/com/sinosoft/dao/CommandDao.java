package com.sinosoft.dao;

import com.sinosoft.model.Command;

public interface CommandDao {

	Command findByCommandName(String commandName);
}
