package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class uk4 {
    public final int a;
    public final String b;
    public final ide c;
    public final long d;
    public final long e;
    public final long f;
    public final pq9 g;
    public final lq9 h;
    public final mq9 i;
    public final Context j;

    public uk4(tk4 tk4Var) {
        lq9 lq9Var;
        mq9 mq9Var;
        Context context = tk4Var.g;
        this.j = context;
        ide ideVar = tk4Var.b;
        if (!((ideVar == null && context == null) ? false : true)) {
            throw new IllegalStateException("Either a non-null context or a base directory path or supplier must be provided.");
        }
        if (ideVar == null && context != null) {
            tk4Var.b = new x24(1, this);
        }
        this.a = 1;
        String str = tk4Var.a;
        str.getClass();
        this.b = str;
        ide ideVar2 = tk4Var.b;
        ideVar2.getClass();
        this.c = ideVar2;
        this.d = tk4Var.c;
        this.e = tk4Var.d;
        this.f = tk4Var.e;
        pq9 pq9Var = tk4Var.f;
        pq9Var.getClass();
        this.g = pq9Var;
        synchronized (lq9.class) {
            try {
                if (lq9.a == null) {
                    lq9.a = new lq9();
                }
                lq9Var = lq9.a;
            } finally {
            }
        }
        this.h = lq9Var;
        synchronized (mq9.class) {
            try {
                if (mq9.b == null) {
                    mq9.b = new mq9(0);
                }
                mq9Var = mq9.b;
            } finally {
            }
        }
        this.i = mq9Var;
        synchronized (oq9.class) {
            if (oq9.b == null) {
                oq9.b = new oq9(0);
            }
        }
    }
}
