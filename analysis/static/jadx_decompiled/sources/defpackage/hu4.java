package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class hu4 {
    public static final HashMap a;
    public static final HashMap b;
    public static final HashMap c;
    public static final HashMap d;
    public static final HashMap e;

    static {
        HashMap map = new HashMap();
        a = map;
        HashMap map2 = new HashMap();
        b = map2;
        HashMap map3 = new HashMap();
        c = map3;
        HashMap map4 = new HashMap();
        d = map4;
        HashMap map5 = new HashMap();
        e = map5;
        map.put(8, new HashSet(Collections.singletonList(8)));
        map.put(10, new HashSet(Collections.singletonList(10)));
        map.put(0, new HashSet(Arrays.asList(8, 10)));
        map2.put(0, new HashSet(Arrays.asList(0, 1, 2, 3, 4)));
        map2.put(1, new HashSet(Collections.singletonList(0)));
        map2.put(2, new HashSet(Arrays.asList(1, 2, 3, 4)));
        map2.put(3, new HashSet(Collections.singletonList(1)));
        map2.put(4, new HashSet(Collections.singletonList(2)));
        map2.put(5, new HashSet(Collections.singletonList(3)));
        map2.put(6, new HashSet(Collections.singletonList(4)));
        map3.put(8, 8);
        map3.put(10, 10);
        map4.put(0, 1);
        map4.put(1, 3);
        map4.put(2, 4);
        map4.put(3, 5);
        map4.put(4, 6);
        HashMap map6 = new HashMap();
        eu4 eu4Var = eu4.d;
        map6.put(eu4Var, 1);
        eu4 eu4Var2 = eu4.e;
        map6.put(eu4Var2, 2);
        eu4 eu4Var3 = eu4.f;
        map6.put(eu4Var3, 4096);
        eu4 eu4Var4 = eu4.g;
        map6.put(eu4Var4, 8192);
        HashMap map7 = new HashMap();
        map7.put(eu4Var, 1);
        map7.put(eu4Var2, 2);
        map7.put(eu4Var3, 4096);
        map7.put(eu4Var4, 8192);
        HashMap map8 = new HashMap();
        map8.put(eu4Var, 1);
        map8.put(eu4Var2, 4);
        map8.put(eu4Var3, 4096);
        map8.put(eu4Var4, 16384);
        HashMap map9 = new HashMap();
        map9.put(eu4.h, 256);
        map9.put(eu4.i, 512);
        map5.put("video/hevc", map6);
        map5.put("video/av01", map7);
        map5.put("video/x-vnd.on2.vp9", map8);
        map5.put("video/dolby-vision", map9);
    }

    public static boolean a(ha0 ha0Var, eu4 eu4Var) {
        Set set;
        int i = ha0Var.h;
        Set set2 = (Set) a.get(Integer.valueOf(eu4Var.b));
        return set2 != null && set2.contains(Integer.valueOf(i)) && (set = (Set) b.get(Integer.valueOf(eu4Var.a))) != null && set.contains(Integer.valueOf(ha0Var.j));
    }
}
