package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class nb3 {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final cc3 f;
    public final Set g;

    public nb3(String str, Set set, Set set2, int i, int i2, cc3 cc3Var, Set set3) {
        this.a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = cc3Var;
        this.g = Collections.unmodifiableSet(set3);
    }

    public static ob8 a(lqb lqbVar) {
        lqb[] lqbVarArr = new lqb[0];
        ob8 ob8Var = new ob8();
        ob8Var.b = null;
        HashSet hashSet = new HashSet();
        ob8Var.a = hashSet;
        ob8Var.c = new HashSet();
        ob8Var.d = 0;
        ob8Var.e = 0;
        ob8Var.g = new HashSet();
        hashSet.add(lqbVar);
        for (lqb lqbVar2 : lqbVarArr) {
            a14.h(lqbVar2, "Null interface");
        }
        Collections.addAll((HashSet) ob8Var.a, lqbVarArr);
        return ob8Var;
    }

    public static nb3 b(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(lqb.a(cls));
        for (Class cls2 : clsArr) {
            a14.h(cls2, "Null interface");
            hashSet.add(lqb.a(cls2));
        }
        return new nb3(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new v02(15, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
