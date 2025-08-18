package defpackage;

/* loaded from: classes2.dex */
public final class qkf implements ooc {
    public final pkf a;

    public qkf(pkf pkfVar) {
        this.a = pkfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qkf) && tpa.f(this.a, ((qkf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VideoQualityUpdateNotification(videoQuality=" + this.a + ")";
    }
}
