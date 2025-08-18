package defpackage;

/* loaded from: classes2.dex */
public final class it3 {
    public final /* synthetic */ int a = 0;
    public long b;
    public String c;
    public String d;
    public String e;

    public /* synthetic */ it3() {
    }

    public boolean a() {
        String str = this.d;
        return (str == null || str.length() == 0 || !eae.o0(str, "image/", true) || w9e.p0(str, "djvu", true)) ? false : true;
    }

    public boolean b() {
        String str = this.d;
        return (str == null || str.length() == 0 || !eae.o0(str, "video/", true)) ? false : true;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentUriParams{contentLength=");
                sb.append(this.b);
                sb.append(", contentName='");
                sb.append(this.c);
                sb.append("', mimeType='");
                sb.append(this.d);
                sb.append("', path='");
                return zr6.l(sb, this.e, "'}");
            default:
                return super.toString();
        }
    }

    public it3(it3 it3Var) {
        this.b = it3Var.b;
        this.c = it3Var.c;
        this.d = it3Var.d;
        this.e = it3Var.e;
    }
}
