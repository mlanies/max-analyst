package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class lgb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ vgb Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lgb(vgb vgbVar, Continuation continuation) {
        super(2, continuation);
        this.Y = vgbVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        lgb lgbVar = (lgb) n((fv4) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        lgbVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        lgb lgbVar = new lgb(this.Y, continuation);
        lgbVar.X = obj;
        return lgbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        fv4 fv4Var = (fv4) this.X;
        vgb vgbVar = this.Y;
        vgbVar.u0.setValue(fv4Var.a);
        vgbVar.s0.setValue(fv4Var.b);
        return e5f.a;
    }
}
