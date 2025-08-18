package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes.dex */
public class h2 extends c2 implements SortedMap {
    public SortedSet X;
    public final /* synthetic */ y1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(y1 y1Var, SortedMap sortedMap) {
        super(y1Var, sortedMap);
        this.Y = y1Var;
    }

    public SortedSet b() {
        return new i2(this.Y, d());
    }

    @Override // defpackage.c2, java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.X;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetB = b();
        this.X = sortedSetB;
        return sortedSetB;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.c;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new h2(this.Y, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new h2(this.Y, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new h2(this.Y, d().tailMap(obj));
    }
}
