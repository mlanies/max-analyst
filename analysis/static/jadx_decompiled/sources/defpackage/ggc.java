package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class ggc {
    public final je7 a;

    public ggc(je7 je7Var) {
        this.a = je7Var;
    }

    public q33 a() {
        return (q33) this.a.getValue();
    }

    public void b(boolean z) {
        hm9.n("SavedBackgroundThemeMigration", "Start theme background migration for theme: isDark=" + z + ".");
        String strL = tfg.l(a(), z);
        List list = z ? ze0.c : ze0.b;
        t33 t33Var = (t33) a();
        if (z ? t33Var.g.getBoolean("app.chat.background.was.set.as.solid.color.dark", false) : t33Var.g.getBoolean("app.chat.background.was.set.as.solid.color.light", false)) {
            tfg.A(null, z, a());
        } else if (strL == null || !list.contains(strL)) {
            tfg.A((String) x53.i0(list), z, a());
        } else {
            tfg.A(strL, z, a());
        }
    }

    public ggc(je7 je7Var, je7 je7Var2) {
        this.a = je7Var;
    }
}
