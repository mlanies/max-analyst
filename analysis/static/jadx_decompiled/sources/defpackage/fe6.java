package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Iterator;

/* loaded from: classes.dex */
public class fe6 {
    public static final int a;
    public static final fe6 b;

    static {
        int i = pe6.e;
        a = 12451000;
        b = new fe6();
    }

    public Intent a(int i, Context context, String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && np8.A(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                bkg bkgVarA = a9g.a(context);
                sb.append(((Context) bkgVarA.b).getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public int b(Context context, int i) {
        boolean z;
        int iA = pe6.a(context, i);
        boolean z2 = true;
        if (iA != 18) {
            if (iA == 1) {
                z2 = false;
                try {
                    Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
                            break;
                        }
                        if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                            z = true;
                            break;
                        }
                    }
                    z2 = z;
                } catch (PackageManager.NameNotFoundException | Exception unused) {
                }
            } else {
                z2 = false;
            }
        }
        if (z2) {
            return 18;
        }
        return iA;
    }
}
