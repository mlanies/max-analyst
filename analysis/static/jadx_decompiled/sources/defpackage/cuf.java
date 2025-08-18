package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cuf extends ffe implements a66 {
    public boolean X;
    public int Y;
    public final /* synthetic */ ouf Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuf(ouf oufVar, Continuation continuation) {
        super(2, continuation);
        this.Z = oufVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((cuf) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new cuf(this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        boolean z;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        if (i == 0) {
            od2.a0(obj);
            ouf oufVar = this.Z;
            boolean zF = oufVar.f();
            mtf mtfVarA = ouf.a(oufVar);
            long j = oufVar.a;
            long j2 = oufVar.b;
            this.X = zF;
            this.Y = 1;
            obj = mtfVarA.a(j, j2, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
            z = zF;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = this.X;
            od2.a0(obj);
        }
        puf pufVar = (puf) obj;
        boolean z2 = pufVar != null && pufVar.e;
        boolean z3 = pufVar != null && pufVar.f;
        String str = pufVar != null ? pufVar.d : null;
        return new nn0(z, z2, z3, !(str == null || str.length() == 0));
    }
}
