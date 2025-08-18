package defpackage;

import kotlin.coroutines.Continuation;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* loaded from: classes2.dex */
public final class lp9 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ NeuroAvatarsScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp9(Continuation continuation, NeuroAvatarsScreen neuroAvatarsScreen) {
        super(2, continuation);
        this.Y = neuroAvatarsScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        lp9 lp9Var = (lp9) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        lp9Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        lp9 lp9Var = new lp9(continuation, this.Y);
        lp9Var.X = obj;
        return lp9Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wm9 wm9Var = (wm9) this.X;
        boolean z = wm9Var instanceof wo9;
        e5f e5fVar = e5f.a;
        if (z) {
            ((ita) lt7.a.getAccessor().c(ita.class)).c();
            du7 du7Var = du7.c;
            du7Var.getClass();
            du7Var.P1().b(":chat-list", null);
        } else if (wm9Var instanceof c64) {
            du7.c.R1((c64) wm9Var);
        } else if (wm9Var instanceof g43) {
            this.Y.getRouter().C();
        }
        return e5fVar;
    }
}
