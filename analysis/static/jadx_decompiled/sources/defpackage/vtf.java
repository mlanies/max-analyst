package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vtf extends ffe implements a66 {
    public puf X;
    public int Y;
    public final /* synthetic */ ouf Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vtf(ouf oufVar, Continuation continuation) {
        super(2, continuation);
        this.Z = oufVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((vtf) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new vtf(this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        ouf oufVar = this.Z;
        if (i == 0) {
            od2.a0(obj);
            mtf mtfVarA = ouf.a(oufVar);
            this.Y = 1;
            obj = mtfVarA.a(oufVar.a, oufVar.b, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                puf pufVar = this.X;
                od2.a0(obj);
                return pufVar;
            }
            od2.a0(obj);
        }
        puf pufVar2 = (puf) obj;
        puf pufVarA = pufVar2 != null ? puf.a(pufVar2, true, false, 15) : new puf(oufVar.a, oufVar.b, false);
        mtf mtfVarA2 = ouf.a(oufVar);
        this.X = pufVarA;
        this.Y = 2;
        mtfVarA2.getClass();
        return ote.j(mtfVarA2.a, new ltf(mtfVarA2, pufVarA, 0), this) == tx3Var ? tx3Var : pufVarA;
    }
}
