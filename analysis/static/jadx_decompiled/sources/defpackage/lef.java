package defpackage;

/* loaded from: classes2.dex */
public final class lef {
    public final String a;
    public final ref b;

    public lef(l7b l7bVar) {
        this.a = (String) l7bVar.b;
        this.b = (ref) l7bVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lef.class != obj.getClass()) {
            return false;
        }
        lef lefVar = (lef) obj;
        String str = lefVar.a;
        String str2 = this.a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        ref refVar = lefVar.b;
        ref refVar2 = this.b;
        return refVar2 != null ? refVar2.equals(refVar) : refVar == null;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        ref refVar = this.b;
        return iHashCode + (refVar != null ? refVar.hashCode() : 0);
    }

    public final String toString() {
        return "VideoConversionData{sourceUri='" + this.a + "', convertOptions=" + this.b + '}';
    }
}
