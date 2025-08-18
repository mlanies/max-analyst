package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class gwc extends u2 {
    public long[] X;
    public long c;
    public long[] o;

    public static Serializable a2(int i, yaf yafVar) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(yafVar.p()));
        }
        if (i == 1) {
            return Boolean.valueOf(yafVar.v() == 1);
        }
        if (i == 2) {
            return c2(yafVar);
        }
        if (i != 3) {
            if (i == 8) {
                return b2(yafVar);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(yafVar.p()));
                yafVar.I(2);
                return date;
            }
            int iY = yafVar.y();
            ArrayList arrayList = new ArrayList(iY);
            for (int i2 = 0; i2 < iY; i2++) {
                Serializable serializableA2 = a2(yafVar.v(), yafVar);
                if (serializableA2 != null) {
                    arrayList.add(serializableA2);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strC2 = c2(yafVar);
            int iV = yafVar.v();
            if (iV == 9) {
                return map;
            }
            Serializable serializableA22 = a2(iV, yafVar);
            if (serializableA22 != null) {
                map.put(strC2, serializableA22);
            }
        }
    }

    public static HashMap b2(yaf yafVar) {
        int iY = yafVar.y();
        HashMap map = new HashMap(iY);
        for (int i = 0; i < iY; i++) {
            String strC2 = c2(yafVar);
            Serializable serializableA2 = a2(yafVar.v(), yafVar);
            if (serializableA2 != null) {
                map.put(strC2, serializableA2);
            }
        }
        return map;
    }

    public static String c2(yaf yafVar) {
        int iA = yafVar.A();
        int i = yafVar.b;
        yafVar.I(iA);
        return new String(yafVar.a, i, iA);
    }

    public final boolean Z1(long j, yaf yafVar) {
        if (yafVar.v() != 2 || !"onMetaData".equals(c2(yafVar)) || yafVar.c() == 0 || yafVar.v() != 8) {
            return false;
        }
        HashMap mapB2 = b2(yafVar);
        Object obj = mapB2.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.c = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapB2.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.o = new long[size];
                this.X = new long[size];
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.o = new long[0];
                        this.X = new long[0];
                        break;
                    }
                    this.o[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.X[i] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }
}
