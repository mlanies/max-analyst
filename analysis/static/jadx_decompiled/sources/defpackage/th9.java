package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class th9 extends ffe implements a66 {
    public final /* synthetic */ uh9 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th9(uh9 uh9Var, Continuation continuation) {
        super(2, continuation);
        this.X = uh9Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        th9 th9Var = (th9) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        th9Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new th9(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        c3b c3bVarD;
        od2.a0(obj);
        uh9 uh9Var = this.X;
        q0e q0eVar = uh9Var.s;
        a98 a98Var = uh9Var.m;
        q0eVar.m(null, new Long(a98Var != null ? a98Var.k() : -1L));
        a98 a98Var2 = uh9Var.m;
        uh9Var.u.m(null, new Long(a98Var2 != null ? a98Var2.e0() : -1L));
        a98 a98Var3 = uh9Var.m;
        int playbackState = a98Var3 != null ? a98Var3.getPlaybackState() : 1;
        uh9Var.v = playbackState;
        uh9Var.y = playbackState == 2;
        uh9Var.A = playbackState == 4;
        a98 a98Var4 = uh9Var.m;
        boolean z = a98Var4 != null && a98Var4.b();
        uh9Var.x = z;
        uh9Var.w = !z && uh9Var.v == 3;
        a98 a98Var5 = uh9Var.m;
        if (a98Var5 != null) {
            a98Var5.n();
        }
        a98 a98Var6 = uh9Var.m;
        uh9Var.B = a98Var6 != null ? a98Var6.R0() : null;
        a98 a98Var7 = uh9Var.m;
        uh9Var.C = uh9.d(uh9Var, a98Var7 != null ? a98Var7.h() : -1);
        a98 a98Var8 = uh9Var.m;
        uh9.d(uh9Var, a98Var8 != null ? a98Var8.i() : -1);
        a98 a98Var9 = uh9Var.m;
        if (a98Var9 != null) {
            a98Var9.E0();
        }
        a98 a98Var10 = uh9Var.m;
        if (a98Var10 != null) {
            a98Var10.getRepeatMode();
        }
        a98 a98Var11 = uh9Var.m;
        uh9Var.D = a98Var11 != null ? a98Var11.N0() : null;
        a98 a98Var12 = uh9Var.m;
        uh9Var.E = a98Var12 != null ? a98Var12.c() : -1L;
        a98 a98Var13 = uh9Var.m;
        uh9Var.F = (a98Var13 == null || (c3bVarD = a98Var13.d()) == null) ? 1.0f : c3bVarD.a;
        a98 a98Var14 = uh9Var.m;
        if (a98Var14 != null) {
            a98Var14.n1();
        }
        uh9Var.G.m(null, new Float(ote.d((float) (((Number) uh9Var.s.getValue()).doubleValue() / uh9Var.E), 0.0f, 1.0f)));
        return e5f.a;
    }
}
