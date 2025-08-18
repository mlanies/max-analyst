package defpackage;

/* loaded from: classes.dex */
public final class l3f {
    public final /* synthetic */ int a;
    public final String b;
    public final int c;
    public final int d;
    public int e;
    public String f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l3f(int i, int i2, int i3, byte b) {
        this(Integer.MIN_VALUE, i, i2, 0);
        this.a = i3;
        switch (i3) {
            case 1:
                this(Integer.MIN_VALUE, i, i2, 1);
                break;
            default:
                break;
        }
    }

    public final void a() {
        switch (this.a) {
            case 0:
                int i = this.e;
                int i2 = i == Integer.MIN_VALUE ? this.c : i + this.d;
                this.e = i2;
                String str = this.b;
                this.f = z7b.h(rh4.e(11, str), i2, str);
                break;
            default:
                int i3 = this.e;
                this.e = i3 == Integer.MIN_VALUE ? this.c : i3 + this.d;
                this.f = this.b + this.e;
                break;
        }
    }

    public final void b() {
        switch (this.a) {
            case 0:
                if (this.e == Integer.MIN_VALUE) {
                    throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
                }
                return;
            default:
                if (this.e == Integer.MIN_VALUE) {
                    throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
                }
                return;
        }
    }

    public l3f(int i, int i2, int i3, int i4) {
        String str;
        String string;
        this.a = i4;
        switch (i4) {
            case 1:
                if (i != Integer.MIN_VALUE) {
                    str = i + "/";
                } else {
                    str = "";
                }
                this.b = str;
                this.c = i2;
                this.d = i3;
                this.e = Integer.MIN_VALUE;
                this.f = "";
                break;
            default:
                if (i != Integer.MIN_VALUE) {
                    StringBuilder sb = new StringBuilder(12);
                    sb.append(i);
                    sb.append("/");
                    string = sb.toString();
                } else {
                    string = "";
                }
                this.b = string;
                this.c = i2;
                this.d = i3;
                this.e = Integer.MIN_VALUE;
                this.f = "";
                break;
        }
    }
}
