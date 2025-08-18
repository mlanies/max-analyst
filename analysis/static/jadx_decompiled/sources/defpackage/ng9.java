package defpackage;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class ng9 extends kq0 {
    public final /* synthetic */ Comparator l;

    public ng9(Comparator comparator) {
        this.l = comparator;
    }

    @Override // defpackage.kq0
    public final Map g() {
        return new TreeMap(this.l);
    }
}
