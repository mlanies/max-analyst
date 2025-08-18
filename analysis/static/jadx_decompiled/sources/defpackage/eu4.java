package defpackage;

/* loaded from: classes.dex */
public final class eu4 {
    public static final eu4 c = new eu4(0, 0);
    public static final eu4 d = new eu4(1, 8);
    public static final eu4 e = new eu4(3, 10);
    public static final eu4 f = new eu4(4, 10);
    public static final eu4 g = new eu4(5, 10);
    public static final eu4 h = new eu4(6, 10);
    public static final eu4 i = new eu4(6, 8);
    public final int a;
    public final int b;

    public eu4(int i2, int i3) {
        this.a = i2;
        this.b = i3;
    }

    public final boolean a() {
        return b() && this.a != 1 && this.b == 10;
    }

    public final boolean b() {
        int i2 = this.a;
        return (i2 == 0 || i2 == 2 || this.b == 0) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eu4)) {
            return false;
        }
        eu4 eu4Var = (eu4) obj;
        return this.a == eu4Var.a && this.b == eu4Var.b;
    }

    public final int hashCode() {
        return this.b ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DynamicRange@");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("{encoding=");
        switch (this.a) {
            case 0:
                str = "UNSPECIFIED";
                break;
            case 1:
                str = "SDR";
                break;
            case 2:
                str = "HDR_UNSPECIFIED";
                break;
            case 3:
                str = "HLG";
                break;
            case 4:
                str = "HDR10";
                break;
            case 5:
                str = "HDR10_PLUS";
                break;
            case 6:
                str = "DOLBY_VISION";
                break;
            default:
                str = "<Unknown>";
                break;
        }
        sb.append(str);
        sb.append(", bitDepth=");
        return zr6.j(sb, this.b, "}");
    }
}
