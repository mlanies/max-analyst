package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bbc extends ffe implements a66 {
    public int X;
    public final /* synthetic */ cbc Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ byte[] s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbc(cbc cbcVar, long j, byte[] bArr, Continuation continuation) {
        super(2, continuation);
        this.Y = cbcVar;
        this.Z = j;
        this.s0 = bArr;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((bbc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new bbc(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            cbc cbcVar = this.Y;
            bac bacVar = cbcVar.b;
            this.X = 1;
            if (cbc.r(cbcVar, bacVar, this.Z, this.s0, this) == tx3Var) {
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
