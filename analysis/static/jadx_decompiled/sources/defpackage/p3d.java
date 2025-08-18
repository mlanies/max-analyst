package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class p3d extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mn5 Z;
    public final /* synthetic */ q3d s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3d(m3d m3dVar, Continuation continuation, q3d q3dVar) {
        super(2, continuation);
        this.Z = m3dVar;
        this.s0 = q3dVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((p3d) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        p3d p3dVar = new p3d((m3d) this.Z, continuation, this.s0);
        p3dVar.Y = obj;
        return p3dVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            zq zqVar = new zq((on5) this.Y, this.s0, 11);
            this.X = 1;
            if (this.Z.d(zqVar, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5f.a;
    }
}
