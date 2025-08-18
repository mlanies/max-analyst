package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class inb extends ppc {
    public final /* synthetic */ jnb s0;

    public inb(jnb jnbVar) {
        this.s0 = jnbVar;
    }

    @Override // defpackage.ppc
    public final void b() {
        this.s0.d.j = true;
    }

    @Override // defpackage.ppc
    public final Object c() throws IOException {
        this.s0.d.a();
        return null;
    }
}
