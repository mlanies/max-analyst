package defpackage;

import android.os.Build;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class e9e {
    public static final aa0 a = new aa0(Long.TYPE, null, "camera2.streamSpec.streamUseCase");
    public static final HashMap b;
    public static final HashMap c;

    static {
        HashMap map = new HashMap();
        b = map;
        HashMap map2 = new HashMap();
        c = map2;
        if (Build.VERSION.SDK_INT >= 33) {
            HashSet hashSet = new HashSet();
            q9f q9fVar = q9f.b;
            hashSet.add(q9fVar);
            q9f q9fVar2 = q9f.Y;
            hashSet.add(q9fVar2);
            map.put(4L, hashSet);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(q9fVar);
            hashSet2.add(q9fVar2);
            hashSet2.add(q9f.c);
            map.put(1L, hashSet2);
            HashSet hashSet3 = new HashSet();
            q9f q9fVar3 = q9f.a;
            hashSet3.add(q9fVar3);
            map.put(2L, hashSet3);
            HashSet hashSet4 = new HashSet();
            q9f q9fVar4 = q9f.o;
            hashSet4.add(q9fVar4);
            map.put(3L, hashSet4);
            HashSet hashSet5 = new HashSet();
            hashSet5.add(q9fVar);
            hashSet5.add(q9fVar3);
            hashSet5.add(q9fVar4);
            map2.put(4L, hashSet5);
            HashSet hashSet6 = new HashSet();
            hashSet6.add(q9fVar);
            hashSet6.add(q9fVar4);
            map2.put(3L, hashSet6);
        }
    }

    public static cv1 a(ce3 ce3Var, long j) {
        aa0 aa0Var = a;
        if (ce3Var.o(aa0Var) && ((Long) ce3Var.h(aa0Var)).longValue() == j) {
            return null;
        }
        mi9 mi9VarC = mi9.c(ce3Var);
        mi9VarC.j(aa0Var, Long.valueOf(j));
        return new cv1(8, mi9VarC);
    }

    public static boolean b(q9f q9fVar, long j, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (q9fVar != q9f.X) {
            HashMap map = b;
            return map.containsKey(Long.valueOf(j)) && ((Set) map.get(Long.valueOf(j))).contains(q9fVar);
        }
        HashMap map2 = c;
        if (!map2.containsKey(Long.valueOf(j))) {
            return false;
        }
        Set set = (Set) map2.get(Long.valueOf(j));
        if (list.size() != set.size()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains((q9f) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(ce3 ce3Var, q9f q9fVar) {
        if (((Boolean) ce3Var.f(o9f.m0, Boolean.FALSE)).booleanValue()) {
            return false;
        }
        aa0 aa0Var = gu6.b;
        if (ce3Var.o(aa0Var)) {
            return q9fVar.ordinal() == 0 && ((Integer) ce3Var.h(aa0Var)).intValue() == 2;
        }
        return false;
    }
}
