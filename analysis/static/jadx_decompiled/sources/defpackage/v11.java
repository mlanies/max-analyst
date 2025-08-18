package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class v11 extends ffe implements e66 {
    public /* synthetic */ boolean X;
    public /* synthetic */ boolean Y;
    public /* synthetic */ aa Z;

    @Override // defpackage.e66
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        v11 v11Var = new v11(4, (Continuation) obj4);
        v11Var.X = zBooleanValue;
        v11Var.Y = zBooleanValue2;
        v11Var.Z = (aa) obj3;
        return v11Var.o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        boolean z = this.X;
        boolean z2 = this.Y;
        aa aaVar = this.Z;
        boolean z3 = false;
        if ((aaVar.a || aaVar.c) && z && z2) {
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }
}
