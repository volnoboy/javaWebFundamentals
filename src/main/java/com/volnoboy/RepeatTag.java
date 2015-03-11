package com.volnoboy;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * @author Volodymyr Volnoboy (vvolnoboy@luxoft.com)
 * @since 3/11/15 2:11 PM
 */
public class RepeatTag extends SimpleTagSupport {
	private int repeat;

	public void setRepeat(int repeat) {
		this.repeat = repeat;
	}

	@Override
	public void doTag() throws JspException, IOException {
		for (int i = 0; i < repeat; i++) {
			getJspBody().invoke(null);
		}
	}
}
