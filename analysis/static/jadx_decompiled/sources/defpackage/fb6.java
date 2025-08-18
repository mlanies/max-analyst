package defpackage;

/* loaded from: classes2.dex */
public final class fb6 {
    public volatile long a;
    public volatile long b;
    public final /* synthetic */ gb6 c;

    public fb6(gb6 gb6Var) {
        this.c = gb6Var;
    }

    @uae
    public final void onEvent(mc2 mc2Var) {
        if (mc2Var.a != this.b) {
            return;
        }
        hm9.n("gb6", "onEvent " + mc2Var);
        this.c.d.makeCompleting$kotlinx_coroutines_core(this.c.c.z(this.a));
    }
}
