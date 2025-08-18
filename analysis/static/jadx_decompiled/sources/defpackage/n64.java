package defpackage;

import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class n64 {
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Object g;

    public n64(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = true;
                this.c = 65536;
                this.f = 0;
                this.g = new wc[100];
                break;
            case 2:
                break;
            default:
                this.b = true;
                this.c = 65536;
                this.f = 0;
                this.g = new vc[100];
                break;
        }
    }

    public synchronized int a() {
        return this.e * this.c;
    }

    public void b(RecyclerView recyclerView) {
        int i = this.f;
        if (i >= 0) {
            this.f = -1;
            recyclerView.a0(i);
            this.b = false;
        } else if (this.b) {
            Interpolator interpolator = (Interpolator) this.g;
            if (interpolator != null && this.e < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i2 = this.e;
            if (i2 < 1) {
                throw new IllegalStateException("Scroll duration must be a positive number");
            }
            recyclerView.p1.c(this.c, this.d, i2, interpolator);
            this.b = false;
        }
    }

    public synchronized void c(int i) {
        int i2 = this.a;
        synchronized (this) {
            switch (i2) {
                case 0:
                    boolean z = i < this.d;
                    this.d = i;
                    if (z) {
                        d();
                    }
                    return;
                default:
                    boolean z2 = i < this.d;
                    this.d = i;
                    if (z2) {
                        d();
                    }
                    return;
            }
        }
    }

    public synchronized void d() {
        int i = this.a;
        synchronized (this) {
            switch (i) {
                case 0:
                    int iMax = Math.max(0, maf.g(this.d, this.c) - this.e);
                    int i2 = this.f;
                    if (iMax >= i2) {
                        return;
                    }
                    Arrays.fill((vc[]) this.g, iMax, i2, (Object) null);
                    this.f = iMax;
                    return;
                default:
                    int iMax2 = Math.max(0, oaf.g(this.d, this.c) - this.e);
                    int i3 = this.f;
                    if (iMax2 >= i3) {
                        return;
                    }
                    Arrays.fill((wc[]) this.g, iMax2, i3, (Object) null);
                    this.f = iMax2;
                    return;
            }
        }
    }

    public void e(int i, int i2, int i3, Interpolator interpolator) {
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.g = interpolator;
        this.b = true;
    }
}
