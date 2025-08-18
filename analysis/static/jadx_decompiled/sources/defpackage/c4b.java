package defpackage;

import android.os.Handler;
import com.google.android.exoplayer2.ParserException;

/* loaded from: classes.dex */
public final class c4b implements xze {
    public final drc a;
    public final imc b = new imc(19);
    public final j99 c = new j99(1);
    public long d = -9223372036854775807L;
    public final /* synthetic */ e4b e;

    public c4b(e4b e4bVar, n64 n64Var) {
        this.e = e4bVar;
        this.a = new drc(n64Var, null, null);
    }

    @Override // defpackage.xze
    public final int a(l24 l24Var, int i, boolean z) {
        return this.a.e(l24Var, i, z);
    }

    @Override // defpackage.xze
    public final void b(long j, int i, int i2, int i3, vze vzeVar) {
        long jG;
        long jG2;
        this.a.b(j, i, i2, i3, vzeVar);
        while (this.a.t(false)) {
            j99 j99Var = this.c;
            j99Var.v();
            if (this.a.y(this.b, j99Var, 0, false) == -4) {
                j99Var.y();
            } else {
                j99Var = null;
            }
            if (j99Var != null) {
                long j2 = j99Var.Y;
                e99 e99VarV = ((wo) this.e.t0).v(j99Var);
                if (e99VarV != null) {
                    c45 c45Var = (c45) e99VarV.a[0];
                    String str = c45Var.a;
                    String str2 = c45Var.b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            jG2 = maf.G(maf.n(c45Var.X));
                        } catch (ParserException unused) {
                            jG2 = -9223372036854775807L;
                        }
                        if (jG2 != -9223372036854775807L) {
                            a4b a4bVar = new a4b(j2, jG2);
                            Handler handler = this.e.b;
                            handler.sendMessage(handler.obtainMessage(1, a4bVar));
                        }
                    }
                }
            }
        }
        drc drcVar = this.a;
        xqc xqcVar = drcVar.a;
        synchronized (drcVar) {
            int i4 = drcVar.s;
            jG = i4 == 0 ? -1L : drcVar.g(i4);
        }
        xqcVar.c(jG);
    }

    @Override // defpackage.xze
    public final void c(int i, yaf yafVar) {
        this.a.f(i, yafVar);
    }

    @Override // defpackage.xze
    public final void d(oy5 oy5Var) {
        this.a.d(oy5Var);
    }
}
