package com.volnoboy;

import java.util.List;

/**
 * @author Volodymyr Volnoboy (vvolnoboy@luxoft.com)
 * @since 3/3/15 10:20 AM
 */
public class ApplicationSettings {
	private CssClass formCssClass;
	private String[] tabNames;

	public List<Tab> getTabs() {
		return tabs;
	}

	private List<Tab> tabs;

	public String[] getTabNames() {
		return tabNames;
	}

	public void setTabNames(String[] tabNames) {
		this.tabNames = tabNames;
	}

	public CssClass getFormCssClass() {
		return formCssClass;
	}

	public void setFormCssClass(CssClass forCssClass) {
		this.formCssClass = forCssClass;
	}

	public void setTabs(List<Tab> tabs) {
		this.tabs = tabs;

	}
}
