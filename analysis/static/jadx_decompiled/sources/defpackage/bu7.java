package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bu7 extends ffe implements a66 {
    public final /* synthetic */ cu7 X;
    public final /* synthetic */ mec Y;
    public final /* synthetic */ fs8 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu7(cu7 cu7Var, mec mecVar, fs8 fs8Var, Continuation continuation) {
        super(2, continuation);
        this.X = cu7Var;
        this.Y = mecVar;
        this.Z = fs8Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        bu7 bu7Var = (bu7) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        bu7Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new bu7(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        cu7 cu7Var = this.X;
        ((au8) cu7Var.j.getValue()).w((cu8) this.Y.a, iz7.g(this.Z.s0, (vxc) cu7Var.r.getValue()));
        return e5f.a;
    }
}
