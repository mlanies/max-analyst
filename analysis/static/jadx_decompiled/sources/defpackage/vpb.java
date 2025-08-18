package defpackage;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class vpb implements Serializable {
    public final f52 a;
    public final List b;
    public final kq3 c;

    public vpb(f52 f52Var, wz wzVar, kq3 kq3Var) {
        this.a = f52Var;
        this.b = wzVar;
        this.c = kq3Var;
    }

    public final String toString() {
        return "{chat=" + this.a + ", highlights=" + s5c.o(this.b) + ", contactSearchResult=" + this.c + "}";
    }
}
