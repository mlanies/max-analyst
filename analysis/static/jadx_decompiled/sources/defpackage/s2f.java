package defpackage;

/* loaded from: classes2.dex */
public final class s2f extends u2f {
    public boolean b;
    public final /* synthetic */ jj5 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2f(jj5 jj5Var, Object obj) {
        super(obj);
        this.c = jj5Var;
        c6d c6dVar = jj5Var.X;
    }

    @Override // defpackage.u2f
    public final Object a() {
        boolean z = this.b;
        jj5 jj5Var = this.c;
        Object obj = this.a;
        if (z) {
            m56 m56Var = ((v2f) jj5Var.X).e;
            if (m56Var == null) {
                return null;
            }
            m56Var.invoke(obj);
            return null;
        }
        this.b = true;
        m56 m56Var2 = ((v2f) jj5Var.X).d;
        if (m56Var2 != null) {
        }
        return obj;
    }
}
