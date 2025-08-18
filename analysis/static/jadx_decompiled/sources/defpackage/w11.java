package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class w11 extends ffe implements g66 {
    public /* synthetic */ boolean X;
    public /* synthetic */ boolean Y;
    public /* synthetic */ boolean Z;
    public /* synthetic */ boolean s0;
    public final /* synthetic */ je7 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w11(je7 je7Var, Continuation continuation) {
        super(5, continuation);
        this.t0 = je7Var;
    }

    @Override // defpackage.g66
    public final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue4 = ((Boolean) obj4).booleanValue();
        w11 w11Var = new w11(this.t0, (Continuation) obj5);
        w11Var.X = zBooleanValue;
        w11Var.Y = zBooleanValue2;
        w11Var.Z = zBooleanValue3;
        w11Var.s0 = zBooleanValue4;
        return w11Var.o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        boolean z = this.X;
        boolean z2 = this.Y;
        boolean z3 = this.Z;
        boolean z4 = this.s0;
        boolean z5 = false;
        if (((se5) ((qe5) this.t0.getValue())).q() && z4 && !z3 && z2 && z) {
            z5 = true;
        }
        return Boolean.valueOf(z5);
    }
}
