package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class eq8 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ jq8 Y;
    public final /* synthetic */ e52 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq8(jq8 jq8Var, e52 e52Var, Continuation continuation) {
        super(2, continuation);
        this.Y = jq8Var;
        this.Z = e52Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((eq8) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new eq8(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            jq8 jq8Var = this.Y;
            cc6 cc6Var = (cc6) jq8Var.x0.getValue();
            long j = this.Z.b.a;
            Integer num = new Integer(((Number) jq8Var.I0.getValue()).intValue());
            this.X = 1;
            obj = cc6Var.a(j, jq8Var.o, null, null, num, this);
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
