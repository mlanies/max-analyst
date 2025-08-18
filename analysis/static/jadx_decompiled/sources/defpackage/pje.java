package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class pje {
    public final Context a;
    public final Object b;
    public volatile int c;
    public List d;
    public final ArrayList e;

    public pje(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        this.a = applicationContext;
        this.b = new Object();
        this.c = 1;
        this.e = new ArrayList();
    }

    public final void a(int i) {
        String str;
        List listH;
        if (au1.b(this.c, i) >= 0) {
            return;
        }
        synchronized (this.b) {
            try {
                int i2 = this.c;
                if (au1.b(i2, i) >= 0) {
                    return;
                }
                Context context = this.a;
                String strQ = c37.q();
                if (strQ.equals(context.getPackageName())) {
                    str = "tracer";
                } else {
                    str = "tracer-" + Uri.encode(strQ.replace(':', '-'));
                }
                File fileJ = lk5.J(new File(context.getCacheDir(), str), "tags");
                int iS = au1.s(i2);
                if (iS == 0) {
                    int iS2 = au1.s(i);
                    if (iS2 != 1) {
                        if (iS2 != 2) {
                            throw new AssertionError("Unreachable code");
                        }
                        if (fileJ.exists()) {
                            try {
                                m6d.k(fileJ);
                            } catch (IOException unused) {
                                fileJ.toString();
                            }
                        }
                    } else if (fileJ.exists()) {
                        try {
                            listH = lk5.H(fileJ);
                        } catch (IOException unused2) {
                            fileJ.toString();
                        }
                        this.d = listH;
                    } else {
                        listH = nz4.a;
                        this.d = listH;
                    }
                } else {
                    if (iS != 1) {
                        throw new AssertionError("Unreachable code");
                    }
                    if (oje.$EnumSwitchMapping$0[au1.s(i)] != 2) {
                        throw new AssertionError("Unreachable code");
                    }
                    if (fileJ.exists()) {
                        try {
                            m6d.k(fileJ);
                        } catch (IOException unused3) {
                            fileJ.toString();
                        }
                    }
                    this.d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Map map) {
        boolean zQ;
        synchronized (this.e) {
            zQ = false;
            for (Map.Entry entry : map.entrySet()) {
                zQ |= rq9.q(this.e, (String) entry.getKey(), (String) entry.getValue(), 30);
            }
        }
        if (zQ) {
            hze.a(new u3c(27, this));
        }
    }
}
