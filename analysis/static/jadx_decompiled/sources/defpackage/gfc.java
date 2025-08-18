package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class gfc extends zw6 {
    public final /* synthetic */ hfc c;

    public gfc(hfc hfcVar) {
        this.c = hfcVar;
    }

    @Override // defpackage.qw6
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        hfc hfcVar = this.c;
        z04.k(i, hfcVar.Z);
        int i2 = i * 2;
        int i3 = hfcVar.Y;
        Object[] objArr = hfcVar.X;
        Object obj = objArr[i2 + i3];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + (i3 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.Z;
    }
}
