package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class kl3 {
    public final String a;

    public kl3(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kl3) {
            return Objects.equals(this.a, ((kl3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        return zr6.l(new StringBuilder("MenuButton{text='"), this.a, "'}");
    }
}
