package defpackage;

/* loaded from: classes2.dex */
public final class i9c {
    public final int a;
    public final long b;
    public final long c;
    public final tva d;

    public i9c(s82 s82Var) {
        this.a = s82Var.a;
        this.b = s82Var.b;
        this.c = s82Var.c;
        this.d = (tva) s82Var.d;
    }

    public static i9c a(gy8 gy8Var) {
        int i;
        String str;
        int iN = lz7.N(gy8Var);
        if (iN == 0) {
            return null;
        }
        s82 s82Var = new s82();
        for (int i2 = 0; i2 < iN; i2++) {
            String strZ0 = gy8Var.z0();
            strZ0.getClass();
            switch (strZ0) {
                case "id":
                    s82Var.b = gy8Var.w0();
                    break;
                case "gif":
                    s82Var.d = (tva) bz.b(gy8Var);
                    break;
                case "type":
                    String strP = lz7.P(gy8Var);
                    int[] iArrV = au1.v(3);
                    int length = iArrV.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            i = 1;
                        } else {
                            i = iArrV[i3];
                            if (i == 1) {
                                str = "UNKNOWN";
                            } else if (i == 2) {
                                str = "STICKER";
                            } else {
                                if (i != 3) {
                                    throw null;
                                }
                                str = "GIF";
                            }
                            if (!str.equals(strP)) {
                                i3++;
                            }
                        }
                    }
                    s82Var.a = i;
                    break;
                case "stickerId":
                    s82Var.c = lz7.M(gy8Var, 0L);
                    break;
                default:
                    gy8Var.z();
                    break;
            }
        }
        return new i9c(s82Var);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecentItem{type=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "GIF" : "STICKER" : "UNKNOWN");
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", stickerId=");
        sb.append(this.c);
        sb.append(", gif=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
