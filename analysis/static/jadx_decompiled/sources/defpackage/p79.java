package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class p79 extends ffe implements m56 {
    public int X;
    public final /* synthetic */ r79 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ fs8 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p79(r79 r79Var, long j, fs8 fs8Var, Continuation continuation) {
        super(1, continuation);
        this.Y = r79Var;
        this.Z = j;
        this.s0 = fs8Var;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        return new p79(this.Y, this.Z, this.s0, (Continuation) obj).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object objJ;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        fs8 fs8Var = this.s0;
        r79 r79Var = this.Y;
        if (i == 0) {
            od2.a0(obj);
            long j = fs8Var.a;
            this.X = 1;
            objJ = r79Var.a.j(this.Z, j, this);
            if (objJ == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    od2.a0(obj);
                    return obj;
                }
                if (i == 3) {
                    od2.a0(obj);
                    return obj;
                }
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
                return obj;
            }
            od2.a0(obj);
            objJ = obj;
        }
        cu8 cu8Var = (cu8) objJ;
        if (cu8Var != null) {
            return cu8Var;
        }
        long j2 = fs8Var.Y;
        if (j2 == 0) {
            long jE = r79Var.a.e(this.Z, ((Number) r79Var.b.getValue()).longValue(), fs8Var);
            this.X = 2;
            Object objA = r79Var.a(jE, this);
            return objA == tx3Var ? tx3Var : objA;
        }
        vlc vlcVar = r79Var.a;
        ru8 ru8VarH = vlcVar.d().h(this.Z, j2);
        cu8 cu8VarB = ru8VarH != null ? vlcVar.b(ru8VarH) : null;
        if (cu8VarB == null) {
            long jE2 = r79Var.a.e(this.Z, ((Number) r79Var.b.getValue()).longValue(), this.s0);
            this.X = 4;
            Object objA2 = r79Var.a(jE2, this);
            return objA2 == tx3Var ? tx3Var : objA2;
        }
        oz7 oz7Var = iu8.b;
        r79Var.a.o(this.s0, this.Z, false, null);
        xt8 xt8Var = new xt8(cu8VarB, iz7.g(fs8Var.s0, (vxc) r79Var.c.getValue()), 1);
        vlc vlcVar2 = r79Var.a;
        long j3 = cu8VarB.b;
        vlcVar2.n(j3, xt8Var);
        this.X = 3;
        Object objA3 = r79Var.a(j3, this);
        return objA3 == tx3Var ? tx3Var : objA3;
    }
}
