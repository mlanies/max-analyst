package defpackage;

/* loaded from: classes2.dex */
public final class sua extends gle {
    public int X;
    public int Y;
    public int Z;
    public String c;
    public int o;
    public int s0;
    public int t0;

    public sua(gy8 gy8Var) {
        super(gy8Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0010  */
    @Override // defpackage.gle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.gy8 r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sua.b(gy8, java.lang.String):void");
    }

    @Override // defpackage.zje
    public final String toString() {
        String strX = oag.x(this.c);
        int i = this.o;
        int i2 = this.X;
        int i3 = this.Y;
        int i4 = this.s0;
        int i5 = this.Z;
        int i6 = this.t0;
        StringBuilder sb = new StringBuilder("{token='");
        sb.append(strX);
        sb.append("', retries=");
        sb.append(i);
        sb.append(", codeDelay=");
        ms2.k(sb, i2, ", codeLength=", i3, ", tokenType=");
        sb.append(ey8.p(i4));
        sb.append(", callDelay=");
        sb.append(i5);
        sb.append(", requestType=");
        sb.append(i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? "null" : "CALL" : "CALL_DELAY" : "SMS" : "UNKNOWN");
        sb.append("}");
        return sb.toString();
    }
}
