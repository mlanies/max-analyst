package defpackage;

/* loaded from: classes.dex */
public final class haf {
    public final long a;
    public final boolean b;
    public final boolean c;
    public final llf d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final llf h;

    public haf(long j, boolean z, boolean z2, llf llfVar, boolean z3, boolean z4, boolean z5, llf llfVar2) {
        this.a = j;
        this.b = z;
        this.c = z2;
        this.d = llfVar;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = llfVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof haf)) {
            return false;
        }
        haf hafVar = (haf) obj;
        return this.a == hafVar.a && this.b == hafVar.b && this.c == hafVar.c && tpa.f(this.d, hafVar.d) && this.e == hafVar.e && this.f == hafVar.f && this.g == hafVar.g && tpa.f(this.h, hafVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ms2.d(ms2.d(ms2.d((this.d.hashCode() + ms2.d(ms2.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        return "UserVideoState(id=" + this.a + ", isMe=" + this.b + ", isVideoEnabled=" + this.c + ", videoState=" + this.d + ", isConnected=" + this.e + ", isAccepted=" + this.f + ", isScreenCaptureEnabled=" + this.g + ", screenCaptureState=" + this.h + ")";
    }
}
