package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.startconversation.channel.PickSubscribersScreen;

/* loaded from: classes2.dex */
public final class gxa extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickSubscribersScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxa(PickSubscribersScreen pickSubscribersScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = pickSubscribersScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        gxa gxaVar = (gxa) n((Set) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        gxaVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        gxa gxaVar = new gxa(this.Y, continuation);
        gxaVar.X = obj;
        return gxaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        long[] jArrE0 = x53.E0((Set) this.X);
        bc7[] bc7VarArr = PickSubscribersScreen.z0;
        PickSubscribersScreen pickSubscribersScreen = this.Y;
        pickSubscribersScreen.getClass();
        bc7 bc7Var = PickSubscribersScreen.z0[0];
        pickSubscribersScreen.t0.b(pickSubscribersScreen, jArrE0);
        return e5f.a;
    }
}
