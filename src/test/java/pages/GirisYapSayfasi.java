package pages;

import org.openqa.selenium.WebDriver;

public class GirisYapSayfasi extends Sayfa{
    public final String emailAdres = "txtUserName";
    public final String girisYapTusu = "btnLogin";

    public GirisYapSayfasi(WebDriver driver) {
        super(driver);
    }
}
