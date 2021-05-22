package cz.czechitas.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class hacaton {
    WebDriver prohlizec;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\Java-Training\\Selenium\\geckodriver.exe");
        prohlizec = new FirefoxDriver();
        prohlizec.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void uzivatelMusiBytSchopenVytvoritRezervaciZHlavniStranky_BDHCC_54() {
        uzivatelMusiBytSchopenProvestRezervaciPokojeBudgetCabin_BDHCC_57();
        uzivatelMusiBytSchopenProvestRezervaciPokojeDeluxeApartments_BDHCC_91();
        uzivatelMusiBytSchopenProvestRezervaciPokojeFullNatureExperience_BDHCC_92();
        uzivatelMusiBytSchopenProvestRezervaciPokojeLuxuryInTheWoods_BDHCC_93();
    }

    @AfterEach
    public void tearDown() {
        prohlizec.close();
    }


    public void uzivatelMusiBytSchopenProvestRezervaciPokojeBudgetCabin_BDHCC_57() {
        prohlizec.navigate().to("http://czechitas-datestovani-hackathon.cz/en/");
        WebElement rezervacePokojeBudgetCabin = prohlizec.findElement(By.xpath("//a[@href='http://czechitas-datestovani-hackathon.cz/en/home/1-super-delux-rooms.html']"));
        rezervacePokojeBudgetCabin.click();
        prohlizec.navigate().to("http://czechitas-datestovani-hackathon.cz/en/home/1-super-delux-rooms.html");

        WebElement potvrzeniRezervaceSpravnehoPokoje = prohlizec.findElement(By.xpath("//*[@class='hotel_name_block']"));
        Assertions.assertEquals("Budget cabin - Three Foxes Lounge", potvrzeniRezervaceSpravnehoPokoje.getText());
        WebElement potvrzeniZobrazeniVolbyCheckInDate = prohlizec.findElement(By.xpath("//div[2]/div[1]/div/form/div[2]/div[1]/label"));
        Assertions.assertEquals("Check In Date", potvrzeniZobrazeniVolbyCheckInDate.getText());
        WebElement potvrzeniZobrazeniVolbyCheckOutDate = prohlizec.findElement(By.xpath("//div[2]/div[1]/div/form/div[2]/div[2]/label"));
        Assertions.assertEquals("Check Out Date", potvrzeniZobrazeniVolbyCheckOutDate.getText());
    }

    public void uzivatelMusiBytSchopenProvestRezervaciPokojeDeluxeApartments_BDHCC_91() {
        prohlizec.navigate().to("http://czechitas-datestovani-hackathon.cz/en/");
        WebElement rezervacePokojeDeluxeApartments = prohlizec.findElement(By.xpath("//a[@href='http://czechitas-datestovani-hackathon.cz/en/home/2-super-delux-rooms.html']"));
        rezervacePokojeDeluxeApartments.click();
        prohlizec.navigate().to("http://czechitas-datestovani-hackathon.cz/en/home/2-super-delux-rooms.html");

        WebElement potvrzeniRezervaceSpravnehoPokoje = prohlizec.findElement(By.xpath("//*[@class='hotel_name_block']"));
        Assertions.assertEquals("Deluxe apartments - Three Foxes Lounge", potvrzeniRezervaceSpravnehoPokoje.getText());
        WebElement potvrzeniZobrazeniVolbyCheckInDate = prohlizec.findElement(By.xpath("//div[2]/div[1]/div/form/div[2]/div[1]/label"));
        Assertions.assertEquals("Check In Date", potvrzeniZobrazeniVolbyCheckInDate.getText());
        WebElement potvrzeniZobrazeniVolbyCheckOutDate = prohlizec.findElement(By.xpath("//div[2]/div[1]/div/form/div[2]/div[2]/label"));
        Assertions.assertEquals("Check Out Date", potvrzeniZobrazeniVolbyCheckOutDate.getText());
    }

    public void uzivatelMusiBytSchopenProvestRezervaciPokojeFullNatureExperience_BDHCC_92() {
        prohlizec.navigate().to("http://czechitas-datestovani-hackathon.cz/en/");
        WebElement rezervacePokojeFullNatureExperience = prohlizec.findElement(By.xpath("//a[@href='http://czechitas-datestovani-hackathon.cz/en/home/3-super-delux-rooms.html']"));
        rezervacePokojeFullNatureExperience.click();
        prohlizec.navigate().to("http://czechitas-datestovani-hackathon.cz/en/home/3-super-delux-rooms.html");

        WebElement potvrzeniRezervaceSpravnehoPokoje = prohlizec.findElement(By.xpath("//*[@class='hotel_name_block']"));
        Assertions.assertEquals("Full nature experience - Three Foxes Lounge", potvrzeniRezervaceSpravnehoPokoje.getText());
        WebElement potvrzeniZobrazeniVolbyCheckInDate = prohlizec.findElement(By.xpath("//div[2]/div[1]/div/form/div[2]/div[1]/label"));
        Assertions.assertEquals("Check In Date", potvrzeniZobrazeniVolbyCheckInDate.getText());
        WebElement potvrzeniZobrazeniVolbyCheckOutDate = prohlizec.findElement(By.xpath("//div[2]/div[1]/div/form/div[2]/div[2]/label"));
        Assertions.assertEquals("Check Out Date", potvrzeniZobrazeniVolbyCheckOutDate.getText());
    }

    public void uzivatelMusiBytSchopenProvestRezervaciPokojeLuxuryInTheWoods_BDHCC_93() {
        prohlizec.navigate().to("http://czechitas-datestovani-hackathon.cz/en/");
        WebElement rezervacePokojeLuxuryInTheWoods = prohlizec.findElement(By.xpath("//a[@href='http://czechitas-datestovani-hackathon.cz/en/home/4-super-delux-rooms.html']"));
        rezervacePokojeLuxuryInTheWoods.click();
        prohlizec.navigate().to("http://czechitas-datestovani-hackathon.cz/en/home/4-super-delux-rooms.html");

        WebElement potvrzeniRezervaceSpravnehoPokoje = prohlizec.findElement(By.xpath("//*[@class='hotel_name_block']"));
        Assertions.assertEquals("Luxury in the woods - Three Foxes Lounge", potvrzeniRezervaceSpravnehoPokoje.getText());
        WebElement potvrzeniZobrazeniVolbyCheckInDate = prohlizec.findElement(By.xpath("//div[2]/div[1]/div/form/div[2]/div[1]/label"));
        Assertions.assertEquals("Check In Date", potvrzeniZobrazeniVolbyCheckInDate.getText());
        WebElement potvrzeniZobrazeniVolbyCheckOutDate = prohlizec.findElement(By.xpath("//div[2]/div[1]/div/form/div[2]/div[2]/label"));
        Assertions.assertEquals("Check Out Date", potvrzeniZobrazeniVolbyCheckOutDate.getText());
    }

}
