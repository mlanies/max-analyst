package defpackage;

import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class og9 implements jde, Serializable {
    public final int a;

    public og9(int i) {
        wmd.i(i, "expectedValuesPerKey");
        this.a = i;
    }

    @Override // defpackage.jde
    public final Object get() {
        return new ArrayList(this.a);
    }
}
