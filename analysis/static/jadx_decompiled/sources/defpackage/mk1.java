package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class mk1 extends ffe implements e66 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public /* synthetic */ Object Z;
    public /* synthetic */ Object s0;
    public final /* synthetic */ pnf t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mk1(pnf pnfVar, Continuation continuation, int i) {
        super(4, continuation);
        this.X = i;
        this.t0 = pnfVar;
    }

    @Override // defpackage.e66
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) throws Throwable {
        switch (this.X) {
            case 0:
                mk1 mk1Var = new mk1((el1) this.t0, (Continuation) obj4, 0);
                mk1Var.Y = (la1) obj;
                mk1Var.Z = (to1) obj2;
                mk1Var.s0 = (Map) obj3;
                e5f e5fVar = e5f.a;
                mk1Var.o(e5fVar);
                return e5fVar;
            case 1:
                mk1 mk1Var2 = new mk1((sn1) this.t0, (Continuation) obj4, 1);
                mk1Var2.Y = (la1) obj;
                mk1Var2.Z = (nnf) obj2;
                mk1Var2.s0 = (vwe) obj3;
                return mk1Var2.o(e5f.a);
            default:
                mk1 mk1Var3 = new mk1((bp8) this.t0, (Continuation) obj4, 2);
                mk1Var3.Y = (List) obj;
                mk1Var3.Z = (List) obj2;
                mk1Var3.s0 = (hn8) obj3;
                return mk1Var3.o(e5f.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0454 A[LOOP:3: B:73:0x0177->B:208:0x0454, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0451 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b9  */
    /* JADX WARN: Type inference failed for: r1v73, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v75 */
    /* JADX WARN: Type inference failed for: r1v84, types: [java.util.ArrayList] */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1128
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mk1.o(java.lang.Object):java.lang.Object");
    }
}
