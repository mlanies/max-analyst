package defpackage;

/* loaded from: classes.dex */
public final class m94 {
    public final /* synthetic */ int a;
    public final String b;
    public final String c;

    public /* synthetic */ m94(String str, String str2, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(this.b);
                sb.append("(");
                return zr6.l(sb, this.c, ")");
            default:
                String str = this.b;
                int iE = rh4.e(2, str);
                String str2 = this.c;
                StringBuilder sb2 = new StringBuilder(rh4.e(iE, str2));
                sb2.append(str);
                sb2.append(", ");
                sb2.append(str2);
                return sb2.toString();
        }
    }
}
