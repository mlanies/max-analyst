package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class dx2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ nx2 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx2(nx2 nx2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = nx2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        dx2 dx2Var = (dx2) n((mt2) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        dx2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        dx2 dx2Var = new dx2(this.Y, continuation);
        dx2Var.X = obj;
        return dx2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f1  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dx2.o(java.lang.Object):java.lang.Object");
    }
}
