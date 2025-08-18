package defpackage;

/* loaded from: classes2.dex */
public final class nad extends gle {
    public int X;
    public wz Y;
    public String c;
    public String o;

    public nad(gy8 gy8Var) {
        super(gy8Var);
    }

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        str.getClass();
        switch (str) {
            case "proxy-domains":
                this.Y = wz.g(gy8Var);
                break;
            case "proxy":
                this.c = lz7.P(gy8Var);
                break;
            case "app-update-type":
                this.X = lz7.L(gy8Var);
                break;
            case "location":
                this.o = lz7.P(gy8Var);
                break;
            default:
                gy8Var.z();
                break;
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        String str = this.c;
        String str2 = this.o;
        int i = this.X;
        wz wzVar = this.Y;
        StringBuilder sbK = k7d.k("{  proxy='", str, "', locationCountryCode='", str2, "', appUpdateType=");
        sbK.append(i);
        sbK.append(", proxyDomains=");
        sbK.append(wzVar);
        sbK.append("}");
        return sbK.toString();
    }
}
