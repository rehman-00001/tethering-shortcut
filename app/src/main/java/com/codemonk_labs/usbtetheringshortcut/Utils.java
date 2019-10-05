package com.codemonk_labs.usbtetheringshortcut;

import android.content.Context;
import android.content.Intent;

import static com.codemonk_labs.usbtetheringshortcut.Constants.SETTINGS_CLASS_NAME;
import static com.codemonk_labs.usbtetheringshortcut.Constants.SETTINGS_PACKAGE_NAME;

public final class Utils {
    private Utils() {
        throw new AssertionError();
    }

    public static void launchSettingsScreen(Context context) {
        Intent tetherSettings = new Intent();
        tetherSettings.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        tetherSettings.setClassName(SETTINGS_PACKAGE_NAME, SETTINGS_CLASS_NAME);
        context.startActivity(tetherSettings);
    }
}
