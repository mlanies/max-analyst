package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wv extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ bx Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ ta3 s0;
    public final /* synthetic */ ta3 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv(bx bxVar, long j, ua3 ua3Var, ua3 ua3Var2, Continuation continuation) {
        super(2, continuation);
        this.Y = bxVar;
        this.Z = j;
        this.s0 = ua3Var;
        this.t0 = ua3Var2;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((wv) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        wv wvVar = new wv(this.Y, this.Z, (ua3) this.s0, (ua3) this.t0, continuation);
        wvVar.X = obj;
        return wvVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        sx3 sx3Var = (sx3) this.X;
        bx bxVar = this.Y;
        lx3 lx3Var = bxVar.t;
        kke kkeVar = bxVar.b;
        j47.T(sx3Var, lx3Var.plus(((w9a) kkeVar).b()), null, new uv(this.Y, this.Z, this.s0, null), 2);
        return j47.T(sx3Var, bxVar.t.plus(((w9a) kkeVar).b()), null, new vv(this.Y, this.Z, this.t0, null), 2);
    }
}
