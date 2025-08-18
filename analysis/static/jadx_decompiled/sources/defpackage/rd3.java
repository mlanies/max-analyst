package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Debug;
import java.io.File;
import java.io.IOException;
import java.lang.Thread;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class rd3 implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ int a;

    public /* synthetic */ rd3(int i) {
        this.a = i;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) throws IOException {
        Context context;
        String str;
        switch (this.a) {
            case 0:
                ((cba) jyc.a.i()).c(th, false);
                return;
        }
        while (!(th instanceof OutOfMemoryError)) {
            Throwable cause = th.getCause();
            if (cause == null || cause == th) {
                return;
            } else {
                th = cause;
            }
        }
        jj6 jj6Var = jj6.a;
        if (kye.b || (context = jj6.c) == null || !jj6.b.getAndSet(false)) {
            return;
        }
        qi8 qi8Var = kye.c;
        if (qi8Var == null) {
            qi8Var = null;
        }
        String str2 = (String) qi8Var.c;
        String strQ = c37.q();
        if (strQ.equals(context.getPackageName())) {
            str = "tracer";
        } else {
            str = "tracer-" + Uri.encode(strQ.replace(':', '-'));
        }
        File file = new File(context.getCacheDir(), str);
        File fileJ = lk5.J(file, "dump-tmp.hprof");
        File fileJ2 = lk5.J(file, "dump-tmp-meta.json");
        try {
            m6d.y(file);
            Debug.dumpHprofData(fileJ.getAbsolutePath());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("buildUuid", str2);
            jSONObject.put("tag", (Object) null);
            lk5.K(fileJ2, jSONObject.toString());
        } catch (Exception unused) {
            jj6.a(fileJ);
            jj6.a(fileJ2);
        }
        File fileJ3 = lk5.J(file, "dump.hprof");
        File fileJ4 = lk5.J(file, "dump-meta.json");
        try {
            if (fileJ3.exists()) {
                m6d.k(fileJ3);
            }
            if (fileJ4.exists()) {
                m6d.k(fileJ4);
            }
            m6d.K(fileJ, fileJ3);
            m6d.K(fileJ2, fileJ4);
        } catch (Exception unused2) {
            jj6.a(fileJ3);
            jj6.a(fileJ4);
        }
    }
}
