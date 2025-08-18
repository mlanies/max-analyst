package defpackage;

import java.util.Collections;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class ft8 implements m56 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ xs8 b;
    public final /* synthetic */ ht8 c;

    public /* synthetic */ ft8(xs8 xs8Var, ht8 ht8Var) {
        this.b = xs8Var;
        this.c = ht8Var;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        xx6 xx6Var;
        c6c c6cVar;
        e5f e5fVar = e5f.a;
        xs8 xs8Var = this.b;
        ht8 ht8Var = this.c;
        switch (this.a) {
            case 0:
                ht8Var.K(xs8Var, (String) obj);
                break;
            default:
                v5c v5cVar = (v5c) obj;
                long j = ht8Var.J0;
                bc7[] bc7VarArr = MessagesListWidget.X0;
                MessagesListWidget messagesListWidget = ((b69) xs8Var).a;
                MessageModel messageModelD = ((l29) messagesListWidget.x0().p1.getValue()).d(j);
                v5c v5cVar2 = null;
                g7c g7cVar = messageModelD == null ? null : new g7c(v5cVar, messageModelD.a, messageModelD.b, messageModelD.B0);
                if (g7cVar != null) {
                    messagesListWidget.t0().q().l(g7cVar);
                    ix8 ix8Var = g7cVar.d;
                    if (ix8Var != null && (c6cVar = ix8Var.c) != null) {
                        v5cVar2 = c6cVar.b;
                    }
                    if (!tpa.f(v5cVar2, v5cVar) && (xx6Var = (xx6) o19.a.getAccessor().e()) != null) {
                        xx6Var.f(Collections.singleton(new wx6(ux6.X, 1)), wuc.CHAT);
                        break;
                    }
                }
                break;
        }
        return e5fVar;
    }

    public /* synthetic */ ft8(ht8 ht8Var, xs8 xs8Var) {
        this.c = ht8Var;
        this.b = xs8Var;
    }
}
