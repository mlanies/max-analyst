package defpackage;

/* loaded from: classes2.dex */
public final class hc2 {
    public final je7 a;
    public final je7 b;
    public final String c = hc2.class.getName();

    public hc2(je7 je7Var, je7 je7Var2) {
        this.a = je7Var;
        this.b = je7Var2;
    }

    public static void a(hc2 hc2Var, long j, long j2, long j3, long j4, mg4 mg4Var) {
        hc2Var.getClass();
        StringBuilder sbJ = z7b.j("from: chatId = ", j, ", time = ", nu0.G(Long.valueOf(j3)));
        sbJ.append(", chatAccessToken=");
        sbJ.append(true);
        hm9.n(hc2Var.c, sbJ.toString());
        ome.b((ome) hc2Var.b.getValue(), new cc2(((hyc) ((rhc) hc2Var.a.getValue())).o(), j, j2, j3, j4, null, 0, 40, 0L, mg4Var, 3776));
    }

    public static long b(hc2 hc2Var, long j, long j2, long j3, long j4, long j5, mg4 mg4Var) {
        hc2Var.getClass();
        String strG = nu0.G(Long.valueOf(j3));
        String strG2 = nu0.G(Long.valueOf(j4));
        StringBuilder sbJ = z7b.j("from-to: chatId = ", j, ", time = ", strG);
        sbJ.append(", backwardTime = ");
        sbJ.append(strG2);
        sbJ.append(", chatAccessToken=");
        sbJ.append(true);
        hm9.n(hc2Var.c, sbJ.toString());
        return ome.b((ome) hc2Var.b.getValue(), new cc2(((hyc) ((rhc) hc2Var.a.getValue())).o(), j, j2, j3, j5, null, 40, 40, j4, mg4Var, 3200));
    }

    public static long c(hc2 hc2Var, long j, long j2, long j3, long j4, long j5, mg4 mg4Var) {
        hc2Var.getClass();
        String strG = nu0.G(Long.valueOf(j3));
        String strG2 = nu0.G(Long.valueOf(j4));
        StringBuilder sbJ = z7b.j("to: chatId = ", j, ", time = ", strG);
        sbJ.append(", backwardTime = ");
        sbJ.append(strG2);
        sbJ.append(", chatAccessToken=");
        sbJ.append(true);
        hm9.n(hc2Var.c, sbJ.toString());
        return ome.b((ome) hc2Var.b.getValue(), new cc2(((hyc) ((rhc) hc2Var.a.getValue())).o(), j, j2, j3, j5, null, 0, 40, j4, mg4Var, 3264));
    }
}
