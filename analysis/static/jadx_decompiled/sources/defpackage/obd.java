package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class obd {
    public static final String b;
    public static final String c;
    public final nbd a;

    static {
        nc8.a("media3.session");
        int i = oaf.a;
        b = Integer.toString(0, 36);
        c = Integer.toString(1, 36);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public obd(android.content.Context r12, android.content.ComponentName r13) {
        /*
            r11 = this;
            r11.<init>()
            java.lang.String r0 = "context must not be null"
            defpackage.fm9.i(r12, r0)
            android.content.pm.PackageManager r12 = r12.getPackageManager()
            java.lang.String r0 = r13.getPackageName()
            r1 = 0
            android.content.pm.ApplicationInfo r0 = r12.getApplicationInfo(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L19
            int r0 = r0.uid     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L19
        L17:
            r2 = r0
            goto L1b
        L19:
            r0 = -1
            goto L17
        L1b:
            java.lang.String r0 = "androidx.media3.session.MediaLibraryService"
            boolean r0 = a(r12, r0, r13)
            r1 = 101(0x65, float:1.42E-43)
            if (r0 == 0) goto L28
            r12 = 2
        L26:
            r3 = r12
            goto L3b
        L28:
            java.lang.String r0 = "androidx.media3.session.MediaSessionService"
            boolean r0 = a(r12, r0, r13)
            if (r0 == 0) goto L32
            r12 = 1
            goto L26
        L32:
            java.lang.String r0 = "android.media.browse.MediaBrowserService"
            boolean r12 = a(r12, r0, r13)
            if (r12 == 0) goto L5c
            r3 = r1
        L3b:
            if (r3 == r1) goto L54
            pbd r12 = new pbd
            java.lang.String r6 = r13.getPackageName()
            java.lang.String r7 = r13.getClassName()
            android.os.Bundle r10 = android.os.Bundle.EMPTY
            r5 = 0
            r9 = 0
            r4 = 0
            r1 = r12
            r8 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a = r12
            goto L5b
        L54:
            qbd r12 = new qbd
            r12.<init>(r2, r13)
            r11.a = r12
        L5b:
            return
        L5c:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to resolve SessionToken for "
            r12.<init>(r0)
            r12.append(r13)
            java.lang.String r13 = ". Manifest doesn't declare one of either MediaSessionService, MediaLibraryService, MediaBrowserService or MediaBrowserServiceCompat. Use service's full name."
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.obd.<init>(android.content.Context, android.content.ComponentName):void");
    }

    public static boolean a(PackageManager packageManager, String str, ComponentName componentName) {
        ServiceInfo serviceInfo;
        Intent intent = new Intent(str);
        intent.setPackage(componentName.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 128);
        if (listQueryIntentServices != null) {
            for (int i = 0; i < listQueryIntentServices.size(); i++) {
                ResolveInfo resolveInfo = listQueryIntentServices.get(i);
                if (resolveInfo != null && (serviceInfo = resolveInfo.serviceInfo) != null && TextUtils.equals(serviceInfo.name, componentName.getClassName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        nbd nbdVar = this.a;
        boolean z = nbdVar instanceof pbd;
        String str = b;
        if (z) {
            bundle.putInt(str, 0);
        } else {
            bundle.putInt(str, 1);
        }
        bundle.putBundle(c, nbdVar.g());
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof obd) {
            return this.a.equals(((obd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    public obd(int i, int i2, int i3, String str, qr6 qr6Var, Bundle bundle) {
        str.getClass();
        IBinder iBinderAsBinder = qr6Var.asBinder();
        bundle.getClass();
        this.a = new pbd(i, 0, i2, i3, str, "", null, iBinderAsBinder, bundle);
    }
}
