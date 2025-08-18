package defpackage;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;

/* loaded from: classes.dex */
public final class ui8 {
    public Context a;
    public final ContentResolver b;

    static {
        boolean z = xi8.b;
    }

    public ui8(Context context) {
        this.a = context;
        this.b = context.getContentResolver();
        this.a = context;
    }

    public final boolean a(ti8 ti8Var, String str) {
        int i = ti8Var.b;
        return i < 0 ? this.a.getPackageManager().checkPermission(str, ti8Var.a) == 0 : this.a.checkPermission(str, i, ti8Var.c) == 0;
    }

    public boolean b(ti8 ti8Var) {
        if (this.a.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", ti8Var.b, ti8Var.c) != 0) {
            try {
                if (this.a.getPackageManager().getApplicationInfo(ti8Var.a, 0) == null) {
                    return false;
                }
                if (!a(ti8Var, "android.permission.STATUS_BAR_SERVICE") && !a(ti8Var, "android.permission.MEDIA_CONTENT_CONTROL") && ti8Var.c != 1000) {
                    String string = Settings.Secure.getString(this.b, "enabled_notification_listeners");
                    if (string == null) {
                        return false;
                    }
                    for (String str : string.split(":")) {
                        ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                        if (componentNameUnflattenFromString == null || !componentNameUnflattenFromString.getPackageName().equals(ti8Var.a)) {
                        }
                    }
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        }
        return true;
    }
}
