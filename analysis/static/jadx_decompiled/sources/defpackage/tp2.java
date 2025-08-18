package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class tp2 extends ffe implements a66 {
    public glc X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ rq2 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp2(rq2 rq2Var, Continuation continuation) {
        super(2, continuation);
        this.s0 = rq2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((tp2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        tp2 tp2Var = new tp2(this.s0, continuation);
        tp2Var.Z = obj;
        return tp2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        sx3 sx3Var;
        glc glcVar;
        Object objY;
        sx3 sx3Var2;
        zic zicVar;
        CharSequence charSequence;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        rq2 rq2Var = this.s0;
        if (i == 0) {
            od2.a0(obj);
            sx3Var = (sx3) this.Z;
            glcVar = rq2Var.Z;
            this.Z = sx3Var;
            this.X = glcVar;
            this.Y = 1;
            objY = rq2Var.y(this);
            if (objY == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sx3Var2 = (sx3) this.Z;
                od2.a0(obj);
                zicVar = (zic) obj;
                e5f e5fVar = e5f.a;
                if (zicVar != null && (charSequence = zicVar.a) != null && !w9e.C0(charSequence)) {
                    hm9.n(sx3Var2.getClass().getName(), "send restored draft on UI");
                    pnf.o(rq2Var.b1, new cp2(charSequence, zicVar.c, zicVar.b));
                }
                return e5fVar;
            }
            glcVar = this.X;
            sx3 sx3Var3 = (sx3) this.Z;
            od2.a0(obj);
            objY = obj;
            sx3Var = sx3Var3;
        }
        long jLongValue = ((Number) objY).longValue();
        this.Z = sx3Var;
        this.X = null;
        this.Y = 2;
        Object objT0 = j47.t0(((w9a) ((kke) ((je7) glcVar.o).getValue())).b(), new ajc(glcVar, jLongValue, null), this);
        if (objT0 == tx3Var) {
            return tx3Var;
        }
        sx3 sx3Var4 = sx3Var;
        obj = objT0;
        sx3Var2 = sx3Var4;
        zicVar = (zic) obj;
        e5f e5fVar2 = e5f.a;
        if (zicVar != null) {
            hm9.n(sx3Var2.getClass().getName(), "send restored draft on UI");
            pnf.o(rq2Var.b1, new cp2(charSequence, zicVar.c, zicVar.b));
        }
        return e5fVar2;
    }
}
