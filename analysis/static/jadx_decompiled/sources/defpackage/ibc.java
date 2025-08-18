package defpackage;

/* loaded from: classes2.dex */
public final class ibc {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public ibc(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibc)) {
            return false;
        }
        ibc ibcVar = (ibc) obj;
        return this.a == ibcVar.a && this.b == ibcVar.b && this.c == ibcVar.c && this.d == ibcVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + k7d.e(this.c, k7d.e(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Config(recordingButtonIcon=");
        sb.append(this.a);
        sb.append(", pauseRecordingIcon=");
        sb.append(this.b);
        sb.append(", resumeRecodingIcon=");
        sb.append(this.c);
        sb.append(", swipeToCancelHint=");
        return zr6.j(sb, this.d, ")");
    }
}
