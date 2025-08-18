package defpackage;

/* loaded from: classes2.dex */
public final class iwf {
    public final je7 a;
    public final je7 b;

    public iwf(je7 je7Var, je7 je7Var2) {
        this.a = je7Var;
        this.b = je7Var2;
    }

    public static void a(iwf iwfVar, String str, long j, String str2, boolean z, int i, Integer num, Integer num2, int i2) {
        if ((i2 & 16) != 0) {
            i = 0;
        }
        if ((i2 & 32) != 0) {
            num = null;
        }
        if ((i2 & 64) != 0) {
            num2 = null;
        }
        ad adVar = (ad) iwfVar.a.getValue();
        ky7 ky7Var = new ky7();
        je7 je7Var = iwfVar.b;
        ky7Var.put("sessionId", Long.valueOf(((t33) ((q33) je7Var.getValue())).F()));
        ky7Var.put("botId", Long.valueOf(j));
        ky7Var.put("webAppName", str2);
        ky7Var.put("success", Integer.valueOf(z ? 1 : 0));
        ky7Var.put("type", Integer.valueOf(i));
        if (num != null) {
            ky7Var.put("method", num);
        }
        if (num2 != null) {
            ky7Var.put("code", num2);
        }
        ky7 ky7VarB = ky7Var.b();
        e47 e47Var = new e47();
        e47Var.c = "WEBAPP_BRIDGE";
        e47Var.b = ((hyc) ((q33) je7Var.getValue())).t();
        e47Var.a = System.currentTimeMillis();
        e47Var.o = str;
        e47Var.b(ky7VarB);
        adVar.j(e47Var.c());
    }
}
