package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class lb1 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ vb1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb1(vb1 vb1Var, Continuation continuation) {
        super(2, continuation);
        this.Y = vb1Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((lb1) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new lb1(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object value;
        nb1 nb1Var;
        md0 md0Var;
        tta ttaVar;
        boolean zB;
        m38 m38Var;
        m38 m38Var2;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        vb1 vb1Var = this.Y;
        if (i == 0) {
            od2.a0(obj);
            wva wvaVar = vb1Var.c;
            this.X = 1;
            obj = wvaVar.h(this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        uj3 uj3Var = (uj3) obj;
        q0e q0eVar = vb1Var.w0;
        do {
            value = q0eVar.getValue();
            nb1Var = (nb1) value;
            uc0 uc0VarA = oag.a(uj3Var.m(), new Long(((Number) vb1Var.v0.getValue()).longValue()));
            vb1Var.c.getClass();
            md0Var = new md0(uc0VarA, uj3Var.p(kk0.c));
            ttaVar = vb1Var.X;
            zB = ttaVar.a().b(eua.l);
            m38Var = m38.a;
            m38Var2 = m38.X;
        } while (!q0eVar.c(value, nb1.a(nb1Var, md0Var, !ttaVar.a().b(eua.h) ? m38Var2 : m38Var, !zB ? m38Var2 : m38Var, false, null, null, null, 120)));
        return e5f.a;
    }
}
