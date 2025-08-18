package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class h54 extends j54 {
    public final knb j;
    public final ey1 k;

    public h54(k54 k54Var, fi0 fi0Var, eab eabVar, knb knbVar, ey1 ey1Var, boolean z, int i) {
        super(k54Var, fi0Var, eabVar, z, i);
        this.j = knbVar;
        this.k = ey1Var;
        this.h = 0;
    }

    @Override // defpackage.j54
    public final int n(g05 g05Var) {
        return this.j.f;
    }

    @Override // defpackage.j54
    public final hx6 o() {
        int i = this.j.e;
        ((rq9) this.k.b).getClass();
        boolean z = i >= 0;
        hx6 hx6Var = new hx6();
        hx6Var.a = i;
        hx6Var.b = z;
        hx6Var.c = false;
        return hx6Var;
    }

    @Override // defpackage.j54
    public final synchronized boolean u(g05 g05Var, int i) {
        int iIntValue;
        if (g05Var == null) {
            return false;
        }
        try {
            boolean zE = this.g.e(g05Var, i);
            if (fi0.b(i) || fi0.l(i, 8)) {
                if (!fi0.l(i, 4) && g05.m0(g05Var)) {
                    g05Var.o0();
                    if (g05Var.c == qb4.a) {
                        if (!this.j.b(g05Var)) {
                            return false;
                        }
                        int i2 = this.j.e;
                        int i3 = this.h;
                        if (i2 <= i3) {
                            return false;
                        }
                        ((rq9) this.k.b).getClass();
                        List list = Collections.EMPTY_LIST;
                        if (list != null && !list.isEmpty()) {
                            int i4 = 0;
                            while (true) {
                                if (i4 >= list.size()) {
                                    iIntValue = Integer.MAX_VALUE;
                                    break;
                                }
                                if (((Integer) list.get(i4)).intValue() > i3) {
                                    iIntValue = ((Integer) list.get(i4)).intValue();
                                    break;
                                }
                                i4++;
                            }
                        } else {
                            iIntValue = i3 + 1;
                        }
                        if (i2 < iIntValue && !this.j.g) {
                            return false;
                        }
                        this.h = i2;
                    }
                }
            }
            return zE;
        } catch (Throwable th) {
            throw th;
        }
    }
}
