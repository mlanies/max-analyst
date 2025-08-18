package defpackage;

import android.graphics.Rect;
import android.util.Size;

/* loaded from: classes.dex */
public final class ecd extends i06 {
    public final su6 X;
    public final int Y;
    public final int Z;
    public final Object o;

    public ecd(ov6 ov6Var, Size size, su6 su6Var) {
        super(ov6Var);
        this.o = new Object();
        if (size == null) {
            this.Y = this.b.getWidth();
            this.Z = this.b.getHeight();
        } else {
            this.Y = size.getWidth();
            this.Z = size.getHeight();
        }
        this.X = su6Var;
    }

    public final void d(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, this.Y, this.Z)) {
                rect2.setEmpty();
            }
        }
        synchronized (this.o) {
        }
    }

    @Override // defpackage.i06, defpackage.ov6
    public final int getHeight() {
        return this.Z;
    }

    @Override // defpackage.i06, defpackage.ov6
    public final su6 getImageInfo() {
        return this.X;
    }

    @Override // defpackage.i06, defpackage.ov6
    public final int getWidth() {
        return this.Y;
    }
}
