package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class xqb extends mue {
    public static final xqb g;
    public static final Object h;
    public final zw6 e;
    public final wqb f;

    static {
        ls5 ls5Var = zw6.b;
        g = new xqb(ffc.X, null);
        h = new Object();
    }

    public xqb(zw6 zw6Var, wqb wqbVar) {
        this.e = zw6Var;
        this.f = wqbVar;
    }

    @Override // defpackage.mue
    public final int b(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.mue
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqb)) {
            return false;
        }
        xqb xqbVar = (xqb) obj;
        return f46.B(this.e, xqbVar.e) && f46.B(this.f, xqbVar.f);
    }

    @Override // defpackage.mue
    public final hue g(int i, hue hueVar, boolean z) {
        wqb wqbVarV = v(i);
        Long lValueOf = Long.valueOf(wqbVarV.b);
        long jS = oaf.S(wqbVarV.c);
        hueVar.getClass();
        hueVar.j(lValueOf, null, i, jS, 0L, s8.g, false);
        return hueVar;
    }

    @Override // defpackage.mue
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.e, this.f});
    }

    @Override // defpackage.mue
    public final int i() {
        return p();
    }

    @Override // defpackage.mue
    public final Object m(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.mue
    public final kue n(int i, kue kueVar, long j) {
        wqb wqbVarV = v(i);
        kueVar.b(h, wqbVarV.a, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, true, false, null, 0L, oaf.S(wqbVarV.c), i, i, 0L);
        return kueVar;
    }

    @Override // defpackage.mue
    public final int p() {
        return this.e.size() + (this.f == null ? 0 : 1);
    }

    public final boolean r(tb8 tb8Var) {
        wqb wqbVar = this.f;
        if (wqbVar != null && tb8Var.equals(wqbVar.a)) {
            return true;
        }
        int i = 0;
        while (true) {
            zw6 zw6Var = this.e;
            if (i >= zw6Var.size()) {
                return false;
            }
            if (tb8Var.equals(((wqb) zw6Var.get(i)).a)) {
                return true;
            }
            i++;
        }
    }

    public final xqb s(int i, tb8 tb8Var, long j) {
        zw6 zw6Var = this.e;
        int size = zw6Var.size();
        wqb wqbVar = this.f;
        fm9.f(i < size || (i == zw6Var.size() && wqbVar != null));
        if (i == zw6Var.size()) {
            return new xqb(zw6Var, new wqb(tb8Var, -1L, j));
        }
        long j2 = ((wqb) zw6Var.get(i)).b;
        ww6 ww6Var = new ww6();
        ww6Var.f(zw6Var.subList(0, i));
        ww6Var.d(new wqb(tb8Var, j2, j));
        ww6Var.f(zw6Var.subList(i + 1, zw6Var.size()));
        return new xqb(ww6Var.j(), wqbVar);
    }

    public final xqb t(int i, List list) {
        ww6 ww6Var = new ww6(4);
        zw6 zw6Var = this.e;
        ww6Var.e(zw6Var.subList(0, i));
        for (int i2 = 0; i2 < list.size(); i2++) {
            ww6Var.a(new wqb((tb8) list.get(i2), -1L, -9223372036854775807L));
        }
        ww6Var.e(zw6Var.subList(i, zw6Var.size()));
        return new xqb(ww6Var.j(), this.f);
    }

    public final long u(int i) {
        if (i >= 0) {
            zw6 zw6Var = this.e;
            if (i < zw6Var.size()) {
                return ((wqb) zw6Var.get(i)).b;
            }
        }
        return -1L;
    }

    public final wqb v(int i) {
        wqb wqbVar;
        zw6 zw6Var = this.e;
        return (i != zw6Var.size() || (wqbVar = this.f) == null) ? (wqb) zw6Var.get(i) : wqbVar;
    }
}
