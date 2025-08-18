package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class h6f extends ffe implements a66 {
    public int X;
    public final /* synthetic */ i6f Y;
    public final /* synthetic */ int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6f(i6f i6fVar, int i, Continuation continuation) {
        super(2, continuation);
        this.Y = i6fVar;
        this.Z = i;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((h6f) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new h6f(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        i6f i6fVar = this.Y;
        if (i == 0) {
            od2.a0(obj);
            pk pkVar = (pk) i6fVar.a.getValue();
            eaf eafVar = new eaf();
            eafVar.v = this.Z;
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
        ((jp) ((hp) i6fVar.b.getValue())).z(gafVar);
        return e5f.a;
    }
}
