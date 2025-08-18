package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* loaded from: classes.dex */
public final class x58 extends ffe implements a66 {
    public final /* synthetic */ MediaBarWidget X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x58(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.X = mediaBarWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        x58 x58Var = (x58) n(bool, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        x58Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new x58(continuation, this.X);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        bc7[] bc7VarArr = MediaBarWidget.d1;
        br7.d(this.X.r0(), MediaBarWidget.e1, null);
        return e5f.a;
    }
}
