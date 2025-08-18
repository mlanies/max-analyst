package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class rec extends LinkedHashMap {
    public final /* synthetic */ sh0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rec(sh0 sh0Var, int i) {
        super(i, 0.75f, true);
        this.a = sh0Var;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.a.b;
    }
}
