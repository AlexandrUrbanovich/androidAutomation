package services.modules;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import services.AndroidWifiServices;
import services.DisplayServices;
import services.NotificationServices;
import services.SettingServices;
import services.interfaces.IAndroidWifiServices;
import services.interfaces.IDisplayServices;
import services.interfaces.INotificationServices;
import services.interfaces.ISettingServices;

public class CustomFrameworkModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(ISettingServices.class).to(SettingServices.class).in(Scopes.SINGLETON);
        bind(IAndroidWifiServices.class).to(AndroidWifiServices.class).in(Scopes.SINGLETON);
        bind(IDisplayServices.class).to(DisplayServices.class).in(Scopes.SINGLETON);
        bind(INotificationServices.class).to(NotificationServices.class).in(Scopes.SINGLETON);
    }
}
