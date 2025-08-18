package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class oc4 implements wj8 {
    public final od a;
    public q24 b;
    public mbe c;
    public final long d;
    public final long e;
    public final long f;
    public final float g;
    public final float h;
    public boolean i;

    public oc4(Context context, va4 va4Var) {
        h94 h94Var = new h94(context);
        this.b = h94Var;
        b46 b46Var = new b46();
        this.c = b46Var;
        od odVar = new od();
        odVar.b = va4Var;
        odVar.Y = b46Var;
        odVar.c = new HashMap();
        odVar.o = new HashMap();
        odVar.a = true;
        this.a = odVar;
        if (h94Var != ((q24) odVar.X)) {
            odVar.X = h94Var;
            ((HashMap) odVar.c).clear();
            ((HashMap) odVar.o).clear();
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.i = true;
    }

    public static wj8 f(Class cls, q24 q24Var) {
        try {
            return (wj8) cls.getConstructor(q24.class).newInstance(q24Var);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.wj8
    public final wj8 a() {
        fm9.i(null, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        throw null;
    }

    @Override // defpackage.wj8
    public final void b(boolean z) {
        this.i = z;
        od odVar = this.a;
        odVar.a = z;
        ((ra5) odVar.b).h(z);
        Iterator it = ((HashMap) odVar.o).values().iterator();
        while (it.hasNext()) {
            ((wj8) it.next()).b(z);
        }
    }

    @Override // defpackage.wj8
    public final wj8 c() {
        fm9.i(null, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        throw null;
    }

    @Override // defpackage.wj8
    public final void d(b46 b46Var) {
        b46Var.getClass();
        this.c = b46Var;
        od odVar = this.a;
        odVar.Y = b46Var;
        ((ra5) odVar.b).d(b46Var);
        Iterator it = ((HashMap) odVar.o).values().iterator();
        while (it.hasNext()) {
            ((wj8) it.next()).d(b46Var);
        }
    }

    @Override // defpackage.wj8
    public final ej0 e(tb8 tb8Var) {
        ib8 ib8Var;
        tr4 tr4VarS;
        tr4 tr4Var;
        tb8 tb8VarA = tb8Var;
        tb8VarA.b.getClass();
        String scheme = tb8VarA.b.a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (Objects.equals(tb8VarA.b.b, "application/x-image-uri")) {
            long j = tb8VarA.b.i;
            int i = oaf.a;
            throw null;
        }
        ib8 ib8Var2 = tb8VarA.b;
        int iJ = oaf.J(ib8Var2.a, ib8Var2.b);
        if (tb8VarA.b.i != -9223372036854775807L) {
            ra5 ra5Var = (ra5) this.a.b;
            if (ra5Var instanceof va4) {
                va4 va4Var = (va4) ra5Var;
                synchronized (va4Var) {
                    va4Var.Z = 1;
                }
            }
        }
        try {
            wj8 wj8VarC = this.a.c(iJ);
            fb8 fb8VarA = tb8VarA.c.a();
            hb8 hb8Var = tb8VarA.c;
            if (hb8Var.a == -9223372036854775807L) {
                fb8VarA.a = this.d;
            }
            if (hb8Var.d == -3.4028235E38f) {
                fb8VarA.d = this.g;
            }
            if (hb8Var.e == -3.4028235E38f) {
                fb8VarA.e = this.h;
            }
            if (hb8Var.b == -9223372036854775807L) {
                fb8VarA.b = this.e;
            }
            if (hb8Var.c == -9223372036854775807L) {
                fb8VarA.c = this.f;
            }
            hb8 hb8Var2 = new hb8(fb8VarA);
            if (!hb8Var2.equals(tb8VarA.c)) {
                ya8 ya8VarA = tb8Var.a();
                ya8VarA.m = hb8Var2.a();
                tb8VarA = ya8VarA.a();
            }
            ej0 ej0VarE = wj8VarC.e(tb8VarA);
            zw6 zw6Var = tb8VarA.b.g;
            if (!zw6Var.isEmpty()) {
                ej0[] ej0VarArr = new ej0[zw6Var.size() + 1];
                boolean z = false;
                ej0VarArr[0] = ej0VarE;
                int i2 = 0;
                while (i2 < zw6Var.size()) {
                    if (this.i) {
                        ny5 ny5Var = new ny5();
                        ny5Var.m = ia9.l(((pb8) zw6Var.get(i2)).b);
                        ny5Var.d = ((pb8) zw6Var.get(i2)).c;
                        ny5Var.e = ((pb8) zw6Var.get(i2)).d;
                        ny5Var.f = ((pb8) zw6Var.get(i2)).e;
                        ny5Var.b = ((pb8) zw6Var.get(i2)).f;
                        ny5Var.a = ((pb8) zw6Var.get(i2)).g;
                        d74 d74Var = new d74(this, 3, new qy5(ny5Var));
                        q24 q24Var = this.b;
                        yt8 yt8Var = new yt8(24, d74Var);
                        Object obj = new Object();
                        huc hucVar = new huc();
                        int i3 = i2 + 1;
                        String string = ((pb8) zw6Var.get(i2)).a.toString();
                        za8 za8Var = new za8();
                        s74 s74Var = new s74();
                        List listEmptyList = Collections.emptyList();
                        ffc ffcVar = ffc.X;
                        fb8 fb8Var = new fb8();
                        lb8 lb8Var = lb8.d;
                        Uri uri = string == null ? null : Uri.parse(string);
                        fm9.k((((Uri) s74Var.e) == null || ((UUID) s74Var.d) != null) ? true : z);
                        if (uri != null) {
                            ib8Var = new ib8(uri, null, ((UUID) s74Var.d) != null ? new eb8(s74Var) : null, null, listEmptyList, null, ffcVar, null, -9223372036854775807L);
                        } else {
                            ib8Var = null;
                        }
                        tb8 tb8Var2 = new tb8("", new db8(za8Var), ib8Var, new hb8(fb8Var), gd8.J, lb8Var);
                        ib8Var.getClass();
                        tb8Var2.b.getClass();
                        eb8 eb8Var = tb8Var2.b.c;
                        if (eb8Var == null) {
                            tr4Var = tr4.a;
                        } else {
                            synchronized (obj) {
                                try {
                                    tr4VarS = !eb8Var.equals(null) ? pl8.s(eb8Var) : null;
                                    tr4VarS.getClass();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            tr4Var = tr4VarS;
                        }
                        ej0VarArr[i3] = new aob(tb8Var2, q24Var, yt8Var, tr4Var, hucVar, 1048576);
                    } else {
                        q24 q24Var2 = this.b;
                        q24Var2.getClass();
                        ej0VarArr[i2 + 1] = new qrd((pb8) zw6Var.get(i2), q24Var2, new huc());
                    }
                    i2++;
                    z = false;
                }
                ej0VarE = new cs8(ej0VarArr);
            }
            ej0 e43Var = ej0VarE;
            db8 db8Var = tb8VarA.e;
            long j2 = db8Var.b;
            if (j2 != 0 || db8Var.d != Long.MIN_VALUE || db8Var.f) {
                e43Var = new e43(e43Var, j2, db8Var.d, !db8Var.g, db8Var.e, db8Var.f);
            }
            tb8VarA.b.getClass();
            if (tb8VarA.b.d != null) {
                z04.c0("Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            }
            return e43Var;
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }
}
