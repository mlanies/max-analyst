package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class x5f implements je7, Serializable {
    public k56 a;
    public Object b;

    @Override // defpackage.je7
    public final boolean a() {
        return this.b != qq9.v0;
    }

    @Override // defpackage.je7
    public final Object getValue() {
        if (this.b == qq9.v0) {
            this.b = this.a.invoke();
            this.a = null;
        }
        return this.b;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
