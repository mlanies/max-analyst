package defpackage;

/* loaded from: classes2.dex */
public final class c39 implements f39 {
    public final String a;

    public c39(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c39) && tpa.f(this.a, ((c39) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return zr6.l(new StringBuilder("ProcessBotCommand(botCommand="), this.a, ")");
    }
}
