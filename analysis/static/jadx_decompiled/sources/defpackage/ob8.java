package defpackage;

import java.io.Serializable;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class ob8 {
    public Object a;
    public String b = null;
    public Serializable c;
    public int d;
    public int e;
    public Object f;
    public Serializable g;

    public ob8(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.c = new HashSet();
        this.d = 0;
        this.e = 0;
        this.g = new HashSet();
        hashSet.add(lqb.a(cls));
        for (Class cls2 : clsArr) {
            a14.h(cls2, "Null interface");
            ((HashSet) this.a).add(lqb.a(cls2));
        }
    }

    public void a(nh4 nh4Var) {
        if (!(!((HashSet) this.a).contains(nh4Var.a))) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.c).add(nh4Var);
    }

    public nb3 b() {
        if (((cc3) this.f) != null) {
            return new nb3(this.b, new HashSet((HashSet) this.a), new HashSet((HashSet) this.c), this.d, this.e, (cc3) this.f, (HashSet) this.g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }
}
