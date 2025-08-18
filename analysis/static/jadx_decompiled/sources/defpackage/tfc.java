package defpackage;

import android.app.RemoteInput;
import android.content.Intent;
import android.net.Uri;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class tfc {
    public static void a(vfc vfcVar, Intent intent, Map<String, Uri> map) {
        RemoteInput.addDataResultToIntent(vfc.a(vfcVar), intent, map);
    }

    public static Set<String> b(Object obj) {
        return ((RemoteInput) obj).getAllowedDataTypes();
    }

    public static Map<String, Uri> c(Intent intent, String str) {
        return RemoteInput.getDataResultsFromIntent(intent, str);
    }

    public static RemoteInput.Builder d(RemoteInput.Builder builder, String str, boolean z) {
        return builder.setAllowDataType(str, z);
    }
}
