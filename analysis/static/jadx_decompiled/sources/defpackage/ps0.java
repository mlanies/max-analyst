package defpackage;

import java.util.LinkedList;

/* loaded from: classes.dex */
public class ps0 {
    public final int a;
    public final int b;
    public final LinkedList c;
    public final boolean d;
    public int e;

    public ps0(int i, int i2, int i3) {
        od2.p(i > 0);
        od2.p(i2 >= 0);
        od2.p(i3 >= 0);
        this.a = i;
        this.b = i2;
        this.c = new LinkedList();
        this.e = i3;
        this.d = false;
    }

    public void a(Object obj) {
        this.c.add(obj);
    }

    public Object b() {
        return this.c.poll();
    }

    public final void c(Object obj) {
        obj.getClass();
        if (this.d) {
            od2.p(this.e > 0);
            this.e--;
            a(obj);
            return;
        }
        int i = this.e;
        if (i > 0) {
            this.e = i - 1;
            a(obj);
        } else {
            Object[] objArr = {obj};
            if (ta5.a.i(6)) {
                ta5.a.e("BUCKET", String.format(null, "Tried to release value %s from an empty bucket!", objArr));
            }
        }
    }
}
