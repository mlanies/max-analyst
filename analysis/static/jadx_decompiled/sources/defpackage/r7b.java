package defpackage;

/* loaded from: classes2.dex */
public final class r7b {
    public static final r7b c = new r7b(0, 0);
    public static final r7b d = new r7b(30, 0);
    public final int a;
    public final int b;

    public r7b(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Presence{type=");
        sb.append(this.a);
        sb.append(",seen=");
        return zr6.j(sb, this.b, "}");
    }
}
