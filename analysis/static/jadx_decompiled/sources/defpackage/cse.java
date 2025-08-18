package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class cse implements m66 {
    public final /* synthetic */ lse a;

    public cse(lse lseVar) {
        this.a = lseVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof cse) && (obj instanceof m66)) {
            return tpa.f(getFunctionDelegate(), ((m66) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.m66
    public final f66 getFunctionDelegate() {
        return new v8(1, 8, lse.class, this.a, "onNewTheme", "onNewTheme(Ljava/lang/String;)Lkotlinx/coroutines/Job;");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
