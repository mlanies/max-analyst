package defpackage;

import android.database.Cursor;
import com.facebook.fresco.middleware.HasExtraData;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class mje {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public mje(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        this.a = str;
        this.b = map;
        this.c = abstractSet;
        this.d = abstractSet2;
    }

    /* JADX WARN: Finally extract failed */
    public static final mje a(k36 k36Var, String str) {
        Map mapB;
        wbd wbdVarA;
        wbd wbdVar;
        String str2;
        int i;
        int i2;
        Throwable th;
        lje ljeVar;
        k36 k36Var2 = k36Var;
        StringBuilder sb = new StringBuilder("PRAGMA table_info(`");
        sb.append(str);
        String str3 = "`)";
        sb.append("`)");
        Cursor cursorQ0 = k36Var2.q0(sb.toString());
        try {
            String str4 = "name";
            if (cursorQ0.getColumnCount() <= 0) {
                mapB = oz4.a;
                v3c.i(cursorQ0, null);
            } else {
                int columnIndex = cursorQ0.getColumnIndex("name");
                int columnIndex2 = cursorQ0.getColumnIndex("type");
                int columnIndex3 = cursorQ0.getColumnIndex("notnull");
                int columnIndex4 = cursorQ0.getColumnIndex("pk");
                int columnIndex5 = cursorQ0.getColumnIndex("dflt_value");
                ky7 ky7Var = new ky7();
                while (cursorQ0.moveToNext()) {
                    String string = cursorQ0.getString(columnIndex);
                    ky7Var.put(string, new ije(cursorQ0.getInt(columnIndex4), 2, string, cursorQ0.getString(columnIndex2), cursorQ0.getString(columnIndex5), cursorQ0.getInt(columnIndex3) != 0));
                }
                mapB = ky7Var.b();
                v3c.i(cursorQ0, null);
            }
            cursorQ0 = k36Var2.q0("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = cursorQ0.getColumnIndex("id");
                int columnIndex7 = cursorQ0.getColumnIndex("seq");
                int columnIndex8 = cursorQ0.getColumnIndex("table");
                int columnIndex9 = cursorQ0.getColumnIndex("on_delete");
                int columnIndex10 = cursorQ0.getColumnIndex("on_update");
                int columnIndex11 = cursorQ0.getColumnIndex("id");
                int columnIndex12 = cursorQ0.getColumnIndex("seq");
                int columnIndex13 = cursorQ0.getColumnIndex("from");
                int columnIndex14 = cursorQ0.getColumnIndex("to");
                kl7 kl7VarL = j1e.l();
                while (cursorQ0.moveToNext()) {
                    kl7VarL.add(new kje(cursorQ0.getString(columnIndex13), cursorQ0.getInt(columnIndex11), cursorQ0.getInt(columnIndex12), cursorQ0.getString(columnIndex14)));
                    mapB = mapB;
                    str4 = str4;
                    columnIndex11 = columnIndex11;
                    columnIndex12 = columnIndex12;
                    columnIndex13 = columnIndex13;
                }
                Map map = mapB;
                String str5 = str4;
                List listW0 = x53.w0(j1e.d(kl7VarL));
                cursorQ0.moveToPosition(-1);
                wbd wbdVar2 = new wbd();
                while (cursorQ0.moveToNext()) {
                    if (cursorQ0.getInt(columnIndex7) == 0) {
                        int i3 = cursorQ0.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : listW0) {
                            List list = listW0;
                            if (((kje) obj).a == i3) {
                                arrayList3.add(obj);
                            }
                            listW0 = list;
                        }
                        List list2 = listW0;
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            kje kjeVar = (kje) it.next();
                            arrayList.add(kjeVar.c);
                            arrayList2.add(kjeVar.o);
                        }
                        wbdVar2.add(new jje(cursorQ0.getString(columnIndex8), cursorQ0.getString(columnIndex9), cursorQ0.getString(columnIndex10), arrayList, arrayList2));
                        listW0 = list2;
                    }
                }
                wbd wbdVarA2 = z7.a(wbdVar2);
                v3c.i(cursorQ0, null);
                cursorQ0 = k36Var2.q0("PRAGMA index_list(`" + str + "`)");
                String str6 = str5;
                try {
                    int columnIndex15 = cursorQ0.getColumnIndex(str6);
                    int columnIndex16 = cursorQ0.getColumnIndex(HasExtraData.KEY_ORIGIN);
                    int columnIndex17 = cursorQ0.getColumnIndex("unique");
                    if (columnIndex15 == -1 || columnIndex16 == -1 || columnIndex17 == -1) {
                        wbdVarA = null;
                        v3c.i(cursorQ0, null);
                    } else {
                        wbd wbdVar3 = new wbd();
                        while (cursorQ0.moveToNext()) {
                            if ("c".equals(cursorQ0.getString(columnIndex16))) {
                                String string2 = cursorQ0.getString(columnIndex15);
                                boolean z = cursorQ0.getInt(columnIndex17) == 1;
                                cursorQ0 = k36Var2.q0("PRAGMA index_xinfo(`" + string2 + str3);
                                try {
                                    int columnIndex18 = cursorQ0.getColumnIndex("seqno");
                                    int columnIndex19 = cursorQ0.getColumnIndex("cid");
                                    int columnIndex20 = cursorQ0.getColumnIndex(str6);
                                    int columnIndex21 = cursorQ0.getColumnIndex("desc");
                                    String str7 = str6;
                                    if (columnIndex18 == -1 || columnIndex19 == -1 || columnIndex20 == -1 || columnIndex21 == -1) {
                                        str2 = str3;
                                        i = columnIndex15;
                                        i2 = columnIndex16;
                                        th = null;
                                        v3c.i(cursorQ0, null);
                                        ljeVar = null;
                                    } else {
                                        TreeMap treeMap = new TreeMap();
                                        str2 = str3;
                                        TreeMap treeMap2 = new TreeMap();
                                        while (cursorQ0.moveToNext()) {
                                            if (cursorQ0.getInt(columnIndex19) >= 0) {
                                                int i4 = cursorQ0.getInt(columnIndex18);
                                                int i5 = columnIndex15;
                                                String string3 = cursorQ0.getString(columnIndex20);
                                                int i6 = columnIndex21;
                                                String str8 = cursorQ0.getInt(columnIndex21) > 0 ? "DESC" : "ASC";
                                                int i7 = columnIndex16;
                                                treeMap.put(Integer.valueOf(i4), string3);
                                                treeMap2.put(Integer.valueOf(i4), str8);
                                                columnIndex15 = i5;
                                                columnIndex16 = i7;
                                                columnIndex21 = i6;
                                            }
                                        }
                                        i = columnIndex15;
                                        i2 = columnIndex16;
                                        ljeVar = new lje(string2, z, x53.D0(treeMap.values()), x53.D0(treeMap2.values()));
                                        v3c.i(cursorQ0, null);
                                        th = null;
                                    }
                                    if (ljeVar == null) {
                                        v3c.i(cursorQ0, th);
                                        wbdVar = null;
                                        break;
                                    }
                                    wbdVar3.add(ljeVar);
                                    k36Var2 = k36Var;
                                    str6 = str7;
                                    str3 = str2;
                                    columnIndex15 = i;
                                    columnIndex16 = i2;
                                } finally {
                                }
                            }
                        }
                        wbdVarA = z7.a(wbdVar3);
                        v3c.i(cursorQ0, null);
                    }
                    wbdVar = wbdVarA;
                    return new mje(str, map, wbdVarA2, wbdVar);
                } finally {
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } finally {
                }
            }
        } finally {
            try {
                throw th2;
            } finally {
            }
        }
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mje)) {
            return false;
        }
        mje mjeVar = (mje) obj;
        if (!tpa.f(this.a, mjeVar.a) || !tpa.f(this.b, mjeVar.b) || !tpa.f(this.c, mjeVar.c)) {
            return false;
        }
        Set set2 = this.d;
        if (set2 == null || (set = mjeVar.d) == null) {
            return true;
        }
        return tpa.f(set2, set);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.a + "', columns=" + this.b + ", foreignKeys=" + this.c + ", indices=" + this.d + '}';
    }
}
