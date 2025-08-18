package defpackage;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class s2 extends AbstractMap implements Map, ub7 {
    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new xd3((yd3) this, new ai0(10));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new xd3((yd3) this, new ai0(9));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return yd3.b.get((yd3) this);
    }
}
