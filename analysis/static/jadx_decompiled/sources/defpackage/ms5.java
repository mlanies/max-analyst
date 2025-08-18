package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class ms5 extends ns5 {
    public final /* synthetic */ Iterable[] a;

    public ms5(Iterable[] iterableArr) {
        this.a = iterableArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ls5 ls5Var = new ls5(this, this.a.length);
        n77 n77Var = new n77();
        n77Var.b = m77.X;
        n77Var.c = ls5Var;
        return n77Var;
    }
}
