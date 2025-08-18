package defpackage;

import java.util.Date;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class pa7 implements p05 {
    public static final na7 f;
    public static final na7 g;
    public final HashMap a;
    public final HashMap b;
    public final ma7 c;
    public boolean d;
    public static final ma7 e = new ma7(0);
    public static final oa7 h = new oa7();

    /* JADX WARN: Type inference failed for: r0v1, types: [na7] */
    /* JADX WARN: Type inference failed for: r0v2, types: [na7] */
    static {
        final int i = 0;
        f = new waf() { // from class: na7
            @Override // defpackage.m05
            public final void a(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        ((xaf) obj2).b((String) obj);
                        break;
                    default:
                        ((xaf) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i2 = 1;
        g = new waf() { // from class: na7
            @Override // defpackage.m05
            public final void a(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        ((xaf) obj2).b((String) obj);
                        break;
                    default:
                        ((xaf) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public pa7() {
        HashMap map = new HashMap();
        this.a = map;
        HashMap map2 = new HashMap();
        this.b = map2;
        this.c = e;
        this.d = false;
        map2.put(String.class, f);
        map.remove(String.class);
        map2.put(Boolean.class, g);
        map.remove(Boolean.class);
        map2.put(Date.class, h);
        map.remove(Date.class);
    }

    public final p05 a(Class cls, my9 my9Var) {
        this.a.put(cls, my9Var);
        this.b.remove(cls);
        return this;
    }
}
