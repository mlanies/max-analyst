package defpackage;

import android.util.SparseBooleanArray;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class mh8 {
    public static final z9d d;
    public static final k3b e;
    public final z9d a;
    public final k3b b;
    public final zw6 c;

    static {
        HashSet hashSet = new HashSet();
        ffc ffcVar = y9d.d;
        for (int i = 0; i < ffcVar.o; i++) {
            hashSet.add(new y9d(((Integer) ffcVar.get(i)).intValue()));
        }
        d = new z9d(hashSet);
        HashSet hashSet2 = new HashSet();
        ffc ffcVar2 = y9d.e;
        for (int i2 = 0; i2 < ffcVar2.o; i2++) {
            hashSet2.add(new y9d(((Integer) ffcVar2.get(i2)).intValue()));
        }
        for (int i3 = 0; i3 < ffcVar.o; i3++) {
            hashSet2.add(new y9d(((Integer) ffcVar.get(i3)).intValue()));
        }
        new z9d(hashSet2);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i4 : wd6.o) {
            fm9.k(!false);
            sparseBooleanArray.append(i4, true);
        }
        fm9.k(!false);
        e = new k3b(new tm5(sparseBooleanArray));
    }

    public mh8(z9d z9dVar, k3b k3bVar, zw6 zw6Var) {
        this.a = z9dVar;
        this.b = k3bVar;
        this.c = zw6Var;
    }
}
