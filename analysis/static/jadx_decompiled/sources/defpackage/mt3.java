package defpackage;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public abstract class mt3 {
    public static Context a(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    public static File b(Context context) {
        return context.getDataDir();
    }

    public static boolean c(Context context) {
        return context.isDeviceProtectedStorage();
    }
}
