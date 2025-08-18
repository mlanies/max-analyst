package defpackage;

/* loaded from: classes2.dex */
public final class l67 {
    public final je7 a;
    public final je7 b;
    public final je7 c;

    public l67(je7 je7Var, je7 je7Var2, je7 je7Var3) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
    }

    public final void a(String str, String str2, String str3) {
        ky7 ky7Var = new ky7();
        je7 je7Var = this.a;
        ky7Var.put("session_id", Long.valueOf(((t33) ((q33) je7Var.getValue())).F()));
        ky7Var.put("screen", ((an9) this.b.getValue()).d());
        ky7Var.put("entryPoint", str2);
        ky7Var.put("linkType", str3);
        ky7Var.put("status", "success");
        ky7 ky7VarB = ky7Var.b();
        e47 e47Var = new e47();
        e47Var.c = "INVITE_MAX_BANNER";
        e47Var.o = str;
        e47Var.b = ((hyc) ((q33) je7Var.getValue())).t();
        e47Var.a = System.currentTimeMillis();
        e47Var.b(ky7VarB);
        ((ad) this.c.getValue()).j(e47Var.c());
    }

    public final void b() {
        Integer numD = ((an9) this.b.getValue()).d();
        a("click_qr", (numD != null && numD.intValue() == 100) ? "plus" : "main", "invite_friends");
    }
}
