package defpackage;

import java.util.AbstractMap;

/* loaded from: classes.dex */
public final class lx6 extends zw6 {
    public final /* synthetic */ mx6 c;

    public lx6(mx6 mx6Var) {
        this.c = mx6Var;
    }

    @Override // defpackage.qw6
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        mx6 mx6Var = this.c;
        return new AbstractMap.SimpleImmutableEntry(mx6Var.o.X.a().get(i), mx6Var.o.Y.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.o.Y.size();
    }
}
