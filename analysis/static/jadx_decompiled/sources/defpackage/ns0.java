package defpackage;

/* loaded from: classes2.dex */
public final class ns0 {
    public final int a;

    public static final boolean a(int i) {
        return (i & 268435456) != 0;
    }

    public static final boolean b(int i) {
        return (i & 67108864) != 0;
    }

    public static final boolean c(int i) {
        return (i & 134217728) != 0;
    }

    public static String d(int i) {
        return "BubbleType(" + (a(i) ? "First" : (536870912 & i) != 0 ? "Middle" : (1073741824 & i) != 0 ? "Last" : c(i) ? "Single" : "unknown!") + " " + (b(i) ? (char) 8595 : (char) 8593) + ")";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ns0) {
            return this.a == ((ns0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return d(this.a);
    }
}
