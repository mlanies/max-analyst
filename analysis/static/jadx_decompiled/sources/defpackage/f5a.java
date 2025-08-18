package defpackage;

/* loaded from: classes2.dex */
public final class f5a {
    public final z4 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;

    public f5a(je7 je7Var, je7 je7Var2, z4 z4Var, je7 je7Var3) {
        this.a = z4Var;
        this.b = je7Var;
        this.c = je7Var2;
        this.d = je7Var3;
    }

    public final b5 a() {
        return (b5) this.c.getValue();
    }

    public final m7b b() {
        return (m7b) this.b.getValue();
    }

    public final oq0 c() {
        boolean zD = d();
        boolean z = false;
        boolean zD2 = ((p7b) b()).d.d("auth.account.external", false);
        if (zD && zD2) {
            z = true;
        }
        return new oq0(zD, z);
    }

    public final boolean d() {
        if (((p7b) b()).a.t() != -1) {
            String string = ((p7b) b()).d.g.getString("auth.token", null);
            if (string != null && string.length() != 0) {
                return true;
            }
            b5 b5VarA = a();
            b5VarA.a();
            b5VarA.a.getClass();
        }
        return false;
    }

    public final boolean e() {
        return d() && ((p7b) b()).d.d("auth.account.external", false);
    }

    public final String f() {
        String string;
        if (((p7b) b()).a.t() == 0 || (string = ((p7b) b()).d.g.getString("auth.token", null)) == null || string.length() == 0) {
            return null;
        }
        String string2 = ((p7b) b()).d.g.getString("auth.token", null);
        if (string2 != null && string2.length() != 0) {
            return string2;
        }
        b5 b5VarA = a();
        b5VarA.a();
        b5VarA.a.getClass();
        return null;
    }

    public final void g(boolean z) {
        hm9.n("f5a", "removeAccount");
        ((p7b) b()).d.c();
        a().b();
        if (z) {
            int i = t8d.o;
            s8g s8gVar = (s8g) this.d.getValue();
            boolean zE = e();
            int i2 = ft4.o;
            t8d.c = z7.S(System.nanoTime(), kt4.NANOSECONDS);
            s8gVar.a(new t8d(zE));
        }
    }

    public final void h(String str, boolean z) {
        ((p7b) b()).d.o(a().a(), str, z);
        a().getClass();
    }
}
