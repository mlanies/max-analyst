package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class o7d implements m66 {
    public final /* synthetic */ oo6 a;

    public o7d(oo6 oo6Var) {
        this.a = oo6Var;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o7d) && (obj instanceof m66)) {
            return tpa.f(getFunctionDelegate(), ((m66) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.m66
    public final f66 getFunctionDelegate() {
        return new v8(1, 8, oo6.class, this.a, "onNewHost", "onNewHost(Ljava/lang/String;)Lkotlinx/coroutines/Job;");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
