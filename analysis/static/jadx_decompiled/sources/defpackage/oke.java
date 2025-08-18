package defpackage;

import java.io.File;
import ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker;

/* loaded from: classes2.dex */
public final class oke implements fh3 {
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public iq1 s0;
    public sd7 t0;
    public wd6 u0;
    public int v0;
    public long w0;

    public oke(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6, je7 je7Var7) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
        this.o = je7Var4;
        this.X = je7Var5;
        this.Y = je7Var6;
        this.Z = je7Var7;
    }

    @Override // defpackage.fh3
    public final void a() {
    }

    @Override // defpackage.fh3
    public final void b() {
        if (((gh3) this.Z.getValue()).b() == zh3.c) {
            c(this.u0);
            return;
        }
        cqc.b(this.t0);
        wd6 wd6Var = this.u0;
        if (wd6Var != null) {
            int i = this.v0;
            hm9.m(LoadEmojiFontWorker.TAG, "onDownloadEmojiFontProgressChange %d", Integer.valueOf(i));
            ((LoadEmojiFontWorker) wd6Var.b).state = new sn7(i);
        }
    }

    public final void c(wd6 wd6Var) {
        hm9.n("oke", "Load font");
        this.u0 = wd6Var;
        if (!cqc.c(this.s0)) {
            hm9.n("oke", "Font already loading");
            return;
        }
        q1a q1aVar = new q1a(2, new l5(15, this));
        hle hleVar = (hle) this.X.getValue();
        hleVar.getClass();
        drd drdVarI = q1aVar.m(((jle) hleVar).a()).i(muc.d);
        iq1 iq1Var = new iq1(new mke(this, wd6Var, 0), 2, new mke(this, wd6Var, 1));
        drdVarI.k(iq1Var);
        this.s0 = iq1Var;
    }

    public final void d(File file, wd6 wd6Var) {
        hm9.n("oke", "Tam emoji font loaded");
        je7 je7Var = this.X;
        je7 je7Var2 = this.Y;
        a8g a8gVar = new a8g();
        a8gVar.a = file;
        a8gVar.b = je7Var;
        a8gVar.c = je7Var2;
        mx5 mx5Var = new mx5(a8gVar);
        if (wd6Var != null) {
            hm9.m(LoadEmojiFontWorker.TAG, "onDownloadEmojiFontSuccess %s", mx5Var);
            ((LoadEmojiFontWorker) wd6Var.b).state = new tn7(mx5Var);
        }
        ((gh3) this.Z.getValue()).e(this);
        this.u0 = null;
    }
}
