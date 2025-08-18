package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class hi6 {
    public final Set a;
    public final String b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Set] */
    public hi6(HashSet hashSet, String str) {
        this.a = hashSet == null ? Collections.emptySet() : hashSet;
        this.b = str;
    }
}
