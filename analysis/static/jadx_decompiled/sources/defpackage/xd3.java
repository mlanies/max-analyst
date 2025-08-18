package defpackage;

import java.util.Iterator;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public final class xd3 extends t2 {
    public final a66 a;
    public final /* synthetic */ yd3 b;

    public xd3(yd3 yd3Var, a66 a66Var) {
        this.b = yd3Var;
        this.a = a66Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Symbol symbol = zd3.a;
        throw new UnsupportedOperationException("not implemented");
    }

    @Override // defpackage.t2
    public final int getSize() {
        return this.b.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        vd3 vd3Var = (vd3) yd3.c.get(this.b);
        vd3Var.getClass();
        return new ud3(vd3Var, this.a);
    }
}
