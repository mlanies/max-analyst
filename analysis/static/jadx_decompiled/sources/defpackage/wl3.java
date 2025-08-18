package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wl3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ jm3 Y;
    public final /* synthetic */ boolean Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wl3(jm3 jm3Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = jm3Var;
        this.Z = z;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((wl3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new wl3(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        jm3 jm3Var = this.Y;
        if (i == 0) {
            od2.a0(obj);
            ggc ggcVar = jm3Var.y;
            this.X = 1;
            ome omeVar = (ome) ((qea) ggcVar.a.getValue()).a.getValue();
            gs9 gs9Var = new gs9(sla.n2, 6);
            gs9Var.d("delete", this.Z);
            obj = omeVar.e(gs9Var, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        Long l = ((egc) obj).c;
        jm3.p(jm3Var, l != null ? l.longValue() : 0L);
        return e5f.a;
    }
}
