package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vb9 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ xb9 Y;
    public final /* synthetic */ long[] Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb9(xb9 xb9Var, Continuation continuation, long[] jArr) {
        super(2, continuation);
        this.Y = xb9Var;
        this.Z = jArr;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((vb9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new vb9(this.Y, continuation, this.Z);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        try {
            if (i == 0) {
                od2.a0(obj);
                pk pkVar = (pk) this.Y.b.getValue();
                tq2 tq2Var = new tq2(this.Z);
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
            long[] jArr = this.Z;
            ym3 ym3Var = (ym3) obj;
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.X, "MissedContactsController", "success CONTACT_INFO request: " + ym3Var + "; " + ys.h0(jArr, ", ", "", "", -1, "...", null) + "}", null);
            }
            return (ym3) obj;
        } catch (Throwable th) {
            hm9.p("MissedContactsController", "fail to fetch contact info ".concat(ys.h0(this.Z, ", ", "", "", -1, "...", null)), th);
            return null;
        }
    }
}
