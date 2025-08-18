package defpackage;

import android.util.SparseIntArray;
import androidx.work.WorkRequest;
import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.Locale;
import java.util.NoSuchElementException;
import one.me.rlottie.RLottie;

/* loaded from: classes2.dex */
public final class ll4 {
    public static final SecureRandom j = new SecureRandom();
    public int e;
    public int g;
    public boolean h;
    public final LinkedList a = new LinkedList();
    public final SparseIntArray b = new SparseIntArray();
    public final LinkedList c = new LinkedList();
    public final re i = new re(15, this);
    public final int d = 4;
    public final int f = j.nextInt();

    public final il4 a() {
        il4 il4Var = new il4("rlottie-pool-" + this.f + "-" + j.nextInt());
        il4Var.setPriority(10);
        return il4Var;
    }

    public final void b(Runnable runnable) throws InterruptedException {
        il4 il4VarA;
        LinkedList linkedList = this.c;
        boolean zIsEmpty = linkedList.isEmpty();
        LinkedList linkedList2 = this.a;
        int i = this.d;
        if (!zIsEmpty && (this.g / 2 <= linkedList.size() || (linkedList2.isEmpty() && this.e >= i))) {
            try {
                il4VarA = (il4) linkedList.removeFirst();
            } catch (NoSuchElementException e) {
                RLottie.getLogger().o(e);
                il4VarA = null;
            }
        } else if (linkedList2.isEmpty()) {
            il4VarA = a();
            this.e++;
        } else {
            il4VarA = (il4) linkedList2.removeFirst();
        }
        if (!this.h) {
            he.e(this.i, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
            this.h = true;
        }
        if (il4VarA == null) {
            lm9 logger = RLottie.getLogger();
            Locale locale = Locale.US;
            int size = linkedList.size();
            int i2 = this.g;
            int size2 = linkedList2.size();
            int i3 = this.e;
            StringBuilder sbJ = wg0.j("DispatchQueuePool: queue is null – busyQueues.size=", size, ", totalTasksCount=", i2, ", queues.size=");
            ms2.k(sbJ, size2, ", createdCount=", i3, ", maxCount=");
            sbJ.append(i);
            logger.j(sbJ.toString(), new IllegalStateException("queue is null"));
            il4VarA = a();
            this.e++;
        }
        this.g++;
        linkedList.add(il4VarA);
        SparseIntArray sparseIntArray = this.b;
        int i4 = il4VarA.o;
        sparseIntArray.put(i4, sparseIntArray.get(i4, 0) + 1);
        if (il4VarA.getPriority() != 10) {
            il4VarA.setPriority(10);
        }
        il4VarA.b(new f5(this, runnable, il4VarA, 20));
    }
}
