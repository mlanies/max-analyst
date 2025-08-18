package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xc8 extends ffe implements a66 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ es8 Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ yc8 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc8(Object obj, Continuation continuation, es8 es8Var, boolean z, yc8 yc8Var) {
        super(2, continuation);
        this.X = obj;
        this.Y = es8Var;
        this.Z = z;
        this.s0 = yc8Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((xc8) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new xc8(this.X, continuation, this.Y, this.Z, this.s0);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        l20 l20Var = (l20) this.X;
        long jHashCode = l20Var.r.hashCode();
        jk0 jk0Var = jk0.b;
        kk0 kk0Var = kk0.b;
        es8 es8Var = this.Y;
        String str = l20Var.r;
        k20 k20Var = l20Var.d;
        if (k20Var != null) {
            return new wm8(jHashCode, es8Var.a.b, k20Var.a, kk5.r(ju0.t(k20Var.d, kk0Var, jk0Var)), 2, new Long(k20Var.c), str, this.Z, null, false);
        }
        yc8 yc8Var = this.s0;
        d20 d20Var = l20Var.o;
        x10 x10Var = l20Var.b;
        if (x10Var != null && x10Var.X) {
            return new wm8(jHashCode, es8Var.a.b, x10Var.s0, kk5.r(ju0.t(x10Var.v0, kk0Var, jk0Var)), 3, null, str, this.Z, null, (yc8Var.c.b(true) || d20Var.c()) ? false : true);
        }
        if (x10Var != null) {
            return new wm8(jHashCode, es8Var.a.b, x10Var.s0, kk5.r(ju0.t(x10Var.a, kk0Var, jk0Var)), 1, null, str, this.Z, ((o20) yc8Var.e.getValue()).c(l20Var, false), (yc8Var.c.d() || d20Var.c()) ? false : true);
        }
        throw new IllegalStateException((yc8Var.getClass().getName() + ": Unknown type in PhotoVideoAttach with messageId = " + es8Var.a.b).toString());
    }
}
