package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ServiceLoader;

/* loaded from: classes2.dex */
public abstract class b4a {
    public static final ArrayList a = new ArrayList();

    static {
        Iterator it = ServiceLoader.load(c4a.class, c4a.class.getClassLoader()).iterator();
        while (it.hasNext()) {
            ArrayList arrayList = a;
            au1.r(it.next());
            arrayList.add(null);
        }
    }
}
