package defpackage;

import android.util.Pair;
import android.view.Surface;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class elf {
    public final v43 a;
    public final qy5 b;
    public final List c;
    public final f1f d;
    public final x99 e;
    public final String f;
    public final int g;
    public jee h;
    public volatile y84 i;
    public volatile int j;
    public volatile boolean k;

    public elf(v43 v43Var, qy5 qy5Var, zw6 zw6Var, f1f f1fVar, x99 x99Var) {
        i63 i63Var = qy5Var.A;
        fm9.f(i63Var != null);
        this.a = v43Var;
        this.b = qy5Var;
        this.c = zw6Var;
        this.d = f1fVar;
        this.e = x99Var;
        String str = qy5Var.n;
        str.getClass();
        String str2 = f1fVar.c;
        String str3 = "video/hevc";
        if (str2 != null) {
            str = str2;
        } else if (ia9.i(str)) {
            str = "video/hevc";
        }
        int i = f1fVar.d;
        if (i != 0 || !i63.g(i63Var) || !h15.g(str, i63Var).isEmpty()) {
            str3 = str;
        } else if (h15.g("video/hevc", i63Var).isEmpty()) {
            i = 2;
            str3 = str;
        }
        Pair pairCreate = Pair.create(str3, Integer.valueOf(i));
        this.f = (String) pairCreate.first;
        this.g = ((Integer) pairCreate.second).intValue();
    }

    public final jee a(int i, int i2) {
        i63 i63Var;
        if (this.k) {
            return null;
        }
        jee jeeVar = this.h;
        if (jeeVar != null) {
            return jeeVar;
        }
        if (i < i2) {
            this.j = 90;
            i2 = i;
            i = i2;
        }
        if (this.b.w % 180 == this.j % 180) {
            this.j = this.b.w;
        }
        ny5 ny5Var = new ny5();
        ny5Var.s = i;
        ny5Var.t = i2;
        ny5Var.v = 0;
        ny5Var.u = this.b.v;
        ny5Var.m = ia9.l(this.f);
        qy5 qy5Var = this.b;
        if ((!i63.g(qy5Var.A) || this.g == 0) && !i63.i.equals(qy5Var.A)) {
            i63Var = qy5Var.A;
            i63Var.getClass();
        } else {
            i63Var = i63.h;
        }
        ny5Var.z = i63Var;
        ny5Var.i = this.b.j;
        qy5 qy5Var2 = new qy5(ny5Var);
        v43 v43Var = this.a;
        ny5 ny5VarA = qy5Var2.a();
        ny5VarA.m = ia9.l(yqc.i(qy5Var2, this.c));
        this.i = v43Var.d(new qy5(ny5VarA));
        qy5 qy5Var3 = this.i.c;
        x99 x99Var = this.e;
        f1f f1fVar = this.d;
        boolean z = this.j != 0;
        int i3 = this.g;
        ty tyVarA = f1fVar.a();
        if (f1fVar.d != i3) {
            tyVarA.b = i3;
        }
        if (!oaf.a(qy5Var2.n, qy5Var3.n)) {
            tyVarA.c(qy5Var3.n);
        }
        if (z) {
            int i4 = qy5Var2.t;
            int i5 = qy5Var3.t;
            if (i4 != i5) {
                tyVarA.a = i5;
            }
        } else {
            int i6 = qy5Var2.u;
            int i7 = qy5Var3.u;
            if (i6 != i7) {
                tyVarA.a = i7;
            }
        }
        x99Var.m(tyVarA.a());
        Surface surface = this.i.e;
        fm9.l(surface);
        this.h = new jee(surface, qy5Var3.t, qy5Var3.u, this.j);
        if (this.k) {
            this.i.h();
        }
        return this.h;
    }

    public final void b() {
        if (this.i != null) {
            y84 y84Var = this.i;
            if (!y84Var.i.get()) {
                try {
                    Thread.sleep(30L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
            LinkedHashMap linkedHashMap = d54.a;
            try {
                synchronized (d54.class) {
                    synchronized (d54.class) {
                    }
                    y84Var.d.signalEndOfInputStream();
                }
                y84Var.d.signalEndOfInputStream();
            } catch (RuntimeException e) {
                z04.s(e, "MediaCodec error");
                throw y84Var.a(e);
            }
        }
    }
}
