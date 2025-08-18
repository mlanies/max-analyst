package defpackage;

import kotlinx.coroutines.internal.ContextScope;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class rj {
    public static final /* synthetic */ bc7[] k;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final ContextScope h;
    public final boolean j;
    public final String a = rj.class.getName();
    public final w4d i = mqd.D();

    static {
        oi9 oi9Var = new oi9(rj.class, "invalidateCacheJob", "getInvalidateCacheJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        k = new bc7[]{oi9Var};
    }

    public rj(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6, ri4 ri4Var, kke kkeVar) {
        this.b = je7Var;
        this.c = je7Var2;
        this.d = je7Var3;
        this.e = je7Var4;
        this.f = je7Var5;
        this.g = je7Var6;
        this.h = j1e.a(((w9a) kkeVar).a().plus(new qj(this)));
        this.j = ri4Var.b().compareTo(vi4.o) >= 0;
    }

    public final boolean a() {
        if (!((jp) ((hp) this.c.getValue())).g.getBoolean("app.media.animoji.enabled", this.j)) {
            return false;
        }
        qyc qycVar = (qyc) ((y7d) this.b.getValue());
        qycVar.getClass();
        return qycVar.n(PmsKey.f20chatanimojienabled, false);
    }
}
