package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* loaded from: classes.dex */
public final class ln2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ln2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ln2(continuation, this.Y);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            ChatScreen chatScreen = this.Y;
            if (chatScreen.getView() == null) {
                return e5fVar;
            }
            mn5 mn5VarX = od2.x(new j31(chatScreen.J0().Y, chatScreen.P0().d1, new c3(chatScreen, null, 6), 4));
            kn2 kn2Var = new kn2(null, chatScreen);
            this.X = 1;
            Object objD = mn5VarX.d(new yn5(gr9.a, kn2Var, 4), this);
            if (objD != tx3Var) {
                objD = e5fVar;
            }
            if (objD != tx3Var) {
                objD = e5fVar;
            }
            if (objD == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5fVar;
    }
}
