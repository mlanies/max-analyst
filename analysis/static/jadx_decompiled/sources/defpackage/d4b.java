package defpackage;

import android.os.Handler;
import androidx.media3.common.ParserException;

/* loaded from: classes.dex */
public final class d4b implements yze {
    public final erc a;
    public final y7g b = new y7g(18);
    public final k99 c = new k99(1);
    public long d = -9223372036854775807L;
    public final /* synthetic */ e4b e;

    public d4b(e4b e4bVar, n64 n64Var) {
        this.e = e4bVar;
        this.a = new erc(n64Var, null, null);
    }

    @Override // defpackage.yze
    public final void a(long j, int i, int i2, int i3, wze wzeVar) {
        long jF;
        long jV;
        this.a.a(j, i, i2, i3, wzeVar);
        while (this.a.s(false)) {
            k99 k99Var = this.c;
            k99Var.v();
            if (this.a.x(this.b, k99Var, 0, false) == -4) {
                k99Var.y();
            } else {
                k99Var = null;
            }
            if (k99Var != null) {
                long j2 = k99Var.Z;
                f99 f99VarM = ((xo) this.e.t0).m(k99Var);
                if (f99VarM != null) {
                    d45 d45Var = (d45) f99VarM.a[0];
                    String str = d45Var.a;
                    String str2 = d45Var.b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            jV = oaf.V(oaf.q(d45Var.X));
                        } catch (ParserException unused) {
                            jV = -9223372036854775807L;
                        }
                        if (jV != -9223372036854775807L) {
                            b4b b4bVar = new b4b(j2, jV);
                            Handler handler = this.e.b;
                            handler.sendMessage(handler.obtainMessage(1, b4bVar));
                        }
                    }
                }
            }
        }
        erc ercVar = this.a;
        xqc xqcVar = ercVar.a;
        synchronized (ercVar) {
            int i4 = ercVar.s;
            jF = i4 == 0 ? -1L : ercVar.f(i4);
        }
        xqcVar.c(jF);
    }

    @Override // defpackage.yze
    public final void b(wpa wpaVar, int i, int i2) {
        this.a.b(wpaVar, i, 0);
    }

    @Override // defpackage.yze
    public final int c(m24 m24Var, int i, boolean z) {
        return this.a.c(m24Var, i, z);
    }

    @Override // defpackage.yze
    public final void e(qy5 qy5Var) {
        this.a.e(qy5Var);
    }
}
