package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ik1 extends ffe implements g66 {
    public final /* synthetic */ int X;
    public /* synthetic */ boolean Y;
    public /* synthetic */ Comparable Z;
    public /* synthetic */ Object s0;
    public /* synthetic */ Object t0;
    public final /* synthetic */ pnf u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ik1(pnf pnfVar, Continuation continuation, int i) {
        super(5, continuation);
        this.X = i;
        this.u0 = pnfVar;
    }

    @Override // defpackage.g66
    public final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws Throwable {
        switch (this.X) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                ik1 ik1Var = new ik1((el1) this.u0, (Continuation) obj5, 0);
                ik1Var.Z = (Long) obj;
                ik1Var.s0 = (la1) obj2;
                ik1Var.Y = zBooleanValue;
                ik1Var.t0 = (CharSequence) obj4;
                e5f e5fVar = e5f.a;
                ik1Var.o(e5fVar);
                return e5fVar;
            default:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                ik1 ik1Var2 = new ik1((n59) this.u0, (Continuation) obj5, 1);
                ik1Var2.Y = zBooleanValue2;
                ik1Var2.Z = (e52) obj2;
                ik1Var2.s0 = (z2e) obj3;
                ik1Var2.t0 = (uj3) obj4;
                return ik1Var2.o(e5f.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x018c  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ik1.o(java.lang.Object):java.lang.Object");
    }
}
