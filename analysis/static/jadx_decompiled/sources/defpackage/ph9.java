package defpackage;

import android.os.Bundle;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ph9 extends ffe implements a66 {
    public final /* synthetic */ uh9 X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ ub8 s0;
    public final /* synthetic */ String t0;
    public final /* synthetic */ String u0;
    public final /* synthetic */ Bundle v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph9(uh9 uh9Var, String str, String str2, ub8 ub8Var, String str3, String str4, Bundle bundle, Continuation continuation) {
        super(2, continuation);
        this.X = uh9Var;
        this.Y = str;
        this.Z = str2;
        this.s0 = ub8Var;
        this.t0 = str3;
        this.u0 = str4;
        this.v0 = bundle;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ph9 ph9Var = (ph9) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ph9Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ph9(this.X, this.Y, this.Z, this.s0, this.t0, this.u0, this.v0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        int i = uh9.K;
        uh9 uh9Var = this.X;
        uh9Var.getClass();
        tb8 tb8VarJ = uh9.j(this.Y, this.Z, this.s0, this.t0, this.u0, this.v0);
        a98 a98Var = uh9Var.m;
        if (a98Var != null) {
            a98Var.K();
            z88 z88Var = a98Var.c;
            if (z88Var.isConnected()) {
                z88Var.U0(tb8VarJ);
            } else {
                z04.c0("The controller is not connected. Ignoring setMediaItem().");
            }
        }
        uh9Var.r();
        return e5f.a;
    }
}
