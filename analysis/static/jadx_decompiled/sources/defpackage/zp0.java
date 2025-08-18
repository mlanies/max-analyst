package defpackage;

/* loaded from: classes.dex */
public final class zp0 implements cc7 {
    public static final zp0 a = new zp0();
    public static final y8b b = new y8b("kotlin.Boolean", w8b.e);

    @Override // defpackage.cc7
    public final Object a(x8 x8Var) {
        return Boolean.valueOf(x8Var.n());
    }

    @Override // defpackage.cc7
    public final void b(xu3 xu3Var, Object obj) {
        xu3Var.d(((Boolean) obj).booleanValue());
    }

    @Override // defpackage.cc7
    public final r6d d() {
        return b;
    }
}
