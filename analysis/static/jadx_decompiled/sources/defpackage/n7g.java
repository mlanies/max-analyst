package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.UUID;

/* loaded from: classes.dex */
public final class n7g {
    public final UUID a;
    public final m7g b;
    public final d24 c;
    public final HashSet d;
    public final d24 e;
    public final int f;
    public final int g;

    public n7g(UUID uuid, m7g m7gVar, d24 d24Var, ArrayList arrayList, d24 d24Var2, int i, int i2) {
        this.a = uuid;
        this.b = m7gVar;
        this.c = d24Var;
        this.d = new HashSet(arrayList);
        this.e = d24Var2;
        this.f = i;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n7g.class != obj.getClass()) {
            return false;
        }
        n7g n7gVar = (n7g) obj;
        if (this.f == n7gVar.f && this.g == n7gVar.g && this.a.equals(n7gVar.a) && this.b == n7gVar.b && this.c.equals(n7gVar.c) && this.d.equals(n7gVar.d)) {
            return this.e.equals(n7gVar.e);
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f) * 31) + this.g;
    }

    public final String toString() {
        return "WorkInfo{mId='" + this.a + "', mState=" + this.b + ", mOutputData=" + this.c + ", mTags=" + this.d + ", mProgress=" + this.e + '}';
    }
}
