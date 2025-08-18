package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.startconversation.channel.PickSubscribersScreen;

/* loaded from: classes2.dex */
public final class jxa extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickSubscribersScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jxa(PickSubscribersScreen pickSubscribersScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = pickSubscribersScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        jxa jxaVar = (jxa) n((twa) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        jxaVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        jxa jxaVar = new jxa(this.Y, continuation);
        jxaVar.X = obj;
        return jxaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        twa twaVar = (twa) this.X;
        boolean z = twaVar instanceof swa;
        PickSubscribersScreen pickSubscribersScreen = this.Y;
        if (z) {
            bc7[] bc7VarArr = PickSubscribersScreen.z0;
            pickSubscribersScreen.x0().setProgressEnabled(false);
            syd.c.b2(new wz7(pickSubscribersScreen, twaVar, 16));
        } else {
            if (!tpa.f(twaVar, rwa.a)) {
                throw new NoWhenBranchMatchedException();
            }
            bc7[] bc7VarArr2 = PickSubscribersScreen.z0;
            pickSubscribersScreen.x0().setProgressEnabled(false);
            syd.c.b2(new fxa(pickSubscribersScreen, 1));
            wha whaVar = new wha(pickSubscribersScreen);
            whaVar.g(new eqe(aja.a));
            whaVar.e(new kia(woc.u1));
            whaVar.i();
        }
        return e5f.a;
    }
}
