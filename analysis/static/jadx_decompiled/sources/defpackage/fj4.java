package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class fj4 {
    public static final String a = a14.O("DiagnosticsWrkr");

    public static final String a(y7g y7gVar, k8g k8gVar, die dieVar, ArrayList arrayList) {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            h8g h8gVar = (h8g) it.next();
            cie cieVarX = dieVar.x(ju0.n(h8gVar));
            Integer numValueOf = cieVarX != null ? Integer.valueOf(cieVarX.c) : null;
            y7gVar.getClass();
            xlc xlcVarA = xlc.a(1, "SELECT name FROM workname WHERE work_spec_id=?");
            String str = h8gVar.a;
            if (str == null) {
                xlcVarA.W(1);
            } else {
                xlcVarA.f(1, str);
            }
            ilc ilcVar = (ilc) y7gVar.b;
            ilcVar.b();
            Cursor cursorO = ilcVar.o(xlcVarA, null);
            try {
                ArrayList arrayList2 = new ArrayList(cursorO.getCount());
                while (cursorO.moveToNext()) {
                    arrayList2.add(cursorO.isNull(0) ? null : cursorO.getString(0));
                }
                cursorO.close();
                xlcVarA.n();
                String strN0 = x53.n0(arrayList2, ",", null, null, null, 62);
                String strN02 = x53.n0(k8gVar.r(str), ",", null, null, null, 62);
                StringBuilder sbM = au1.m("\n", str, "\t ");
                sbM.append(h8gVar.c);
                sbM.append("\t ");
                sbM.append(numValueOf);
                sbM.append("\t ");
                sbM.append(h8gVar.b.name());
                sbM.append("\t ");
                sbM.append(strN0);
                sbM.append("\t ");
                sbM.append(strN02);
                sbM.append('\t');
                sb.append(sbM.toString());
            } catch (Throwable th) {
                cursorO.close();
                xlcVarA.n();
                throw th;
            }
        }
        return sb.toString();
    }
}
