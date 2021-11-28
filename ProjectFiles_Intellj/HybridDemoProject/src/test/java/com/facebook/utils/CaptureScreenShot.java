package com.facebook.utils;

import com.facebook.page.BasePage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class CaptureScreenShot {
    public static void screenShot() {
        TakesScreenshot ts= (TakesScreenshot) BasePage.driver;
        File sf=ts.getScreenshotAs(OutputType.FILE);

        try
        {
            FileUtils.copyFile(sf,new File("./screenshots/ss1.jpg") );
        } catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
