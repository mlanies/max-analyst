package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class pqa {
    public final fqa a;
    public final Map b;
    public final Map c;
    public final gg1 d;
    public final gg1 e;
    public final Map f;
    public final Map g;
    public final boolean h;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ pqa(fqa fqaVar) {
        oz4 oz4Var = oz4.a;
        this(fqaVar, oz4Var, oz4Var, null, null, oz4Var, oz4Var, false);
    }

    public final gg1 a() {
        Object next;
        gg1 id;
        Map map = this.f;
        Iterator it = map.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((fqa) next).a.m()) {
                break;
            }
        }
        fqa fqaVar = (fqa) next;
        return (fqaVar == null || (id = fqaVar.a.getId()) == null) ? (gg1) x53.h0(map.keySet()) : id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqa)) {
            return false;
        }
        pqa pqaVar = (pqa) obj;
        return tpa.f(this.a, pqaVar.a) && tpa.f(this.b, pqaVar.b) && tpa.f(this.c, pqaVar.c) && tpa.f(this.d, pqaVar.d) && tpa.f(this.e, pqaVar.e) && tpa.f(this.f, pqaVar.f) && tpa.f(this.g, pqaVar.g) && this.h == pqaVar.h;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        gg1 gg1Var = this.d;
        int iHashCode2 = (iHashCode + (gg1Var == null ? 0 : gg1Var.hashCode())) * 31;
        gg1 gg1Var2 = this.e;
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + ((this.f.hashCode() + ((iHashCode2 + (gg1Var2 != null ? gg1Var2.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ParticipantsState(me=" + this.a + ", usersInCall=" + this.b + ", participants=" + this.c + ", primarySpeaker=" + this.d + ", opponentSpeaker=" + this.e + ", screenShareSpeakers=" + this.f + ", raisedHands=" + this.g + ", hasAnyEnabledCamera=" + this.h + ")";
    }

    public pqa(fqa fqaVar, Map map, Map map2, gg1 gg1Var, gg1 gg1Var2, Map map3, Map map4, boolean z) {
        this.a = fqaVar;
        this.b = map;
        this.c = map2;
        this.d = gg1Var;
        this.e = gg1Var2;
        this.f = map3;
        this.g = map4;
        this.h = z;
    }
}
