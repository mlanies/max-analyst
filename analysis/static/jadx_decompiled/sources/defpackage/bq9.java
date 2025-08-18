package defpackage;

/* loaded from: classes2.dex */
public final class bq9 implements gq9 {
    public final int b;

    public bq9(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bq9) && this.b == ((bq9) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return zr6.j(new StringBuilder("Auto(brightnessThreshold="), this.b, ")");
    }
}
