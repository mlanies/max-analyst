package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class r44 {
    public static final /* synthetic */ int g = 0;
    public final q44 a;
    public final Runnable b;
    public final m56 c;
    public final ztc d;
    public final xpb e;
    public sd7 f;

    static {
        int i = ft4.o;
        z7.R(100, kt4.MILLISECONDS);
    }

    public r44(q44 q44Var, yh0 yh0Var, m56 m56Var) {
        ztc ztcVarA = muc.a();
        this.a = q44Var;
        this.b = yh0Var;
        this.c = m56Var;
        this.d = ztcVarA;
        this.e = new xpb();
        a();
    }

    public final void a() {
        q44 q44Var = this.a;
        if (!(q44Var instanceof q44)) {
            throw new NoWhenBranchMatchedException();
        }
        r0a r0aVarN = this.e.t(ft4.e(q44Var.a), TimeUnit.MILLISECONDS).n(this.d);
        sd7 sd7Var = new sd7(new rxd(12, this), new o9g(12, this), ft.d);
        r0aVarN.a(sd7Var);
        this.f = sd7Var;
    }
}
