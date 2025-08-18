package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class d83 {
    public final av0 a;
    public final kke b;
    public final kld c = lld.b(0, 0, 0, 7);
    public final je7 d;
    public final ContextScope e;

    public d83(av0 av0Var, kke kkeVar, je7 je7Var) {
        this.a = av0Var;
        this.b = kkeVar;
        this.d = je7Var;
        this.e = j1e.a(((w9a) kkeVar).a());
        av0Var.d(this);
    }

    public final void a(y73 y73Var) {
        j47.T(this.e, null, null, new z73(this, y73Var, null), 3);
    }

    @uae
    public final void onAddChatEvent(i9 i9Var) {
        a(new w73(i9Var.b));
    }

    @uae
    public final void onChatMembersUpdateEvent(tk2 tk2Var) {
        int iS = au1.s(tk2Var.X);
        long j = tk2Var.o;
        if (iS == 0) {
            a(new w73(j));
        } else {
            if (iS != 1) {
                throw new NoWhenBranchMatchedException();
            }
            a(new x73(j));
        }
    }

    @uae
    public final void onIncomingMessageEvent(kz6 kz6Var) {
        if (kz6Var.Y) {
            j47.T(this.e, null, null, new c83(this, kz6Var, null), 3);
        }
    }

    @uae
    public final void onLeaveChatEvent(ue7 ue7Var) {
        a(new x73(ue7Var.b));
    }

    @uae
    public final void onRemoveChatEvent(xfc xfcVar) {
        a(new x73(xfcVar.b));
    }
}
