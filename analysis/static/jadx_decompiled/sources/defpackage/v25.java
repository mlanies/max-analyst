package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class v25 extends x1 implements u25, Serializable {
    public final Enum[] a;

    public v25(Enum[] enumArr) {
        this.a = enumArr;
    }

    @Override // defpackage.x1, java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        return ((Enum) ys.f0(r3.ordinal(), this.a)) == r3;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.a;
        int length = enumArr.length;
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException(rh4.h("index: ", i, length, ", size: "));
        }
        return enumArr[i];
    }

    @Override // defpackage.x1
    public final int getSize() {
        return this.a.length;
    }

    @Override // defpackage.x1, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) ys.f0(iOrdinal, this.a)) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // defpackage.x1, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return indexOf((Enum) obj);
        }
        return -1;
    }
}
