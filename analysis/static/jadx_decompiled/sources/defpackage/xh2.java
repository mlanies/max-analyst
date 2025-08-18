package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xh2 extends ffe implements a66 {
    public Object X;
    public List Y;
    public int Z;
    public final /* synthetic */ gi2 s0;
    public final /* synthetic */ tf2 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh2(gi2 gi2Var, tf2 tf2Var, Continuation continuation) {
        super(2, continuation);
        this.s0 = gi2Var;
        this.t0 = tf2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((xh2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new xh2(this.s0, this.t0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        List listF;
        gi2 gi2Var;
        ti9 ti9Var;
        tx3 tx3Var = tx3.a;
        int i = this.Z;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7VarArr = gi2.R0;
            gi2 gi2Var2 = this.s0;
            e52 e52VarV = gi2Var2.v();
            es8 es8Var = e52VarV != null ? e52VarV.c : null;
            Long lValueOf = es8Var != null ? Long.valueOf(es8Var.getC()) : null;
            if (lValueOf != null) {
                long jLongValue = lValueOf.longValue();
                Object[] objArr = {Long.valueOf(jLongValue)};
                tf2 tf2Var = this.t0;
                hm9.m(tf2Var.a, "getHistoryItems: %d", objArr);
                listF = tf2Var.b.f(jLongValue);
                this.X = gi2Var2;
                this.Y = listF;
                this.Z = 1;
                if (gi2.t(gi2Var2, listF, this) == tx3Var) {
                    return tx3Var;
                }
                gi2Var = gi2Var2;
            }
            return e5f.a;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ti9Var = (ti9) this.X;
            od2.a0(obj);
            ti9Var.setValue(obj);
            return e5f.a;
        }
        listF = this.Y;
        gi2Var = (gi2) this.X;
        od2.a0(obj);
        q0e q0eVar = gi2Var.O0;
        this.X = q0eVar;
        this.Y = null;
        this.Z = 2;
        Object objA = gi2Var.A(listF, null, this);
        if (objA == tx3Var) {
            return tx3Var;
        }
        obj = objA;
        ti9Var = q0eVar;
        ti9Var.setValue(obj);
        return e5f.a;
    }
}
