package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cxf extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ dxf Z;
    public final /* synthetic */ gxf s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxf(dxf dxfVar, gxf gxfVar, Continuation continuation) {
        super(2, continuation);
        this.Z = dxfVar;
        this.s0 = gxfVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((cxf) n((Throwable) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        cxf cxfVar = new cxf(this.Z, this.s0, continuation);
        cxfVar.Y = obj;
        return cxfVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            Throwable th = (Throwable) this.Y;
            dxf dxfVar = this.Z;
            ga7 ga7VarE = dxf.e(dxfVar, th);
            y83 y83Var = (y83) dxfVar.c.getValue();
            twf twfVar = twf.b;
            String str = this.s0.a;
            this.X = 1;
            if (y83Var.a(dxfVar.f, ga7VarE, twfVar, str, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5f.a;
    }
}
