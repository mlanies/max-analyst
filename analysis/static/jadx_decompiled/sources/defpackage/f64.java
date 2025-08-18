package defpackage;

import android.os.Bundle;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import one.me.deeplink.InvalidDeeplinkNamingException;

/* loaded from: classes.dex */
public final class f64 {
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public boolean g;
    public final String a = f64.class.getName();
    public final ArrayList f = new ArrayList();

    public f64(je7 je7Var, khe kheVar, je7 je7Var2, je7 je7Var3) {
        this.b = je7Var2;
        this.c = je7Var3;
        this.d = je7Var;
        this.e = kheVar;
    }

    public final x54 a() {
        return (x54) this.c.getValue();
    }

    public final boolean b(String str, Bundle bundle) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("try to open new screen from background thread".toString());
        }
        if (w9e.S0(str, ':')) {
            return c(c54.h(str, "max", null), bundle);
        }
        hm9.p(this.a, "Trying to open invalid app route=".concat(str), null);
        throw new InvalidDeeplinkNamingException(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(android.net.Uri r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 1372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f64.c(android.net.Uri, android.os.Bundle):boolean");
    }

    public final boolean d() {
        coc cocVar;
        if (a().b() <= 1) {
            return false;
        }
        haa haaVar = (haa) a();
        if (haaVar.b) {
            LinkedList linkedList = haaVar.c;
            if (!linkedList.isEmpty()) {
                linkedList.removeLast();
            }
            return true;
        }
        if (haaVar.b() <= 1 || (cocVar = (coc) x53.q0(haaVar.f().C().e())) == null || cocVar.a == null) {
            return false;
        }
        return haaVar.f().C().C();
    }

    public final void e(k56 k56Var) {
        Object njcVar;
        this.g = true;
        ArrayList arrayList = this.f;
        arrayList.clear();
        try {
            k56Var.invoke();
            this.g = false;
            x54 x54VarA = a();
            List listD0 = x53.D0(arrayList);
            haa haaVar = (haa) x54VarA;
            haaVar.getClass();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = listD0.iterator();
            while (it.hasNext()) {
                try {
                    njcVar = haaVar.d((l64) it.next(), true);
                } catch (Throwable th) {
                    njcVar = new njc(th);
                }
                if (njcVar instanceof njc) {
                    njcVar = null;
                }
                coc cocVar = (coc) njcVar;
                if (cocVar != null) {
                    arrayList2.add(cocVar);
                }
            }
            haaVar.f().C().P(arrayList2, haaVar.e());
            arrayList.clear();
        } catch (Throwable th2) {
            this.g = false;
            throw th2;
        }
    }
}
