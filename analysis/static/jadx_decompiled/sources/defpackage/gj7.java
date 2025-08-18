package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class gj7 extends ffe implements a66 {
    public final /* synthetic */ long X;
    public final /* synthetic */ vj7 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ long s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj7(long j, vj7 vj7Var, long j2, long j3, Continuation continuation) {
        super(2, continuation);
        this.X = j;
        this.Y = vj7Var;
        this.Z = j2;
        this.s0 = j3;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((gj7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new gj7(this.X, this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        long j = this.X;
        vj7 vj7Var = this.Y;
        long j2 = this.Z;
        if (j > 0) {
            return ((au8) vj7Var.c.getValue()).q(j2);
        }
        if (j2 > 0) {
            return ((au8) vj7Var.c.getValue()).j(this.s0, j2);
        }
        return null;
    }
}
