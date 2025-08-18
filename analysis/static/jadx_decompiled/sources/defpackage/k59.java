package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class k59 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ta3 Y;
    public final /* synthetic */ n59 Z;
    public final /* synthetic */ long s0;
    public final /* synthetic */ long t0;
    public final /* synthetic */ long u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k59(ua3 ua3Var, n59 n59Var, long j, long j2, long j3, Continuation continuation) {
        super(2, continuation);
        this.Y = ua3Var;
        this.Z = n59Var;
        this.s0 = j;
        this.t0 = j2;
        this.u0 = j3;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((k59) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new k59((ua3) this.Y, this.Z, this.s0, this.t0, this.u0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            obj = ((ua3) this.Y).awaitInternal(this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
                return e5fVar;
            }
            od2.a0(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        n59 n59Var = this.Z;
        if (zBooleanValue) {
            iy2 iy2Var = n59Var.s0;
            this.X = 2;
            p82 p82VarL = ((jz2) iy2Var).l();
            v82 v82Var = v82.o;
            long j = this.s0;
            p82VarL.c(j, v82Var);
            p82VarL.h(j, false, new c10(this.t0, 1));
            if (e5fVar == tx3Var) {
                return tx3Var;
            }
        } else {
            ps2 ps2Var = (ps2) n59Var.O0.getValue();
            this.X = 3;
            ps2Var.a(this.s0, this.u0, this);
            if (e5fVar == tx3Var) {
                return tx3Var;
            }
        }
        return e5fVar;
    }
}
