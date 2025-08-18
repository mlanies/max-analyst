package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.LabeledIntent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Process;
import java.util.List;
import org.apache.http.protocol.HTTP;

/* loaded from: classes2.dex */
public final class o37 {
    public static final String a = new o37().getClass().getName();

    public static Intent a(Context context, Intent intent) {
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        Object obj = null;
        if (listQueryIntentActivities.isEmpty()) {
            return null;
        }
        Intent intentCreateChooser = Intent.createChooser(intent, null);
        for (Object obj2 : listQueryIntentActivities) {
            String str = ((ResolveInfo) obj2).activityInfo.packageName;
            if (tpa.f(str, "org.telegram.messenger") || tpa.f(str, "org.telegram.messenger.beta") || tpa.f(str, "org.telegram.messenger.web")) {
                obj = obj2;
                break;
            }
        }
        ResolveInfo resolveInfo = (ResolveInfo) obj;
        if (resolveInfo != null) {
            Intent intent2 = (Intent) intent.clone();
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            intent2.addFlags(268435456);
            intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new LabeledIntent[]{new LabeledIntent(intent2, resolveInfo.activityInfo.packageName, resolveInfo.labelRes, resolveInfo.icon)});
        }
        return intentCreateChooser;
    }

    public static Intent b(Context context, boolean z) {
        if (!z) {
            return new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT", Uri.fromParts("package", context.getPackageName(), null));
        }
        Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
        intent.setPackage("com.miui.securitycenter");
        intent.putExtra("extra_package_uid", Process.myUid());
        intent.putExtra("extra_pkgname", context.getPackageName());
        return intent;
    }

    public static void c(Context context, Uri uri, String str) {
        Object njcVar;
        try {
            die dieVar = new die(context, 13);
            ((Intent) dieVar.b).setType(str);
            dieVar.Q(uri);
            dieVar.S();
            njcVar = e5f.a;
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        Throwable thA = pjc.a(njcVar);
        if (thA != null) {
            hm9.p(a, "shareMedia: failed", thA);
        }
    }

    public static void d(Context context, CharSequence charSequence, Uri uri) {
        Object njcVar;
        try {
            die dieVar = new die(context, 13);
            ((Intent) dieVar.b).setType(HTTP.PLAIN_TEXT_TYPE);
            dieVar.R(charSequence);
            dieVar.Q(uri);
            Intent intentA = a(context, dieVar.w());
            if (intentA != null) {
                context.startActivity(intentA);
                njcVar = e5f.a;
            } else {
                njcVar = null;
            }
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        Throwable thA = pjc.a(njcVar);
        if (thA != null) {
            hm9.p(a, "showInviteDialog error", thA);
        }
    }
}
