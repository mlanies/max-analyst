package defpackage;

/* loaded from: classes.dex */
public abstract class sqc extends i87 {
    @Override // defpackage.i87
    public d87 dequeueWork() {
        c87 c87VarRemove = null;
        try {
            b87 b87Var = this.mJobImpl;
            if (b87Var != null) {
                return b87Var.b();
            }
            synchronized (this.mCompatQueue) {
                try {
                    if (this.mCompatQueue.size() > 0) {
                        c87VarRemove = this.mCompatQueue.remove(0);
                    }
                } finally {
                }
            }
            return c87VarRemove;
        } catch (SecurityException e) {
            e.printStackTrace();
            return c87VarRemove;
        }
    }

    @Override // defpackage.i87, android.app.Service
    public void onCreate() {
        super.onCreate();
        this.mJobImpl = new f87(this, 1);
    }
}
