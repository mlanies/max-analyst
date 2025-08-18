package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* loaded from: classes.dex */
public final class pg9 extends y1 {
    public transient jde Y;

    @Override // defpackage.y1
    public final c2 c() {
        Map map = this.o;
        return map instanceof NavigableMap ? new e2(this, (NavigableMap) map) : map instanceof SortedMap ? new h2(this, (SortedMap) map) : new c2(this, map);
    }

    @Override // defpackage.y1
    public final Collection d() {
        return (List) this.Y.get();
    }

    @Override // defpackage.y1
    public final d2 e() {
        Map map = this.o;
        return map instanceof NavigableMap ? new f2(this, (NavigableMap) map) : map instanceof SortedMap ? new i2(this, (SortedMap) map) : new d2(this, map);
    }
}
