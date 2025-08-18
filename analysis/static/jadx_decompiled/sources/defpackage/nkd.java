package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class nkd {
    public final ad a;
    public final av0 b;
    public final lq9 c;
    public final o45 d;
    public final s8g e;

    public nkd(ad adVar, av0 av0Var, lq9 lq9Var, o45 o45Var, s8g s8gVar) {
        this.a = adVar;
        this.b = av0Var;
        this.c = lq9Var;
        this.d = o45Var;
        this.e = s8gVar;
    }

    public final ArrayList a(int i, String str, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (uri == null || oag.t(uri.toString())) {
                hm9.p("nkd", "Failed to send media, uri is empty or null", null);
            } else {
                if (i == 7) {
                    this.a.g("ACTION_FILE_SEND", "share");
                }
                aqd aqdVar = new aqd(i, uri.toString());
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(aqdVar);
                d9d d9dVar = new d9d(0L, arrayList2);
                d9dVar.o = true;
                d9dVar.m = str;
                d9dVar.n = null;
                arrayList.add(d9dVar);
            }
        }
        return arrayList;
    }
}
