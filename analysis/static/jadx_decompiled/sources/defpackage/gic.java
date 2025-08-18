package defpackage;

/* loaded from: classes2.dex */
public final class gic implements eic {
    public k56 a;
    public Object b;

    @Override // defpackage.je7
    public final boolean a() {
        return this.b != c32.Y;
    }

    @Override // defpackage.je7
    public final Object getValue() {
        if (this.b == c32.Y) {
            this.b = this.a.invoke();
        }
        return this.b;
    }

    @Override // defpackage.eic
    public final void reset() {
        this.b = c32.Y;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
