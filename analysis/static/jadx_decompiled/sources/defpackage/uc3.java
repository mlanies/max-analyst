package defpackage;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

/* loaded from: classes2.dex */
public final /* synthetic */ class uc3 implements Runnable {
    public final /* synthetic */ int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ View Z;
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int o;

    public /* synthetic */ uc3(View view, int i, int i2, int i3, int i4, View view2, int i5) {
        this.a = i5;
        this.b = view;
        this.c = i;
        this.o = i2;
        this.X = i3;
        this.Y = i4;
        this.Z = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Rect rect = new Rect();
                View view = this.b;
                view.getHitRect(rect);
                rect.left -= this.c;
                rect.top -= this.o;
                rect.right += this.X;
                rect.bottom += this.Y;
                View view2 = this.Z;
                if (!(view2.getTouchDelegate() instanceof tc3)) {
                    view2.setTouchDelegate(new tc3(view2));
                }
                ((tc3) view2.getTouchDelegate()).a.add(new TouchDelegate(rect, view));
                break;
            default:
                Rect rect2 = new Rect();
                View view3 = this.b;
                view3.getHitRect(rect2);
                rect2.left -= this.c;
                rect2.top -= this.o;
                rect2.right += this.X;
                rect2.bottom += this.Y;
                this.Z.setTouchDelegate(new TouchDelegate(rect2, view3));
                break;
        }
    }
}
