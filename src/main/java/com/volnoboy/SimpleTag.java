package com.volnoboy;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * @author Volodymyr Volnoboy (vvolnoboy@luxoft.com)
 * @since 3/11/15 1:47 PM
 */
public class SimpleTag extends SimpleTagSupport {
	@Override
	public void doTag() throws JspException, IOException {
		PageContext ctx = (PageContext) getJspContext();
		ctx.getOut().write("Hello from this tag");
	}
}
