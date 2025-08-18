package defpackage;

import kotlin.coroutines.Continuation;
import one.me.android.MainActivity;
import one.me.android.join.JoinChatWidget;

/* loaded from: classes.dex */
public final class d97 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ JoinChatWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d97(JoinChatWidget joinChatWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = joinChatWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        d97 d97Var = (d97) n((j97) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        d97Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        d97 d97Var = new d97(this.Y, continuation);
        d97Var.X = obj;
        return d97Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        j97 j97Var = (j97) this.X;
        bc7[] bc7VarArr = JoinChatWidget.x0;
        JoinChatWidget joinChatWidget = this.Y;
        if (joinChatWidget.requireActivity() instanceof nmc) {
            joinChatWidget.getRouter().C();
            i97 i97Var = i97.c;
            long jLongValue = ((Number) j97Var.a).longValue();
            f64 f64VarP1 = i97Var.P1();
            y7g y7gVar = new y7g(13);
            y7gVar.b = ":chats";
            y7gVar.D(Long.valueOf(jLongValue), "id");
            y7gVar.D("local", "type");
            f64VarP1.c(y7gVar.r(), null);
        } else {
            int i = MainActivity.a1;
            hx9.t(joinChatWidget.requireActivity(), gy2.Z1(gy2.c, ((Number) j97Var.a).longValue(), "local", null, null, null, null, null, false, 508), null, null, 12);
        }
        joinChatWidget.s0(false);
        return e5f.a;
    }
}
