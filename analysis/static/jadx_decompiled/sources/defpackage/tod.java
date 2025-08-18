package defpackage;

/* loaded from: classes2.dex */
public abstract class tod {
    public final boolean direct;
    public final String message;

    public tod(String str, boolean z) {
        this.message = str;
        this.direct = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        tod todVar = (tod) obj;
        if (this.direct != todVar.direct) {
            return false;
        }
        return this.message.equals(todVar.message);
    }

    public int hashCode() {
        return (this.message.hashCode() * 31) + (this.direct ? 1 : 0);
    }
}
