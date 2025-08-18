package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class rn1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ el1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn1(el1 el1Var, Continuation continuation) {
        super(2, continuation);
        this.Y = el1Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        rn1 rn1Var = (rn1) n((dxe) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        rn1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        rn1 rn1Var = new rn1(this.Y, continuation);
        rn1Var.X = obj;
        return rn1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        hm9.n(this.Y.getClass().getName(), ((dxe) this.X).toString());
        return e5f.a;
    }
}
