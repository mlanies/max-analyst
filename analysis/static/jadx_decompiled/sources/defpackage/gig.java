package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class gig implements zjg, x3a, o3a, k3a {
    public final /* synthetic */ int a;
    public final Executor b;
    public final Object c;
    public final Object o;

    public gig(Executor executor, k3a k3aVar) {
        this.a = 0;
        this.c = new Object();
        this.b = executor;
        this.o = k3aVar;
    }

    @Override // defpackage.x3a
    public void a(Object obj) {
        ((ukg) this.o).n(obj);
    }

    @Override // defpackage.zjg
    public final void b(Task task) {
        switch (this.a) {
            case 0:
                if (((ukg) task).d) {
                    synchronized (this.c) {
                        try {
                            if (((k3a) this.o) != null) {
                                this.b.execute(new gwe(15, this));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            case 1:
                synchronized (this.c) {
                    try {
                        if (((l3a) this.o) == null) {
                            return;
                        }
                        this.b.execute(new u8g(this, 4, task));
                        return;
                    } finally {
                    }
                }
            case 2:
                if (task.h() || ((ukg) task).d) {
                    return;
                }
                synchronized (this.c) {
                    try {
                        if (((o3a) this.o) != null) {
                            this.b.execute(new ihg(this, task, 2));
                        }
                    } finally {
                    }
                }
                return;
            case 3:
                if (task.h()) {
                    synchronized (this.c) {
                        try {
                            if (((x3a) this.o) != null) {
                                this.b.execute(new u8g(this, 5, task));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            default:
                this.b.execute(new u8g(this, 6, task));
                return;
        }
    }

    @Override // defpackage.k3a
    public void d() {
        ((ukg) this.o).o();
    }

    @Override // defpackage.o3a
    public void onFailure(Exception exc) {
        ((ukg) this.o).m(exc);
    }

    public gig(Executor executor, l3a l3aVar) {
        this.a = 1;
        this.c = new Object();
        this.b = executor;
        this.o = l3aVar;
    }

    public gig(Executor executor, o3a o3aVar) {
        this.a = 2;
        this.c = new Object();
        this.b = executor;
        this.o = o3aVar;
    }

    public gig(Executor executor, x3a x3aVar) {
        this.a = 3;
        this.c = new Object();
        this.b = executor;
        this.o = x3aVar;
    }

    public gig(Executor executor, sbe sbeVar, ukg ukgVar) {
        this.a = 4;
        this.b = executor;
        this.c = sbeVar;
        this.o = ukgVar;
    }
}
