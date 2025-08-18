package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class oqc implements Map.Entry {
    public final Object a;
    public final Object b;
    public oqc c;
    public oqc o;

    public oqc(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oqc)) {
            return false;
        }
        oqc oqcVar = (oqc) obj;
        return this.a.equals(oqcVar.a) && this.b.equals(oqcVar.b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.a + "=" + this.b;
    }
}
