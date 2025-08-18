package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class fqb {
    public static final /* synthetic */ bc7[] e = {new hob(fqb.class, "connectionController", "getConnectionController()Lru/ok/tamtam/controllers/ConnectionController;", 0), zr6.e(nec.a, fqb.class, "device", "getDevice()Lru/ok/tamtam/Device;", 0)};
    public static final String f = fqb.class.getName();
    public final y7d a;
    public final AtomicLong b = new AtomicLong();
    public final rm4 c;
    public final rm4 d;

    public fqb(y7d y7dVar, rm4 rm4Var, rm4 rm4Var2) {
        this.a = y7dVar;
        this.c = rm4Var;
        this.d = rm4Var2;
    }

    public final ri4 a() {
        bc7 bc7Var = e[1];
        return (ri4) this.d.get();
    }
}
