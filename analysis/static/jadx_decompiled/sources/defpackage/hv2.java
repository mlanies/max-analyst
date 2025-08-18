package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chats.search.ChatsListSearchScreen;

/* loaded from: classes.dex */
public final class hv2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsListSearchScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv2(Continuation continuation, ChatsListSearchScreen chatsListSearchScreen) {
        super(2, continuation);
        this.Y = chatsListSearchScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        hv2 hv2Var = (hv2) n((wm9) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        hv2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        hv2 hv2Var = new hv2(continuation, this.Y);
        hv2Var.X = obj;
        return hv2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wm9 wm9Var = (wm9) this.X;
        mr0.G(this.Y);
        if (wm9Var instanceof vla) {
            gy2 gy2Var = gy2.c;
            long jLongValue = ((Number) ((vla) wm9Var).a).longValue();
            gy2Var.P1().b(":settings/folder/by-chat?id=" + jLongValue, null);
        } else if (wm9Var instanceof yc9) {
            gy2.c.P1().b(ey8.i(((Number) ((yc9) wm9Var).a).longValue(), ":profile/change-owner?chat_id=", "&leave_chat=true"), null);
        } else if (wm9Var instanceof c64) {
            gy2.c.R1((c64) wm9Var);
        }
        return e5f.a;
    }
}
