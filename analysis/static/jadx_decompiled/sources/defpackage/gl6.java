package defpackage;

/* loaded from: classes.dex */
public final class gl6 extends hl6 {
    public final String a;

    public gl6(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gl6) && tpa.f(this.a, ((gl6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return zr6.l(new StringBuilder("Time(time="), this.a, ")");
    }
}
