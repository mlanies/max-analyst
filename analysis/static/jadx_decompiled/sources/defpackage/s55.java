package defpackage;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class s55 implements Enumeration {
    public final Enumeration a;

    public s55(t55 t55Var) {
        this.a = Collections.enumeration(t55Var.a);
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.a.hasMoreElements();
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        return new HashMap((Map) this.a.nextElement());
    }
}
