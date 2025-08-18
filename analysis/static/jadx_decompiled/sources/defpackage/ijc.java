package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public abstract class ijc extends hjc implements n66 {
    public final int b;

    public ijc(int i, Continuation continuation) {
        super(continuation);
        this.b = i;
    }

    @Override // defpackage.n66
    public final int getArity() {
        return this.b;
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
