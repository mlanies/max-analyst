package defpackage;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class vma extends x1 implements RandomAccess {
    public final aw0[] a;
    public final int[] b;

    public vma(aw0[] aw0VarArr, int[] iArr) {
        this.a = aw0VarArr;
        this.b = iArr;
    }

    @Override // defpackage.x1, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof aw0) {
            return super.contains((aw0) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.a[i];
    }

    @Override // defpackage.x1
    public final int getSize() {
        return this.a.length;
    }

    @Override // defpackage.x1, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof aw0) {
            return super.indexOf((aw0) obj);
        }
        return -1;
    }

    @Override // defpackage.x1, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof aw0) {
            return super.lastIndexOf((aw0) obj);
        }
        return -1;
    }
}
