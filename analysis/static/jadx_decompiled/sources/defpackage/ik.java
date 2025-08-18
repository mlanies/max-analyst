package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* loaded from: classes2.dex */
public final class ik {
    public static final qec b = new qec("main-([0-9]+)\\.txt");
    public final Context a;

    public ik(Context context, int i) {
        this.a = context;
        ote.e(i, 1, 100);
    }

    public final File a() {
        String str;
        String strQ = c37.q();
        Context context = this.a;
        if (strQ.equals(context.getPackageName())) {
            str = "tracer";
        } else {
            str = "tracer-" + Uri.encode(strQ.replace(':', '-'));
        }
        return lk5.J(new File(context.getCacheDir(), str), "main_snapshots");
    }
}
