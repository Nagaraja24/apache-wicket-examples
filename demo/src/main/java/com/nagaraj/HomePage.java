package com.nagaraj;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;
	
	private static final String NAME = "Nagaraja Ramappa";

	public HomePage(final PageParameters parameters) {
		super(parameters);

		add(new Label("name", NAME));

		// TODO Add your page's components here

	}
}
