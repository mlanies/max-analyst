package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class um2 extends ffe implements a66 {
    public final /* synthetic */ cn2 X;
    public final /* synthetic */ e52 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public um2(cn2 cn2Var, e52 e52Var, Continuation continuation) {
        super(2, continuation);
        this.X = cn2Var;
        this.Y = e52Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        um2 um2Var = (um2) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        um2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new um2(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        cn2 cn2Var = this.X;
        cn2Var.getClass();
        e52 e52Var = this.Y;
        if (e52Var.I()) {
            k92 k92Var = e52Var.b;
            if (k92Var.g()) {
                ((k4a) ((pk) cn2Var.p.getValue())).j(k92Var.a);
            }
        }
        return e5f.a;
    }
}
