package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nh2 extends ffe implements a66 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ xm8 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ long s0;
    public final /* synthetic */ gi2 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nh2(Object obj, Continuation continuation, xm8 xm8Var, long j, long j2, gi2 gi2Var) {
        super(2, continuation);
        this.X = obj;
        this.Y = xm8Var;
        this.Z = j;
        this.s0 = j2;
        this.t0 = gi2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((nh2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new nh2(this.X, continuation, this.Y, this.Z, this.s0, this.t0);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        l20 l20Var = (l20) this.X;
        g20 g20Var = l20Var.a;
        int i = g20Var == null ? -1 : mh2.$EnumSwitchMapping$0[g20Var.ordinal()];
        xm8 xm8Var = this.Y;
        if (i == 1) {
            x10 x10Var = l20Var.b;
            if (x10Var != null) {
                if (x10Var.s0 == xm8Var.i()) {
                    return null;
                }
            }
            return crd.f(l20Var, this.Z, this.s0, false, 24);
        }
        if (i == 2) {
            k20 k20Var = l20Var.d;
            if (k20Var != null) {
                if (k20Var.a == xm8Var.i()) {
                    return null;
                }
            }
            return crd.f(l20Var, this.Z, this.s0, this.t0.z0.v(), 8);
        }
        if (i == 3) {
            c20 c20Var = l20Var.g;
            if (c20Var != null) {
                if (c20Var.a == xm8Var.i()) {
                    return null;
                }
            }
            return crd.f(l20Var, this.Z, this.s0, false, 24);
        }
        if (i != 4) {
            return crd.f(l20Var, this.Z, this.s0, false, 24);
        }
        s10 s10Var = l20Var.j;
        if (s10Var != null) {
            if (s10Var.a == xm8Var.i()) {
                return null;
            }
        }
        return crd.f(l20Var, this.Z, this.s0, false, 24);
    }
}
