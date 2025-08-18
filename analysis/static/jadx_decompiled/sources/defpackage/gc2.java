package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class gc2 {
    public final kld a = lld.b(0, 0, 0, 7);
    public final ContextScope b;

    public gc2(av0 av0Var, kke kkeVar) {
        this.b = j1e.a(((w9a) kkeVar).c());
        av0Var.d(this);
    }

    @uae
    public final void onEvent(ec2 ec2Var) {
        j47.T(this.b, null, null, new fc2(this, ec2Var, null), 3);
    }
}
