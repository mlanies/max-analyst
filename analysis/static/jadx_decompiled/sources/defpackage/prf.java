package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class prf {
    public static final long a = TimeUnit.MINUTES.toMillis(1);
    public static final Object b = new Object();
    public static orf c;

    public static void a(Context context) {
        if (c == null) {
            orf orfVar = new orf(context);
            c = orfVar;
            synchronized (orfVar.a) {
                orfVar.g = true;
            }
        }
    }

    public static void b(Intent intent) {
        synchronized (b) {
            try {
                if (c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ComponentName c(Context context, Intent intent) {
        synchronized (b) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    c.a(a);
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
