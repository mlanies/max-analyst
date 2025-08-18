package defpackage;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;
import org.apache.http.util.LangUtils;

/* loaded from: classes.dex */
public abstract class pdg {
    public static final qpd a = new qpd();
    public static Locale b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = (Context) a9g.a(context).b;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i) {
        Resources resources = context.getResources();
        return i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(g2c.common_google_play_services_enable_button) : resources.getString(g2c.common_google_play_services_update_button) : resources.getString(g2c.common_google_play_services_install_button);
    }

    public static String c(Context context, int i) {
        Resources resources = context.getResources();
        String strA = a(context);
        if (i == 1) {
            return resources.getString(g2c.common_google_play_services_install_text, strA);
        }
        if (i == 2) {
            return np8.A(context) ? resources.getString(g2c.common_google_play_services_wear_update_text) : resources.getString(g2c.common_google_play_services_update_text, strA);
        }
        if (i == 3) {
            return resources.getString(g2c.common_google_play_services_enable_text, strA);
        }
        if (i == 5) {
            return e(context, "common_google_play_services_invalid_account_text", strA);
        }
        if (i == 7) {
            return e(context, "common_google_play_services_network_error_text", strA);
        }
        if (i == 9) {
            return resources.getString(g2c.common_google_play_services_unsupported_text, strA);
        }
        if (i == 20) {
            return e(context, "common_google_play_services_restricted_profile_text", strA);
        }
        switch (i) {
            case 16:
                return e(context, "common_google_play_services_api_unavailable_text", strA);
            case LangUtils.HASH_SEED /* 17 */:
                return e(context, "common_google_play_services_sign_in_failed_text", strA);
            case 18:
                return resources.getString(g2c.common_google_play_services_updating_text, strA);
            default:
                return resources.getString(h2c.common_google_play_services_unknown_issue, strA);
        }
    }

    public static String d(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(g2c.common_google_play_services_install_title);
        }
        if (i == 2) {
            return resources.getString(g2c.common_google_play_services_update_title);
        }
        if (i == 3) {
            return resources.getString(g2c.common_google_play_services_enable_title);
        }
        if (i == 5) {
            return f(context, "common_google_play_services_invalid_account_title");
        }
        if (i == 7) {
            return f(context, "common_google_play_services_network_error_title");
        }
        if (i == 17) {
            return f(context, "common_google_play_services_sign_in_failed_title");
        }
        if (i != 20) {
            return null;
        }
        return f(context, "common_google_play_services_restricted_profile_title");
    }

    public static String e(Context context, String str, String str2) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        String strF = f(context, str);
        if (strF == null) {
            strF = resources.getString(h2c.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strF, str2);
    }

    public static String f(Context context, String str) {
        Resources resourcesForApplication;
        qpd qpdVar = a;
        synchronized (qpdVar) {
            try {
                Locale locale = pe3.a(context.getResources().getConfiguration()).get(0);
                if (!locale.equals(b)) {
                    qpdVar.clear();
                    b = locale;
                }
                String str2 = (String) qpdVar.get(str);
                if (str2 != null) {
                    return str2;
                }
                int i = pe6.e;
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resourcesForApplication = null;
                }
                if (resourcesForApplication == null) {
                    return null;
                }
                int identifier = resourcesForApplication.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    return null;
                }
                String string = resourcesForApplication.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    return null;
                }
                a.put(str, string);
                return string;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
