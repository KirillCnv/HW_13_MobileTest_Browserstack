package guru.qa.configurate;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:remote/remote.properties"
})

public interface OwnerData extends Config{
    @Config.Key("browserstack.user")
    String browserstackUser();

    @Config.Key("browserstack.key")
    String browserstackKey();

    @Config.Key("app")
    String app();

    @Config.Key("device")
    String device();

    @Config.Key("os_version")
    String osVersion();

    @Config.Key("project")
    String project();

    @Config.Key("build")
    String build();

    @Config.Key("name")
    String name();

    @Config.Key("remoteUrl")
    String remoteUrl();
}
