package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class rd7 implements n66, Serializable {
    private final int arity;

    public rd7(int i) {
        this.arity = i;
    }

    @Override // defpackage.n66
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        nec.a.getClass();
        return oec.a(this);
    }
}
