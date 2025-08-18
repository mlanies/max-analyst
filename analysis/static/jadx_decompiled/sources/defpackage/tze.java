package defpackage;

/* loaded from: classes.dex */
public final class tze {
    public static final tze d = new tze(new rze[0]);
    public static final String e;
    public final int a;
    public final ffc b;
    public int c;

    static {
        int i = oaf.a;
        e = Integer.toString(0, 36);
    }

    public tze(rze... rzeVarArr) {
        this.b = zw6.k(rzeVarArr);
        this.a = rzeVarArr.length;
        int i = 0;
        while (true) {
            ffc ffcVar = this.b;
            if (i >= ffcVar.size()) {
                return;
            }
            int i2 = i + 1;
            for (int i3 = i2; i3 < ffcVar.size(); i3++) {
                if (((rze) ffcVar.get(i)).equals(ffcVar.get(i3))) {
                    z04.v("", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final rze a(int i) {
        return (rze) this.b.get(i);
    }

    public final int b(rze rzeVar) {
        int iIndexOf = this.b.indexOf(rzeVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tze.class != obj.getClass()) {
            return false;
        }
        tze tzeVar = (tze) obj;
        return this.a == tzeVar.a && this.b.equals(tzeVar.b);
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = this.b.hashCode();
        }
        return this.c;
    }
}
