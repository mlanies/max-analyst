package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class m3e {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;
    public final List h;
    public final boolean i;
    public final boolean j;

    public m3e(k3e k3eVar) {
        this.a = k3eVar.a;
        this.b = k3eVar.b;
        this.c = k3eVar.c;
        this.d = k3eVar.d;
        this.e = k3eVar.e;
        this.f = k3eVar.f;
        this.g = k3eVar.g;
        List list = k3eVar.h;
        this.h = list;
        this.i = k3eVar.i;
        boolean z = false;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int i = ((d2e) it.next()).u0;
                if (i == 3 || i == 4) {
                    z = true;
                    break;
                }
            }
        }
        this.j = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m3e.class != obj.getClass()) {
            return false;
        }
        m3e m3eVar = (m3e) obj;
        if (this.a != m3eVar.a || this.d != m3eVar.d || this.e != m3eVar.e || this.f != m3eVar.f || this.i != m3eVar.i) {
            return false;
        }
        String str = m3eVar.b;
        String str2 = this.b;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = m3eVar.c;
        String str4 = this.c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        if (this.g.equals(m3eVar.g)) {
            return this.h.equals(m3eVar.h);
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        long j2 = this.d;
        int i2 = (iHashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.e;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f;
        return ((this.h.hashCode() + rh4.d((i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31, 31, this.g)) * 31) + (this.i ? 1 : 0);
    }

    public final String toString() {
        List list = this.h;
        int size = list != null ? list.size() : 0;
        StringBuilder sb = new StringBuilder("StickerSet{id=");
        sb.append(this.a);
        sb.append(", name='");
        sb.append(this.b);
        sb.append("', iconUrl='");
        sb.append(this.c);
        sb.append("', authorId=");
        sb.append(this.d);
        sb.append(", createTime=");
        sb.append(this.e);
        sb.append(", updateTime=");
        sb.append(this.f);
        sb.append(", link='");
        sb.append(this.g);
        sb.append("', stickers=");
        sb.append(size);
        sb.append(", draft=");
        sb.append(this.i);
        sb.append(", hasAnimatedOrOverlayStickers=");
        return au1.j(sb, this.j, "}");
    }
}
