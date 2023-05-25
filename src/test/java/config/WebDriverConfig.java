package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:auth.properties"
})

public interface WebDriverConfig extends Config {

    @Config.Key("browser")
    @Config.DefaultValue("CHROME")
    String browser();

    @Config.Key("browser_size")
    @Config.DefaultValue("1920x1080")
    String browserSize();

    @Config.Key("browser_version")
    @Config.DefaultValue("100.0")
    String browserVersion();

    @Config.Key("baseUrl")
    @Config.DefaultValue("https://allure.autotests.cloud")
    String baseUrl();

    @Config.Key("isRemote")
    @Config.DefaultValue("false")
    Boolean isRemote();

    @Config.Key("remoteUrl")
    @Config.DefaultValue("http://localhost:4444")
    String remoteUrl();
}
