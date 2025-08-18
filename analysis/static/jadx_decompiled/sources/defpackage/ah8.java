package defpackage;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ah8 implements oie, zec {
    public final Context a;
    public boolean b;
    public jie c;
    public boolean d;
    public kf8 e;
    public final boolean n;
    public fh8 o;
    public dh8 p;
    public dh8 q;
    public dh8 r;
    public tg8 s;
    public dh8 t;
    public sg8 u;
    public bg8 w;
    public bg8 x;
    public int y;
    public bh8 z;
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final HashMap h = new HashMap();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final crd k = new crd();
    public final fd7 l = new fd7(this);
    public final yg8 m = new yg8(this);
    public final HashMap v = new HashMap();
    public final wd6 A = new wd6(21, this);

    public ah8(Context context) {
        this.a = context;
        this.n = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
    }

    public final void a(ug8 ug8Var) {
        if (d(ug8Var) == null) {
            ch8 ch8Var = new ch8(ug8Var);
            this.i.add(ch8Var);
            if (eh8.c) {
                ch8Var.toString();
            }
            this.m.b(513, ch8Var);
            l(ch8Var, ug8Var.Z);
            eh8.b();
            ug8Var.o = this.l;
            ug8Var.h(this.w);
        }
    }

    public final String b(ch8 ch8Var, String str) {
        String strFlattenToShortString = ((ComponentName) ch8Var.c.b).flattenToShortString();
        String strJ = rh4.j(strFlattenToShortString, ":", str);
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            if (((dh8) arrayList.get(i)).c.equals(strJ)) {
                break;
            }
            i++;
        }
        HashMap map = this.h;
        if (i < 0) {
            map.put(new mpa(strFlattenToShortString, str), strJ);
            return strJ;
        }
        int i2 = 2;
        while (true) {
            Locale locale = Locale.US;
            String str2 = strJ + "_" + i2;
            int size2 = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size2) {
                    i3 = -1;
                    break;
                }
                if (((dh8) arrayList.get(i3)).c.equals(str2)) {
                    break;
                }
                i3++;
            }
            if (i3 < 0) {
                map.put(new mpa(strFlattenToShortString, str), str2);
                return str2;
            }
            i2++;
        }
    }

    public final dh8 c() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            dh8 dh8Var = (dh8) it.next();
            if (dh8Var != this.p && dh8Var.c() == this.c && dh8Var.m("android.media.intent.category.LIVE_AUDIO") && !dh8Var.m("android.media.intent.category.LIVE_VIDEO") && dh8Var.f()) {
                return dh8Var;
            }
        }
        return this.p;
    }

    public final ch8 d(ug8 ug8Var) {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((ch8) arrayList.get(i)).a == ug8Var) {
                return (ch8) arrayList.get(i);
            }
        }
        return null;
    }

    public final dh8 e() {
        dh8 dh8Var = this.p;
        if (dh8Var != null) {
            return dh8Var;
        }
        throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
    }

    public final dh8 f() {
        dh8 dh8Var = this.r;
        if (dh8Var != null) {
            return dh8Var;
        }
        throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
    }

    public final void g() {
        if (this.r.e()) {
            List<dh8> listUnmodifiableList = Collections.unmodifiableList(this.r.u);
            HashSet hashSet = new HashSet();
            Iterator it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                hashSet.add(((dh8) it.next()).c);
            }
            HashMap map = this.v;
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains(entry.getKey())) {
                    tg8 tg8Var = (tg8) entry.getValue();
                    tg8Var.h(0);
                    tg8Var.d();
                    it2.remove();
                }
            }
            for (dh8 dh8Var : listUnmodifiableList) {
                if (!map.containsKey(dh8Var.c)) {
                    tg8 tg8VarE = dh8Var.c().e(dh8Var.b, this.r.b);
                    tg8VarE.e();
                    map.put(dh8Var.c, tg8VarE);
                }
            }
        }
    }

    public final void h(dh8 dh8Var, int i) {
        if (!this.g.contains(dh8Var)) {
            Objects.toString(dh8Var);
            return;
        }
        if (!dh8Var.g) {
            dh8Var.toString();
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            ug8 ug8VarC = dh8Var.c();
            kf8 kf8Var = this.e;
            if (ug8VarC == kf8Var && this.r != dh8Var) {
                MediaRoute2Info mediaRoute2InfoI = kf8Var.i(dh8Var.b);
                if (mediaRoute2InfoI == null) {
                    return;
                }
                kf8Var.t0.transferTo(mediaRoute2InfoI);
                return;
            }
        }
        i(dh8Var, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(defpackage.dh8 r11, int r12) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ah8.i(dh8, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ah8.j():void");
    }

    public final void k() {
        MediaRouter2.RoutingController routingController;
        dh8 dh8Var = this.r;
        if (dh8Var != null) {
            int i = dh8Var.o;
            crd crdVar = this.k;
            crdVar.getClass();
            int i2 = dh8Var.p;
            crdVar.getClass();
            if (!dh8Var.e()) {
                int i3 = dh8Var.n;
            } else if (eh8.d != null) {
                eh8.c().getClass();
                int i32 = dh8Var.n;
            }
            crdVar.getClass();
            dh8 dh8Var2 = this.r;
            int i4 = dh8Var2.l;
            crdVar.getClass();
            int i5 = dh8Var2.k;
            crdVar.getClass();
            if (this.d && dh8Var2.c() == this.e) {
                tg8 tg8Var = this.s;
                if ((tg8Var instanceof gf8) && (routingController = ((gf8) tg8Var).g) != null) {
                    routingController.getId();
                }
            }
            ArrayList arrayList = this.j;
            if (arrayList.size() <= 0) {
                return;
            }
            ((zg8) arrayList.get(0)).getClass();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(defpackage.ch8 r18, defpackage.vg8 r19) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ah8.l(ch8, vg8):void");
    }

    public final int m(dh8 dh8Var, zf8 zf8Var) {
        int i = dh8Var.i(zf8Var);
        if (i != 0) {
            int i2 = i & 1;
            yg8 yg8Var = this.m;
            if (i2 != 0) {
                if (eh8.c) {
                    dh8Var.toString();
                }
                yg8Var.b(259, dh8Var);
            }
            if ((i & 2) != 0) {
                if (eh8.c) {
                    dh8Var.toString();
                }
                yg8Var.b(260, dh8Var);
            }
            if ((i & 4) != 0) {
                if (eh8.c) {
                    dh8Var.toString();
                }
                yg8Var.b(261, dh8Var);
            }
        }
        return i;
    }

    public final void n(boolean z) {
        dh8 dh8Var = this.p;
        if (dh8Var != null && !dh8Var.f()) {
            Objects.toString(this.p);
            this.p = null;
        }
        dh8 dh8Var2 = this.p;
        ArrayList arrayList = this.g;
        if (dh8Var2 == null && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                dh8 dh8Var3 = (dh8) it.next();
                if (dh8Var3.c() == this.c && dh8Var3.b.equals("DEFAULT_ROUTE") && dh8Var3.f()) {
                    this.p = dh8Var3;
                    Objects.toString(dh8Var3);
                    break;
                }
            }
        }
        dh8 dh8Var4 = this.q;
        if (dh8Var4 != null && !dh8Var4.f()) {
            Objects.toString(this.q);
            this.q = null;
        }
        if (this.q == null && !arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                dh8 dh8Var5 = (dh8) it2.next();
                if (dh8Var5.c() == this.c && dh8Var5.m("android.media.intent.category.LIVE_AUDIO") && !dh8Var5.m("android.media.intent.category.LIVE_VIDEO") && dh8Var5.f()) {
                    this.q = dh8Var5;
                    Objects.toString(dh8Var5);
                    break;
                }
            }
        }
        dh8 dh8Var6 = this.r;
        if (dh8Var6 == null || !dh8Var6.g) {
            Objects.toString(dh8Var6);
            i(c(), 0);
        } else if (z) {
            g();
            k();
        }
    }
}
