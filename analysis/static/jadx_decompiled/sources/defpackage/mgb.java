package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mgb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ vgb Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mgb(vgb vgbVar, Continuation continuation) {
        super(2, continuation);
        this.Y = vgbVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        mgb mgbVar = (mgb) n((wm9) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        mgbVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        mgb mgbVar = new mgb(this.Y, continuation);
        mgbVar.X = obj;
        return mgbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        pnf.o(this.Y.w0, (wm9) this.X);
        return e5f.a;
    }
}
