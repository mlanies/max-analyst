package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final /* synthetic */ class t72 implements c7b, lde {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t72(p82 p82Var, boolean z, boolean z2) {
        this.c = p82Var;
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.lde
    public Object get() {
        return are.g((Context) this.c, this.a, this.b);
    }

    @Override // defpackage.c7b
    public boolean test(Object obj) {
        e52 e52Var = (e52) obj;
        p82 p82Var = (p82) this.c;
        p82Var.getClass();
        int i = e52Var.b.m;
        boolean z = this.a;
        return (i > 0 || (z && e52Var.i0())) && (this.b || !e52Var.V(((p7b) p82Var.n).a) || e52Var.A()) && !e52Var.F() && ((e52Var.e0() && e52Var.h0()) || (z && e52Var.i0()));
    }

    public /* synthetic */ t72(Context context, boolean z) {
        this.c = context;
        this.a = z;
        this.b = true;
    }
}
