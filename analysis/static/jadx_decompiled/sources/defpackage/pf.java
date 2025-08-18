package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class pf implements Drawable.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                ((sf) this.b).invalidateSelf();
                break;
            case 1:
                Drawable.Callback callback = ((zj) this.b).getCallback();
                if (callback != null) {
                    callback.invalidateDrawable(drawable);
                    break;
                }
                break;
            case 2:
                ((g5a) this.b).invalidateSelf();
                break;
            case 3:
                boolean zIsCurrentThread = Looper.getMainLooper().isCurrentThread();
                yia yiaVar = (yia) this.b;
                if (!zIsCurrentThread) {
                    Handler handler = yiaVar.getHandler();
                    if (handler == null) {
                        yiaVar.post(new xia(yiaVar, 1));
                        break;
                    } else {
                        handler.postAtFrontOfQueue(new xia(yiaVar, 0));
                        break;
                    }
                } else {
                    yiaVar.invalidate();
                    break;
                }
            default:
                ((f9f) this.b).invalidateSelf();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.a) {
            case 0:
                ((sf) this.b).scheduleSelf(runnable, j);
                break;
            case 1:
                Drawable.Callback callback = ((zj) this.b).getCallback();
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j);
                    break;
                }
                break;
            case 2:
                ((g5a) this.b).scheduleSelf(runnable, j);
                break;
            case 3:
                ((yia) this.b).postDelayed(runnable, j);
                break;
            default:
                ((f9f) this.b).scheduleSelf(runnable, j);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.a) {
            case 0:
                ((sf) this.b).unscheduleSelf(runnable);
                break;
            case 1:
                Drawable.Callback callback = ((zj) this.b).getCallback();
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
            case 2:
                ((g5a) this.b).unscheduleSelf(runnable);
                break;
            case 3:
                boolean zIsCurrentThread = Looper.getMainLooper().isCurrentThread();
                yia yiaVar = (yia) this.b;
                if (!zIsCurrentThread) {
                    Handler handler = yiaVar.getHandler();
                    if (handler == null) {
                        yiaVar.post(new h76(yiaVar, 17, runnable));
                        break;
                    } else {
                        handler.postAtFrontOfQueue(new i76(yiaVar, 14, runnable));
                        break;
                    }
                } else {
                    yiaVar.removeCallbacks(runnable);
                    break;
                }
            default:
                ((f9f) this.b).unscheduleSelf(runnable);
                break;
        }
    }
}
