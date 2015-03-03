package com.volnoboy;

/**
 * @author Volodymyr Volnoboy (vvolnoboy@luxoft.com)
 * @since 3/3/15 10:20 AM
 */
public class ApplicationSettings {
	private CssClass formCssClass;
	private String[] tabNames;

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
}
