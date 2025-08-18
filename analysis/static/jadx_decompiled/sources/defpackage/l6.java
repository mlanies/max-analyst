package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class l6 extends View {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l6(Context context, int i) {
        super(context);
        this.a = i;
    }

    @Override // android.view.View
    public int getWindowSystemUiVisibility() {
        switch (this.a) {
            case 0:
                return 0;
            default:
                return super.getWindowSystemUiVisibility();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
