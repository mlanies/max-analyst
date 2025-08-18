package defpackage;

/* loaded from: classes.dex */
public abstract class h87 {
    public boolean a;
    public int b;

    public final void a(int i) {
        if (!this.a) {
            this.a = true;
            this.b = i;
        } else {
            if (this.b == i) {
                return;
            }
            StringBuilder sbN = rh4.n(i, "Given job ID ", " is different than previous ");
            sbN.append(this.b);
            throw new IllegalArgumentException(sbN.toString());
        }
    }

    public void b() {
    }
}
