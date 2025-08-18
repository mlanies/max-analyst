package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fw extends ffe implements a66 {
    public int X;
    public final /* synthetic */ bx Y;
    public final /* synthetic */ long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw(bx bxVar, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = bxVar;
        this.Z = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((fw) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new fw(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        bx bxVar = this.Y;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7VarArr = bx.F;
            iy2 iy2Var = (iy2) bxVar.p.getValue();
            this.X = 1;
            obj = iy2Var.d(bxVar.a, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
                bxVar.r(this.Z);
                return e5f.a;
            }
            od2.a0(obj);
        }
        e52 e52Var = (e52) obj;
        if (!e52Var.M()) {
            gb6 gb6Var = (gb6) bxVar.x.getValue();
            long j = e52Var.b.a;
            this.X = 2;
            if (gb6Var.a(j, true, this) == tx3Var) {
                return tx3Var;
            }
        }
        bxVar.r(this.Z);
        return e5f.a;
    }
}
