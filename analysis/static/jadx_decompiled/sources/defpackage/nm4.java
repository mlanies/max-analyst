package defpackage;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public final class nm4 implements mm4 {
    public static final long f = TimeUnit.MINUTES.toMillis(15);
    public long c;
    public final String a = nm4.class.getName();
    public final ReentrantLock b = new ReentrantLock();
    public final HashMap d = new HashMap();
    public final x67 e = new x67();

    public static final String a(nm4 nm4Var) {
        StringBuilder sb = new StringBuilder("Dns cache:");
        for (Map.Entry entry : nm4Var.d.entrySet()) {
            String str = (String) entry.getKey();
            ArrayList<v67> arrayList = (ArrayList) entry.getValue();
            sb.append("\n" + str);
            for (v67 v67Var : arrayList) {
                sb.append("\n- ");
                sb.append(v67Var);
            }
        }
        return sb.toString();
    }

    public final void b() {
        String str = this.a;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.o, str, "resetIps", null);
        }
        Iterator it = this.d.entrySet().iterator();
        while (it.hasNext()) {
            for (v67 v67Var : (ArrayList) ((Map.Entry) it.next()).getValue()) {
                if (v67Var.b != 0) {
                    v67Var.d = 0;
                    v67Var.c = v67Var.b;
                } else {
                    v67Var.d = 0;
                    v67Var.c = 0;
                }
                v67Var.e = 1.0f;
            }
        }
    }

    public final void c(String str, InetAddress[] inetAddressArr) {
        int i = 0;
        ArrayList arrayList = new ArrayList(new gs(inetAddressArr, false));
        HashMap map = this.d;
        Object arrayList2 = map.get(str);
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            map.put(str, arrayList2);
        }
        ArrayList arrayList3 = (ArrayList) arrayList2;
        while (i < arrayList3.size()) {
            int iIndexOf = arrayList.indexOf(((v67) arrayList3.get(i)).a);
            if (iIndexOf != -1) {
                arrayList.remove(iIndexOf);
                i++;
            } else {
                arrayList3.remove(i);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(new v67((InetAddress) it.next()));
        }
    }
}
