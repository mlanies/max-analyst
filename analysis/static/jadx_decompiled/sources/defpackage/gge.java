package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class gge extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ige Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gge(ige igeVar, Continuation continuation) {
        super(2, continuation);
        this.Y = igeVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((gge) n((iy8) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        gge ggeVar = new gge(this.Y, continuation);
        ggeVar.X = obj;
        return ggeVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        iy8 iy8Var = (iy8) this.X;
        int i = iy8Var.d;
        return (i == 2 || i == 9) ? c37.c(((kw3) this.Y.d.getValue()).a(iy8Var)) : new qn5(3, iy8Var);
    }
}
