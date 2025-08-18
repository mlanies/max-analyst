package defpackage;

import android.net.Uri;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* loaded from: classes.dex */
public final class io2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        io2 io2Var = (io2) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        io2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        io2 io2Var = new io2(continuation, this.Y);
        io2Var.X = obj;
        return io2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        kz8 kz8Var = (kz8) this.X;
        bc7[] bc7VarArr = ChatScreen.k1;
        ChatScreen chatScreen = this.Y;
        chatScreen.getClass();
        if (kz8Var instanceof gz8) {
            chatScreen.P0().s();
            rq2 rq2VarP0 = chatScreen.P0();
            cz5 cz5Var = ((gz8) kz8Var).a;
            e52 e52Var = (e52) rq2VarP0.Y0.a.getValue();
            if (e52Var != null) {
                pnf.n(rq2VarP0, ((w9a) rq2VarP0.u()).b(), null, new lp2(e52Var.a, rq2VarP0, cz5Var, null), 2);
            }
        } else if (kz8Var instanceof hz8) {
            rq2 rq2VarP02 = chatScreen.P0();
            Uri uri = ((hz8) kz8Var).a;
            Long lW = chatScreen.F0().w();
            rq2VarP02.C(j47.S(rq2VarP02.a, ((w9a) rq2VarP02.u()).b(), vx3.b, new yp2(rq2VarP02, uri, lW, null)));
        } else if (kz8Var instanceof iz8) {
            ((iz8) kz8Var).getClass();
            chatScreen.S0(true);
        } else if (tpa.f(kz8Var, jz8.a)) {
            chatScreen.T0();
        } else {
            if (!(kz8Var instanceof fz8)) {
                throw new NoWhenBranchMatchedException();
            }
            rq2 rq2VarP03 = chatScreen.P0();
            CharSequence charSequence = ((fz8) kz8Var).a;
            Long lU = chatScreen.F0().u();
            bc7[] bc7VarArr2 = rq2.f1;
            rq2VarP03.t(charSequence, lU, null, false);
            xz8.C(chatScreen.F0(), null, null, null, 14);
        }
        return e5f.a;
    }
}
