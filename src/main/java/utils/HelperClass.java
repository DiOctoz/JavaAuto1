package utils;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.EdgeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class HelperClass {
    public static Properties prop = new Properties();

    private static HelperClass helperClass;
    private static WebDriver driver;
    public final static int TIMEOUT = 10;

    private HelperClass() {
        WebDriverManager.edgedriver().setup();
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new EdgeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        driver.manage().window().maximize();
//        String fileName = "src/config.properties";
//        FileInputStream fis;
//        {
//            try {
//                fis = new FileInputStream(fileName);
//                prop.load(fis);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        String a = prop.getProperty("driver.type");
//        System.out.println(a);
    }

    public static void setUpDriver() {

        if (helperClass==null) {

            helperClass = new HelperClass();
        }
    }

    public static void openPage(String url){
        driver.get(url);
        try {
            Thread.sleep(50000000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void tearDown() {

        if(driver!=null) {
            driver.close();
            driver.quit();
        }

        helperClass = null;
    }

}