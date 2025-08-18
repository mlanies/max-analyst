package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class bt1 {
    public final je7 a;
    public final je7 b;
    public final je7 c;

    public bt1(je7 je7Var, je7 je7Var2, je7 je7Var3) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    public static void c(bt1 bt1Var, String str, String str2, String str3, Long l, String str4, String str5, boolean z, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            l = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        ?? r10 = z;
        if ((i & 64) != 0) {
            r10 = 0;
        }
        ad adVar = (ad) bt1Var.b.getValue();
        ky7 ky7Var = new ky7();
        Integer numD = ((an9) bt1Var.c.getValue()).d();
        if (numD != null) {
            ky7Var.put("screen", Integer.valueOf(numD.intValue()));
        }
        if (str2 != null) {
            ky7Var.put("call_id", str2);
        }
        if (str3 != null) {
            ky7Var.put("event_label_str", str3);
        }
        if (l != null) {
            ky7Var.put("event_label_int", Long.valueOf(l.longValue()));
        }
        if (str4 != null) {
            ky7Var.put("custom_feedback", str4);
        }
        if (str5 != null) {
            ky7Var.put("error_type", str5);
        }
        ky7Var.put("is_group", Integer.valueOf((int) r10));
        ky7 ky7VarB = ky7Var.b();
        e47 e47Var = new e47();
        e47Var.c = "CALL";
        je7 je7Var = bt1Var.a;
        e47Var.b = ((hyc) ((q33) je7Var.getValue())).t();
        e47Var.X = ((t33) ((q33) je7Var.getValue())).F();
        e47Var.o = str;
        e47Var.a = System.currentTimeMillis();
        e47Var.b(ky7VarB);
        adVar.j(e47Var.c());
    }

    public final void a(long j, LinkedHashMap linkedHashMap) {
        ky7 ky7Var = new ky7();
        Integer numD = ((an9) this.c.getValue()).d();
        if (numD != null) {
            ky7Var.put("screen", Integer.valueOf(numD.intValue()));
        }
        ky7Var.put("user_id2", Long.valueOf(j));
        ky7Var.putAll(linkedHashMap);
        b("ADMIN_CALL_SETTINGS_TO_USER", ky7Var.b());
    }

    public final void b(String str, ky7 ky7Var) {
        ad adVar = (ad) this.b.getValue();
        e47 e47Var = new e47();
        e47Var.c = "CALL";
        je7 je7Var = this.a;
        e47Var.b = ((hyc) ((q33) je7Var.getValue())).t();
        e47Var.X = ((t33) ((q33) je7Var.getValue())).F();
        e47Var.o = str;
        e47Var.a = System.currentTimeMillis();
        e47Var.b(ky7Var);
        adVar.j(e47Var.c());
    }

    public final void d(int i, int i2) {
        long j;
        String str;
        if (i2 == 1) {
            j = 1;
        } else {
            if (i2 != 2) {
                throw null;
            }
            j = 2;
        }
        Long lValueOf = Long.valueOf(j);
        if (i == 1) {
            str = "COPY_LINK";
        } else if (i == 2) {
            str = "INSIDE_SHARE";
        } else {
            if (i != 3) {
                throw null;
            }
            str = "OUTSIDE_SHARE";
        }
        c(this, "SHARE_CALL_LINK", null, str, lValueOf, null, null, true, 50);
    }

    public final void e(at1 at1Var, boolean z) {
        c(this, "START_CALL", null, at1Var.a(), Long.valueOf(z ? 2L : 1L), null, null, at1Var instanceof ys1, 50);
    }
}
