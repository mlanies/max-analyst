package defpackage;

import java.util.List;
import ru.ok.tamtam.util.HandledException;

/* loaded from: classes2.dex */
public final class ay4 extends tw4 implements tx4 {
    public final je7 a;
    public final je7 b;
    public zw4 c;
    public jy4 d;
    public boolean e;

    public ay4(je7 je7Var, je7 je7Var2) {
        this.a = je7Var;
        this.b = je7Var2;
    }

    @Override // defpackage.tx4
    public final boolean a(int i, CharSequence charSequence) {
        return j().a(i, charSequence);
    }

    @Override // defpackage.tx4
    public final List c(CharSequence charSequence) {
        return j().c(charSequence);
    }

    @Override // defpackage.tx4
    public final CharSequence e(CharSequence charSequence) {
        return j().e(charSequence);
    }

    @Override // defpackage.tx4
    public final List f(CharSequence charSequence) {
        return j().f(charSequence);
    }

    @Override // defpackage.tx4
    public final boolean g(CharSequence charSequence) {
        return j().g(charSequence);
    }

    @Override // defpackage.tw4
    public final void h(Throwable th) {
        vx4 vx4Var;
        je7 je7Var = this.b;
        if (je7Var == null || (vx4Var = (vx4) je7Var.getValue()) == null) {
            return;
        }
        ((cba) ((o45) vx4Var.e.getValue())).c(new HandledException("Can't load emoji", th), true);
    }

    @Override // defpackage.tw4
    public final void i() {
        vx4 vx4Var;
        int i = 1;
        this.c = new zw4(vw4.a());
        this.e = true;
        je7 je7Var = this.b;
        if (je7Var == null || (vx4Var = (vx4) je7Var.getValue()) == null) {
            return;
        }
        ((jle) ((hle) vx4Var.d.getValue())).a().b(new dd4(14, vx4Var));
        sx4 sx4Var = (sx4) vx4Var.f.getValue();
        if (sx4Var.d == null) {
            hm9.n("sx4", "invalidate: palette is null. Ignore");
        } else {
            hm9.n("sx4", "invalidate");
            new e0a(qy9.j(sx4Var.d), new rx4(sx4Var, 0), 1).v().m(((jle) sx4Var.b).a()).k(new iq1(new rx4(sx4Var, i), 2, new ta4(10)));
        }
    }

    public final tx4 j() {
        zw4 zw4Var = this.c;
        if (zw4Var != null) {
            return zw4Var;
        }
        if (this.d == null) {
            this.d = new jy4();
        }
        return this.d;
    }
}
