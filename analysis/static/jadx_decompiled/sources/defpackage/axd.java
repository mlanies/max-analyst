package defpackage;

import android.content.Context;
import javax.net.ssl.SSLException;

/* loaded from: classes2.dex */
public final class axd implements zwd {
    public final String a = axd.class.getName().concat("(DEF_SSL)");
    public final Context b;
    public final bxd c;
    public final ey1 d;

    public axd(Context context) {
        this.b = context.getApplicationContext();
        bxd bxdVar = new bxd();
        this.c = bxdVar;
        this.d = new ey1(29, bxdVar);
    }

    public final pud a(String str) throws SSLException {
        String str2 = this.a;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str2, zr6.i("createSocketFactory, host=", str, " ->"), null);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            pud pudVar = new pud(this.b, str);
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            bxd bxdVar = this.c;
            if (jCurrentTimeMillis2 >= 0) {
                bxdVar.a = jCurrentTimeMillis2;
                bxdVar.b += jCurrentTimeMillis2;
                bxdVar.c++;
            } else {
                bxdVar.getClass();
            }
            String str3 = this.a;
            ir6 ir6Var2 = hm9.m;
            if (ir6Var2 != null && ir6Var2.c()) {
                ir6Var2.d(us7.X, str3, ey8.i(jCurrentTimeMillis2, "<- createSocketFactory, took=", "ms"), null);
            }
            return pudVar;
        } catch (SSLException e) {
            throw e;
        } catch (Throwable th) {
            throw new SSLException("Failed to create socket factory", th);
        }
    }
}
