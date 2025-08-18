package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import ru.ok.tracer.minidump.Minidump;

/* loaded from: classes2.dex */
public abstract class aze {
    public static boolean a() {
        if (tpa.f(null, Boolean.FALSE)) {
            return false;
        }
        try {
            Minidump.getInstance();
            return true;
        } catch (Throwable unused) {
            tpa.f(null, Boolean.TRUE);
            return false;
        }
    }

    public static void b(Context context) {
        String str;
        try {
            String strQ = c37.q();
            if (strQ.equals(context.getPackageName())) {
                str = "tracer";
            } else {
                str = "tracer-" + Uri.encode(strQ.replace(':', '-'));
            }
            File fileJ = lk5.J(new File(context.getCacheDir(), str), "minidump");
            m6d.y(fileJ);
            Minidump.getInstance().installMinidumpWriter(fileJ.getPath());
        } catch (Throwable unused) {
        }
    }
}
