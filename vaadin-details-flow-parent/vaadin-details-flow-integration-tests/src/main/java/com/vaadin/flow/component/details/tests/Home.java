package com.vaadin.flow.component.details.tests;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.details.Details;
import com.vaadin.flow.component.details.DetailsVariant;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;

@Route(value = "vaadin-details")
public class Home extends Div {

    public Home() {
        Div info = new Div();
        info.setId("info");

        Details details = new Details();
        details.setSummary(new Span("Some summary"));
        details.add("Some content");

        Details detailsDisabled = new Details();
        detailsDisabled.setOpened(true);
        detailsDisabled.setEnabled(false);
        detailsDisabled.setSummaryText("Disabled heading");
        detailsDisabled.add(new H3("Disabled content"));
        detailsDisabled.add(new Span("Always visible content"));

        Details detailsThemed = new Details("Small Reversed Filled Summary",
                new Span("Themed Content"));
        detailsThemed.addThemeVariants(DetailsVariant.values());

        add(details, detailsDisabled, detailsThemed, info);
    }
}
