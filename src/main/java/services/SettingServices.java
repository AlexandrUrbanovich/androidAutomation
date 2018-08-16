package services;

import services.interfaces.ISettingServices;

public class SettingServices implements ISettingServices {
    @Override
    public boolean getWifi() {
        return false;
    }

    @Override
    public boolean getDisplay() {
        return false;
    }
}
