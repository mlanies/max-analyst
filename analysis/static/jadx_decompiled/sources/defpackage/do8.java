package defpackage;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class do8 {
    public final kld a = lld.b(0, 0, 0, 7);
    public final ContextScope b;

    public do8(av0 av0Var, kke kkeVar) {
        this.b = j1e.a(((w9a) kkeVar).a());
        av0Var.d(this);
    }

    @uae
    public final void onChatMembersUpdateEvent(tk2 tk2Var) {
        yn8 vn8Var;
        int iS = au1.s(tk2Var.X);
        List list = tk2Var.b;
        ek2 ek2Var = tk2Var.c;
        long j = tk2Var.o;
        if (iS == 0) {
            vn8Var = new vn8(j, ek2Var, list);
        } else {
            if (iS != 1) {
                throw new NoWhenBranchMatchedException();
            }
            vn8Var = new xn8(j, ek2Var, list);
        }
        j47.T(this.b, null, null, new ao8(this, vn8Var, null), 3);
    }

    @uae
    public final void onEvent(ps3 ps3Var) {
        j47.T(this.b, null, null, new bo8(this, ps3Var, null), 3);
    }
}
