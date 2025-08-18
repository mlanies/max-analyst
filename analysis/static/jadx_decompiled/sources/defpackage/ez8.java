package defpackage;

import android.view.MotionEvent;

/* loaded from: classes2.dex */
public final class ez8 {
    public final bac a;
    public final MotionEvent b;

    public ez8(bac bacVar, MotionEvent motionEvent) {
        this.a = bacVar;
        this.b = motionEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez8)) {
            return false;
        }
        ez8 ez8Var = (ez8) obj;
        return this.a == ez8Var.a && tpa.f(this.b, ez8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RecordControlMotionEvent(type=" + this.a + ", motionEvent=" + this.b + ")";
    }
}
