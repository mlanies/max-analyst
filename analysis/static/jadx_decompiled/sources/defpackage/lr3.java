package defpackage;

import android.os.Bundle;
import one.me.main.MainScreen;

/* loaded from: classes.dex */
public final class lr3 implements b64 {
    public final /* synthetic */ int a;
    public final je7 b;

    public /* synthetic */ lr3(int i, je7 je7Var) {
        this.a = i;
        this.b = je7Var;
    }

    @Override // defpackage.b64
    public final i64 a() {
        switch (this.a) {
            case 0:
                return mr3.b;
            default:
                return (ex7) this.b.getValue();
        }
    }

    @Override // defpackage.b64
    public final l64 b(String str, final e64 e64Var, final Bundle bundle) {
        k64 lqVar;
        switch (this.a) {
            case 0:
                if (!mr3.b.a.contains(e64Var)) {
                    return null;
                }
                if (e64Var.equals(mr3.c)) {
                    lqVar = new i(8);
                } else {
                    if (!e64Var.equals(mr3.d)) {
                        if (e64Var.equals(mr3.e)) {
                            return new l64(str, e64Var, bundle, 0, null, new i(9), 24);
                        }
                        throw new IllegalStateException(au1.f("unknown route ", e64Var));
                    }
                    lqVar = new lq(1, this);
                }
                return new l64(str, e64Var, bundle, 3, null, lqVar, 16);
            default:
                if (!((ex7) this.b.getValue()).a.contains(e64Var)) {
                    return null;
                }
                ex7.b.getClass();
                if (e64Var.equals(ex7.c) || e64Var.equals(ex7.d) || e64Var.equals(ex7.e) || e64Var.equals(ex7.f)) {
                    return new l64(str, e64Var, bundle, 0, null, new k64() { // from class: dx7
                        @Override // defpackage.k64
                        public final Object a() {
                            return new MainScreen(m64.a(e64Var.a), bundle);
                        }
                    }, 24);
                }
                throw new IllegalStateException(au1.f("unknown route ", e64Var));
        }
    }
}
