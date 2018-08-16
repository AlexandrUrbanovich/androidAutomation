package services.modules;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import services.SettingServices;
import services.interfaces.ISettingServices;

public class CustomFrameworkModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(ISettingServices.class).to(SettingServices.class).in(Scopes.SINGLETON);
    }
}
