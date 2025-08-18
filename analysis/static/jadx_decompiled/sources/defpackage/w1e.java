package defpackage;

/* loaded from: classes2.dex */
public final class w1e implements tg1 {
    public final q0e a;
    public final w7c b;
    public final je7 c;

    public w1e() {
        q0e q0eVarA = r0e.a(v1e.a);
        this.a = q0eVarA;
        this.b = new w7c(q0eVarA);
        this.c = l1e.a.getAccessor().d(bt1.class);
    }

    public final void a(String str, boolean z) {
        bt1 bt1Var = (bt1) this.c.getValue();
        long j = z ? 1L : 0L;
        bt1Var.getClass();
        bt1.c(bt1Var, "PIP_ENABLED", str, null, Long.valueOf(j), null, null, false, 116);
    }
}
