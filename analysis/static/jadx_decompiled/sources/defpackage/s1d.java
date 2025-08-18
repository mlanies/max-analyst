package defpackage;

/* loaded from: classes.dex */
public final class s1d {
    public final y1d a;
    public final y1d b;

    public s1d(y1d y1dVar, y1d y1dVar2) {
        this.a = y1dVar;
        this.b = y1dVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s1d.class != obj.getClass()) {
            return false;
        }
        s1d s1dVar = (s1d) obj;
        return this.a.equals(s1dVar.a) && this.b.equals(s1dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String string;
        y1d y1dVar = this.a;
        String strValueOf = String.valueOf(y1dVar);
        y1d y1dVar2 = this.b;
        if (y1dVar.equals(y1dVar2)) {
            string = "";
        } else {
            String strValueOf2 = String.valueOf(y1dVar2);
            StringBuilder sb = new StringBuilder(strValueOf2.length() + 2);
            sb.append(", ");
            sb.append(strValueOf2);
            string = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder(rh4.e(strValueOf.length() + 2, string));
        sb2.append("[");
        sb2.append(strValueOf);
        sb2.append(string);
        sb2.append("]");
        return sb2.toString();
    }
}
