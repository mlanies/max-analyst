package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class kh4 implements c6d {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final a66 d;

    public kh4(CharSequence charSequence, int i, int i2, a66 a66Var) {
        this.a = charSequence;
        this.b = i;
        this.c = i2;
        this.d = a66Var;
    }

    @Override // defpackage.c6d
    public final Iterator iterator() {
        return new jh4(this);
    }
}
