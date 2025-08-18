package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class wqa extends ffe implements a66 {
    public int X;
    public final /* synthetic */ cra Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wqa(cra craVar, Continuation continuation) {
        super(2, continuation);
        this.Y = craVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((wqa) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new wqa(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        cra craVar = this.Y;
        if (i == 0) {
            od2.a0(obj);
            so1 so1Var = craVar.b;
            this.X = 1;
            obj = j47.t0(((w9a) ((kke) so1Var.c.getValue())).b(), new po1(so1Var, null), this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        fqa fqaVar = new fqa(mqa.a(), (bo1) obj);
        pqa pqaVar = (pqa) craVar.s0.get();
        if (pqaVar == null) {
            craVar.e(new pqa(fqaVar));
        } else {
            craVar.e(new pqa(fqaVar, pqaVar.b, pqaVar.c, pqaVar.d, pqaVar.e, pqaVar.f, pqaVar.g, pqaVar.h));
        }
        craVar.d();
        return e5f.a;
    }
}
