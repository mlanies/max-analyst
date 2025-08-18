package defpackage;

/* loaded from: classes.dex */
public final class aaf implements kfd {
    public final jqe a;

    public aaf(gqe gqeVar) {
        this.a = gqeVar;
    }

    @Override // defpackage.kfd
    public final jqe b() {
        return null;
    }

    @Override // defpackage.kfd
    public final bfd c() {
        return null;
    }

    @Override // defpackage.kfd
    public final jqe d() {
        return null;
    }

    @Override // defpackage.kfd
    public final hfd e() {
        return cfd.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aaf) && tpa.f(this.a, ((aaf) obj).a);
    }

    @Override // defpackage.kfd
    public final Integer f() {
        return null;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return Long.MIN_VALUE;
    }

    @Override // defpackage.kfd
    public final jqe getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.kfd, defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return y7a.R0;
    }

    public final String toString() {
        return rh4.l(new StringBuilder("UserInWaitingMore(title="), this.a, ")");
    }

    @Override // defpackage.kfd
    public final int u() {
        return 0;
    }
}
