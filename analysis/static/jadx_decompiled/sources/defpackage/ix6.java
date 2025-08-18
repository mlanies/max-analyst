package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class ix6 extends pw6 {
    @Override // defpackage.pw6
    public final /* bridge */ /* synthetic */ pw6 c(Object obj) {
        j(obj);
        return this;
    }

    public final void j(Object obj) {
        obj.getClass();
        a(obj);
    }

    public final void k(Iterable iterable) {
        iterable.getClass();
        e(iterable);
    }

    public final jx6 l() {
        int i = this.b;
        if (i == 0) {
            int i2 = jx6.c;
            return lfc.u0;
        }
        if (i != 1) {
            jx6 jx6VarI = jx6.i(i, this.c);
            this.b = jx6VarI.size();
            this.a = true;
            return jx6VarI;
        }
        Object obj = this.c[0];
        Objects.requireNonNull(obj);
        int i3 = jx6.c;
        return new jsd(obj);
    }
}
