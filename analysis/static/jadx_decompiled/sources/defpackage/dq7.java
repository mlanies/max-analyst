package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public class dq7 implements m4d, l4d {
    public final up7 X;
    public final qq7 a;
    public final p4d b;
    public final hle c;
    public final hc3 o = new hc3();

    public dq7(qq7 qq7Var, p4d p4dVar, hle hleVar, up7 up7Var) {
        this.a = qq7Var;
        this.b = p4dVar;
        this.c = hleVar;
        this.X = up7Var;
    }

    public void a() {
        this.o.d();
    }

    public final void b() {
        p4d p4dVar = this.b;
        up7 up7Var = this.X;
        awa awaVarE = p4dVar.e(up7Var);
        this.a.N(up7Var, awa.a(awaVarE, up7Var), 0, awaVarE != null ? awaVarE.X : null);
    }

    public void c() {
        int i = 2;
        up7 up7Var = this.X;
        hm9.m("dq7", "loadThumbnail with localMediaId = %d", Long.valueOf(up7Var.b));
        Uri uriN = j47.N(up7Var.c);
        long j = up7Var.b;
        if (uriN != null) {
            hm9.m("dq7", "loadThumbnail: %d, cachedUri is not empty", Long.valueOf(j));
            d(0, uriN.toString());
            return;
        }
        this.a.N(up7Var, null, 0, null);
        r4d r4dVarH = this.b.h(up7Var);
        String str = r4dVarH != null ? oag.t(r4dVarH.d) ? r4dVarH.a.o : r4dVarH.d : up7Var.o;
        q1a q1aVar = new q1a(2, new l5(8, str));
        hle hleVar = this.c;
        hleVar.getClass();
        jle jleVar = (jle) hleVar;
        rqd rqdVar = new rqd(q1aVar.m(jleVar.a()).i(jleVar.b()), new lt1(j, str, 4), i);
        iq1 iq1Var = new iq1(new d74(this, 21, str), 2, new z16(13, this));
        rqdVar.k(iq1Var);
        this.o.a(iq1Var);
    }

    public final void d(int i, String str) {
        Uri uriN = j47.N(str);
        p4d p4dVar = this.b;
        up7 up7Var = this.X;
        awa awaVarE = p4dVar.e(up7Var);
        if (awa.b(awaVarE, up7Var)) {
            Uri uriA = awa.a(awaVarE, up7Var);
            if (!uriA.getPath().equals(up7Var.c)) {
                uriN = uriA;
            }
            i = 0;
        }
        this.a.N(up7Var, uriN, i, awaVarE != null ? awaVarE.X : null);
    }

    @Override // defpackage.l4d
    public final void j(r4d r4dVar) {
        up7 up7Var = this.X;
        if (up7Var != null) {
            String str = up7Var.c;
            up7 up7Var2 = r4dVar.a;
            if (str.equals(up7Var2.c)) {
                d(up7Var2.X, oag.t(r4dVar.d) ? up7Var2.o : r4dVar.d);
            }
        }
    }

    @Override // defpackage.m4d
    public final void s1(r4d r4dVar) {
        b();
    }
}
