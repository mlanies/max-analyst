package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class iif extends ffe implements a66 {
    public int X;
    public final /* synthetic */ dkf Y;
    public final /* synthetic */ nif Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iif(dkf dkfVar, nif nifVar, Continuation continuation) {
        super(2, continuation);
        this.Y = dkfVar;
        this.Z = nifVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((iif) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new iif(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        long jR;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        od2.a0(obj);
        do {
            if (!this.Y.b()) {
                return e5f.a;
            }
            pag.j(this.b);
            nif nifVar = this.Z;
            ijf ijfVar = (ijf) x53.i0(nifVar.Z.a.b());
            if (ijfVar != null) {
                kld kldVar = nifVar.Y;
                ijfVar.X = 3;
                ijfVar.Y = (r8.F0() / r8.G0()) * 100.0f;
                kldVar.g(ijfVar);
            }
            int i2 = ft4.o;
            jR = z7.R(100, kt4.MILLISECONDS);
            this.X = 1;
        } while (j47.y(jR, this) != tx3Var);
        return tx3Var;
    }
}
