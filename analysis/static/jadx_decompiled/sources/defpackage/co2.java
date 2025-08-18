package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* loaded from: classes.dex */
public final class co2 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ChatScreen Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Z = chatScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((co2) n(obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        co2 co2Var = new co2(continuation, this.Z);
        co2Var.Y = obj;
        return co2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            j92 j92Var = (j92) this.Y;
            bc7[] bc7VarArr = ChatScreen.k1;
            ChatScreen chatScreen = this.Z;
            yce yceVar = (yce) chatScreen.G0.getValue();
            Context context = chatScreen.getContext();
            this.X = 1;
            Object objT0 = j47.t0(((w9a) ((kke) yceVar.Y.getValue())).a(), new vce(j92Var, yceVar, context, null), this);
            if (objT0 != tx3Var) {
                objT0 = e5fVar;
            }
            if (objT0 == tx3Var) {
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
