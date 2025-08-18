package defpackage;

import kotlin.coroutines.Continuation;
import one.me.startconversation.StartConversationScreen;

/* loaded from: classes2.dex */
public final class azd extends ffe implements a66 {
    public int X;
    public final /* synthetic */ StartConversationScreen Y;
    public final /* synthetic */ rd6 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azd(StartConversationScreen startConversationScreen, rd6 rd6Var, Continuation continuation) {
        super(2, continuation);
        this.Y = startConversationScreen;
        this.Z = rd6Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((azd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new azd(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        rd6 rd6Var = this.Z;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7VarArr = StartConversationScreen.I0;
            jzd jzdVarN0 = this.Y.n0();
            wm3 wm3Var = rd6Var.Y;
            this.X = 1;
            Object objT0 = j47.t0(((w9a) ((kke) jzdVarN0.o.getValue())).b(), new fzd(jzdVarN0, wm3Var, null), this);
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
        syd sydVar = syd.c;
        long j = rd6Var.a;
        sydVar.getClass();
        sydVar.P1().b(":profile?id=" + j + "&type=contact", null);
        return e5fVar;
    }
}
