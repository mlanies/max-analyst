package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Spanned;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class wl5 implements Drawable.Callback {
    public final /* synthetic */ yl5 X;
    public final WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap();
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final ArrayList o = new ArrayList();

    public wl5(yl5 yl5Var, WeakHashMap weakHashMap) {
        this.X = yl5Var;
        this.a = weakHashMap;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        yl5 yl5Var;
        boolean z;
        Object[] spans;
        AtomicBoolean atomicBoolean = this.c;
        int i = 0;
        int i2 = 1;
        if (atomicBoolean.compareAndSet(false, true)) {
            WeakHashMap weakHashMap = this.a;
            Set setKeySet = weakHashMap.keySet();
            ArrayList arrayList = this.o;
            Iterator it = setKeySet.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                yl5Var = this.X;
                if (!zHasNext) {
                    break;
                }
                Object next = it.next();
                TextView textView = (TextView) next;
                ArrayList arrayList2 = qqe.a;
                CharSequence text = textView.getText();
                Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
                if (spanned == null || (spans = spanned.getSpans(0, textView.length(), yl5Var.getClass())) == null) {
                    z = false;
                } else {
                    for (Object obj : spans) {
                        if (obj == yl5Var) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                }
                if (!z) {
                    arrayList.add(next);
                }
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                yl5Var.c((TextView) arrayList.get(i3));
            }
            arrayList.clear();
            for (TextView textView2 : weakHashMap.keySet()) {
                if (!Looper.getMainLooper().isCurrentThread()) {
                    Handler handler = textView2.getHandler();
                    if (handler != null) {
                        handler.postAtFrontOfQueue(new tl5(yl5Var, textView2, this, i));
                    } else {
                        textView2.post(new tl5(yl5Var, textView2, this, i2));
                    }
                } else if (yl5Var.b) {
                    pla.a(textView2, new tl5(textView2, textView2, yl5Var, this));
                } else {
                    textView2.invalidate();
                    atomicBoolean.set(false);
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        yl5 yl5Var = this.X;
        boolean z = yl5Var.b;
        WeakHashMap weakHashMap = this.a;
        if (!z) {
            TextView textView = (TextView) x53.h0(weakHashMap.keySet());
            if (textView != null) {
                textView.postDelayed(runnable, j - SystemClock.uptimeMillis());
                return;
            }
            return;
        }
        v05 v05Var = new v05(runnable, this, yl5Var, 4);
        this.b.put(runnable, v05Var);
        TextView textView2 = (TextView) x53.h0(weakHashMap.keySet());
        if (textView2 != null) {
            textView2.postDelayed(v05Var, j - SystemClock.uptimeMillis());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        boolean z = this.X.b;
        WeakHashMap weakHashMap = this.a;
        if (!z) {
            for (TextView textView : weakHashMap.keySet()) {
                if (Looper.getMainLooper().isCurrentThread()) {
                    textView.removeCallbacks(runnable);
                } else {
                    Handler handler = textView.getHandler();
                    if (handler != null) {
                        handler.postAtFrontOfQueue(new ul5(textView, runnable, 0));
                    } else {
                        textView.post(new vl5(textView, runnable, 0));
                    }
                }
            }
            return;
        }
        Runnable runnable2 = (Runnable) this.b.remove(runnable);
        for (TextView textView2 : weakHashMap.keySet()) {
            if (Looper.getMainLooper().isCurrentThread()) {
                textView2.removeCallbacks(runnable2);
            } else {
                Handler handler2 = textView2.getHandler();
                if (handler2 != null) {
                    handler2.postAtFrontOfQueue(new ul5(textView2, runnable2, 1));
                } else {
                    textView2.post(new vl5(textView2, runnable2, 1));
                }
            }
        }
    }
}
