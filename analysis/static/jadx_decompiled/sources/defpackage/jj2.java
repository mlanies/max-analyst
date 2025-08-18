package defpackage;

import java.util.function.LongUnaryOperator;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class jj2 extends ffe implements a66 {
    public long X;
    public int Y;
    public final /* synthetic */ ck2 Z;
    public final /* synthetic */ int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj2(ck2 ck2Var, int i, Continuation continuation) {
        super(2, continuation);
        this.Z = ck2Var;
        this.s0 = i;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((jj2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new jj2(this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        final long j;
        Object objE;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        e5f e5fVar = e5f.a;
        ck2 ck2Var = this.Z;
        if (i == 0) {
            od2.a0(obj);
            gef gefVar = ((ej2) ck2Var.W0.a.getValue()).b;
            String str = ck2Var.w0;
            if (gefVar == null) {
                hm9.n(str, "Can't load frame for preview because videoContent is null");
                return e5fVar;
            }
            je7 je7Var = ck2Var.D0;
            if (!tpa.f(((p26) je7Var.getValue()).c().a, gefVar)) {
                ((p26) je7Var.getValue()).f(new m26(gefVar, 6));
                if (!((p26) je7Var.getValue()).d()) {
                    hm9.n(str, "Can't load frame for preview because can't extract frame");
                    return e5fVar;
                }
                ((p26) je7Var.getValue()).prepare();
            }
            long j2 = ck2Var.M0.get();
            long jC = gefVar.c();
            int i2 = this.s0;
            if (jC == 0 || Math.abs(j2 - i2) > gefVar.c() * 0.01d) {
                q0e q0eVar = ck2Var.R0;
                q0eVar.m(null, aj2.a((aj2) q0eVar.getValue(), new zi2(null, true, false, 5)));
                j = i2;
                p26 p26Var = (p26) je7Var.getValue();
                this.X = j;
                this.Y = 1;
                objE = p26Var.e(j, this);
                if (objE == tx3Var) {
                    return tx3Var;
                }
            }
            return e5fVar;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long j3 = this.X;
        od2.a0(obj);
        j = j3;
        objE = obj;
        q0e q0eVar2 = ck2Var.R0;
        q0eVar2.m(null, aj2.a((aj2) q0eVar2.getValue(), new zi2((n26) objE, false, false, 6)));
        ck2Var.M0.updateAndGet(new LongUnaryOperator() { // from class: ij2
            @Override // java.util.function.LongUnaryOperator
            public final long applyAsLong(long j4) {
                return j;
            }
        });
        return e5fVar;
    }
}
