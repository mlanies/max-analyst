package defpackage;

/* loaded from: classes.dex */
public abstract class oy {
    public final /* synthetic */ int a;
    public int b;

    public static String d(int i) {
        StringBuilder sb = new StringBuilder(4);
        sb.append((char) ((i >> 24) & 255));
        sb.append((char) ((i >> 16) & 255));
        sb.append((char) ((i >> 8) & 255));
        sb.append((char) (i & 255));
        return sb.toString();
    }

    public static String e(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public static int s(int i) {
        return (i >> 24) & 255;
    }

    public static int t(int i) {
        return (i >> 24) & 255;
    }

    public void a(int i) {
        switch (this.a) {
            case 2:
                this.b = i | this.b;
                break;
            default:
                this.b = i | this.b;
                break;
        }
    }

    public abstract void b(k36 k36Var);

    public abstract void c(k36 k36Var);

    public boolean f(int i) {
        switch (this.a) {
            case 2:
                if ((this.b & i) == i) {
                }
                break;
            default:
                if ((this.b & i) == i) {
                }
                break;
        }
        return false;
    }

    public abstract int h();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract void n();

    public abstract void o(k36 k36Var);

    public abstract void q(k36 k36Var);

    public abstract yx8 r(k36 k36Var);

    public String toString() {
        switch (this.a) {
            case 0:
                return d(this.b);
            case 1:
                return e(this.b);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ oy(int i, int i2) {
        this.a = i2;
        this.b = i;
    }
}
