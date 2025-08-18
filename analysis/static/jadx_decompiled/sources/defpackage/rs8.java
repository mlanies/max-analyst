package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class rs8 extends ii0 {
    public final es8 b;
    public final l20 c;
    public boolean d = false;
    public final /* synthetic */ ts8 e;

    public rs8(ts8 ts8Var, es8 es8Var, l20 l20Var) {
        this.e = ts8Var;
        this.b = es8Var;
        this.c = l20Var;
    }

    @Override // defpackage.ii0, defpackage.ev3
    public final void a(String str, ru6 ru6Var, Animatable animatable) throws Throwable {
        if (this.d) {
            return;
        }
        this.d = true;
        boolean z = ru6Var instanceof j43;
        l20 l20Var = this.c;
        if (z) {
            c37.e((j43) ru6Var, l20Var);
        }
        if (s5c.K(l20Var) || s5c.N(l20Var) || l20Var.o.c()) {
            return;
        }
        d20 d20Var = d20.c;
        ts8 ts8Var = this.e;
        long j = ts8Var.y0.a.b;
        es8 es8Var = this.b;
        ts8Var.U(es8Var, l20Var, d20Var, j == es8Var.a.b);
        if (((y8a) ts8Var.a).n().c.g.getBoolean("app.media.save.to.gallery", false)) {
            p00 p00Var = new p00(this, 5, ru6Var);
            hj8 hj8Var = new hj8(9);
            hle hleVarQ = ((y8a) ts8Var.a).q();
            hleVarQ.getClass();
            cqc.a(p00Var, ((jle) hleVarQ).a(), null, hj8Var, null);
        }
    }

    @Override // defpackage.ii0, defpackage.ev3
    public final void d(String str, Throwable th) {
        Drawable drawable = ts8.V0;
        StringBuilder sb = new StringBuilder("Set photo attach failed, messageId ");
        ts8 ts8Var = this.e;
        sb.append(ts8Var.y0.a.b);
        hm9.p("ts8", sb.toString(), th);
        if (th instanceof NullPointerException) {
            return;
        }
        d20 d20Var = d20.o;
        long j = ts8Var.y0.a.b;
        es8 es8Var = this.b;
        ts8Var.U(es8Var, this.c, d20Var, j == es8Var.a.b);
    }
}
