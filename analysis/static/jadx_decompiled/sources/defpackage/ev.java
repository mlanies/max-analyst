package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class ev implements vp6 {
    public final /* synthetic */ int a;
    public volatile long b;
    public Object c;
    public volatile Object o;

    public ev(y8 y8Var) {
        this.a = 1;
        this.c = y8Var;
        this.b = Long.MIN_VALUE;
    }

    public synchronized void a() {
        c();
        cqc.b((zl4) this.o);
        this.o = null;
    }

    public synchronized void b() {
        f6 f6Var = (f6) this.c;
        if (f6Var == null) {
            return;
        }
        f6Var.run();
        this.c = null;
    }

    public synchronized void c() {
        this.b = -1L;
    }

    @Override // defpackage.vp6
    public Uri p(String str) {
        Uri uriP = ((vp6) this.c).p(str);
        if (!str.equals("api")) {
            return uriP;
        }
        Uri uri = sl.a;
        String string = uriP.toString();
        String string2 = uri.toString();
        if (!string.equals(string2)) {
            int iV0 = w9e.s0(string, '/') ? w9e.v0(string) : string.length();
            if (iV0 != (w9e.s0(string2, '/') ? w9e.v0(string2) : string2.length()) || !eae.l0(0, 0, iV0, string, string2, false)) {
                return uriP;
            }
        }
        if (SystemClock.elapsedRealtime() > this.b) {
            synchronized (this) {
                try {
                    if (SystemClock.elapsedRealtime() > this.b) {
                        long jElapsedRealtime = Long.MAX_VALUE;
                        try {
                            String strN0 = (String) rq9.t().c;
                            if (w9e.S0(strN0, '\"') && w9e.s0(strN0, '\"')) {
                                strN0 = strN0.substring(1, w9e.v0(strN0));
                            }
                            if (w9e.p0(strN0, "\"\"", false)) {
                                strN0 = eae.n0(strN0, "\"\"", "");
                            }
                            String string3 = w9e.b1(strN0).toString();
                            if (w9e.q0(string3, ' ')) {
                                string3 = string3.substring(w9e.E0(string3, ' ', 0, 6) + 1);
                            }
                            if (w9e.s0(string3, '/')) {
                                string3 = string3.substring(0, w9e.v0(string3));
                            }
                            Uri uri2 = Uri.parse(string3);
                            this.o = uri2;
                            int iS = au1.s(2);
                            if (iS != 0) {
                                if (iS == 1) {
                                    jElapsedRealtime = SystemClock.elapsedRealtime() + (r0.b * 1000);
                                } else {
                                    if (iS != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    jElapsedRealtime = Long.MIN_VALUE;
                                }
                            }
                            this.b = jElapsedRealtime;
                            return uri2;
                        } catch (Exception e) {
                            int iS2 = au1.s(3);
                            if (iS2 == 0) {
                                throw e;
                            }
                            if (iS2 == 1) {
                                jElapsedRealtime = Long.MIN_VALUE;
                            } else if (iS2 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.b = jElapsedRealtime;
                            Uri uri3 = (Uri) this.o;
                            return uri3 == null ? uriP : uri3;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        Uri uri4 = (Uri) this.o;
        return uri4 == null ? uriP : uri4;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "LoadOperation{operationTime=" + this.b + ", disposable=" + ((zl4) this.o) + ", onComplete=" + ((f6) this.c) + '}';
            default:
                return super.toString();
        }
    }

    public ev() {
        this.a = 0;
        this.b = -1L;
        this.o = null;
        this.c = null;
    }
}
