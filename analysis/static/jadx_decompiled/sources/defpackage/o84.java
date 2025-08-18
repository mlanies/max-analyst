package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.io.File;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class o84 implements l30, s43, sbe, wde, i78, z0a, kz3, o2a, o1f {
    public static o84 b;
    public final /* synthetic */ int a;
    public static final o84 c = new o84(1);
    public static final o84 o = new o84(2);
    public static final /* synthetic */ o84 X = new o84(3);
    public static final o84 Y = new o84(4);
    public static t7d Z = new t7d();
    public static final /* synthetic */ o84 s0 = new o84(6);

    public /* synthetic */ o84(int i) {
        this.a = i;
    }

    public static synchronized o84 g() {
        try {
            if (b == null) {
                b = new o84(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void n(defpackage.qy3 r16, java.util.List r17) throws org.json.JSONException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o84.n(qy3, java.util.List):void");
    }

    public static void o(List list) {
        List listD;
        list.size();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            qy3 qy3Var = (qy3) list.get(i);
            if (i == 0) {
                kye kyeVar = kye.a;
                listD = kye.b().d();
            } else {
                listD = null;
            }
            try {
                n(qy3Var, listD);
                qy3Var.getClass();
                lk5.F(new File(qy3Var.c));
            } catch (Throwable unused) {
                if (listD != null) {
                    kye kyeVar2 = kye.a;
                    kye.b().a(listD);
                }
            }
        }
    }

    @Override // defpackage.wde
    public xde a(ana anaVar) {
        return new o36((Context) anaVar.c, (String) anaVar.o, (l0f) anaVar.X, anaVar.a, anaVar.b);
    }

    public do0 b(wv6 wv6Var, Object obj) {
        do0 do0Var = new do0(c(wv6Var.b).toString(), wv6Var.i, wv6Var.j, wv6Var.h, null, null);
        do0Var.g = obj;
        return do0Var;
    }

    public Uri c(Uri uri) {
        return uri;
    }

    @Override // defpackage.z0a
    public c1a call() {
        return new f1a();
    }

    public tpd d(Uri uri) {
        return new tpd(c(uri).toString());
    }

    @Override // defpackage.i78
    public long e() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.o2a
    public u1d f() {
        return new pm5(-9223372036854775807L);
    }

    @Override // defpackage.i78
    public long h() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.o2a
    public void i(long j) {
    }

    public do0 j(wv6 wv6Var, Object obj) {
        ww0 ww0Var;
        String name;
        q6b q6bVar = wv6Var.q;
        if (q6bVar != null) {
            ww0 ww0VarB = q6bVar.b();
            name = q6bVar.getClass().getName();
            ww0Var = ww0VarB;
        } else {
            ww0Var = null;
            name = null;
        }
        do0 do0Var = new do0(c(wv6Var.b).toString(), wv6Var.i, wv6Var.j, wv6Var.h, ww0Var, name);
        do0Var.g = obj;
        return do0Var;
    }

    @Override // defpackage.sbe
    public ukg k(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = goc.h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? j1e.r(bundle) : j1e.r(null);
    }

    @Override // defpackage.o2a
    public long l(ra4 ra4Var) {
        return -1L;
    }

    @Override // defpackage.o1f
    public p1f m(Context context, i63 i63Var, xw0 xw0Var, pgf pgfVar, crd crdVar, List list, long j) {
        return new m1f(context, i63Var, xw0Var, pgfVar, crdVar, list, j);
    }

    @Override // defpackage.i78
    public boolean next() {
        return false;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    @Override // defpackage.s43
    public defpackage.gle w(defpackage.gy8 r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o84.w(gy8):gle");
    }

    public o84(Context context) {
        this.a = 19;
    }
}
