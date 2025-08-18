package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class jt {
    public final /* synthetic */ int a;
    public int b;
    public int c;

    public /* synthetic */ jt(int i) {
        this.a = i;
    }

    public void a(int i) {
        int i2;
        int i3 = this.c;
        if (i3 < i || (i2 = this.b) <= 0) {
            ta5.n("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i), Integer.valueOf(this.c), Integer.valueOf(this.b));
        } else {
            this.b = i2 - 1;
            this.c = i3 - i;
        }
    }

    public int b() {
        switch (this.a) {
            case 4:
                int i = this.c;
                if (i != 2) {
                    if (i != 5) {
                        if (i != 29) {
                            if (i != 42) {
                                if (i != 22) {
                                    if (i != 23) {
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            default:
                int i2 = this.c;
                if (i2 != 2) {
                    if (i2 != 5) {
                        if (i2 != 29) {
                            if (i2 != 42) {
                                if (i2 != 22) {
                                    if (i2 != 23) {
                                    }
                                }
                            }
                        }
                    }
                }
                break;
        }
        return 10;
    }

    public void c(dec decVar) {
        View view = decVar.a;
        this.b = view.getLeft();
        this.c = view.getTop();
        view.getRight();
        view.getBottom();
    }

    public String toString() {
        switch (this.a) {
            case 8:
                StringBuilder sb = new StringBuilder("Size{width=");
                sb.append(this.b);
                sb.append(", height=");
                return au1.h(sb, this.c, '}');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ jt(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }
}
