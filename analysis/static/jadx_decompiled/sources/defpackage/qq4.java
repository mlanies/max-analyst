package defpackage;

import java.util.concurrent.ArrayBlockingQueue;

/* loaded from: classes.dex */
public final class qq4 {
    public static final qq4 b = new qq4();
    public static final boolean c = true;
    public final ArrayBlockingQueue a = new ArrayBlockingQueue(20);

    public final void a(pq4 pq4Var) {
        if (!c) {
            return;
        }
        int i = 5;
        while (true) {
            ArrayBlockingQueue arrayBlockingQueue = this.a;
            if (arrayBlockingQueue.offer(pq4Var) || i <= 0) {
                return;
            }
            arrayBlockingQueue.poll();
            i--;
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
