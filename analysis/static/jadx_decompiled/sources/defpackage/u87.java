package defpackage;

/* loaded from: classes.dex */
public final class u87 extends k87 {
    public final /* synthetic */ int b;
    public final z3d c;
    public final /* synthetic */ z87 o;

    public /* synthetic */ u87(z87 z87Var, z3d z3dVar, int i) {
        this.b = i;
        this.o = z87Var;
        this.c = z3dVar;
    }

    @Override // defpackage.k87
    public final boolean c() {
        switch (this.b) {
        }
        return false;
    }

    @Override // defpackage.k87
    public final void d(Throwable th) {
        switch (this.b) {
            case 0:
                z87 z87Var = this.o;
                Object state$kotlinx_coroutines_core = z87Var.getState$kotlinx_coroutines_core();
                if (!(state$kotlinx_coroutines_core instanceof lb3)) {
                    state$kotlinx_coroutines_core = a97.a(state$kotlinx_coroutines_core);
                }
                ((y3d) this.c).g(z87Var, state$kotlinx_coroutines_core);
                break;
            default:
                ((y3d) this.c).g(this.o, e5f.a);
                break;
        }
    }
}
