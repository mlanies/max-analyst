package defpackage;

import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class fs7 implements yp {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fs7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void b() {
    }

    @Override // defpackage.yp
    public final void a() {
        switch (this.a) {
            case 0:
                js7.g((js7) this.b, false, 3);
                break;
            default:
                ((an9) this.b).i = SystemClock.elapsedRealtime();
                an9.g((an9) this.b, wuc.APPLICATION_BACKGROUND);
                break;
        }
    }

    @Override // defpackage.yp
    public final void c() {
        switch (this.a) {
            case 0:
                break;
            default:
                an9 an9Var = (an9) this.b;
                if (an9Var.i != 0) {
                    v1e v1eVar = (v1e) an9Var.l.get();
                    String str = an9Var.f;
                    ir6 ir6Var = hm9.m;
                    if (ir6Var != null && ir6Var.c()) {
                        ir6Var.d(us7.X, str, "Navigation stats. Try update session id on warmStart, lastTime:" + an9Var.i + "|lastCondition:" + v1eVar, null);
                    }
                    if (!an9Var.e()) {
                        v1eVar.getClass();
                        if (v1eVar != v1e.b && v1eVar != v1e.c) {
                            j47.T(an9Var.e, null, null, new xm9(an9Var, null), 3);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
