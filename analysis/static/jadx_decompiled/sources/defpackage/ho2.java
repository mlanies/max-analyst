package defpackage;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes.dex */
public final class ho2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ho2 ho2Var = (ho2) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ho2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ho2 ho2Var = new ho2(continuation, this.Y);
        ho2Var.X = obj;
        return ho2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        MessageWriteWidget messageWriteWidgetG0;
        View view;
        od2.a0(obj);
        f39 f39Var = (f39) this.X;
        boolean z = f39Var instanceof e39;
        ChatScreen chatScreen = this.Y;
        if (z) {
            bc7[] bc7VarArr = ChatScreen.k1;
            Long lW = chatScreen.F0().w();
            e39 e39Var = (e39) f39Var;
            long j = e39Var.a;
            if (lW != null && lW.longValue() == j && (messageWriteWidgetG0 = chatScreen.G0()) != null && (view = messageWriteWidgetG0.getView()) != null) {
                view.requestFocus();
            }
            chatScreen.F0().D(new Long(e39Var.a));
        } else if (f39Var instanceof d39) {
            bc7[] bc7VarArr2 = ChatScreen.k1;
            xz8 xz8VarF0 = chatScreen.F0();
            Long l = new Long(((d39) f39Var).a);
            MessageWriteWidget messageWriteWidgetG02 = chatScreen.G0();
            CharSequence text = messageWriteWidgetG02 != null ? messageWriteWidgetG02.q0().getText() : null;
            MessageWriteWidget messageWriteWidgetG03 = chatScreen.G0();
            xz8.C(xz8VarF0, l, text, messageWriteWidgetG03 != null ? new Integer(messageWriteWidgetG03.q0().getCursorPosition()) : null, 8);
        } else if (f39Var instanceof b39) {
            bc7[] bc7VarArr3 = ChatScreen.k1;
            if (chatScreen.K0().getState() == cha.c || chatScreen.K0().getState() == cha.o) {
                chatScreen.K0().b();
            }
        } else {
            if (!(f39Var instanceof c39)) {
                throw new NoWhenBranchMatchedException();
            }
            bc7[] bc7VarArr4 = ChatScreen.k1;
            rq2 rq2VarP0 = chatScreen.P0();
            String str = ((c39) f39Var).a;
            Long lW2 = chatScreen.F0().w();
            zy8 zy8VarV = chatScreen.F0().v();
            e52 e52Var = (e52) rq2VarP0.Y0.a.getValue();
            if (e52Var != null) {
                rq2VarP0.Q0.o1(rq2VarP0, rq2.f1[5], j47.S(rq2VarP0.a, ((w9a) rq2VarP0.u()).b(), vx3.b, new vp2(str, e52Var, rq2VarP0, lW2, zy8VarV, null)));
            }
        }
        return e5f.a;
    }
}
