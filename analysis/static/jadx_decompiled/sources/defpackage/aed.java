package defpackage;

import android.os.Bundle;
import java.util.List;

/* loaded from: classes2.dex */
public final class aed extends ka1 {
    public static final aed f;
    public static final aed g;
    public static final aed h;
    public static final aed i;
    public static final aed j;
    public static final aed k;
    public static final aed l;
    public final jqe b;
    public final List c;
    public final wuc d;
    public final Bundle e;

    static {
        eqe eqeVar = new eqe(kha.w);
        wuc wucVar = wuc.SETTINGS_PRIVACY_SAFE_MODE_ONLINE;
        int i2 = jpc.Q;
        f = new aed(eqeVar, y53.M(new zdd(iha.l, new eqe(i2), false), new zdd(iha.m, new eqe(jpc.G1), false)), wucVar, null, 8);
        g = new aed(new eqe(kha.v), y53.M(new zdd(iha.n, new eqe(kha.t), false), new zdd(iha.o, new eqe(kha.u), false)), null, null, 12);
        eqe eqeVar2 = new eqe(kha.p);
        wuc wucVar2 = wuc.SETTINGS_PRIVACY_SAFE_MODE_CALLS;
        int i3 = jpc.b;
        h = new aed(eqeVar2, y53.M(new zdd(iha.h, new eqe(i3), false), new zdd(iha.i, new eqe(i2), false)), wucVar2, null, 8);
        i = new aed(new eqe(kha.A), y53.M(new zdd(iha.r, new eqe(i3), false), new zdd(iha.s, new eqe(i2), false)), wuc.SETTINGS_PRIVACY_SAFE_MODE_SEARCH_BY_PHONE, null, 8);
        j = new aed(new eqe(kha.o), y53.M(new zdd(iha.f, new eqe(i3), false), new zdd(iha.g, new eqe(i2), false)), wuc.SETTINGS_PRIVACY_SAFE_MODE_INVITE, null, 8);
        k = new aed(new eqe(kha.s), y53.M(new zdd(iha.k, new eqe(kha.r), true), new zdd(iha.j, new eqe(kha.q), false)), null, null, 12);
        l = new aed(new eqe(kha.z), y53.M(new zdd(iha.q, new eqe(kha.y), false), new zdd(iha.p, new eqe(kha.x), false)), null, null, 12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aed(jqe jqeVar, List list, wuc wucVar, Bundle bundle, int i2) {
        super(12);
        wucVar = (i2 & 4) != 0 ? null : wucVar;
        bundle = (i2 & 8) != 0 ? null : bundle;
        this.b = jqeVar;
        this.c = list;
        this.d = wucVar;
        this.e = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aed)) {
            return false;
        }
        aed aedVar = (aed) obj;
        return tpa.f(this.b, aedVar.b) && tpa.f(this.c, aedVar.c) && this.d == aedVar.d && tpa.f(this.e, aedVar.e);
    }

    public final int hashCode() {
        int iG = k7d.g(this.c, this.b.hashCode() * 31, 31);
        wuc wucVar = this.d;
        int iHashCode = (iG + (wucVar == null ? 0 : wucVar.hashCode())) * 31;
        Bundle bundle = this.e;
        return iHashCode + (bundle != null ? bundle.hashCode() : 0);
    }

    public final String toString() {
        return "OpenConfirmationDialog(title=" + this.b + ", buttons=" + this.c + ", statScreen=" + this.d + ", payload=" + this.e + ")";
    }
}
