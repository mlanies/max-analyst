package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class kuf extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ouf Y;
    public final /* synthetic */ ln0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kuf(ouf oufVar, ln0 ln0Var, Continuation continuation) {
        super(2, continuation);
        this.Y = oufVar;
        this.Z = ln0Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((kuf) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new kuf(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        ouf oufVar = this.Y;
        if (i == 0) {
            od2.a0(obj);
            mtf mtfVarA = ouf.a(oufVar);
            this.X = 1;
            obj = mtfVarA.a(oufVar.a, oufVar.b, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
                return e5fVar;
            }
            od2.a0(obj);
        }
        puf pufVar = (puf) obj;
        String str = pufVar != null ? pufVar.d : null;
        if (str == null || str.length() == 0) {
            this.Z.b(new vuf());
            return e5fVar;
        }
        if (pufVar != null) {
            puf pufVarA = puf.a(pufVar, false, false, 55);
            mtf mtfVarA2 = ouf.a(oufVar);
            this.X = 2;
            mtfVarA2.getClass();
            if (ote.j(mtfVarA2.a, new ltf(mtfVarA2, pufVarA, 1), this) == tx3Var) {
                return tx3Var;
            }
        }
        return e5fVar;
    }
}
