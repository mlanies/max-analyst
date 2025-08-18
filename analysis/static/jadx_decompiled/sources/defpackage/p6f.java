package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class p6f extends ffe implements a66 {
    public int X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ q6f Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6f(boolean z, q6f q6fVar, Continuation continuation) {
        super(2, continuation);
        this.Y = z;
        this.Z = q6fVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((p6f) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new p6f(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        q6f q6fVar = this.Z;
        if (i == 0) {
            od2.a0(obj);
            eaf eafVar = new eaf();
            boolean z = this.Y;
            eafVar.u = Boolean.valueOf(z);
            if (z) {
                eafVar.o = 3;
                eafVar.p = 3;
                eafVar.v = 3;
                se5 se5Var = (se5) ((qe5) q6fVar.e.getValue());
                se5Var.getClass();
                if (se5Var.n(PmsKey.f125unsafefilesalert, false)) {
                    eafVar.w = Boolean.TRUE;
                }
            }
            pk pkVar = (pk) q6fVar.a.getValue();
            tq2 tq2Var = new tq2(null, 0L, new le3(new gaf(eafVar)), false);
            this.X = 1;
            obj = ((k4a) pkVar).J(tq2Var, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        gaf gafVar = ((fe3) obj).o;
        if (gafVar == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        ((jp) ((hp) q6fVar.b.getValue())).z(gafVar);
        if (tpa.f(gafVar.u, Boolean.FALSE)) {
            t33 t33Var = (t33) ((q33) q6fVar.c.getValue());
            t33Var.m("app.pin_" + t33Var.t(), null);
        }
        ie3 ie3Var = (ie3) q6fVar.g.getValue();
        ie3Var.getClass();
        j47.T(ie3Var.b, null, null, new he3(ie3Var, null), 3);
        return e5f.a;
    }
}
