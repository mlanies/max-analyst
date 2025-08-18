package defpackage;

import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.cookie.SM;

/* loaded from: classes2.dex */
public final class mw3 {
    public static final yxc a = new yxc(9);

    public static void a(zs zsVar) {
        Object next;
        List list;
        ArrayList arrayList = new ArrayList();
        Iterator it = zsVar.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                break;
            }
            Object next2 = u1Var.next();
            if (SM.SET_COOKIE.equals(((lq6) next2).a)) {
                arrayList.add(next2);
            }
        }
        ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                list = HttpCookie.parse(((lq6) it2.next()).b);
            } catch (Exception unused) {
                list = nz4.a;
            }
            arrayList2.add(list);
        }
        ArrayList arrayListT = z53.T(arrayList2);
        ArrayList arrayList3 = new ArrayList(z53.S(arrayListT, 10));
        Iterator it3 = arrayListT.iterator();
        while (it3.hasNext()) {
            HttpCookie httpCookie = (HttpCookie) it3.next();
            httpCookie.toString();
            arrayList3.add(httpCookie);
        }
        Iterator it4 = arrayList3.iterator();
        while (true) {
            if (!it4.hasNext()) {
                next = null;
                break;
            } else {
                next = it4.next();
                if ("vdt".equals(((HttpCookie) next).getName())) {
                    break;
                }
            }
        }
        HttpCookie httpCookie2 = (HttpCookie) next;
        if (httpCookie2 != null) {
            httpCookie2.getName();
            httpCookie2.getValue();
        }
    }
}
