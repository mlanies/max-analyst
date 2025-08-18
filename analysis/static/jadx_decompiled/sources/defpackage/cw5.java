package defpackage;

import kotlin.coroutines.Continuation;
import one.me.folders.list.FoldersListScreen;

/* loaded from: classes.dex */
public final class cw5 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ FoldersListScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw5(Continuation continuation, FoldersListScreen foldersListScreen) {
        super(2, continuation);
        this.Y = foldersListScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        cw5 cw5Var = (cw5) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        cw5Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        cw5 cw5Var = new cw5(continuation, this.Y);
        cw5Var.X = obj;
        return cw5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wm9 wm9Var = (wm9) this.X;
        if (wm9Var instanceof c64) {
            bv5.c.R1((c64) wm9Var);
        }
        return e5f.a;
    }
}
