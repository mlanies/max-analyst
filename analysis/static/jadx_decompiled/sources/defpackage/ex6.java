package defpackage;

import java.util.AbstractMap;
import java.util.Set;

/* loaded from: classes2.dex */
public final class ex6 extends AbstractMap {
    public final uaf[] a;

    public ex6(uaf[] uafVarArr) {
        this.a = uafVarArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new ps(this.a);
    }
}
