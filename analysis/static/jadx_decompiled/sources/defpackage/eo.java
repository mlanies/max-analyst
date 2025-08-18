package defpackage;

import android.app.Notification;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class eo implements Runnable {
    public final /* synthetic */ int a;
    public final int b;
    public final Object c;
    public final Object o;

    public /* synthetic */ eo(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.o = obj;
        this.b = i;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lq1 lq1Var;
        ArrayList arrayList;
        int iDecrementAndGet;
        Object obj = this.c;
        int i = this.b;
        Object obj2 = this.o;
        switch (this.a) {
            case 0:
                ((TextView) obj).setTypeface((Typeface) obj2, i);
                return;
            case 1:
                int i2 = BottomSheetBehavior.f0;
                ((BottomSheetBehavior) obj2).N(i, (View) obj, false);
                return;
            case 2:
                ArrayList arrayList2 = (ArrayList) obj;
                int size = arrayList2.size();
                if (i != 1) {
                    for (int i3 = 0; i3 < size; i3++) {
                        ((tw4) arrayList2.get(i3)).h((Throwable) obj2);
                    }
                    return;
                } else {
                    for (int i4 = 0; i4 < size; i4++) {
                        ((tw4) arrayList2.get(i4)).i();
                    }
                    return;
                }
            case 3:
                bm7 bm7Var = (bm7) obj;
                nl7 nl7Var = (nl7) obj2;
                AtomicInteger atomicInteger = nl7Var.o;
                ArrayList arrayList3 = nl7Var.b;
                boolean zIsDone = nl7Var.isDone();
                boolean z = nl7Var.c;
                if (zIsDone || arrayList3 == null) {
                    c54.p("Future was done before all dependencies completed", z);
                    return;
                }
                try {
                    try {
                        try {
                            try {
                                c54.p("Tried to set value from future which is not done", bm7Var.isDone());
                                arrayList3.set(i, kq0.o(bm7Var));
                                iDecrementAndGet = atomicInteger.decrementAndGet();
                                c54.p("Less than 0 remaining futures", iDecrementAndGet >= 0);
                            } catch (CancellationException unused) {
                                if (z) {
                                    nl7Var.cancel(false);
                                }
                                int iDecrementAndGet2 = atomicInteger.decrementAndGet();
                                c54.p("Less than 0 remaining futures", iDecrementAndGet2 >= 0);
                                if (iDecrementAndGet2 != 0) {
                                    return;
                                }
                                ArrayList arrayList4 = nl7Var.b;
                                if (arrayList4 != null) {
                                    lq1Var = nl7Var.Y;
                                    arrayList = new ArrayList(arrayList4);
                                }
                            }
                        } catch (ExecutionException e) {
                            if (z) {
                                nl7Var.Y.d(e.getCause());
                            }
                            int iDecrementAndGet3 = atomicInteger.decrementAndGet();
                            c54.p("Less than 0 remaining futures", iDecrementAndGet3 >= 0);
                            if (iDecrementAndGet3 != 0) {
                                return;
                            }
                            ArrayList arrayList5 = nl7Var.b;
                            if (arrayList5 != null) {
                                lq1Var = nl7Var.Y;
                                arrayList = new ArrayList(arrayList5);
                            }
                        }
                    } catch (Error e2) {
                        nl7Var.Y.d(e2);
                        int iDecrementAndGet4 = atomicInteger.decrementAndGet();
                        c54.p("Less than 0 remaining futures", iDecrementAndGet4 >= 0);
                        if (iDecrementAndGet4 != 0) {
                            return;
                        }
                        ArrayList arrayList6 = nl7Var.b;
                        if (arrayList6 != null) {
                            lq1Var = nl7Var.Y;
                            arrayList = new ArrayList(arrayList6);
                        }
                    } catch (RuntimeException e3) {
                        if (z) {
                            nl7Var.Y.d(e3);
                        }
                        int iDecrementAndGet5 = atomicInteger.decrementAndGet();
                        c54.p("Less than 0 remaining futures", iDecrementAndGet5 >= 0);
                        if (iDecrementAndGet5 != 0) {
                            return;
                        }
                        ArrayList arrayList7 = nl7Var.b;
                        if (arrayList7 != null) {
                            lq1Var = nl7Var.Y;
                            arrayList = new ArrayList(arrayList7);
                        }
                    }
                    if (iDecrementAndGet == 0) {
                        ArrayList arrayList8 = nl7Var.b;
                        if (arrayList8 != null) {
                            lq1Var = nl7Var.Y;
                            arrayList = new ArrayList(arrayList8);
                            lq1Var.b(arrayList);
                            return;
                        }
                        c54.p(null, nl7Var.isDone());
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    int iDecrementAndGet6 = atomicInteger.decrementAndGet();
                    c54.p("Less than 0 remaining futures", iDecrementAndGet6 >= 0);
                    if (iDecrementAndGet6 == 0) {
                        ArrayList arrayList9 = nl7Var.b;
                        if (arrayList9 != null) {
                            nl7Var.Y.b(new ArrayList(arrayList9));
                        } else {
                            c54.p(null, nl7Var.isDone());
                        }
                    }
                    throw th;
                }
            case 4:
                ((phe) obj).a((Intent) obj2, i);
                return;
            default:
                ((SystemForegroundService) obj2).X.notify(i, (Notification) obj);
                return;
        }
    }

    public /* synthetic */ eo(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.o = obj2;
        this.b = i;
    }

    public eo(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.a = 1;
        this.o = bottomSheetBehavior;
        this.c = view;
        this.b = i;
    }

    public eo(List list, int i, Throwable th) {
        this.a = 2;
        c54.o(list, "initCallbacks cannot be null");
        this.c = new ArrayList(list);
        this.b = i;
        this.o = th;
    }
}
