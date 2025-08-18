package defpackage;

/* loaded from: classes.dex */
public final class lv3 implements mv3 {
    public final int a;

    public lv3(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lv3) && this.a == ((lv3) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return zr6.j(new StringBuilder("StopSeekPlayerProgress(progress="), this.a, ")");
    }
}
