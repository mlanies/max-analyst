package defpackage;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes2.dex */
public final class o85 extends TouchDelegate {
    public boolean a;
    public final Rect b;
    public final int c;
    public final Rect d;
    public final View e;

    public o85(Rect rect, View view) {
        super(rect, view);
        this.b = rect;
        this.e = view;
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.c = scaledTouchSlop;
        Rect rect2 = new Rect(rect);
        this.d = rect2;
        int i = -scaledTouchSlop;
        rect2.inset(i, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    @Override // android.view.TouchDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            float r0 = r8.getX()
            int r0 = (int) r0
            float r1 = r8.getY()
            int r1 = (int) r1
            int r2 = r8.getActionMasked()
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L27
            if (r2 == r3) goto L27
            r6 = 3
            if (r2 == r6) goto L22
            r6 = 5
            if (r2 == r6) goto L27
            r6 = 6
            if (r2 == r6) goto L27
            r0 = r4
            goto L40
        L22:
            boolean r0 = r7.a
            r7.a = r4
            goto L40
        L27:
            boolean r2 = r7.a
            if (r2 == 0) goto L36
            android.graphics.Rect r6 = r7.d
            boolean r0 = r6.contains(r0, r1)
            if (r0 != 0) goto L36
            r0 = r2
            r5 = r4
            goto L40
        L36:
            r0 = r2
            goto L40
        L38:
            android.graphics.Rect r2 = r7.b
            boolean r0 = r2.contains(r0, r1)
            r7.a = r0
        L40:
            if (r0 == 0) goto L6d
            android.view.View r0 = r7.e
            if (r5 == 0) goto L56
            int r7 = r0.getWidth()
            int r7 = r7 / r3
            float r7 = (float) r7
            int r1 = r0.getHeight()
            int r1 = r1 / r3
            float r1 = (float) r1
            r8.setLocation(r7, r1)
            goto L5e
        L56:
            int r7 = r7.c
            int r7 = r7 * r3
            float r7 = (float) r7
            float r7 = -r7
            r8.setLocation(r7, r7)
        L5e:
            android.view.TouchDelegate r7 = r0.getTouchDelegate()
            r1 = 0
            r0.setTouchDelegate(r1)
            boolean r4 = r0.dispatchTouchEvent(r8)
            r0.setTouchDelegate(r7)
        L6d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o85.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
