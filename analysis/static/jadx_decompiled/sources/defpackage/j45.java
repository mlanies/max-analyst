package defpackage;

/* loaded from: classes.dex */
public final class j45 {
    public final c45[] a;
    public final long[] b;
    public final String c;
    public final String d;

    public j45(String str, String str2, long[] jArr, c45[] c45VarArr) {
        this.c = str;
        this.d = str2;
        this.b = jArr;
        this.a = c45VarArr;
    }

    public final String a() {
        String str = this.c;
        int iE = rh4.e(1, str);
        String str2 = this.d;
        StringBuilder sb = new StringBuilder(rh4.e(iE, str2));
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        return sb.toString();
    }
}
