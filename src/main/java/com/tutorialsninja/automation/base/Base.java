package com.tutorialsninja.automation.base;

import org.openqa.selenium.WebDriver;

import com.tutorialsninja.automation.config.ConfigurationReader;
import com.tutorialsninja.automation.config.PropertyFileReader;
import com.tutorialsninja.automation.framework.Browser;
import com.tutorialsninja.automation.util.PathHelper;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Base {
	
	public static Logger log=Logger.getLogger(Base.class);
	
	public static WebDriver driver;
	public static ConfigurationReader reader;

	}


