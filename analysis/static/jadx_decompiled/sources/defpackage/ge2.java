package defpackage;

import java.util.Set;

/* loaded from: classes2.dex */
public final class ge2 {
    public final pk a;
    public final p82 b;
    public final au8 c;
    public final m7b d;
    public final gh3 e;
    public final zu8 f;

    public ge2(pk pkVar, p82 p82Var, au8 au8Var, m7b m7bVar, gh3 gh3Var, zu8 zu8Var) {
        this.a = pkVar;
        this.b = p82Var;
        this.c = au8Var;
        this.d = m7bVar;
        this.e = gh3Var;
        this.f = zu8Var;
    }

    public final long a(e52 e52Var, cu8 cu8Var, boolean z, Set set) {
        int i;
        ge2 ge2Var;
        long j = e52Var.b.a;
        long j2 = cu8Var != null ? cu8Var.b : 0L;
        long j3 = cu8Var != null ? cu8Var.c : 0L;
        int i2 = z ? 100 : 0;
        if (z) {
            ge2Var = this;
            i = 0;
        } else {
            i = 100;
            ge2Var = this;
        }
        k4a k4aVar = (k4a) ge2Var.a;
        long j4 = e52Var.a;
        if (k4aVar.o(j4)) {
            return k4a.v(k4aVar, new rd2(((p7b) k4aVar.y()).a.o(), j4, j, j2, j3, i2, i, set));
        }
        return 0L;
    }

    public final boolean b(boolean z) {
        int i = ((p7b) this.d).c.g.getInt("app.media.load.gif", 0);
        return z ? c(i) : i != -1;
    }

    public final boolean c(int i) {
        gh3 gh3Var = this.e;
        boolean zG = gh3Var.g();
        zh3 zh3VarB = gh3Var.b();
        if (i != -1) {
            return i != 0 ? zh3VarB == zh3.c : zh3VarB == zh3.c || ((p7b) this.d).c.n() || !zG;
        }
        return false;
    }

    public final boolean d() {
        return c(((p7b) this.d).c.g.getInt("app.media.load.photo", 0));
    }

    public final boolean e(boolean z) {
        int i = ((p7b) this.d).c.g.getInt("app.media.load.stickers", 0);
        return z ? c(i) : i != -1;
    }
}
