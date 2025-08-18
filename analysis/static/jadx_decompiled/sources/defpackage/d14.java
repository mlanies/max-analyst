package defpackage;

/* loaded from: classes2.dex */
public final class d14 {
    public final String a;
    public final long b;
    public long c = 200;
    public long d;

    public d14(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Command{seq:");
        sb.append(this.b);
        sb.append("|retry count:");
        sb.append(this.d);
        sb.append("|retry timeout:");
        sb.append(this.c);
        sb.append('|');
        return rh4.m(sb, this.a, '}');
    }
}
