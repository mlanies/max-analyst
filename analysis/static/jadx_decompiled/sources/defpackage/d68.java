package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* loaded from: classes.dex */
public final class d68 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaBarWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d68(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.Y = mediaBarWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        d68 d68Var = (d68) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        d68Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        d68 d68Var = new d68(continuation, this.Y);
        d68Var.X = obj;
        return d68Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        i5d i5dVar = (i5d) this.X;
        bc7[] bc7VarArr = MediaBarWidget.d1;
        this.Y.D0(i5dVar);
        return e5f.a;
    }
}
