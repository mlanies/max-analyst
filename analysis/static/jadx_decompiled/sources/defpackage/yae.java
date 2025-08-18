package defpackage;

/* loaded from: classes.dex */
public final class yae extends kld implements j0e {
    @Override // defpackage.j0e
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(((Number) lld.c(this.s0, (this.t0 + ((int) ((s() + this.v0) - this.t0))) - 1)).intValue());
        }
        return numValueOf;
    }

    public final void z(int i) {
        synchronized (this) {
            g(Integer.valueOf(((Number) lld.c(this.s0, (this.t0 + ((int) ((s() + this.v0) - this.t0))) - 1)).intValue() + i));
        }
    }
}
