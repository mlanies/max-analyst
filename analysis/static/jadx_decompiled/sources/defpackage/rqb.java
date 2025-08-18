package defpackage;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class rqb {
    public static final HashMap b;
    public static final HashMap c;
    public final HashMap a = new HashMap();

    static {
        HashMap map = new HashMap();
        b = map;
        map.put(mb0.g, Range.create(2160, 4319));
        map.put(mb0.f, Range.create(1080, 1439));
        map.put(mb0.e, Range.create(720, 1079));
        map.put(mb0.d, Range.create(241, 719));
        HashMap map2 = new HashMap();
        c = map2;
        map2.put(0, lt.a);
        map2.put(1, lt.c);
    }

    public rqb(List list, HashMap map) {
        HashMap map2;
        Integer num;
        mb0 mb0Var;
        HashMap map3 = b;
        Iterator it = map3.keySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map2 = c;
            if (!zHasNext) {
                break;
            }
            mb0 mb0Var2 = (mb0) it.next();
            this.a.put(new lb0(mb0Var2, -1), new ArrayList());
            Iterator it2 = map2.keySet().iterator();
            while (it2.hasNext()) {
                this.a.put(new lb0(mb0Var2, ((Integer) it2.next()).intValue()), new ArrayList());
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list2 = (List) this.a.get(new lb0((mb0) entry.getKey(), -1));
            Objects.requireNonNull(list2);
            list2.add((Size) entry.getValue());
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Size size = (Size) it3.next();
            Iterator it4 = map3.entrySet().iterator();
            while (true) {
                num = null;
                if (!it4.hasNext()) {
                    mb0Var = null;
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it4.next();
                if (((Range) entry2.getValue()).contains((Range) Integer.valueOf(size.getHeight()))) {
                    mb0Var = (mb0) entry2.getKey();
                    break;
                }
            }
            if (mb0Var != null) {
                Iterator it5 = map2.entrySet().iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Map.Entry entry3 = (Map.Entry) it5.next();
                    if (lt.a(size, (Rational) entry3.getValue(), msd.b)) {
                        num = (Integer) entry3.getKey();
                        break;
                    }
                }
                if (num != null) {
                    List list3 = (List) this.a.get(new lb0(mb0Var, num.intValue()));
                    Objects.requireNonNull(list3);
                    list3.add(size);
                }
            }
        }
        for (Map.Entry entry4 : this.a.entrySet()) {
            Size size2 = (Size) map.get(((lb0) entry4.getKey()).a);
            if (size2 != null) {
                Size size3 = msd.a;
                Collections.sort((List) entry4.getValue(), new y30(size2.getHeight() * size2.getWidth(), 1));
            }
        }
    }
}
