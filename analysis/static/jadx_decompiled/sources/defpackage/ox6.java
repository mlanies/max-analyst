package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class ox6 extends jx6 implements NavigableSet, xud {
    public transient ox6 X;
    public final transient Comparator o;

    public ox6(Comparator comparator) {
        this.o = comparator;
    }

    public static mfc n(Comparator comparator) {
        return sm9.a.equals(comparator) ? mfc.Z : new mfc(ffc.X, comparator);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.o;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        mfc mfcVar = (mfc) this;
        return mfcVar.p(0, mfcVar.q(obj, z));
    }

    @Override // java.util.NavigableSet
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final ox6 descendingSet() {
        ox6 ox6VarN = this.X;
        if (ox6VarN == null) {
            mfc mfcVar = (mfc) this;
            Comparator comparatorReverseOrder = Collections.reverseOrder(mfcVar.o);
            ox6VarN = mfcVar.isEmpty() ? n(comparatorReverseOrder) : new mfc(mfcVar.Y.q(), comparatorReverseOrder);
            this.X = ox6VarN;
            ox6VarN.X = this;
        }
        return ox6VarN;
    }

    @Override // java.util.NavigableSet
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final mfc subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.o.compare(obj, obj2) > 0) {
            throw new IllegalArgumentException();
        }
        mfc mfcVar = (mfc) this;
        mfc mfcVarP = mfcVar.p(mfcVar.r(obj, z), mfcVar.Y.size());
        return mfcVarP.p(0, mfcVarP.q(obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        mfc mfcVar = (mfc) this;
        return mfcVar.p(mfcVar.r(obj, z), mfcVar.Y.size());
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        mfc mfcVar = (mfc) this;
        return mfcVar.p(0, mfcVar.q(obj, false));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        mfc mfcVar = (mfc) this;
        return mfcVar.p(mfcVar.r(obj, true), mfcVar.Y.size());
    }
}
