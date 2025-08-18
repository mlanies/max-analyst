package defpackage;

/* loaded from: classes.dex */
public final class sze implements su0 {
    public static final sze o = new sze(new qze[0]);
    public final int a;
    public final ffc b;
    public int c;

    public sze(qze... qzeVarArr) {
        this.b = zw6.k(qzeVarArr);
        this.a = qzeVarArr.length;
        int i = 0;
        while (true) {
            ffc ffcVar = this.b;
            if (i >= ffcVar.size()) {
                return;
            }
            int i2 = i + 1;
            for (int i3 = i2; i3 < ffcVar.size(); i3++) {
                if (((qze) ffcVar.get(i)).equals(ffcVar.get(i3))) {
                    fm9.r(new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final qze a(int i) {
        return (qze) this.b.get(i);
    }

    public final int b(qze qzeVar) {
        int iIndexOf = this.b.indexOf(qzeVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sze.class != obj.getClass()) {
            return false;
        }
        sze szeVar = (sze) obj;
        return this.a == szeVar.a && this.b.equals(szeVar.b);
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = this.b.hashCode();
        }
        return this.c;
    }
}
