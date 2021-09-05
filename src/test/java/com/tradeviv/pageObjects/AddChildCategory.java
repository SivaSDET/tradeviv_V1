package com.tradeviv.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class AddChildCategory {
WebDriver ldriver;
	
	public AddChildCategory(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[@href=\"#menu5\"]")
	@CacheLookup
	WebElement manageCategory;
	
	@FindBy(xpath="//a[contains(@href,'child')]")
	@CacheLookup
	WebElement child_category;
	
	@FindBy(xpath="//a[contains(@data-href,'childcategory/create')]")
	@CacheLookup
	WebElement add_child;
	
	@FindBy(id="cat")
	@CacheLookup
	WebElement select_main;
	
	@FindBy(id="subcat")
	@CacheLookup
	WebElement select_sub;
	
	@FindBy(xpath="(//input[contains(@class,'input-field')])[1]")
	@CacheLookup
	WebElement child_field;
	
	@FindBy(xpath="(//input[contains(@class,'input-field')])[2]")
	@CacheLookup
	WebElement subslug_field;
	
	@FindBy(xpath="//input[contains(@class,'img-upload')]")
	@CacheLookup
	WebElement child_img;
	
	@FindBy(xpath="//input[contains(@class,'ui-autocomplete-input')]")
	@CacheLookup
	WebElement tags;
	
	@FindBy(xpath="//button[contains(@class,'addProductSubmit')]")
	@CacheLookup
	WebElement child_submit;
	
	public void manageCategoryClick()
	{
		manageCategory.click();
	}
	
	public void childCategoryClick()
	{
		child_category.click();
	}

	public void addChildCategory()
	{
		add_child.click();
	}
	
	public void selectMainCategory(int index)
	{
		Select drop=new Select(select_main);
		drop.selectByIndex(index);
	}
	
	public void selectSubCategory(int index_sub)
	{
		Select drop_sub=new Select(select_sub);
		drop_sub.selectByIndex(index_sub);
	}
	
	public void childCategoryField(String sub_name)
	{
		child_field.sendKeys(sub_name);
	}
	
	public void childSubField(String sub_slug)
	{
		subslug_field.sendKeys(sub_slug);
	}
	
	public void childImgUpload(String path)
	{
		child_img.sendKeys(path);
	}
	public void addTags(String tag)
	{
		tags.sendKeys(tag);
	}
	
	public void submitChildCategory()
	{
		child_submit.click();
	}
}
