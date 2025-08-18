package defpackage;

/* loaded from: classes2.dex */
public final class v4d {
    public final long a;
    public final int b;

    public v4d(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4d)) {
            return false;
        }
        v4d v4dVar = (v4d) obj;
        return this.a == v4dVar.a && this.b == v4dVar.b;
    }

    public final int hashCode() {
        return au1.s(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectedMention(id=");
        sb.append(this.a);
        sb.append(", selectedMentionType=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? "null" : "NAME" : "SHORTLINK");
        sb.append(")");
        return sb.toString();
    }
}
