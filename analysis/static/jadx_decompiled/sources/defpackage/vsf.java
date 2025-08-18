package defpackage;

/* loaded from: classes2.dex */
public final class vsf {
    public final je7 a;
    public final je7 b;

    public vsf(je7 je7Var, je7 je7Var2) {
        this.a = je7Var;
        this.b = je7Var2;
    }

    public final void a(int i, long j, String str, osf osfVar, q42 q42Var, String str2) {
        String str3;
        ad adVar = (ad) this.a.getValue();
        ky7 ky7Var = new ky7();
        je7 je7Var = this.b;
        ky7Var.put("sessionId", Long.valueOf(((t33) ((q33) je7Var.getValue())).F()));
        ky7Var.put("botId", Long.valueOf(j));
        ky7Var.put("webAppName", str);
        ky7Var.put("entryPoint", Integer.valueOf(osfVar.b));
        ky7Var.put("sourceType", Integer.valueOf(q42Var.a));
        Long lA = q42Var.a();
        if (lA != null) {
            ky7Var.put("sourceId", Long.valueOf(lA.longValue()));
        }
        if (str2 != null) {
            ky7Var.put("label", str2);
        }
        ky7 ky7VarB = ky7Var.b();
        e47 e47Var = new e47();
        e47Var.c = "WEBAPP_ACTION";
        e47Var.b = ((hyc) ((q33) je7Var.getValue())).t();
        if (i == 1) {
            str3 = "OPEN";
        } else if (i == 2) {
            str3 = "CLOSE";
        } else {
            if (i != 3) {
                throw null;
            }
            str3 = "REFRESH";
        }
        e47Var.o = str3;
        e47Var.a = System.currentTimeMillis();
        e47Var.b(ky7VarB);
        adVar.j(e47Var.c());
    }
}
