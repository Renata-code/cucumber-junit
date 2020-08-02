package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearPage {


    public SmartBearPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "ctl00$MainContent$username")
    public WebElement username;

    @FindBy(id = "ctl00_MainContent_password")
    public  WebElement password;

    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement submit;

    @FindBy(xpath = "//*[@id=\"ctl00_menu\"]/li[3]/a")
    public  WebElement orderButton;

    @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement dropdownBox;

    @FindBy(xpath = "//option[@value='FamilyAlbum']")
    public WebElement familyAlbumOption;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantityBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
    public WebElement customerNameBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement streetNameBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement cityNameBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement statenameBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zipBox;

    @FindBy(id = "ctl00_MainContent_fmwOrder_cardList_0")
    public WebElement visaCardOption;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNumber;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expirationDate;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processButton;





}
