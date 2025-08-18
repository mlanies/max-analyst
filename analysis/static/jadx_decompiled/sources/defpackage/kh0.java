package defpackage;

/* loaded from: classes2.dex */
public final class kh0 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final zh9 d;
    public final zh9 e;
    public final zh9 f;

    public kh0(je7 je7Var, je7 je7Var2, je7 je7Var3) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
        int i = f37.a;
        this.d = new zh9(6);
        this.e = new zh9(6);
        this.f = new zh9(6);
    }

    public final void a(int i, int i2, int i3) {
        Integer numD = ((an9) this.c.getValue()).d();
        if (numD != null) {
            b(i, numD.intValue(), i2, i3, ((t33) ((q33) this.a.getValue())).F(), "clicked");
        }
    }

    public final void b(int i, int i2, int i3, int i4, long j, String str) {
        String str2;
        String str3;
        String str4;
        ad adVar = (ad) this.b.getValue();
        ky7 ky7Var = new ky7();
        if (i == 1) {
            str2 = "push";
        } else if (i == 2) {
            str2 = "contacts";
        } else {
            if (i != 3) {
                throw null;
            }
            str2 = "mic";
        }
        ky7Var.put("bannerType", str2);
        ky7Var.put("screen", Integer.valueOf(i2));
        if (i3 == 1) {
            str3 = "small";
        } else if (i3 == 2) {
            str3 = "medium";
        } else {
            if (i3 != 3) {
                throw null;
            }
            str3 = "large";
        }
        ky7Var.put("bannerSize", str3);
        if (i4 == 1) {
            str4 = "carousel";
        } else {
            if (i4 != 2) {
                throw null;
            }
            str4 = "banner";
        }
        ky7Var.put("bannerShowType", str4);
        ky7 ky7VarB = ky7Var.b();
        e47 e47Var = new e47();
        e47Var.c = "BANNER";
        e47Var.b = ((hyc) ((q33) this.a.getValue())).t();
        e47Var.X = j;
        e47Var.o = str;
        e47Var.a = System.currentTimeMillis();
        e47Var.b(ky7VarB);
        adVar.j(e47Var.c());
    }
}
