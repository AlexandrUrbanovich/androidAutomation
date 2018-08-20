package services.modules;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import services.AndroidWifiServices;
import services.SettingServices;
import services.interfaces.IAndroidWifiServices;
import services.interfaces.ISettingServices;

public class CustomFrameworkModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(ISettingServices.class).to(SettingServices.class).in(Scopes.SINGLETON);
        bind(IAndroidWifiServices.class).to(AndroidWifiServices.class).in(Scopes.SINGLETON);
    }
}
