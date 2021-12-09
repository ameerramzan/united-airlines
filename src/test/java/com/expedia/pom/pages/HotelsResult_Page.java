package com.expedia.pom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.expedia.base.Hooks.driver;

public class HotelsResult_Page {

    @FindBy(css = "ol[class='listings infinite-scroll-enabled']>li")
    private List<WebElement> hotelsResult_list;

    public HotelsResult_Page(){PageFactory.initElements(driver,this);}

    public List<WebElement> getHotelsResult_list() {return hotelsResult_list;}
}
