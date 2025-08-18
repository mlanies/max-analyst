package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class m20 {
    public List a;
    public z07 b;
    public wgc c;

    public final void a(l20 l20Var) {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        this.a.add(l20Var);
    }

    public final int b() {
        List list = this.a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final k8g c() {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        return new k8g(this);
    }

    public final l20 d(int i) {
        if (i < 0 || i >= b()) {
            throw new IllegalArgumentException("index < 0 or index >= attaches.size()");
        }
        return (l20) this.a.get(i);
    }

    public final void e(int i, l20 l20Var) {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        if (i < 0 || i >= b()) {
            throw new IllegalArgumentException("index < 0 or index >= attaches.size()");
        }
        this.a.set(i, l20Var);
    }
}
