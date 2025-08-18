package defpackage;

/* loaded from: classes.dex */
public final class t1d {
    public final z1d a;
    public final z1d b;

    public t1d(z1d z1dVar, z1d z1dVar2) {
        this.a = z1dVar;
        this.b = z1dVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t1d.class != obj.getClass()) {
            return false;
        }
        t1d t1dVar = (t1d) obj;
        return this.a.equals(t1dVar.a) && this.b.equals(t1dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        z1d z1dVar = this.a;
        sb.append(z1dVar);
        z1d z1dVar2 = this.b;
        if (z1dVar.equals(z1dVar2)) {
            str = "";
        } else {
            str = ", " + z1dVar2;
        }
        return zr6.l(sb, str, "]");
    }
}
