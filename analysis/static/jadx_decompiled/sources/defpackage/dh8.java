package defpackage;

import android.content.ComponentName;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class dh8 {
    public final ch8 a;
    public final String b;
    public final String c;
    public String d;
    public String e;
    public Uri f;
    public boolean g;
    public int h;
    public boolean i;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public Bundle r;
    public IntentSender s;
    public zf8 t;
    public us v;
    public final ArrayList j = new ArrayList();
    public int q = -1;
    public ArrayList u = new ArrayList();

    public dh8(ch8 ch8Var, String str, String str2) {
        this.a = ch8Var;
        this.b = str;
        this.c = str2;
    }

    public static sg8 a() {
        eh8.b();
        tg8 tg8Var = eh8.c().s;
        if (tg8Var instanceof sg8) {
            return (sg8) tg8Var;
        }
        return null;
    }

    public final gaa b(dh8 dh8Var) {
        if (dh8Var == null) {
            throw new NullPointerException("route must not be null");
        }
        us usVar = this.v;
        if (usVar == null) {
            return null;
        }
        String str = dh8Var.c;
        if (usVar.containsKey(str)) {
            return new gaa((rg8) this.v.get(str));
        }
        return null;
    }

    public final ug8 c() {
        ch8 ch8Var = this.a;
        ch8Var.getClass();
        eh8.b();
        return ch8Var.a;
    }

    public final boolean d() {
        eh8.b();
        dh8 dh8Var = eh8.c().p;
        if (dh8Var == null) {
            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
        }
        if ((dh8Var == this) || this.m == 3) {
            return true;
        }
        return TextUtils.equals(((ComponentName) c().b.b).getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO");
    }

    public final boolean e() {
        return Collections.unmodifiableList(this.u).size() >= 1;
    }

    public final boolean f() {
        return this.t != null && this.g;
    }

    public final boolean g() {
        eh8.b();
        return eh8.c().f() == this;
    }

    public final boolean h(wg8 wg8Var) {
        if (wg8Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        eh8.b();
        ArrayList arrayList = this.j;
        if (arrayList == null) {
            return false;
        }
        wg8Var.a();
        if (wg8Var.b.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            IntentFilter intentFilter = (IntentFilter) it.next();
            if (intentFilter != null) {
                Iterator it2 = wg8Var.b.iterator();
                while (it2.hasNext()) {
                    if (intentFilter.hasCategory((String) it2.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0106 A[EDGE_INSN: B:130:0x0106->B:70:0x0106 BREAK  A[LOOP:0: B:37:0x0099->B:136:0x0099], EDGE_INSN: B:131:0x0106->B:70:0x0106 BREAK  A[LOOP:0: B:37:0x0099->B:136:0x0099], EDGE_INSN: B:132:0x0106->B:70:0x0106 BREAK  A[LOOP:0: B:37:0x0099->B:136:0x0099], EDGE_INSN: B:133:0x0106->B:70:0x0106 BREAK  A[LOOP:0: B:37:0x0099->B:136:0x0099, LOOP_LABEL: LOOP:0: B:37:0x0099->B:136:0x0099], EDGE_INSN: B:134:0x0106->B:70:0x0106 BREAK  A[LOOP:0: B:37:0x0099->B:136:0x0099], EDGE_INSN: B:135:0x0106->B:70:0x0106 BREAK  A[LOOP:0: B:37:0x0099->B:136:0x0099, LOOP_LABEL: LOOP:0: B:37:0x0099->B:136:0x0099]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(defpackage.zf8 r15) {
        /*
            Method dump skipped, instructions count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dh8.i(zf8):int");
    }

    public final void j(int i) {
        tg8 tg8Var;
        tg8 tg8Var2;
        eh8.b();
        ah8 ah8VarC = eh8.c();
        int iMin = Math.min(this.p, Math.max(0, i));
        if (this == ah8VarC.r && (tg8Var2 = ah8VarC.s) != null) {
            tg8Var2.f(iMin);
            return;
        }
        HashMap map = ah8VarC.v;
        if (map.isEmpty() || (tg8Var = (tg8) map.get(this.c)) == null) {
            return;
        }
        tg8Var.f(iMin);
    }

    public final void k(int i) {
        tg8 tg8Var;
        tg8 tg8Var2;
        eh8.b();
        if (i != 0) {
            ah8 ah8VarC = eh8.c();
            if (this == ah8VarC.r && (tg8Var2 = ah8VarC.s) != null) {
                tg8Var2.i(i);
                return;
            }
            HashMap map = ah8VarC.v;
            if (map.isEmpty() || (tg8Var = (tg8) map.get(this.c)) == null) {
                return;
            }
            tg8Var.i(i);
        }
    }

    public final void l() {
        eh8.b();
        eh8.c().h(this, 3);
    }

    public final boolean m(String str) {
        eh8.b();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((IntentFilter) arrayList.get(i)).hasCategory(str)) {
                return true;
            }
        }
        return false;
    }

    public final void n(Collection collection) {
        this.u.clear();
        if (this.v == null) {
            this.v = new us(0);
        }
        this.v.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            rg8 rg8Var = (rg8) it.next();
            dh8 dh8VarA = this.a.a(rg8Var.a.c());
            if (dh8VarA != null) {
                this.v.put(dh8VarA.c, rg8Var);
                int i = rg8Var.b;
                if (i == 2 || i == 3) {
                    this.u.add(dh8VarA);
                }
            }
        }
        eh8.c().m.b(259, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaRouter.RouteInfo{ uniqueId=" + this.c + ", name=" + this.d + ", description=" + this.e + ", iconUri=" + this.f + ", enabled=" + this.g + ", connectionState=" + this.h + ", canDisconnect=" + this.i + ", playbackType=" + this.k + ", playbackStream=" + this.l + ", deviceType=" + this.m + ", volumeHandling=" + this.n + ", volume=" + this.o + ", volumeMax=" + this.p + ", presentationDisplayId=" + this.q + ", extras=" + this.r + ", settingsIntent=" + this.s + ", providerPackageName=" + ((ComponentName) this.a.c.b).getPackageName());
        if (e()) {
            sb.append(", members=[");
            int size = this.u.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                if (this.u.get(i) != this) {
                    sb.append(((dh8) this.u.get(i)).c);
                }
            }
            sb.append(']');
        }
        sb.append(" }");
        return sb.toString();
    }
}
