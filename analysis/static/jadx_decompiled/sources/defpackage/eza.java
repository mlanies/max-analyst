package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class eza extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ long Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eza(long j, Continuation continuation) {
        super(2, continuation);
        this.Y = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((eza) n((uj3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        eza ezaVar = new eza(this.Y, continuation);
        ezaVar.X = obj;
        return ezaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        uj3 uj3Var = (uj3) this.X;
        long jN = uj3Var.n();
        String strD = uj3Var.d();
        String str = strD == null ? "" : strD;
        String strP = uj3Var.p(kk0.a);
        return new rya(this.Y, jN, uj3Var.m(), str, strP == null ? "" : strP);
    }
}
