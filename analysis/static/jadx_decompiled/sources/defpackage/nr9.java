package defpackage;

/* loaded from: classes2.dex */
public final class nr9 extends gle {
    public long X;
    public String Y;
    public long c;
    public long o;

    @Override // defpackage.gle
    public final void b(gy8 gy8Var, String str) {
        str.getClass();
        switch (str) {
            case "fileId":
                this.X = lz7.M(gy8Var, 0L);
                break;
            case "audioId":
                this.c = lz7.M(gy8Var, 0L);
                break;
            case "error":
                this.Y = lz7.P(gy8Var);
                break;
            case "videoId":
                this.o = lz7.M(gy8Var, 0L);
                break;
            default:
                gy8Var.z();
                break;
        }
    }

    @Override // defpackage.zje
    public final String toString() {
        long j = this.c;
        long j2 = this.o;
        long j3 = this.X;
        String str = this.Y;
        StringBuilder sbK = au1.k(j, "{audioId=", ", videoId=");
        sbK.append(j2);
        au1.q(j3, ", fileId=", ", error='", sbK);
        return zr6.l(sbK, str, "'}");
    }
}
