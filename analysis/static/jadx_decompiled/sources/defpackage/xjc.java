package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class xjc {
    public float a;
    public final Serializable b;

    public xjc() {
        this.b = new Random(System.currentTimeMillis());
        this.a = 0.0f;
    }

    public long a(long j) {
        fm9.f(j >= 0);
        Map.Entry entryFirstEntry = ((nx6) this.b).tailMap(Long.valueOf(j), false).firstEntry();
        Long l = (Long) (entryFirstEntry == null ? null : entryFirstEntry.getKey());
        if (l != null) {
            return l.longValue();
        }
        return -9223372036854775807L;
    }

    public float b(long j) {
        fm9.f(j >= 0);
        Map.Entry entryLastEntry = ((nx6) this.b).headMap(Long.valueOf(j), true).lastEntry();
        return entryLastEntry != null ? ((Float) entryLastEntry.getValue()).floatValue() : this.a;
    }

    public xjc(f99 f99Var) {
        float f;
        nx6 nx6VarK;
        int i = 0;
        while (true) {
            d99[] d99VarArr = f99Var.a;
            if (i >= d99VarArr.length) {
                f = -3.4028235E38f;
                break;
            }
            d99 d99Var = d99VarArr[i];
            if (d99Var instanceof eud) {
                f = ((eud) d99Var).a;
                break;
            }
            i++;
        }
        float f2 = f == -3.4028235E38f ? 1.0f : f / 30.0f;
        this.a = f2;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            d99[] d99VarArr2 = f99Var.a;
            if (i2 >= d99VarArr2.length) {
                break;
            }
            d99 d99Var2 = d99VarArr2[i2];
            if (d99Var2 instanceof itd) {
                arrayList.addAll(((itd) d99Var2).a);
            }
            i2++;
        }
        ffc ffcVarR = zw6.r(gtd.o, arrayList);
        if (ffcVarR.isEmpty()) {
            nx6VarK = nx6.o();
        } else {
            TreeMap treeMap = new TreeMap();
            for (int i3 = 0; i3 < ffcVarR.size(); i3++) {
                treeMap.put(Long.valueOf(oaf.S(((gtd) ffcVarR.get(i3)).a)), Float.valueOf(f2 / r4.c));
            }
            for (int i4 = 0; i4 < ffcVarR.size(); i4++) {
                long j = ((gtd) ffcVarR.get(i4)).b;
                if (!treeMap.containsKey(Long.valueOf(oaf.S(j)))) {
                    treeMap.put(Long.valueOf(oaf.S(j)), Float.valueOf(f2));
                }
            }
            nx6VarK = nx6.k(treeMap);
        }
        this.b = nx6VarK;
    }
}
