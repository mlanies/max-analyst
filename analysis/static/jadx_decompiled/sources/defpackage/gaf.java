package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class gaf {
    public final Boolean a;
    public final Long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Boolean h;
    public final Integer i;
    public final Integer j;
    public final Integer k;
    public final Boolean l;
    public final Boolean m;
    public final Boolean n;
    public final int o;
    public final int p;
    public final faf q;
    public final int r;
    public final int s;
    public final Boolean t;
    public final Boolean u;
    public final int v;
    public final Boolean w;

    public gaf(eaf eafVar) {
        this.a = eafVar.a;
        this.b = eafVar.b;
        this.c = eafVar.c;
        this.d = eafVar.d;
        this.e = eafVar.e;
        this.f = eafVar.f;
        this.g = eafVar.g;
        this.h = eafVar.h;
        this.i = eafVar.i;
        this.j = eafVar.j;
        this.k = eafVar.k;
        this.l = eafVar.l;
        this.m = eafVar.m;
        this.n = eafVar.n;
        this.o = eafVar.o;
        this.p = eafVar.p;
        this.q = eafVar.q;
        this.r = eafVar.r;
        this.s = eafVar.s;
        this.t = eafVar.t;
        this.u = eafVar.u;
        this.v = eafVar.v;
        this.w = eafVar.w;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gaf.class != obj.getClass()) {
            return false;
        }
        gaf gafVar = (gaf) obj;
        return Objects.equals(this.a, gafVar.a) && Objects.equals(this.b, gafVar.b) && Objects.equals(this.c, gafVar.c) && Objects.equals(this.d, gafVar.d) && Objects.equals(this.e, gafVar.e) && Objects.equals(this.f, gafVar.f) && Objects.equals(this.g, gafVar.g) && Objects.equals(this.h, gafVar.h) && Objects.equals(this.i, gafVar.i) && Objects.equals(this.j, gafVar.j) && Objects.equals(this.k, gafVar.k) && Objects.equals(this.l, gafVar.l) && Objects.equals(this.m, gafVar.m) && Objects.equals(this.n, gafVar.n) && this.o == gafVar.o && this.p == gafVar.p && this.q == gafVar.q && this.r == gafVar.r && this.s == gafVar.s && Objects.equals(this.t, gafVar.t) && Objects.equals(this.u, gafVar.u) && this.v == gafVar.v && Objects.equals(this.w, gafVar.w);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, au1.a(this.o), au1.a(this.p), this.q, au1.a(this.r), au1.a(this.s), this.t, this.u, au1.a(this.v), this.w);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserSettings{pushNewContacts=");
        sb.append(this.a);
        sb.append(", dontDustirbUntil=");
        sb.append(this.b);
        sb.append(", dialogsPushNotification='");
        sb.append(this.c);
        sb.append("', chatsPushNotification='");
        sb.append(this.d);
        sb.append("', pushSound='");
        sb.append(this.e);
        sb.append("', dialogsPushSound='");
        sb.append(this.f);
        sb.append("', chatsPushSound='");
        sb.append(this.g);
        sb.append("', hiddenOnline=");
        sb.append(this.h);
        sb.append(", led=");
        sb.append(this.i);
        sb.append(", dialogsLed=");
        sb.append(this.j);
        sb.append(", chatsLed=");
        sb.append(this.k);
        sb.append(", vibration=");
        sb.append(this.l);
        sb.append(", dialogsVibration=");
        sb.append(this.m);
        sb.append(", chatsVibration=");
        sb.append(this.n);
        sb.append(", chatsInvite=");
        sb.append(h4f.u(this.o));
        sb.append(", incomingCall=");
        sb.append(h4f.u(this.p));
        sb.append(", inactiveTtl=");
        sb.append(this.q);
        sb.append(", groupChatCallNotificationStatus=");
        int i = this.r;
        sb.append(i != 1 ? i != 2 ? "null" : "OFF" : "ON");
        sb.append(", suggestStickersStatus=");
        int i2 = this.s;
        sb.append(i2 != 1 ? i2 != 2 ? "null" : "OFF" : "ON");
        sb.append(", audioTranscriptionEnabled=");
        sb.append(this.t);
        sb.append(", safeMode=");
        sb.append(this.u);
        sb.append(", searchByPhone=");
        sb.append(h4f.u(this.v));
        sb.append(", unsafeFiles=");
        sb.append(this.w);
        sb.append("}");
        return sb.toString();
    }
}
