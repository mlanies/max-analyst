package defpackage;

import java.util.AbstractList;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class rm7 extends g1f implements ListIterator {
    public final /* synthetic */ int b;
    public final /* synthetic */ AbstractList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rm7(AbstractList abstractList, ListIterator listIterator, int i) {
        super(listIterator);
        this.b = i;
        this.c = abstractList;
    }

    @Override // defpackage.g1f
    public final Object a(Object obj) {
        switch (this.b) {
            case 0:
                return ((sm7) this.c).b.mo131apply(obj);
            default:
                return ((tm7) this.c).b.mo131apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a(((ListIterator) this.a).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
