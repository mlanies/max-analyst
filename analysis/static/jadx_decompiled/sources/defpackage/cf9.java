package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class cf9 extends gle {
    public final Map c;

    public cf9(us usVar) {
        this.c = usVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cf9) && tpa.f(this.c, ((cf9) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.zje
    public final String toString() {
        return "Response(messagesReactions=" + this.c + ")";
    }
}
