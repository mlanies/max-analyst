package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ncd extends ffe implements a66 {
    public int X;
    public final /* synthetic */ wxc Y;
    public final /* synthetic */ blb Z;
    public final /* synthetic */ je7 s0;
    public final /* synthetic */ add t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncd(wxc wxcVar, blb blbVar, je7 je7Var, add addVar, Continuation continuation) {
        super(2, continuation);
        this.Y = wxcVar;
        this.Z = blbVar;
        this.s0 = je7Var;
        this.t0 = addVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ncd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ncd(this.Y, this.Z, this.s0, this.t0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            ovc ovcVar = new ovc(new zn5(((hyc) ((q33) this.Y.a.getValue())).u(), new mcd(this.s0, null)), 2);
            this.X = 1;
            obj = od2.A(ovcVar, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    od2.a0(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        long jLongValue = ((Number) obj).longValue();
        blb blbVar = this.Z;
        ti9 ti9Var = (ti9) blbVar.f.computeIfAbsent(Long.valueOf(jLongValue), new di(18, new nq2(blbVar, jLongValue, 2)));
        xw xwVar = new xw(12, this.t0);
        this.X = 2;
        Object objD = ti9Var.d(new ix2(xwVar, 14), this);
        if (objD != tx3Var) {
            objD = e5fVar;
        }
        return objD == tx3Var ? tx3Var : e5fVar;
    }
}
