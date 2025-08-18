package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* loaded from: classes.dex */
public final class c68 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaBarWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c68(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.Y = mediaBarWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        c68 c68Var = (c68) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        c68Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        c68 c68Var = new c68(continuation, this.Y);
        c68Var.X = obj;
        return c68Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        n00 n00Var = (n00) this.X;
        bc7[] bc7VarArr = MediaBarWidget.d1;
        this.Y.E0(n00Var);
        return e5f.a;
    }
}
