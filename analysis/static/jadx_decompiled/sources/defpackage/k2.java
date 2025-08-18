package defpackage;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class k2 extends b2 implements ListIterator {
    public final /* synthetic */ l2 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(l2 l2Var) {
        super(l2Var);
        this.X = l2Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        l2 l2Var = this.X;
        boolean zIsEmpty = l2Var.isEmpty();
        b().add(obj);
        l2Var.Y.X++;
        if (zIsEmpty) {
            l2Var.a();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(l2 l2Var, int i) {
        super(l2Var, ((List) l2Var.b).listIterator(i));
        this.X = l2Var;
    }
}
