package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class fg1 {
    public static final kpa r = new kpa("peerid", "WEB_SOCKET");
    public bg1 a;
    public final hi9 b;
    public final ji9 c;
    public final ArrayList d;
    public final List e;
    public final HashMap f;
    public boolean g;
    public float h;
    public ao9 i;
    public kpa j;
    public String k;
    public String l;
    public long m;
    public boolean n;
    public boolean o;
    public o61 p;
    public List q;

    public fg1(bg1 bg1Var, kpa kpaVar, hi9 hi9Var, ji9 ji9Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = Collections.unmodifiableList(arrayList);
        this.f = new HashMap();
        this.h = 1.0f;
        this.i = ao9.a;
        this.q = Collections.emptyList();
        this.a = bg1Var;
        e(kpaVar);
        this.b = hi9Var == null ? new hi9() : hi9Var;
        this.c = ji9Var == null ? new ji9() : ji9Var;
    }

    public final boolean a() {
        eg1 eg1Var = eg1.b;
        List list = this.e;
        return list.contains(eg1Var) || list.contains(eg1.a);
    }

    public final boolean b() {
        return this.j != null;
    }

    public final boolean c() {
        return d() && this.o;
    }

    public final boolean d() {
        return this.c.e && this.n;
    }

    public final boolean e(kpa kpaVar) {
        if (kpaVar == null || TextUtils.isEmpty((CharSequence) kpaVar.a) || Objects.equals(this.j, kpaVar)) {
            return false;
        }
        if (this.j == null) {
            this.m = System.currentTimeMillis();
        }
        this.j = kpaVar;
        kpa kpaVar2 = (kpa) this.f.get(kpaVar);
        if (kpaVar2 == null) {
            return true;
        }
        this.l = (String) kpaVar2.a;
        this.k = (String) kpaVar2.b;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fg1.class != obj.getClass()) {
            return false;
        }
        bg1 bg1Var = this.a;
        return bg1Var != null && bg1Var.equals(((fg1) obj).a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallParticipant{");
        sb.append(this.a);
        if (this.j != null || !this.f.isEmpty()) {
            sb.append("|registered");
        }
        kpa kpaVar = this.j;
        if (kpaVar != null) {
            sb.append("|accepted(");
            sb.append((String) kpaVar.a);
            sb.append(',');
            sb.append(this.l);
            sb.append('/');
            sb.append(this.k);
            sb.append(')');
        }
        if (this.g) {
            sb.append("|connected");
        }
        sb.append('|');
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }
}
