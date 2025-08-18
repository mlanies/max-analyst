package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* loaded from: classes2.dex */
public final class cp9 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ NeuroAvatarsScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp9(Continuation continuation, NeuroAvatarsScreen neuroAvatarsScreen) {
        super(2, continuation);
        this.Y = neuroAvatarsScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        cp9 cp9Var = (cp9) n((List) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        cp9Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        cp9 cp9Var = new cp9(continuation, this.Y);
        cp9Var.X = obj;
        return cp9Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.Y.I0.E((List) this.X);
        return e5f.a;
    }
}
