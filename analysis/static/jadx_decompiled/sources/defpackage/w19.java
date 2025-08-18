package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class w19 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ Long Y;
    public final /* synthetic */ x19 Z;
    public final /* synthetic */ long s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w19(Long l, x19 x19Var, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = l;
        this.Z = x19Var;
        this.s0 = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((w19) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new w19(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        x19 x19Var = this.Z;
        if (i == 0) {
            od2.a0(obj);
            Long l = this.Y;
            if (l == null) {
                return null;
            }
            r79 r79Var = (r79) x19Var.a.getValue();
            long jLongValue = l.longValue();
            this.X = 1;
            obj = r79Var.a(jLongValue, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        cu8 cu8Var = (cu8) obj;
        if (cu8Var == null) {
            return null;
        }
        es8 es8VarA = zu8.a((zu8) x19Var.b.getValue(), cu8Var);
        long j = es8VarA.a.c;
        long j2 = this.s0;
        return new bw8(1, j2, es8VarA, null, null, j2, j);
    }
}
