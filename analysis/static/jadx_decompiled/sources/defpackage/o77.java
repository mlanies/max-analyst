package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o77 implements Iterator {
    public static final o77 a;
    public static final /* synthetic */ o77[] b;

    static {
        o77 o77Var = new o77("INSTANCE", 0);
        a = o77Var;
        b = new o77[]{o77Var};
    }

    public static o77 valueOf(String str) {
        return (o77) Enum.valueOf(o77.class, str);
    }

    public static o77[] values() {
        return (o77[]) b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }
}
