package defpackage;

/* loaded from: classes.dex */
public final class hi5 {
    public final ma0 a;
    public final ma0 b;

    public hi5(ma0 ma0Var) {
        this.a = ma0Var;
        this.b = ma0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi5)) {
            return false;
        }
        return this.b.equals(((hi5) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString().replaceFirst("FileOutputOptionsInternal", "FileOutputOptions");
    }
}
