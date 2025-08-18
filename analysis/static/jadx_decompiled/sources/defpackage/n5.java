package defpackage;

import android.graphics.Point;
import android.graphics.drawable.Animatable;
import android.os.Handler;
import android.os.Looper;
import one.me.sdk.uikit.common.views.OneMeDraweeView;
import one.me.sdk.zoom.ZoomableDraweeView;
import ru.ok.messages.views.ActAvatarCrop;

/* loaded from: classes2.dex */
public final class n5 extends ii0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n5(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.ii0, defpackage.ev3
    public final void a(String str, ru6 ru6Var, Animatable animatable) {
        switch (this.b) {
            case 0:
                Point point = new Point(ru6Var.getWidth(), ru6Var.getHeight());
                ActAvatarCrop actAvatarCrop = (ActAvatarCrop) this.c;
                actAvatarCrop.a1 = point;
                actAvatarCrop.Z0.setEnabled(true);
                break;
            case 1:
                ((g5a) this.c).invalidateSelf();
                break;
            case 2:
                boolean zIsCurrentThread = Looper.getMainLooper().isCurrentThread();
                s5a s5aVar = (s5a) this.c;
                if (!zIsCurrentThread) {
                    Handler handler = s5aVar.getHandler();
                    if (handler == null) {
                        s5aVar.post(new n5a(s5aVar, 1));
                        break;
                    } else {
                        handler.postAtFrontOfQueue(new n5a(s5aVar, 0));
                        break;
                    }
                } else {
                    k56 k56Var = s5aVar.C0;
                    if (k56Var != null) {
                        k56Var.invoke();
                    }
                    s5aVar.invalidate();
                    break;
                }
            case 3:
                boolean zIsCurrentThread2 = Looper.getMainLooper().isCurrentThread();
                OneMeDraweeView oneMeDraweeView = (OneMeDraweeView) this.c;
                if (!zIsCurrentThread2) {
                    Handler handler2 = oneMeDraweeView.getHandler();
                    if (handler2 == null) {
                        oneMeDraweeView.post(new xaa(oneMeDraweeView, str, ru6Var, animatable, 1));
                        break;
                    } else {
                        handler2.postAtFrontOfQueue(new xaa(oneMeDraweeView, str, ru6Var, animatable, 0));
                        break;
                    }
                } else {
                    oneMeDraweeView.p(ru6Var, animatable);
                    oneMeDraweeView.requestLayout();
                    oneMeDraweeView.invalidate();
                    break;
                }
            case 4:
                ((f9f) this.c).invalidateSelf();
                break;
            default:
                br7.N((ZoomableDraweeView) this.c, new fre(this, 24, ru6Var));
                break;
        }
    }

    @Override // defpackage.ii0, defpackage.ev3
    public void d(String str, Throwable th) {
        switch (this.b) {
            case 1:
                hm9.m0(((g5a) this.c).c, "Failed to load image. ID: " + str + ". Exception: " + th, new Object[0]);
                break;
            case 2:
                s5a s5aVar = (s5a) this.c;
                hm9.l0(s5aVar.a, "Failed to load image. ID: " + str, th);
                s5aVar.postInvalidate();
                break;
            case 3:
                OneMeDraweeView oneMeDraweeView = (OneMeDraweeView) this.c;
                hm9.m0(oneMeDraweeView.x0, "Failed to load image. ID: " + str + ". Exception: " + th, new Object[0]);
                if (!Looper.getMainLooper().isCurrentThread()) {
                    Handler handler = oneMeDraweeView.getHandler();
                    if (handler == null) {
                        oneMeDraweeView.post(new waa(oneMeDraweeView, 1));
                        break;
                    } else {
                        handler.postAtFrontOfQueue(new waa(oneMeDraweeView, 0));
                        break;
                    }
                } else {
                    oneMeDraweeView.requestLayout();
                    oneMeDraweeView.invalidate();
                    break;
                }
            case 4:
                m56 m56Var = ((f9f) this.c).c;
                if (m56Var != null) {
                    m56Var.invoke(th);
                    break;
                }
                break;
            case 5:
                br7.N((ZoomableDraweeView) this.c, new fre(this, 25, th));
                break;
        }
    }

    @Override // defpackage.ii0, defpackage.ev3
    public void g(String str) {
        switch (this.b) {
            case 5:
                ZoomableDraweeView zoomableDraweeView = (ZoomableDraweeView) this.c;
                br7.N(zoomableDraweeView, new kag(zoomableDraweeView, 1));
                break;
        }
    }

    @Override // defpackage.ii0, defpackage.ev3
    public void h(String str, ru6 ru6Var) {
        switch (this.b) {
            case 1:
                ((g5a) this.c).invalidateSelf();
                break;
            case 2:
                ((s5a) this.c).postInvalidate();
                break;
            case 3:
                boolean zIsCurrentThread = Looper.getMainLooper().isCurrentThread();
                OneMeDraweeView oneMeDraweeView = (OneMeDraweeView) this.c;
                if (!zIsCurrentThread) {
                    Handler handler = oneMeDraweeView.getHandler();
                    if (handler == null) {
                        oneMeDraweeView.post(new waa(oneMeDraweeView, 3));
                        break;
                    } else {
                        handler.postAtFrontOfQueue(new waa(oneMeDraweeView, 2));
                        break;
                    }
                } else {
                    oneMeDraweeView.requestLayout();
                    oneMeDraweeView.invalidate();
                    break;
                }
            case 5:
                ZoomableDraweeView zoomableDraweeView = (ZoomableDraweeView) this.c;
                zoomableDraweeView.removeCallbacks(zoomableDraweeView.B0);
                br7.N(zoomableDraweeView, zoomableDraweeView.B0);
                break;
        }
    }
}
