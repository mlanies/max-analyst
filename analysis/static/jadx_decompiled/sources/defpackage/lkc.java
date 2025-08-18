package defpackage;

import android.media.AudioManager;

/* loaded from: classes.dex */
public final class lkc {
    public final khe a = new khe(new hbc(5));
    public final khe b;
    public kkc c;

    public lkc(je7 je7Var, je7 je7Var2) {
        this.b = new khe(new a81(je7Var, this, je7Var2, 9));
    }

    public final xh1 a() {
        return (xh1) this.b.getValue();
    }

    public final void b() {
        this.c = kkc.END;
        xh1 xh1VarA = a();
        if (((AudioManager) xh1VarA.d.getValue()).getRingerMode() != 2) {
            return;
        }
        xh1VarA.a(xh1VarA.b.a, false);
    }

    public final void c() {
        kkc kkcVar = this.c;
        if (kkcVar == kkc.END || kkcVar == kkc.BUSY) {
            this.c = null;
        } else {
            this.c = null;
            a().c();
        }
    }
}
