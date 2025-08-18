package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: classes2.dex */
public final class ua6 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k56 b;

    public /* synthetic */ ua6(int i, k56 k56Var) {
        this.a = i;
        this.b = k56Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                this.b.invoke();
                break;
            default:
                this.b.invoke();
                break;
        }
        return true;
    }
}
