package defpackage;

/* loaded from: classes.dex */
public final class jy implements pob {
    public final int a;

    public jy(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return pob.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pob)) {
            return false;
        }
        jy jyVar = (jy) ((pob) obj);
        if (this.a == jyVar.a) {
            Object obj2 = oob.a;
            jyVar.getClass();
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (oob.a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + oob.a + ')';
    }
}
