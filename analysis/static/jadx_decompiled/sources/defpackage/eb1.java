package defpackage;

/* loaded from: classes.dex */
public final class eb1 extends gb1 {
    public final boolean a;

    public eb1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eb1) && this.a == ((eb1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return au1.j(new StringBuilder("TalkingState(isEnabled="), this.a, ")");
    }
}
