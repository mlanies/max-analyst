package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vmb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ mec Y;
    public final /* synthetic */ lec Z;
    public final /* synthetic */ cnb s0;
    public final /* synthetic */ boolean t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vmb(mec mecVar, lec lecVar, cnb cnbVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = mecVar;
        this.Z = lecVar;
        this.s0 = cnbVar;
        this.t0 = z;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((vmb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new vmb(this.Y, this.Z, this.s0, this.t0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        k10 k10VarR;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        String str = null;
        lec lecVar = this.Z;
        cnb cnbVar = this.s0;
        mec mecVar = this.Y;
        if (i == 0) {
            od2.a0(obj);
            if (mecVar.a == hdb.c) {
                Long lJ = cnbVar.O0.j();
                if (lJ == null) {
                    return e5fVar;
                }
                lecVar.a = lJ.longValue();
                mecVar.a = hdb.o;
            }
            if (mecVar.a == hdb.o) {
                pab pabVar = cnbVar.O0;
                this.X = 1;
                obj = pabVar.n(this);
                if (obj == tx3Var) {
                    return tx3Var;
                }
            }
            pnf.o(cnbVar.A0, new mkb(lecVar.a, (hdb) mecVar.a, this.t0, str));
            return e5fVar;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        od2.a0(obj);
        e52 e52Var = (e52) obj;
        if (e52Var != null && (k10VarR = e52Var.r()) != null) {
            str = k10VarR.c;
        }
        pnf.o(cnbVar.A0, new mkb(lecVar.a, (hdb) mecVar.a, this.t0, str));
        return e5fVar;
    }
}
