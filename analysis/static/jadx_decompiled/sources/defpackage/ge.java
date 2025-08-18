package defpackage;

import android.graphics.Bitmap;
import android.util.SparseIntArray;
import androidx.work.WorkRequest;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import one.me.rlottie.RLottie;

/* loaded from: classes2.dex */
public final /* synthetic */ class ge implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ ge(ArrayList arrayList, int i) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        il4 il4Var;
        switch (this.a) {
            case 0:
                ((ScheduledExecutorService) ((khe) tu0.l.f.b).getValue()).schedule(new ge(this.b, 1), 36L, TimeUnit.MILLISECONDS);
                break;
            case 1:
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.b;
                    if (i >= arrayList.size()) {
                        break;
                    } else {
                        Bitmap bitmap = (Bitmap) ((WeakReference) arrayList.get(i)).get();
                        ((WeakReference) arrayList.get(i)).clear();
                        if (bitmap != null && !bitmap.isRecycled()) {
                            try {
                                bitmap.recycle();
                            } catch (Throwable th) {
                                RLottie.getLogger().o(th);
                            }
                        }
                        i++;
                    }
                }
                break;
            case 2:
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    ((Bitmap) it.next()).recycle();
                }
                break;
            case 3:
                ml4 ml4Var = ml4.k;
                ml4Var.getClass();
                int i2 = 0;
                while (true) {
                    ArrayList arrayList2 = this.b;
                    if (i2 >= arrayList2.size()) {
                        arrayList2.clear();
                        he.d(new ge(arrayList2, 4));
                        break;
                    } else {
                        Runnable runnable = (Runnable) arrayList2.get(i2);
                        if (runnable != null) {
                            ArrayList arrayList3 = ml4Var.c;
                            boolean zIsEmpty = arrayList3.isEmpty();
                            ArrayList arrayList4 = ml4Var.a;
                            if (!zIsEmpty && (ml4Var.g / 2 <= arrayList3.size() || (arrayList4.isEmpty() && ml4Var.e >= ml4Var.d))) {
                                il4Var = (il4) arrayList3.remove(0);
                            } else if (arrayList4.isEmpty()) {
                                il4Var = new il4("rlottie-bg-pool" + ml4Var.f + "-" + ll4.j.nextInt());
                                il4Var.setPriority(10);
                                ml4Var.e = ml4Var.e + 1;
                            } else {
                                il4Var = (il4) arrayList4.remove(0);
                            }
                            if (!ml4Var.h) {
                                ((ScheduledExecutorService) ((khe) tu0.l.f.b).getValue()).schedule(ml4Var.i, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, TimeUnit.MILLISECONDS);
                                ml4Var.h = true;
                            }
                            ml4Var.g++;
                            arrayList3.add(il4Var);
                            SparseIntArray sparseIntArray = ml4Var.b;
                            sparseIntArray.put(il4Var.o, sparseIntArray.get(il4Var.o, 0) + 1);
                            if (il4Var.getPriority() != 10) {
                                il4Var.setPriority(10);
                            }
                            il4Var.b(new f5(ml4Var, runnable, il4Var, 21));
                        }
                        i2++;
                    }
                }
                break;
            default:
                ml4.l.add(this.b);
                break;
        }
    }
}
