package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class aw2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ gw2 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw2(Object obj, Continuation continuation, gw2 gw2Var) {
        super(2, continuation);
        this.Y = obj;
        this.Z = gw2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((aw2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new aw2(this.Y, continuation, this.Z);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kzc kzcVar = (kzc) this.Y;
            nzc nzcVar = this.Z.Y;
            this.X = 1;
            obj = nzcVar.b(kzcVar, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return obj;
    }
}
