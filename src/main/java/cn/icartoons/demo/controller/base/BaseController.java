package cn.icartoons.demo.controller.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseController {
	protected final Logger logger;

	public BaseController() {
		this.logger = LoggerFactory.getLogger(this.getClass());
	}

}
