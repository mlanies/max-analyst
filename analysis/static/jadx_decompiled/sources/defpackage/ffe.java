package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public abstract class ffe extends hu3 implements n66 {
    public final int o;

    public ffe(int i, Continuation continuation) {
        super(continuation);
        this.o = i;
    }

    @Override // defpackage.n66
    public final int getArity() {
        return this.o;
    }

    @Override // defpackage.gi0
    public final String toString() {
        if (this.a != null) {
            return super.toString();
        }
        nec.a.getClass();
        return oec.a(this);
    }
}
