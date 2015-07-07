package org.vaadin.hello;

import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

public class MainLayout extends HelloDesign {
	private int counter = 1;

	public MainLayout() {
		clickMe.addClickListener(new ClickListener() {

			public void buttonClick(ClickEvent event) {
				welcomeLabel.setValue("The button has been pressed "
						+ counter++ + " times");
			}
		});
	}

}
