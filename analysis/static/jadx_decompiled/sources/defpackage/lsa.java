package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class lsa {
    public die A;
    public vte C;
    public yuc D;
    public qld a;
    public d b;
    public ExecutorService c;
    public ag1 d;
    public Context e;
    public d4c f;
    public a4c g;
    public o9g w;
    public kj x;
    public ni y;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;
    public String[] o = null;
    public String[] p = null;
    public int q = 0;
    public boolean r = false;
    public boolean s = false;
    public boolean t = false;
    public boolean u = false;
    public boolean v = false;
    public int z = 4;
    public boolean B = false;

    public final nsa a() {
        if (this.a != null && this.b != null && this.c != null && this.d != null && this.e != null && this.f != null && this.g != null && this.w != null && this.C != null) {
            return new nsa(this);
        }
        throw new IllegalStateException("failed to build peerConnectionClient" + this.a + " " + this.b + " " + this.c + " " + this.d + " " + this.e + " " + this.f + " " + this.g + " " + this.w + " " + this.C);
    }
}
